package io.github.flaviolionelrita.lambdaorm.client.model
data class QueryQueuedRequest (
    val expression: String,
    val topic: String,
    val options: QueryOptions? = null,
    val `data`: Any? = null,
    val chunk: java.math.BigDecimal? = null
)



