package io.github.flaviolionelrita.lambdaorm.client.lab

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import io.github.flaviolionelrita.lambdaorm.client.api.GeneralApi

@SpringBootApplication
class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args)
	println("ping:")
	val general = GeneralApi()
	println(general.ping().message)
}
