package io.github.flaviolionelrita.lambdaorm.client.api
import io.github.flaviolionelrita.lambdaorm.client.model.*
import io.github.flaviolionelrita.lambdaorm.client.model.Enum
import reactor.core.publisher.Mono
import reactor.core.publisher.Flux
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.RestClient
class ExpressionApi(private val client: RestClient){
    suspend fun constraints(query: QueryRequest): Mono<MetadataConstraint> = client.post<QueryRequest>("/constraints",query).bodyToMono(MetadataConstraint::class.java)
    suspend fun metadata(query: QueryRequest): Mono<Metadata>  = client.post<QueryRequest>("/constraints",query).bodyToMono(Metadata::class.java)
    suspend fun model(query: QueryRequest): Flux<MetadataModel> = client.post<QueryRequest>("/model",query).bodyToFlux(MetadataModel::class.java)
    suspend fun parameters(query: QueryRequest): Flux<MetadataParameter> = client.post<QueryRequest>("/parameters",query).bodyToFlux(MetadataParameter::class.java)
    suspend fun sentence(query: QueryRequest): Mono<MetadataSentence> = client.post<QueryRequest>("/sentence",query).bodyToMono(MetadataSentence::class.java)
    suspend fun execute(query: QueryRequest): Flux<Any> = client.post<QueryRequest>("/execute",query).bodyToFlux(Any::class.java)
    suspend fun executeQueued(query: QueryQueuedRequest): Mono<QueryQueuedResponse> = client.post<QueryQueuedRequest>("/execute-queued",query).bodyToMono(QueryQueuedResponse::class.java)
}