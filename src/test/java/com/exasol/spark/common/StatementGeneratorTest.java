package com.exasol.spark.common;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.exasol.sql.expression.BooleanExpression;
import com.exasol.sql.expression.BooleanTerm;
import com.exasol.sql.expression.literal.IntegerLiteral;
import com.exasol.sql.expression.literal.StringLiteral;

class StatementGeneratorTest {
    private static final StatementGeneratorFactory factory = StatementGeneratorFactory.getInstance();
    private static SelectStatementGenerator stmtGenerator;

    @BeforeEach
    public void beforeEach() {
        stmtGenerator = factory.selectFrom("DB.T1");
    }

    @Test
    void testSelectStarNoPredicate() {
        assertThat(stmtGenerator.render(), equalTo("SELECT * FROM DB.T1"));
    }

    @Test
    void testSelectStarWithPredicate() {
        final BooleanExpression predicate = BooleanTerm.lt(StringLiteral.of("a"), IntegerLiteral.of(13));
        assertThat(stmtGenerator.where(predicate).render(), equalTo("SELECT * FROM DB.T1 WHERE \'a\' < 13"));
    }

    @Test
    void testSelectColumnsNoPredicate() {
        assertThat(stmtGenerator.columns("a", "b").render(), equalTo("SELECT \"a\", \"b\" FROM DB.T1"));
    }

    @Test
    void testSelectColumnsWithPredicate() {
        final BooleanExpression expr1 = BooleanTerm.lt(StringLiteral.of("a"), IntegerLiteral.of(13));
        final BooleanExpression expr2 = BooleanTerm.ge(StringLiteral.of("a"), StringLiteral.of("b"));
        final BooleanExpression predicate = BooleanTerm.and(expr1, expr2);
        final String expected = stmtGenerator.columns("a").where(predicate).render();
        assertThat(expected, equalTo("SELECT \"a\" FROM DB.T1 WHERE ('a' < 13) AND ('a' >= 'b')"));
    }

    @Test
    void testSelectInnerQuery() {
        final BooleanExpression predicate = BooleanTerm.isNull(StringLiteral.of("a"));
        final SelectStatementGenerator stmtGenerator = factory.selectFrom("(SELECT * FROM D.T1)");
        final String expected = stmtGenerator.columns("a").where(predicate).render();
        assertThat(expected, equalTo("SELECT \"a\" FROM (SELECT * FROM D.T1) WHERE 'a' IS NULL"));
    }

    @Test
    void testCountStarNoPredicate() {
        final CountStarStatementGenerator countStarGen = factory.countStarFrom("DB.T1");
        assertThat(countStarGen.render(), equalTo("SELECT COUNT('*') FROM DB.T1"));
    }

    @Test
    void testCountStarWithPredicate() {
        final CountStarStatementGenerator countStarGen = factory.countStarFrom("DB.T1");
        final BooleanExpression predicate = BooleanTerm.le(StringLiteral.of("a"), StringLiteral.of('x'));
        assertThat(countStarGen.where(predicate).render(), equalTo("SELECT COUNT('*') FROM DB.T1 WHERE \'a\' <= 'x'"));
    }

}
