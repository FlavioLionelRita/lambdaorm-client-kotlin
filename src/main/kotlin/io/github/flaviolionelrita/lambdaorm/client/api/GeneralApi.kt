package io.github.flaviolionelrita.lambdaorm.client.api
import io.github.flaviolionelrita.lambdaorm.client.model.*
import reactor.core.publisher.Mono
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.IRestClient

class GeneralApi(private val client: IRestClient){
    suspend fun health(): Mono<Health> = client.get("/health").bodyToMono(Health::class.java)
    suspend fun ping(): Mono<Ping> = client.get("/ping").bodyToMono(Ping::class.java)
    suspend fun metrics(): Mono<Any> = client.get("/metrics").bodyToMono(Any::class.java)
}