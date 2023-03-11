package io.github.flaviolionelrita.lambdaorm.client.model
data class MetadataParameter (
    val name: String,
    val type: String,
    val children: List<MetadataParameter>? = null
)

