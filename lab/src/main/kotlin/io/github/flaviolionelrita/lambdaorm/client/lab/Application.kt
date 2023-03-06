package io.github.flaviolionelrita.lambdaorm.client.lab

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import io.github.flaviolionelrita.lambdaorm.client.OrmClient

@SpringBootApplication
class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args)
	println("ping:")
	val client = OrmClient("http://localhost:9291")
	println(client.ping().message)
	client.enums().forEach {
		println(it.name)
	}
}
