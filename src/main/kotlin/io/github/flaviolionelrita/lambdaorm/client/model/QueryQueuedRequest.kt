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

import io.github.flaviolionelrita.lambdaorm.client.model.QueryOptions

import com.squareup.moshi.Json

/**
 * 
 *
 * @param expression 
 * @param topic 
 * @param options 
 * @param `data` 
 * @param chunk 
 */


data class QueryQueuedRequest (

    @Json(name = "expression")
    val expression: kotlin.String,

    @Json(name = "topic")
    val topic: kotlin.String,

    @Json(name = "options")
    val options: QueryOptions? = null,

    @Json(name = "data")
    val `data`: kotlin.Any? = null,

    @Json(name = "chunk")
    val chunk: java.math.BigDecimal? = null

)
