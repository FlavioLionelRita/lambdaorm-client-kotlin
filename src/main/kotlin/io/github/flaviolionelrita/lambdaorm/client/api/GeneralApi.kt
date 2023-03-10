package io.github.flaviolionelrita.lambdaorm.client.api
import io.github.flaviolionelrita.lambdaorm.client.model.Health
import reactor.core.publisher.Mono
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.RestClient

class GeneralApi(private val client: RestClient){
    suspend fun health(): Mono<Health> {
      return  this.client.get("/health").bodyToMono(Health::class.java)
    }
}