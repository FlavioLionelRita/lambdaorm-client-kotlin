# SchemaApi

All URIs are relative to *http://localhost:9291*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callEnum**](SchemaApi.md#callEnum) | **GET** /enums/{enum} | 
[**dataSources**](SchemaApi.md#dataSources) | **GET** /datasources | 
[**datasource**](SchemaApi.md#datasource) | **GET** /datasources/{datasource} | 
[**entities**](SchemaApi.md#entities) | **GET** /entities | 
[**entity**](SchemaApi.md#entity) | **GET** /entities/{entity} | 
[**entityMapping**](SchemaApi.md#entityMapping) | **GET** /mappings/{mapping}/{entity} | 
[**enums**](SchemaApi.md#enums) | **GET** /enums | 
[**mapping**](SchemaApi.md#mapping) | **GET** /mappings/{mapping} | 
[**mappings**](SchemaApi.md#mappings) | **GET** /mappings | 
[**stage**](SchemaApi.md#stage) | **GET** /stages/{stage} | 
[**stages**](SchemaApi.md#stages) | **GET** /stages | 


<a name="callEnum"></a>
# **callEnum**
> Enum callEnum(`enum`)



### Example
```kotlin
// Import classes:
//import org.flaviolrita.lambdaorm.infrastructure.*
//import org.flaviolrita.lambdaorm.model.*

val apiInstance = SchemaApi()
val `enum` : kotlin.String = `enum`_example // kotlin.String | 
try {
    val result : Enum = apiInstance.callEnum(`enum`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SchemaApi#callEnum")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SchemaApi#callEnum")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;enum&#x60;** | **kotlin.String**|  |

### Return type

**Enum**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dataSources"></a>
# **dataSources**
> kotlin.collections.List&lt;DataSource&gt; dataSources()



### Example
```kotlin
// Import classes:
//import org.flaviolrita.lambdaorm.infrastructure.*
//import org.flaviolrita.lambdaorm.model.*

val apiInstance = SchemaApi()
try {
    val result : kotlin.collections.List<DataSource> = apiInstance.dataSources()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SchemaApi#dataSources")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SchemaApi#dataSources")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.collections.List&lt;DataSource&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datasource"></a>
# **datasource**
> DataSource datasource(datasource)



### Example
```kotlin
// Import classes:
//import org.flaviolrita.lambdaorm.infrastructure.*
//import org.flaviolrita.lambdaorm.model.*

val apiInstance = SchemaApi()
val datasource : kotlin.String = datasource_example // kotlin.String | 
try {
    val result : DataSource = apiInstance.datasource(datasource)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SchemaApi#datasource")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SchemaApi#datasource")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**|  |

### Return type

**DataSource**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="entities"></a>
# **entities**
> kotlin.collections.List&lt;Entity&gt; entities()



### Example
```kotlin
// Import classes:
//import org.flaviolrita.lambdaorm.infrastructure.*
//import org.flaviolrita.lambdaorm.model.*

val apiInstance = SchemaApi()
try {
    val result : kotlin.collections.List<Entity> = apiInstance.entities()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SchemaApi#entities")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SchemaApi#entities")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.collections.List&lt;Entity&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="entity"></a>
# **entity**
> Entity entity(entity)



### Example
```kotlin
// Import classes:
//import org.flaviolrita.lambdaorm.infrastructure.*
//import org.flaviolrita.lambdaorm.model.*

val apiInstance = SchemaApi()
val entity : kotlin.String = entity_example // kotlin.String | 
try {
    val result : Entity = apiInstance.entity(entity)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SchemaApi#entity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SchemaApi#entity")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | **kotlin.String**|  |

### Return type

**Entity**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="entityMapping"></a>
# **entityMapping**
> EntityMapping entityMapping(mapping, entity)



### Example
```kotlin
// Import classes:
//import org.flaviolrita.lambdaorm.infrastructure.*
//import org.flaviolrita.lambdaorm.model.*

val apiInstance = SchemaApi()
val mapping : kotlin.String = mapping_example // kotlin.String | 
val entity : kotlin.String = entity_example // kotlin.String | 
try {
    val result : EntityMapping = apiInstance.entityMapping(mapping, entity)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SchemaApi#entityMapping")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SchemaApi#entityMapping")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mapping** | **kotlin.String**|  |
 **entity** | **kotlin.String**|  |

### Return type

**EntityMapping**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="enums"></a>
# **enums**
> kotlin.collections.List&lt;Enum&gt; enums()



### Example
```kotlin
// Import classes:
//import org.flaviolrita.lambdaorm.infrastructure.*
//import org.flaviolrita.lambdaorm.model.*

val apiInstance = SchemaApi()
try {
    val result : kotlin.collections.List<Enum> = apiInstance.enums()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SchemaApi#enums")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SchemaApi#enums")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.collections.List&lt;Enum&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="mapping"></a>
# **mapping**
> Mapping mapping(mapping)



### Example
```kotlin
// Import classes:
//import org.flaviolrita.lambdaorm.infrastructure.*
//import org.flaviolrita.lambdaorm.model.*

val apiInstance = SchemaApi()
val mapping : kotlin.String = mapping_example // kotlin.String | 
try {
    val result : Mapping = apiInstance.mapping(mapping)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SchemaApi#mapping")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SchemaApi#mapping")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mapping** | **kotlin.String**|  |

### Return type

**Mapping**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="mappings"></a>
# **mappings**
> kotlin.collections.List&lt;Mapping&gt; mappings()



### Example
```kotlin
// Import classes:
//import org.flaviolrita.lambdaorm.infrastructure.*
//import org.flaviolrita.lambdaorm.model.*

val apiInstance = SchemaApi()
try {
    val result : kotlin.collections.List<Mapping> = apiInstance.mappings()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SchemaApi#mappings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SchemaApi#mappings")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.collections.List&lt;Mapping&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stage"></a>
# **stage**
> Stage stage(stage)



### Example
```kotlin
// Import classes:
//import org.flaviolrita.lambdaorm.infrastructure.*
//import org.flaviolrita.lambdaorm.model.*

val apiInstance = SchemaApi()
val stage : kotlin.String = stage_example // kotlin.String | 
try {
    val result : Stage = apiInstance.stage(stage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SchemaApi#stage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SchemaApi#stage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stage** | **kotlin.String**|  |

### Return type

**Stage**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stages"></a>
# **stages**
> kotlin.collections.List&lt;Stage&gt; stages()



### Example
```kotlin
// Import classes:
//import org.flaviolrita.lambdaorm.infrastructure.*
//import org.flaviolrita.lambdaorm.model.*

val apiInstance = SchemaApi()
try {
    val result : kotlin.collections.List<Stage> = apiInstance.stages()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SchemaApi#stages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SchemaApi#stages")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.collections.List&lt;Stage&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

