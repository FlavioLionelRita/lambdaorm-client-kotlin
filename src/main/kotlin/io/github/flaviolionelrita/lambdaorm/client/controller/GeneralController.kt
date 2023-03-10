package io.github.flaviolionelrita.lambdaorm.client.controller

import io.github.flaviolionelrita.lambdaorm.client.OrmClient
import io.github.flaviolionelrita.lambdaorm.client.model.*
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono
@RestController("general")
class GeneralController(private val ormClient:OrmClient) {
    @GetMapping("/health")
    suspend fun health():Mono<Health> {
	    return ormClient.health()
    }
    @GetMapping("/ping")
    suspend fun ping():Mono<Ping> {
        return ormClient.ping()
    }

    @GetMapping("/metrics")
    suspend fun metrics():Mono<Any> {
        return ormClient.metrics()
    }

}