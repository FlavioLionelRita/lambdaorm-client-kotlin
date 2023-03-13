package io.github.flaviolionelrita.lambdaorm.client.infrastructure
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec
import java.awt.PageAttributes
import java.net.http.HttpHeaders

interface IRestClient {
    public suspend fun <T: Any> post(endpoint: String,data: T): ResponseSpec
    public suspend fun get(uri: String): ResponseSpec 
}