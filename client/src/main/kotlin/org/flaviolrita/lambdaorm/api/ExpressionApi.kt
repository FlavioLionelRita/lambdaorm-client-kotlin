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

package org.flaviolrita.lambdaorm.api

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import org.flaviolrita.lambdaorm.model.Metadata
import org.flaviolrita.lambdaorm.model.MetadataConstraint
import org.flaviolrita.lambdaorm.model.MetadataModel
import org.flaviolrita.lambdaorm.model.MetadataParameter
import org.flaviolrita.lambdaorm.model.MetadataSentence
import org.flaviolrita.lambdaorm.model.QueryQueuedRequest
import org.flaviolrita.lambdaorm.model.QueryRequest

import com.squareup.moshi.Json

import org.flaviolrita.lambdaorm.infrastructure.ApiClient
import org.flaviolrita.lambdaorm.infrastructure.ApiResponse
import org.flaviolrita.lambdaorm.infrastructure.ClientException
import org.flaviolrita.lambdaorm.infrastructure.ClientError
import org.flaviolrita.lambdaorm.infrastructure.ServerException
import org.flaviolrita.lambdaorm.infrastructure.ServerError
import org.flaviolrita.lambdaorm.infrastructure.MultiValueMap
import org.flaviolrita.lambdaorm.infrastructure.PartConfig
import org.flaviolrita.lambdaorm.infrastructure.RequestConfig
import org.flaviolrita.lambdaorm.infrastructure.RequestMethod
import org.flaviolrita.lambdaorm.infrastructure.ResponseType
import org.flaviolrita.lambdaorm.infrastructure.Success
import org.flaviolrita.lambdaorm.infrastructure.toMultiValue

class ExpressionApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost:9291")
        }
    }

    /**
     * 
     * 
     * @param queryRequest  (optional)
     * @return MetadataConstraint
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun constraints(queryRequest: QueryRequest? = null) : MetadataConstraint {
        val localVarResponse = constraintsWithHttpInfo(queryRequest = queryRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as MetadataConstraint
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
     * @param queryRequest  (optional)
     * @return ApiResponse<MetadataConstraint?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun constraintsWithHttpInfo(queryRequest: QueryRequest?) : ApiResponse<MetadataConstraint?> {
        val localVariableConfig = constraintsRequestConfig(queryRequest = queryRequest)

        return request<QueryRequest, MetadataConstraint>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation constraints
     *
     * @param queryRequest  (optional)
     * @return RequestConfig
     */
    fun constraintsRequestConfig(queryRequest: QueryRequest?) : RequestConfig<QueryRequest> {
        val localVariableBody = queryRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/constraints",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param queryRequest 
     * @return kotlin.Any
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun execute(queryRequest: QueryRequest) : kotlin.Any {
        val localVarResponse = executeWithHttpInfo(queryRequest = queryRequest)

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
     * @param queryRequest 
     * @return ApiResponse<kotlin.Any?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun executeWithHttpInfo(queryRequest: QueryRequest) : ApiResponse<kotlin.Any?> {
        val localVariableConfig = executeRequestConfig(queryRequest = queryRequest)

        return request<QueryRequest, kotlin.Any>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation execute
     *
     * @param queryRequest 
     * @return RequestConfig
     */
    fun executeRequestConfig(queryRequest: QueryRequest) : RequestConfig<QueryRequest> {
        val localVariableBody = queryRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/execute",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param queryQueuedRequest 
     * @return kotlin.Any
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun executeQueued(queryQueuedRequest: QueryQueuedRequest) : kotlin.Any {
        val localVarResponse = executeQueuedWithHttpInfo(queryQueuedRequest = queryQueuedRequest)

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
     * @param queryQueuedRequest 
     * @return ApiResponse<kotlin.Any?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun executeQueuedWithHttpInfo(queryQueuedRequest: QueryQueuedRequest) : ApiResponse<kotlin.Any?> {
        val localVariableConfig = executeQueuedRequestConfig(queryQueuedRequest = queryQueuedRequest)

        return request<QueryQueuedRequest, kotlin.Any>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation executeQueued
     *
     * @param queryQueuedRequest 
     * @return RequestConfig
     */
    fun executeQueuedRequestConfig(queryQueuedRequest: QueryQueuedRequest) : RequestConfig<QueryQueuedRequest> {
        val localVariableBody = queryQueuedRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/execute-queued",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param queryRequest  (optional)
     * @return Metadata
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun metadata(queryRequest: QueryRequest? = null) : Metadata {
        val localVarResponse = metadataWithHttpInfo(queryRequest = queryRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Metadata
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
     * @param queryRequest  (optional)
     * @return ApiResponse<Metadata?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun metadataWithHttpInfo(queryRequest: QueryRequest?) : ApiResponse<Metadata?> {
        val localVariableConfig = metadataRequestConfig(queryRequest = queryRequest)

        return request<QueryRequest, Metadata>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation metadata
     *
     * @param queryRequest  (optional)
     * @return RequestConfig
     */
    fun metadataRequestConfig(queryRequest: QueryRequest?) : RequestConfig<QueryRequest> {
        val localVariableBody = queryRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/metadata",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param queryRequest  (optional)
     * @return kotlin.collections.List<MetadataModel>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun model(queryRequest: QueryRequest? = null) : kotlin.collections.List<MetadataModel> {
        val localVarResponse = modelWithHttpInfo(queryRequest = queryRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<MetadataModel>
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
     * @param queryRequest  (optional)
     * @return ApiResponse<kotlin.collections.List<MetadataModel>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun modelWithHttpInfo(queryRequest: QueryRequest?) : ApiResponse<kotlin.collections.List<MetadataModel>?> {
        val localVariableConfig = modelRequestConfig(queryRequest = queryRequest)

        return request<QueryRequest, kotlin.collections.List<MetadataModel>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation model
     *
     * @param queryRequest  (optional)
     * @return RequestConfig
     */
    fun modelRequestConfig(queryRequest: QueryRequest?) : RequestConfig<QueryRequest> {
        val localVariableBody = queryRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/model",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param queryRequest  (optional)
     * @return kotlin.collections.List<MetadataParameter>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun parameters(queryRequest: QueryRequest? = null) : kotlin.collections.List<MetadataParameter> {
        val localVarResponse = parametersWithHttpInfo(queryRequest = queryRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<MetadataParameter>
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
     * @param queryRequest  (optional)
     * @return ApiResponse<kotlin.collections.List<MetadataParameter>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun parametersWithHttpInfo(queryRequest: QueryRequest?) : ApiResponse<kotlin.collections.List<MetadataParameter>?> {
        val localVariableConfig = parametersRequestConfig(queryRequest = queryRequest)

        return request<QueryRequest, kotlin.collections.List<MetadataParameter>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation parameters
     *
     * @param queryRequest  (optional)
     * @return RequestConfig
     */
    fun parametersRequestConfig(queryRequest: QueryRequest?) : RequestConfig<QueryRequest> {
        val localVariableBody = queryRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/parameters",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param queryRequest 
     * @return MetadataSentence
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun sentence(queryRequest: QueryRequest) : MetadataSentence {
        val localVarResponse = sentenceWithHttpInfo(queryRequest = queryRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as MetadataSentence
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
     * @param queryRequest 
     * @return ApiResponse<MetadataSentence?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun sentenceWithHttpInfo(queryRequest: QueryRequest) : ApiResponse<MetadataSentence?> {
        val localVariableConfig = sentenceRequestConfig(queryRequest = queryRequest)

        return request<QueryRequest, MetadataSentence>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation sentence
     *
     * @param queryRequest 
     * @return RequestConfig
     */
    fun sentenceRequestConfig(queryRequest: QueryRequest) : RequestConfig<QueryRequest> {
        val localVariableBody = queryRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/sentence",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
