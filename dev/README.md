# Lambdaorm client kotlin

lambdaorm client for kotlin

## Create

- [spring initializr](https://start.spring.io/#!type=gradle-project-kotlin&language=kotlin&platformVersion=3.0.4&packaging=jar&jvmVersion=11&groupId=com.flaviolionelrita&artifactId=lambdaorm.client&name=lambdaorm.client&description=lambdaorm%20client%20for%20kotlin&packageName=com.flaviolionelrita.lambdaorm.client)

## Create Openapi

```kotlin
plugins {
  id "org.openapi.generator" version "6.3.0"
}

task openapi(type: org.openapitools.generator.gradle.plugin.tasks.GenerateTask){
    generatorName = "kotlin"
    inputSpec = "$rootDir/spec/lambda-svc.yaml".toString()
    outputDir = "$rootDir/client".toString()
    groupId = "org.flaviolrita.lambdaorm"
    id= "lambdaorm.client"
    version = "1.0.0"
    packageName = "org.flaviolrita.lambdaorm"
    apiPackage = "org.flaviolrita.lambdaorm.api"
    invokerPackage = "org.flaviolrita.lambdaorm.invoker"
    modelPackage = "org.flaviolrita.lambdaorm.model"
    configOptions = [
        dateLibrary: "java8"
    ]
    globalProperties = [
        modelDocs: "false"
    ]
}
```

Run:

```sh
gradle openapi
```



## Tasks

Openapi generator:

```sh
gradle openapi
```

Clean:

```sh
gradle creanAll
```

Build:

```sh
gradle buildAll
```



## Debugger

```sh
java', '-jar', '-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005', 'build/libs/lambdaorm.client-1.0.0.jar
```

### References

- [openapi generator](https://openapi-generator.tech/)
- [gradle configuration](https://openapi-generator.tech/docs/configuration/)
- [openapi plugin](https://github.com/OpenAPITools/openapi-generator/tree/master/modules/openapi-generator-gradle-plugin)
