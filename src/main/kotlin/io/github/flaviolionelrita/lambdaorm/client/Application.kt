package io.github.flaviolionelrita.lambdaorm.client

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Application

suspend fun main(args: Array<String>) {
	runApplication<Application>(*args)
}