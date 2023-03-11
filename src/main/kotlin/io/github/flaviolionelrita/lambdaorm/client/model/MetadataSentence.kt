package io.github.flaviolionelrita.lambdaorm.client.model
data class MetadataSentence (
    val entity: String,
    val dialect: String,
    val source: String,
    val sentence: String,
    val children: List<MetadataSentence>? = null
)

