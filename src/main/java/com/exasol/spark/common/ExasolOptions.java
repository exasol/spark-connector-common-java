package com.exasol.spark.common;

import java.io.Serializable;
import java.util.*;

import org.apache.spark.sql.util.CaseInsensitiveStringMap;

import com.exasol.errorreporting.ExaError;

/**
 * Configuration parameters for Exasol Spark connectors.
 */
public final class ExasolOptions implements Serializable {
    private static final long serialVersionUID = 3223251912933850463L;

    /** JDBC URL parameter. */
    private final String jdbcUrl;
    /** Host parameter. */
    private final String host;
    /** Port parameter. */
    private final String port;
    /** Fingerprint parameter. */
    private final String fingerprint;
    /** Username parameter. */
    private final String username;
    /** Password parameter. */
    private final String password;
    /** Table parameter. */
    private final String table;
    /** Query parameter. */
    private final String query;
    /** S3 Bucket parameter. */
    private final String s3Bucket;
    /** Additional key-value map. */
    private final Map<String, String> optionsMap;

    private ExasolOptions(final Builder builder) {
        this.host = builder.host;
        this.port = builder.port;
        this.fingerprint = builder.fingerprint;
        this.username = builder.username;
        this.password = builder.password;
        this.table = builder.table;
        this.query = builder.query;
        this.s3Bucket = builder.s3Bucket;
        this.optionsMap = builder.optionsMap;
        this.jdbcUrl = createJdbcUrl();
    }

    private String createJdbcUrl() {
        final StringBuilder sb = new StringBuilder();
        sb.append("jdbc:exa:").append(this.host);
        if (hasFingerprint()) {
            sb.append("/").append(this.fingerprint);
        }
        sb.append(":").append(this.port);
        if (this.containsKey(Option.JDBC_OPTIONS.key())) {
            sb.append(";").append(this.get(Option.JDBC_OPTIONS.key()));
        }
        return sb.toString();
    }

    private boolean isCertificateValidationDisabled() {
        if (!this.containsKey(Option.JDBC_OPTIONS.key())) {
            return false;
        }
        return this.get(Option.JDBC_OPTIONS.key()).contains("validateservercertificate=0");
    }

    /**
     * Gets the JDBC connection URL.
     *
     * @return JDBC connection URL
     */
    public String getJdbcUrl() {
        return this.jdbcUrl;
    }

    /**
     * Gets the connection host address.
     *
     * @return connection host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * Gets the connection port value.
     *
     * @return connection port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * Checks if a certificate fingerprint is available.
     *
     * @return {@code true} if fingerprint value is available
     */
    public boolean hasFingerprint() {
        return this.fingerprint != null && !isCertificateValidationDisabled();
    }

    /**
     * Gets the connection certificate fingerprint value.
     *
     * @return fingerprint value
     */
    public String getFingerprint() {
        return this.fingerprint;
    }

    /**
     * Gets the connection username.
     *
     * @return connection username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Gets the connection password.
     *
     * @return connection password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Checks if an table name parameter is available.
     *
     * @return {@code true} if table parameter is available
     */
    public boolean hasTable() {
        return this.table != null && !this.table.isEmpty();
    }

    /**
     * Gets the table parameter.
     *
     * @return table parameter value
     */
    public String getTable() {
        return this.table;
    }

    /**
     * Checks if a query parameter is available.
     *
     * @return {@code true} if query parameter is available
     */
    public boolean hasQuery() {
        return this.query != null && !this.query.isEmpty();
    }

    /**
     * Gets the query parameter.
     *
     * @return query parameter value
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * Gets the table or query parameter.
     *
     * Both of them would not be set at the same time.
     *
     * @return table or query parameter value
     */
    public String getTableOrQuery() {
        return hasTable() ? this.table : this.query;
    }

    /**
     * Checks if an S3 bucket parameter is available.
     *
     * @return {@code true} if S3 bucket is available
     */
    public boolean hasS3Bucket() {
        return this.s3Bucket != null && !this.s3Bucket.isEmpty();
    }

    /**
     * Gets the S3 bucket name.
     *
     * @return an S3 bucket name
     */
    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * Gets the number of partitions for Spark dataframe.
     *
     * @return number of partitions
     */
    public int getNumberOfPartitions() {
        if (!containsKey(Option.NUMBER_OF_PARTITIONS.key())) {
            return Integer.parseInt(Option.DEFAULT_NUMBER_OF_PARTITIONS.key());
        } else {
            return Integer.parseInt(get(Option.NUMBER_OF_PARTITIONS.key()));
        }
    }

    /**
     * Returns key-value pair options map.
     *
     * @return key-value pair map
     */
    public Map<String,String> getOptionsMap() {
        return this.optionsMap;
    }

    /**
     * Checks if a parameter key is available.
     *
     * @param key parameter name to check
     * @return {@code true} if parameter key is available
     */
    public boolean containsKey(final String key) {
        return this.optionsMap.containsKey(toLowerCase(key));
    }

    /**
     * Gets the value for a key.
     *
     * @param key key of a map
     * @return value of the key
     * @throws IllegalArgumentException in case no value exists for the key
     */
    public String get(final String key) {
        if (!containsKey(key)) {
            throw new IllegalArgumentException(
                    ExaError.messageBuilder("E-SCCJ-7").message("Key {{key name}} not found in the options map.", key)
                            .mitigation("Please make sure it is set and correct.").toString());
        }
        return this.optionsMap.get(toLowerCase(key));
    }

    /**
     * Checks if parameter key is set to {@code true}.
     *
     * @param key key of a map
     * @return {@code true} if parameter key is available and set to {@code true} value
     */
    public boolean hasEnabled(final String key) {
        if (!containsKey(key)) {
            return false;
        }
        final String value = get(key);
        return value.equalsIgnoreCase("true");
    }

    private String toLowerCase(final Object key) {
        return key.toString().toLowerCase(Locale.ROOT);
    }

    /**
     * Creates a new instance of {@link ExasolOptions} from {@link CaseInsensitiveStringMap}.
     *
     * @param map {@link CaseInsensitiveStringMap} map
     * @return instance of {@link ExasolOptions}
     */
    public static ExasolOptions from(final CaseInsensitiveStringMap map) {
        final ExasolOptions.Builder builder = ExasolOptions.builder();
        if (map.containsKey(Option.HOST.key())) {
            builder.host(map.get(Option.HOST.key()));
        }
        if (map.containsKey(Option.PORT.key())) {
            builder.port(map.get(Option.PORT.key()));
        }
        if (map.containsKey(Option.USERNAME.key())) {
            builder.username(map.get(Option.USERNAME.key()));
        }
        if (map.containsKey(Option.PASSWORD.key())) {
            builder.password(map.get(Option.PASSWORD.key()));
        }
        if (map.containsKey(Option.FINGERPRINT.key())) {
            builder.fingerprint(map.get(Option.FINGERPRINT.key()));
        }
        if (map.containsKey(Option.S3_BUCKET.key())) {
            builder.s3Bucket(map.get(Option.S3_BUCKET.key()));
        }
        if (map.containsKey(Option.TABLE.key())) {
            builder.table(map.get(Option.TABLE.key()));
        } else if (map.containsKey(Option.QUERY.key())) {
            builder.query(map.get(Option.QUERY.key()));
        }
        return builder.withOptionsMap(map).build();
    }

    /**
     * Creates a new builder for {@link ExasolOptions}.
     *
     * @return builder instance
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public boolean equals(final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExasolOptions)) {
            return false;
        }
        final ExasolOptions options = (ExasolOptions) other;
        return Objects.equals(this.jdbcUrl, options.jdbcUrl) //
                && Objects.equals(this.host, options.host) //
                && Objects.equals(this.port, options.port) //
                && Objects.equals(this.fingerprint, options.fingerprint) //
                && Objects.equals(this.username, options.username) //
                && Objects.equals(this.password, options.password) //
                && Objects.equals(this.table, options.table) //
                && Objects.equals(this.query, options.query) //
                && Objects.equals(this.s3Bucket, options.s3Bucket) //
                && Objects.equals(this.optionsMap, options.optionsMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.jdbcUrl, this.host, this.port, this.fingerprint, this.username, this.password,
                this.table, this.query, this.s3Bucket, this.optionsMap);
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder("ExasolOptions{") //
                .append("jdbcUrl=\"").append(this.jdbcUrl) //
                .append("\", username=\"").append(this.username) //
                .append("\", password=\"*******\"");
        if (this.hasS3Bucket()) {
            stringBuilder.append(", s3Bucket=\"").append(this.s3Bucket).append("\"");
        }
        if (this.hasTable()) {
            stringBuilder.append(", table=\"").append(this.table).append("\"");
        }
        if (this.hasQuery()) {
            stringBuilder.append(", query=\"").append(this.query).append("\"");
        }
        if (!this.optionsMap.isEmpty()) {
            stringBuilder.append(", map=\"").append(this.optionsMap.toString()).append("\"");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /**
     * Builder for {@link ExasolOptions}.
     */
    public static class Builder {
        private String host = "localhost";
        private String port = "8563";
        private String fingerprint = null;
        private String username = "sys";
        @SuppressWarnings("java:S2068") // Default password used for CI
        private String password = "exasol";
        private String table = null;
        private String query = null;
        private String s3Bucket = null;
        private Map<String, String> optionsMap = new HashMap<>(0);

        /**
         * Sets the connection host address.
         *
         * @param host {@code JDBC} connection host address
         * @return builder instance for fluent programming
         */
        public Builder host(final String host) {
            this.host = host;
            return this;
        }

        /**
         * Sets the connection port.
         *
         * @param port {@code JDBC} connection port
         * @return builder instance for fluent programming
         */
        public Builder port(final String port) {
            this.port = port;
            return this;
        }

        /**
         * Sets the connection fingerprint value.
         *
         * @param fingerprint {@code JDBC} connection fingerprint
         * @return builder instance for fluent programming
         */
        public Builder fingerprint(final String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }

        /**
         * Sets the connection username.
         *
         * @param username connection username
         * @return builder instance for fluent programming
         */
        public Builder username(final String username) {
            this.username = username;
            return this;
        }

        /**
         * Sets the connection password.
         *
         * @param password connection password
         * @return builder instance for fluent programming
         */
        public Builder password(final String password) {
            this.password = password;
            return this;
        }

        /**
         * Sets the user provided table name option.
         *
         * @param table for querying or writing
         * @return builder instance for fluent programming
         */
        public Builder table(final String table) {
            this.table = table;
            return this;
        }

        /**
         * Sets the user provided query string.
         *
         * @param query string for reading
         * @return builder instance for fluent programming
         */
        public Builder query(final String query) {
            this.query = query;
            return this;
        }

        /**
         * Sets the S3 bucket name.
         *
         * @param s3Bucket S3 bucket name
         * @return builder instance for fluent programming
         */
        public Builder s3Bucket(final String s3Bucket) {
            this.s3Bucket = s3Bucket;
            return this;
        }

        /**
         * Sets key-value map.
         *
         * @param map key-value map
         * @return builder instance for fluent programming
         */
        public Builder withOptionsMap(final Map<String, String> map) {
            this.optionsMap = getCaseInsensitiveMap(map);
            return this;
        }

        private Map<String, String> getCaseInsensitiveMap(final Map<String, String> map) {
            final Map<String, String> caseInsensitiveMap = new HashMap<>(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                final String lowerCaseKey = entry.getKey().toLowerCase(Locale.ROOT);
                if (caseInsensitiveMap.containsKey(lowerCaseKey)) {
                    throw new IllegalArgumentException(ExaError.messageBuilder("E-SCCJ-8")
                            .message("Found case sensitive duplicate key {{KEY}}.", entry.getKey())
                            .mitigation("Please remove case sensitive duplicate options, and set only one of them.")
                            .toString());
                }
                caseInsensitiveMap.put(lowerCaseKey, entry.getValue());
            }
            return caseInsensitiveMap;
        }

        /**
         * Builds a new instance of {@link ExasolOptions}.
         *
         * @return new instance of {@link ExasolOptions}
         */
        public ExasolOptions build() {
            validate();
            return new ExasolOptions(this);
        }

        private void validate() {
            if (this.table != null && this.query != null) {
                throw new ExasolValidationException(ExaError.messageBuilder("E-SCCJ-9")
                        .message("It is not possible to set both 'query' and 'table' options.")
                        .mitigation("Please set only one of the them.").toString());
            }
            if (this.table == null && this.query == null) {
                throw new ExasolValidationException(ExaError.messageBuilder("E-SCCJ-10")
                        .message("At least one of the 'query' or 'table' options should be provided.")
                        .mitigation("Please set one of the them. The 'query' for reading and 'table' for writing.")
                        .toString());
            }
        }

    }

}
