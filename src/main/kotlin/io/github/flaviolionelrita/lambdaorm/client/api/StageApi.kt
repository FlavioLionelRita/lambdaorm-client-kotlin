package io.github.flaviolionelrita.lambdaorm.client.api
import io.github.flaviolionelrita.lambdaorm.client.model.*
import reactor.core.publisher.Mono
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.RestClient

class StageApi(private val client: RestClient){
    suspend fun callImport(stage:String, data: SchemaData): Mono<SchemaData> = client.post<SchemaData>("/stages/${stage}/import",data ).bodyToMono(SchemaData::class.java)
    suspend fun export(stage:String): Mono<SchemaData> = client.get("/stages/${stage}/export").bodyToMono(SchemaData::class.java)
    suspend fun exists(stage:String): Mono<Boolean> = client.get("/stages/${stage}/exists").bodyToMono(Boolean::class.java)
}