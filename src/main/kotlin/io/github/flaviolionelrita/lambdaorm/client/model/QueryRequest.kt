package io.github.flaviolionelrita.lambdaorm.client.model
data class QueryRequest (
    val expression: String,
    val options: QueryOptions,
    val `data`: Any? = null
)

