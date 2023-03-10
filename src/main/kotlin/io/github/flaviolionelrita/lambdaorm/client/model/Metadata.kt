package io.github.flaviolionelrita.lambdaorm.client.model
data class Metadata (
    val name: String,
    val type: String,
    val entity: String? = null,
    val children: List<Metadata>? = null,
    val fields: List<Property>? = null,
    val `property`: String? = null,
    val parameters: List<Parameter>? = null,
    val relation: Relation? = null,
    val sentence: String? = null,
    val alias: String? = null,
    val number: Double? = null

)

