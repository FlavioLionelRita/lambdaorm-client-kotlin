package io.github.flaviolionelrita.lambdaorm.client.infrastructure
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec
import java.awt.PageAttributes
import java.net.http.HttpHeaders

class RestClient {
    private val webClient: WebClient
    constructor (host:String) {
        this.webClient =  WebClient.create(host)
    }


//    public suspend fun <Data: Any> post(
//        endpoint: String,
//        data: Data
//    ): ResponseSpec {
//      return  webClient.post().uri("$host/$endpoint").body(BodyInserters.fromValue<Data>(data)).retrieve()
//    }

    public suspend fun get(uri: String): ResponseSpec {
      return  webClient.get().uri(uri).retrieve()
    }
}