package io.github.flaviolionelrita.lambdaorm.client.model
data class Relation (
    val name: String,
    val type: RelationType,
    val from: String,
    val entity: String,
    val to: String,
    val composite: Boolean? = null,
    val weak: Boolean? = null,
    val target: String? = null,
    val targetComposite: Boolean? = null

)

