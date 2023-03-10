package io.github.flaviolionelrita.lambdaorm.client.model
data class Property (
    val name: String,
    val type: String,
    val length: Double? = null,
    val nullable: Boolean? = null,
    val primaryKey: Boolean? = null,
    val autoincrement: Boolean? = null,
    val default: String? = null,
    val readValue: String? = null,
    val writeValue: String? = null,
    val `enum`: String? = null
)

