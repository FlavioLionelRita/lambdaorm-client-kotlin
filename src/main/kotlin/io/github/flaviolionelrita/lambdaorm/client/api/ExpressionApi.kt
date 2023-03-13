package io.github.flaviolionelrita.lambdaorm.client.api
import io.github.flaviolionelrita.lambdaorm.client.model.*
import io.github.flaviolionelrita.lambdaorm.client.model.Enum
import reactor.core.publisher.Mono
import reactor.core.publisher.Flux
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.IRestClient
class ExpressionApi(private val client: IRestClient){
    suspend fun constraints(query: MetadataRequest): Mono<MetadataConstraint> = client.post<MetadataRequest>("/constraints",query).bodyToMono(MetadataConstraint::class.java)
    suspend fun metadata(query: MetadataRequest): Mono<Metadata>  = client.post<MetadataRequest>("/metadata",query).bodyToMono(Metadata::class.java)
    suspend fun getModel(query: MetadataRequest): Flux<MetadataModel> = client.post<MetadataRequest>("/model",query).bodyToFlux(MetadataModel::class.java)
    suspend fun parameters(query: MetadataRequest): Flux<MetadataParameter> = client.post<MetadataRequest>("/parameters",query).bodyToFlux(MetadataParameter::class.java)
    suspend fun sentence(query: SentenceRequest): Flux<MetadataSentence> = client.post<SentenceRequest>("/sentence", query).bodyToFlux(MetadataSentence::class.java)
    suspend fun execute(query: QueryRequest): Flux<Any> = client.post<QueryRequest>("/execute",query).bodyToFlux(Any::class.java)
    suspend fun executeQueued(query: QueryQueuedRequest): Mono<QueryQueuedResponse> = client.post<QueryQueuedRequest>("/execute-queued",query).bodyToMono(QueryQueuedResponse::class.java)
}