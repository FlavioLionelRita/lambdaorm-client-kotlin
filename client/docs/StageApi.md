# StageApi

All URIs are relative to *http://localhost:9291*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callImport**](StageApi.md#callImport) | **POST** /stages/{stage}/import | 
[**exists**](StageApi.md#exists) | **GET** /stages/{stage}/exists | 
[**export**](StageApi.md#export) | **GET** /stages/{stage}/export | 


<a name="callImport"></a>
# **callImport**
> kotlin.Any callImport(stage, schemaData)



### Example
```kotlin
// Import classes:
//import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
//import io.github.flaviolionelrita.lambdaorm.client.model.*

val apiInstance = StageApi()
val stage : kotlin.String = stage_example // kotlin.String | 
val schemaData : SchemaData =  // SchemaData | 
try {
    val result : kotlin.Any = apiInstance.callImport(stage, schemaData)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StageApi#callImport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StageApi#callImport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stage** | **kotlin.String**|  |
 **schemaData** | **SchemaData**|  |

### Return type

**kotlin.Any**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="exists"></a>
# **exists**
> kotlin.Boolean exists(stage)



### Example
```kotlin
// Import classes:
//import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
//import io.github.flaviolionelrita.lambdaorm.client.model.*

val apiInstance = StageApi()
val stage : kotlin.String = stage_example // kotlin.String | 
try {
    val result : kotlin.Boolean = apiInstance.exists(stage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StageApi#exists")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StageApi#exists")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stage** | **kotlin.String**|  |

### Return type

**kotlin.Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="export"></a>
# **export**
> SchemaData export(stage)



### Example
```kotlin
// Import classes:
//import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
//import io.github.flaviolionelrita.lambdaorm.client.model.*

val apiInstance = StageApi()
val stage : kotlin.String = stage_example // kotlin.String | 
try {
    val result : SchemaData = apiInstance.export(stage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StageApi#export")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StageApi#export")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stage** | **kotlin.String**|  |

### Return type

**SchemaData**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

