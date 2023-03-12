package io.github.flaviolionelrita.lambdaorm.client.model
data class QueryOptions (
    val stage: String,
    val view: String = "default",
    val chunkSize: Int = 10000,
    val tryAllCan: Boolean = false,
    val headers: Any? = { }
)

