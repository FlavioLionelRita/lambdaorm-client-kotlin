package io.github.flaviolionelrita.lambdaorm.client.model
data class MetadataConstraint (
    val entity: String,
    val constraints: List<Constraint>,
    val childs: List<MetadataConstraint>? = null
)

