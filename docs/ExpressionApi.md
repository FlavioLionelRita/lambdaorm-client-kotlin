# ExpressionApi

All URIs are relative to *http://localhost:9291*

Method | HTTP request | Description
------------- | ------------- | -------------
[**constraints**](ExpressionApi.md#constraints) | **POST** /constraints | 
[**execute**](ExpressionApi.md#execute) | **POST** /execute | 
[**executeQueued**](ExpressionApi.md#executeQueued) | **POST** /execute-queued | 
[**metadata**](ExpressionApi.md#metadata) | **POST** /metadata | 
[**model**](ExpressionApi.md#model) | **POST** /model | 
[**parameters**](ExpressionApi.md#parameters) | **POST** /parameters | 
[**sentence**](ExpressionApi.md#sentence) | **POST** /sentence | 


<a name="constraints"></a>
# **constraints**
> MetadataConstraint constraints(queryRequest)



### Example
```kotlin
// Import classes:
//import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
//import io.github.flaviolionelrita.lambdaorm.client.model.*

val apiInstance = ExpressionApi()
val queryRequest : QueryRequest =  // QueryRequest | 
try {
    val result : MetadataConstraint = apiInstance.constraints(queryRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpressionApi#constraints")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpressionApi#constraints")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryRequest** | **QueryRequest**|  | [optional]

### Return type

**MetadataConstraint**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="execute"></a>
# **execute**
> kotlin.Any execute(queryRequest)



### Example
```kotlin
// Import classes:
//import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
//import io.github.flaviolionelrita.lambdaorm.client.model.*

val apiInstance = ExpressionApi()
val queryRequest : QueryRequest =  // QueryRequest | 
try {
    val result : kotlin.Any = apiInstance.execute(queryRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpressionApi#execute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpressionApi#execute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryRequest** | **QueryRequest**|  |

### Return type

**kotlin.Any**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="executeQueued"></a>
# **executeQueued**
> kotlin.Any executeQueued(queryQueuedRequest)



### Example
```kotlin
// Import classes:
//import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
//import io.github.flaviolionelrita.lambdaorm.client.model.*

val apiInstance = ExpressionApi()
val queryQueuedRequest : QueryQueuedRequest =  // QueryQueuedRequest | 
try {
    val result : kotlin.Any = apiInstance.executeQueued(queryQueuedRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpressionApi#executeQueued")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpressionApi#executeQueued")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryQueuedRequest** | **QueryQueuedRequest**|  |

### Return type

**kotlin.Any**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="metadata"></a>
# **metadata**
> Metadata metadata(queryRequest)



### Example
```kotlin
// Import classes:
//import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
//import io.github.flaviolionelrita.lambdaorm.client.model.*

val apiInstance = ExpressionApi()
val queryRequest : QueryRequest =  // QueryRequest | 
try {
    val result : Metadata = apiInstance.metadata(queryRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpressionApi#metadata")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpressionApi#metadata")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryRequest** | **QueryRequest**|  | [optional]

### Return type

**Metadata**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="model"></a>
# **model**
> kotlin.collections.List&lt;MetadataModel&gt; model(queryRequest)



### Example
```kotlin
// Import classes:
//import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
//import io.github.flaviolionelrita.lambdaorm.client.model.*

val apiInstance = ExpressionApi()
val queryRequest : QueryRequest =  // QueryRequest | 
try {
    val result : kotlin.collections.List<MetadataModel> = apiInstance.model(queryRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpressionApi#model")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpressionApi#model")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryRequest** | **QueryRequest**|  | [optional]

### Return type

**kotlin.collections.List&lt;MetadataModel&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="parameters"></a>
# **parameters**
> kotlin.collections.List&lt;MetadataParameter&gt; parameters(queryRequest)



### Example
```kotlin
// Import classes:
//import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
//import io.github.flaviolionelrita.lambdaorm.client.model.*

val apiInstance = ExpressionApi()
val queryRequest : QueryRequest =  // QueryRequest | 
try {
    val result : kotlin.collections.List<MetadataParameter> = apiInstance.parameters(queryRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpressionApi#parameters")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpressionApi#parameters")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryRequest** | **QueryRequest**|  | [optional]

### Return type

**kotlin.collections.List&lt;MetadataParameter&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sentence"></a>
# **sentence**
> MetadataSentence sentence(queryRequest)



### Example
```kotlin
// Import classes:
//import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
//import io.github.flaviolionelrita.lambdaorm.client.model.*

val apiInstance = ExpressionApi()
val queryRequest : QueryRequest =  // QueryRequest | 
try {
    val result : MetadataSentence = apiInstance.sentence(queryRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpressionApi#sentence")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpressionApi#sentence")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryRequest** | **QueryRequest**|  |

### Return type

**MetadataSentence**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

