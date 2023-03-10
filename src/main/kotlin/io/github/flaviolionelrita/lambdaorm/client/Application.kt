package io.github.flaviolionelrita.lambdaorm.client

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import io.github.flaviolionelrita.lambdaorm.client.OrmClient
import io.github.flaviolionelrita.lambdaorm.client.model.Health

@SpringBootApplication
class Application

suspend fun main(args: Array<String>) {
	runApplication<Application>(*args)
	val client = OrmClient("http://localhost:9291",null)
	val health = client.health().block()
	println(health?.message)
}