package io.github.flaviolionelrita.lambdaorm.client.model
data class MetadataSentence (
    val entity: String,
    val dialect: String,
    val dataSource: String,
    val sentence: String,
    val childs: List<MetadataSentence>? = null
)

