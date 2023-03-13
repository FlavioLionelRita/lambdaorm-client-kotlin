package io.github.flaviolionelrita.lambdaorm.client.infrastructure
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec
import java.awt.PageAttributes
import java.net.http.HttpHeaders

class RestClient: IRestClient {
    private val webClient: WebClient
    constructor (host:String) {
        this.webClient =  WebClient.create(host)
    }


    override public suspend fun <T: Any> post(
        endpoint: String,
        data: T
    ): ResponseSpec {
      return  webClient.post().uri(endpoint).body(BodyInserters.fromValue<T>(data)).retrieve()
    }

    override public suspend fun get(uri: String): ResponseSpec {
      return  webClient.get().uri(uri).retrieve()
    }
}