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
 * @param childs 
 */


data class MetadataParameter (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "type")
    val type: kotlin.String,

    @Json(name = "childs")
    val childs: kotlin.collections.List<MetadataParameter>? = null

)

