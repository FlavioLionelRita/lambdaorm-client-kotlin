/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.flaviolrita.lambdaorm.model

import org.flaviolrita.lambdaorm.model.Constraint
import org.flaviolrita.lambdaorm.model.Dependent
import org.flaviolrita.lambdaorm.model.Index
import org.flaviolrita.lambdaorm.model.Property
import org.flaviolrita.lambdaorm.model.Relation

import com.squareup.moshi.Json

/**
 * 
 *
 * @param name 
 * @param uniqueKey 
 * @param indexes 
 * @param primaryKey 
 * @param properties 
 * @param relations 
 * @param dependents 
 * @param extends 
 * @param `abstract` 
 * @param singular 
 * @param constraints 
 */


data class Entity (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "uniqueKey")
    val uniqueKey: kotlin.collections.List<kotlin.String>,

    @Json(name = "indexes")
    val indexes: kotlin.collections.List<Index>,

    @Json(name = "primaryKey")
    val primaryKey: kotlin.collections.List<kotlin.String>,

    @Json(name = "properties")
    val properties: kotlin.collections.List<Property>,

    @Json(name = "relations")
    val relations: kotlin.collections.List<Relation>,

    @Json(name = "dependents")
    val dependents: kotlin.collections.List<Dependent>,

    @Json(name = "extends")
    val extends: kotlin.String? = null,

    @Json(name = "abstract")
    val `abstract`: kotlin.Boolean? = null,

    @Json(name = "singular")
    val singular: kotlin.String? = null,

    @Json(name = "constraints")
    val constraints: kotlin.collections.List<Constraint>? = null

)

