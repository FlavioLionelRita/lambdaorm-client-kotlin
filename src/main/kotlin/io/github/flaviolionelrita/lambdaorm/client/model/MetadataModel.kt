package io.github.flaviolionelrita.lambdaorm.client.model
data class MetadataModel (
    val name: String,
    val type: String,
    val childs: List<MetadataModel>? = null

)

