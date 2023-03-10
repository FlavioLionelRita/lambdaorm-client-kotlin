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

package io.github.flaviolionelrita.lambdaorm.client.model


import com.squareup.moshi.Json

/**
 * 
 *
 * @param name 
 * @param type 
 * @param mapping 
 * @param length 
 * @param nullable 
 * @param primaryKey 
 * @param autoincrement 
 * @param default 
 * @param readValue 
 * @param writeValue 
 * @param `enum` 
 * @param key 
 */


data class PropertyMapping (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "type")
    val type: kotlin.String,

    @Json(name = "mapping")
    val mapping: kotlin.String,

    @Json(name = "length")
    val length: kotlin.Double? = null,

    @Json(name = "nullable")
    val nullable: kotlin.Boolean? = null,

    @Json(name = "primaryKey")
    val primaryKey: kotlin.Boolean? = null,

    @Json(name = "autoincrement")
    val autoincrement: kotlin.Boolean? = null,

    @Json(name = "default")
    val default: kotlin.String? = null,

    @Json(name = "readValue")
    val readValue: kotlin.String? = null,

    @Json(name = "writeValue")
    val writeValue: kotlin.String? = null,

    @Json(name = "enum")
    val `enum`: kotlin.String? = null,

    @Json(name = "key")
    val key: kotlin.String? = null

)

