package io.github.flaviolionelrita.lambdaorm.client.api
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec
import io.github.flaviolionelrita.lambdaorm.client.model.Health
import reactor.core.publisher.Flux
import io.github.flaviolionelrita.lambdaorm.client.infraestructure.*

class GeneralApi(private val client: RestClient){
    public suspend fun healt(): Flux<Health> {      
      return  this.client.get("/health").bodyToFlux(Health::class.java)
    }
}