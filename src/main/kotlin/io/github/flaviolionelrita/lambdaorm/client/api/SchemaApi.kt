package io.github.flaviolionelrita.lambdaorm.client.api
import io.github.flaviolionelrita.lambdaorm.client.model.*
import io.github.flaviolionelrita.lambdaorm.client.model.Enum
import reactor.core.publisher.Mono
import reactor.core.publisher.Flux
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.IRestClient
class SchemaApi(private val client: IRestClient){
    suspend fun enums(): Flux<Enum> = client.get("/enums").bodyToFlux(Enum::class.java)
    suspend fun enum(name:String): Mono<Enum> = client.get("/enums/$name").bodyToMono(Enum::class.java)
    suspend fun entities(): Flux<Entity> = client.get("/entities").bodyToFlux(Entity::class.java)
    suspend fun entity(name:String): Mono<Entity> = client.get("/entities/$name").bodyToMono(Entity::class.java)
    suspend fun stages(): Flux<Stage> = client.get("/stages").bodyToFlux(Stage::class.java)
    suspend fun stage(name:String): Mono<Stage> = client.get("/stages/$name").bodyToMono(Stage::class.java)
}