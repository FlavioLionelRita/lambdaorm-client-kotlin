package io.github.flaviolionelrita.lambdaorm.client.controller

import io.github.flaviolionelrita.lambdaorm.client.OrmClient
import io.github.flaviolionelrita.lambdaorm.client.model.Health
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono
@RestController("test")
class Test {
    @GetMapping("/health")
    suspend fun health():Mono<Health> {
        val client = OrmClient("http://localhost:9291",null)
	    return client.health()
    }

}