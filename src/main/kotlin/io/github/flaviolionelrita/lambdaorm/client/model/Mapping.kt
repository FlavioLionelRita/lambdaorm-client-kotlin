package io.github.flaviolionelrita.lambdaorm.client.model
data class Mapping (
    val name: String,
    val entities: List<EntityMapping>,
    val extends: String? = null,
    val mapping: String? = null

)

