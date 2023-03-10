package io.github.flaviolionelrita.lambdaorm.client.model
enum class RelationType(val value: String) {
    oneToMany("oneToMany"),
    manyToOne("manyToOne"),
    oneToOne("oneToOne");

    /**
     * Override toString() to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: Any?): String? = if (data is RelationType) "$data" else null

        /**
         * Returns a valid [RelationType] for [data], null otherwise.
         */
        fun decode(data: Any?): RelationType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

