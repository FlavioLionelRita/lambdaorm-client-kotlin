package io.github.flaviolionelrita.lambdaorm.client.infraestructure
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec

class RestClient(
    private val host: String,
    private val webClient: WebClient
) {

    public suspend fun <Data: Any> post(
        endpoint: String,
        data: Data
    ): ResponseSpec {
      return  webClient.post().uri("$host/$endpoint").body(BodyInserters.fromValue<Data>(data)).retrieve() 
    }

    public suspend fun get(endpoint: String): ResponseSpec {
      return  webClient.get().uri("$host/$endpoint").retrieve() 
    }
}