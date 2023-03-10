package io.github.flaviolionelrita.lambdaorm.client.model
data class DataSource (
    val name:String,
    val dialect:String,
    val mapping:String,
    val connection:Any?

)

