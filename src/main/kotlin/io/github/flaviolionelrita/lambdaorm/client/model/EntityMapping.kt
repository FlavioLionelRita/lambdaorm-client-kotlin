package io.github.flaviolionelrita.lambdaorm.client.model

data class EntityMapping (
    val name:String,
    val uniqueKey: List<kotlin.String>,
    val indexes: List<Index>,
    val primaryKey: List<kotlin.String>,
    val properties: List<PropertyMapping>,
    val relations: List<Relation>,
    val dependents: List<Dependent>,
    val mapping:String,
    val extends:String? = null,
    val `abstract`:Boolean? = null,
    val singular:String? = null,
    val constraints: List<Constraint>? = null

)

