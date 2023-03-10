package io.github.flaviolionelrita.lambdaorm.client.controller

import io.github.flaviolionelrita.lambdaorm.client.OrmClient
import io.github.flaviolionelrita.lambdaorm.client.model.*
import io.github.flaviolionelrita.lambdaorm.client.model.Enum
import org.jetbrains.annotations.NotNull
import reactor.core.publisher.Mono
import reactor.core.publisher.Flux
import org.springframework.web.bind.annotation.*

@RestController("expression")
class ExpressionController(private val ormClient: OrmClient) {
    @PostMapping("/metadata")
    suspend fun metadata(@NotNull @RequestBody query: QueryRequest) : Mono<Metadata> = ormClient.metadata(query)
    @PostMapping("/sentence")
    suspend fun sentence(@NotNull @RequestBody query: QueryRequest) : Mono<MetadataSentence> = ormClient.sentence(query)
    @PostMapping("/parameters")
    suspend fun parameters(@NotNull @RequestBody query: QueryRequest) : Flux<MetadataParameter> = ormClient.parameters(query)
    @PostMapping("/model")
    suspend fun getModel(@NotNull @RequestBody query: QueryRequest) : Flux<MetadataModel> = ormClient.getModel(query)
    @PostMapping("/constraints")
    suspend fun constraints(@NotNull @RequestBody query: QueryRequest) : Mono<MetadataConstraint> = ormClient.constraints(query)
    @PostMapping("/execute-queued")
    suspend fun executeQueued(@NotNull @RequestBody query: QueryQueuedRequest) : Mono<QueryQueuedResponse> = ormClient.executeQueued(query)
    @PostMapping("/execute")
    suspend fun execute(@NotNull @RequestBody query: QueryRequest) : Flux<Any> = ormClient.execute(query)

}