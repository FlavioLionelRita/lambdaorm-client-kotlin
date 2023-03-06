# GeneralApi

All URIs are relative to *http://localhost:9291*

Method | HTTP request | Description
------------- | ------------- | -------------
[**health**](GeneralApi.md#health) | **GET** /health | 
[**metrics**](GeneralApi.md#metrics) | **GET** /metrics | 
[**ping**](GeneralApi.md#ping) | **GET** /ping | 


<a name="health"></a>
# **health**
> Health health()



### Example
```kotlin
// Import classes:
//import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
//import io.github.flaviolionelrita.lambdaorm.client.model.*

val apiInstance = GeneralApi()
try {
    val result : Health = apiInstance.health()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GeneralApi#health")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GeneralApi#health")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Health**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="metrics"></a>
# **metrics**
> kotlin.Any metrics()



### Example
```kotlin
// Import classes:
//import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
//import io.github.flaviolionelrita.lambdaorm.client.model.*

val apiInstance = GeneralApi()
try {
    val result : kotlin.Any = apiInstance.metrics()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GeneralApi#metrics")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GeneralApi#metrics")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.Any**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ping"></a>
# **ping**
> Ping ping()



### Example
```kotlin
// Import classes:
//import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
//import io.github.flaviolionelrita.lambdaorm.client.model.*

val apiInstance = GeneralApi()
try {
    val result : Ping = apiInstance.ping()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GeneralApi#ping")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GeneralApi#ping")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Ping**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

