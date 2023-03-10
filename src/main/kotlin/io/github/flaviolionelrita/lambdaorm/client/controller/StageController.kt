package io.github.flaviolionelrita.lambdaorm.client.controller

import io.github.flaviolionelrita.lambdaorm.client.OrmClient
import io.github.flaviolionelrita.lambdaorm.client.model.*
import io.github.flaviolionelrita.lambdaorm.client.model.Enum
import org.jetbrains.annotations.NotNull
import reactor.core.publisher.Mono
import reactor.core.publisher.Flux
import org.springframework.web.bind.annotation.*

@RestController("stage")
class StageController(private val ormClient: OrmClient) {

    @GetMapping("/stages/{name}/exists")
    suspend fun existsStage(@NotNull @PathVariable(value = "name")name: String):Mono<Boolean> = ormClient.existsStage(name)
    @GetMapping("/stages/{name}/export")
    suspend fun export(@NotNull @PathVariable(value = "name")name: String):Mono<SchemaData> = ormClient.export(name)
    @PostMapping("/stages/{name}/import")
    suspend fun export(@NotNull @PathVariable(value = "name")name: String,@NotNull @RequestBody data: SchemaData):Mono<SchemaData> = ormClient.import(name,data)

}