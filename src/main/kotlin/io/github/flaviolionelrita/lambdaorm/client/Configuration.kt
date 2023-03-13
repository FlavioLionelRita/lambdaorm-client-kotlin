package io.github.flaviolionelrita.lambdaorm.client.lab

import org.springframework.context.annotation.Configuration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Bean
import io.github.flaviolionelrita.lambdaorm.client.OrmClient
@Configuration
@EnableAutoConfiguration
class Configuration {

    @Bean
    fun ormClient(): OrmClient = OrmClient("http://localhost:9291")
}