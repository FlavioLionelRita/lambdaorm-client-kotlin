# Lambdaorm client kotlin

lambdaorm client for kotlin

## Expression methods

Method | HTTP request | Description
------------- | ------------- | -------------
[**constraints**](ExpressionApi.md#constraints) | **POST** /constraints |
[**execute**](ExpressionApi.md#execute) | **POST** /execute |
[**executeQueued**](ExpressionApi.md#executeQueued) | **POST** /execute-queued |
[**metadata**](ExpressionApi.md#metadata) | **POST** /metadata |
[**model**](ExpressionApi.md#model) | **POST** /model |
[**parameters**](ExpressionApi.md#parameters) | **POST** /parameters |
[**sentence**](ExpressionApi.md#sentence) | **POST** /sentence |

### Constraints

Example:

```kotlin
// Import classes:
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
import io.github.flaviolionelrita.lambdaorm.client.model.*
import io.github.flaviolionelrita.lambdaorm.client.OrmClient

val ormClient = OrmClient("http://localhost:9291")
val queryRequest : QueryRequest =  // QueryRequest | 
try {
    val result : MetadataConstraint = ormClient.constraints(queryRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrmClient#constraints")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrmClient#constraints")
    e.printStackTrace()
}
```

Parameters:

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryRequest** | **QueryRequest**|  | [optional]

### Execute

Example:

```kotlin
// Import classes:
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
import io.github.flaviolionelrita.lambdaorm.client.model.*
import io.github.flaviolionelrita.lambdaorm.client.OrmClient

val ormClient = OrmClient("http://localhost:9291")
val queryRequest : QueryRequest =  // QueryRequest | 
try {
    val result : kotlin.Any = ormClient.execute(queryRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrmClient#execute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrmClient#execute")
    e.printStackTrace()
}
```

Parameters:

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryRequest** | **QueryRequest**|  |

### ExecuteQueued

Example:

```kotlin
// Import classes:
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
import io.github.flaviolionelrita.lambdaorm.client.model.*
import io.github.flaviolionelrita.lambdaorm.client.OrmClient

val ormClient = OrmClient("http://localhost:9291")
val queryQueuedRequest : QueryQueuedRequest =  // QueryQueuedRequest | 
try {
    val result : kotlin.Any = ormClient.executeQueued(queryQueuedRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrmClient#executeQueued")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrmClient#executeQueued")
    e.printStackTrace()
}
```

Parameters:

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryQueuedRequest** | **QueryQueuedRequest**|  |

### Metadata

Example:

```kotlin
// Import classes:
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
import io.github.flaviolionelrita.lambdaorm.client.model.*
import io.github.flaviolionelrita.lambdaorm.client.OrmClient

val ormClient = OrmClient("http://localhost:9291")
val queryRequest : QueryRequest =  // QueryRequest | 
try {
    val result : Metadata = ormClient.metadata(queryRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrmClient#metadata")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrmClient#metadata")
    e.printStackTrace()
}
```

Parameters:

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryRequest** | **QueryRequest**|  | [optional]

### Model

Example:

```kotlin
// Import classes:
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
import io.github.flaviolionelrita.lambdaorm.client.model.*
import io.github.flaviolionelrita.lambdaorm.client.OrmClient

val ormClient = OrmClient("http://localhost:9291")
val queryRequest : QueryRequest =  // QueryRequest | 
try {
    val result : kotlin.collections.List<MetadataModel> = ormClient.model(queryRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrmClient#model")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrmClient#model")
    e.printStackTrace()
}
```

Parameters:

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryRequest** | **QueryRequest**|  | [optional]

### Parameters

Example:

```kotlin
// Import classes:
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
import io.github.flaviolionelrita.lambdaorm.client.model.*
import io.github.flaviolionelrita.lambdaorm.client.OrmClient

val ormClient = OrmClient("http://localhost:9291")
val queryRequest : QueryRequest =  // QueryRequest | 
try {
    val result : kotlin.collections.List<MetadataParameter> = ormClient.parameters(queryRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrmClient#parameters")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrmClient#parameters")
    e.printStackTrace()
}
```

Parameters:

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryRequest** | **QueryRequest**|  | [optional]

### Sentence

Example:

```kotlin
// Import classes:
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
import io.github.flaviolionelrita.lambdaorm.client.model.*
import io.github.flaviolionelrita.lambdaorm.client.OrmClient

val ormClient = OrmClient("http://localhost:9291")
val queryRequest : QueryRequest =  // QueryRequest | 
try {
    val result : MetadataSentence = ormClient.sentence(queryRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrmClient#sentence")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrmClient#sentence")
    e.printStackTrace()
}
```

Parameters:

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryRequest** | **QueryRequest**|  |

## General methods

Method | HTTP request | Description
------------- | ------------- | -------------
[**health**](GeneralApi.md#health) | **GET** /health |
[**metrics**](GeneralApi.md#metrics) | **GET** /metrics |
[**ping**](GeneralApi.md#ping) | **GET** /ping |

### Health

Example:

```kotlin
// Import classes:
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
import io.github.flaviolionelrita.lambdaorm.client.model.*
import io.github.flaviolionelrita.lambdaorm.client.OrmClient

val ormClient = OrmClient("http://localhost:9291")
try {
    val result : Health = ormClient.health()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrmClient#health")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrmClient#health")
    e.printStackTrace()
}
```

### Metrics

Example:

```kotlin
// Import classes:
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
import io.github.flaviolionelrita.lambdaorm.client.model.*
import io.github.flaviolionelrita.lambdaorm.client.OrmClient

val ormClient = OrmClient("http://localhost:9291")
try {
    val result : kotlin.Any = ormClient.metrics()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrmClient#metrics")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrmClient#metrics")
    e.printStackTrace()
}
```

### Ping

Example:

```kotlin
// Import classes:
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
import io.github.flaviolionelrita.lambdaorm.client.model.*
import io.github.flaviolionelrita.lambdaorm.client.OrmClient

val ormClient = OrmClient("http://localhost:9291")
try {
    val result : Ping = ormClient.ping()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrmClient#ping")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrmClient#ping")
    e.printStackTrace()
}
```

## Schema methods

Method | HTTP request | Description
------------- | ------------- | -------------
[**entities**](SchemaApi.md#entities) | **GET** /entities |
[**entity**](SchemaApi.md#entity) | **GET** /entities/{entity} |
[**enums**](SchemaApi.md#enums) | **GET** /enums |
[**enum**](SchemaApi.md#callEnum) | **GET** /enums/{enum} |
[**stage**](SchemaApi.md#stage) | **GET** /stages/{stage} |
[**stages**](SchemaApi.md#stages) | **GET** /stages |

### Entities

Example:

```kotlin
// Import classes:
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
import io.github.flaviolionelrita.lambdaorm.client.model.*
import io.github.flaviolionelrita.lambdaorm.client.OrmClient

val ormClient = OrmClient("http://localhost:9291")
try {
    val result : kotlin.collections.List<Entity> = ormClient.entities()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrmClient#entities")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrmClient#entities")
    e.printStackTrace()
}
```

### Entity

Example:

```kotlin
// Import classes:
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
import io.github.flaviolionelrita.lambdaorm.client.model.*
import io.github.flaviolionelrita.lambdaorm.client.OrmClient

val ormClient = OrmClient("http://localhost:9291")
val entity : kotlin.String = entity_example // kotlin.String | 
try {
    val result : Entity = ormClient.entity(entity)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrmClient#entity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrmClient#entity")
    e.printStackTrace()
}
```

Parameters:

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | **kotlin.String**|  |

### Enums

Example:

```kotlin
// Import classes:
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
import io.github.flaviolionelrita.lambdaorm.client.model.*
import io.github.flaviolionelrita.lambdaorm.client.OrmClient

val ormClient = OrmClient("http://localhost:9291")
try {
    val result : kotlin.collections.List<Enum> = ormClient.enums()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrmClient#enums")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrmClient#enums")
    e.printStackTrace()
}
```

### Enum

Example:

```kotlin
// Import classes:
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
import io.github.flaviolionelrita.lambdaorm.client.model.*
import io.github.flaviolionelrita.lambdaorm.client.OrmClient

val ormClient = OrmClient("http://localhost:9291")
val `enum` : kotlin.String = `enum`_example // kotlin.String | 
try {
    val result : Enum = ormClient.enum(`enum`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrmClient#callEnum")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrmClient#callEnum")
    e.printStackTrace()
}
```

Parameters:

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **&#x60;enum&#x60;** | **kotlin.String**|  |

### Stage

Example:

```kotlin
// Import classes:
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
import io.github.flaviolionelrita.lambdaorm.client.model.*
import io.github.flaviolionelrita.lambdaorm.client.OrmClient

val ormClient = OrmClient("http://localhost:9291")
val stage : kotlin.String = stage_example // kotlin.String | 
try {
    val result : Stage = ormClient.stage(stage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrmClient#stage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrmClient#stage")
    e.printStackTrace()
}
```

Parameters:

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stage** | **kotlin.String**|  |

### Stages

Example:

```kotlin
// Import classes:
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
import io.github.flaviolionelrita.lambdaorm.client.model.*
import io.github.flaviolionelrita.lambdaorm.client.OrmClient

val ormClient = OrmClient("http://localhost:9291")
try {
    val result : kotlin.collections.List<Stage> = ormClient.stages()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrmClient#stages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrmClient#stages")
    e.printStackTrace()
}
```

## Stage methods

Method | HTTP request | Description
------------- | ------------- | -------------
[**import**](StageApi.md#callImport) | **POST** /stages/{stage}/import |
[**existsStage**](StageApi.md#exists) | **GET** /stages/{stage}/exists |
[**export**](StageApi.md#export) | **GET** /stages/{stage}/export |

### Import

Example:

```kotlin
// Import classes:
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
import io.github.flaviolionelrita.lambdaorm.client.model.*
import io.github.flaviolionelrita.lambdaorm.client.OrmClient

val ormClient = OrmClient("http://localhost:9291")
val stage : kotlin.String = stage_example // kotlin.String | 
val schemaData : SchemaData =  // SchemaData | 
try {
    val result : kotlin.Any = ormClient.import(stage, schemaData)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrmClient#import")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrmClient#import")
    e.printStackTrace()
}
```

Parameters:

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stage** | **kotlin.String**|  |
 **schemaData** | **SchemaData**|  |

### Exists Stage

Example:

```kotlin
// Import classes:
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
import io.github.flaviolionelrita.lambdaorm.client.model.*
import io.github.flaviolionelrita.lambdaorm.client.OrmClient

val ormClient = OrmClient("http://localhost:9291")
val stage : kotlin.String = stage_example // kotlin.String | 
try {
    val result : kotlin.Boolean = ormClient.existsStage(stage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrmClient#existsStage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrmClient#existsStage")
    e.printStackTrace()
}
```

Parameters:

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stage** | **kotlin.String**|  |

### Export

Example:

```kotlin
// Import classes:
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.*
import io.github.flaviolionelrita.lambdaorm.client.model.*
import io.github.flaviolionelrita.lambdaorm.client.OrmClient

val ormClient = OrmClient("http://localhost:9291")
val stage : kotlin.String = stage_example // kotlin.String | 
try {
    val result : SchemaData = ormClient.export(stage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrmClient#export")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrmClient#export")
    e.printStackTrace()
}
```

Parameters:

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stage** | **kotlin.String**|  |
