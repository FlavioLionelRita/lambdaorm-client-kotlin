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

import io.github.flaviolionelrita.lambdaorm.client.model.Constraint

import com.squareup.moshi.Json

/**
 * 
 *
 * @param entity 
 * @param constraints 
 * @param childs 
 */


data class MetadataConstraint (

    @Json(name = "entity")
    val entity: kotlin.String,

    @Json(name = "constraints")
    val constraints: kotlin.collections.List<Constraint>,

    @Json(name = "childs")
    val childs: kotlin.collections.List<MetadataConstraint>? = null

)

