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

package io.github.flaviolionelrita.lambdaorm.client.api

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import io.github.flaviolionelrita.lambdaorm.client.model.SchemaData

import com.squareup.moshi.Json

import io.github.flaviolionelrita.lambdaorm.client.infrastructure.ApiClient
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.ApiResponse
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.ClientException
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.ClientError
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.ServerException
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.ServerError
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.MultiValueMap
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.PartConfig
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.RequestConfig
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.RequestMethod
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.ResponseType
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.Success
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.toMultiValue

class StageApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost:9291")
        }
    }

    /**
     * 
     * 
     * @param stage 
     * @param schemaData 
     * @return kotlin.Any
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun callImport(stage: kotlin.String, schemaData: SchemaData) : kotlin.Any {
        val localVarResponse = callImportWithHttpInfo(stage = stage, schemaData = schemaData)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Any
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * 
     * @param stage 
     * @param schemaData 
     * @return ApiResponse<kotlin.Any?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun callImportWithHttpInfo(stage: kotlin.String, schemaData: SchemaData) : ApiResponse<kotlin.Any?> {
        val localVariableConfig = callImportRequestConfig(stage = stage, schemaData = schemaData)

        return request<SchemaData, kotlin.Any>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation callImport
     *
     * @param stage 
     * @param schemaData 
     * @return RequestConfig
     */
    fun callImportRequestConfig(stage: kotlin.String, schemaData: SchemaData) : RequestConfig<SchemaData> {
        val localVariableBody = schemaData
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/stages/{stage}/import".replace("{"+"stage"+"}", encodeURIComponent(stage.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param stage 
     * @return kotlin.Boolean
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun exists(stage: kotlin.String) : kotlin.Boolean {
        val localVarResponse = existsWithHttpInfo(stage = stage)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Boolean
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * 
     * @param stage 
     * @return ApiResponse<kotlin.Boolean?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun existsWithHttpInfo(stage: kotlin.String) : ApiResponse<kotlin.Boolean?> {
        val localVariableConfig = existsRequestConfig(stage = stage)

        return request<Unit, kotlin.Boolean>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation exists
     *
     * @param stage 
     * @return RequestConfig
     */
    fun existsRequestConfig(stage: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/stages/{stage}/exists".replace("{"+"stage"+"}", encodeURIComponent(stage.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param stage 
     * @return SchemaData
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun export(stage: kotlin.String) : SchemaData {
        val localVarResponse = exportWithHttpInfo(stage = stage)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as SchemaData
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * 
     * @param stage 
     * @return ApiResponse<SchemaData?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun exportWithHttpInfo(stage: kotlin.String) : ApiResponse<SchemaData?> {
        val localVariableConfig = exportRequestConfig(stage = stage)

        return request<Unit, SchemaData>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation export
     *
     * @param stage 
     * @return RequestConfig
     */
    fun exportRequestConfig(stage: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/stages/{stage}/export".replace("{"+"stage"+"}", encodeURIComponent(stage.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
