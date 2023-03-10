package io.github.flaviolionelrita.lambdaorm.client.model
data class Entity (
    val name: String,
    val uniqueKey: List<String>,
    val indexes: List<Index>,
    val primaryKey: List<String>,
    val properties: List<Property>,
    val relations: List<Relation>,
    val dependents: List<Dependent>,
    val extends: String? = null,
    val `abstract`: Boolean? = null,
    val singular: String? = null,
    val constraints: List<Constraint>? = null

)

