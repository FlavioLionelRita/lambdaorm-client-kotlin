package io.github.flaviolionelrita.lambdaorm.client.model
data class QueryOptions (
    val stage: String? = null,
    val view: String? = null,
    val chunkSize: Int? = null,
    val tryAllCan: Boolean? = null,
    val headers: Any? = null
)

