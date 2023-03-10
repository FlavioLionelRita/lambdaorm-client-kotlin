package io.github.flaviolionelrita.lambdaorm.client

import org.springframework.context.annotation.Configuration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Bean
@Configuration
@EnableAutoConfiguration
class Configuration {

    @Bean
    fun ormClient(): OrmClient = OrmClient("http://localhost:9291",null)
}