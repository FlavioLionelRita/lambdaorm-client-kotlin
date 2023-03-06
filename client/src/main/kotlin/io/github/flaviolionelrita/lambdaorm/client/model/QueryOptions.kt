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
 * @param stage 
 * @param view 
 * @param chunkSize 
 * @param tryAllCan 
 * @param headers 
 */


data class QueryOptions (

    @Json(name = "stage")
    val stage: kotlin.String? = null,

    @Json(name = "view")
    val view: kotlin.String? = null,

    @Json(name = "chunkSize")
    val chunkSize: kotlin.Int? = null,

    @Json(name = "tryAllCan")
    val tryAllCan: kotlin.Boolean? = null,

    @Json(name = "headers")
    val headers: kotlin.Any? = null

)
