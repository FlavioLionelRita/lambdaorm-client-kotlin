package io.github.flaviolionelrita.lambdaorm.client
import io.github.flaviolionelrita.lambdaorm.client.api.*
import io.github.flaviolionelrita.lambdaorm.client.infrastructure.RestClient
import io.github.flaviolionelrita.lambdaorm.client.model.*
import io.github.flaviolionelrita.lambdaorm.client.model.Enum
import reactor.core.publisher.Mono
import reactor.core.publisher.Flux

class OrmClient(host: String, client: RestClient?) {
    private val client: RestClient
    private val general:GeneralApi
    private val schema:SchemaApi
    private val stage:StageApi
    private val expression:ExpressionApi
    init {
        if(client!= null) {
            this.client = client
        } else {
            this.client = RestClient(host)
        }
        this.general = GeneralApi(this.client)
        this.schema = SchemaApi(this.client)
        this.stage = StageApi(this.client)
        this.expression = ExpressionApi(this.client)
    }
    // General
    suspend fun ping() : Mono<Ping> = general.ping()
    suspend fun health() : Mono<Health> = general.health()
    suspend fun metrics() : Mono<Any> = general.metrics()

    // Schema
    suspend fun entities() : Flux<Entity>  = schema.entities()
    suspend fun entity(name: String) : Mono<Entity> = schema.entity(name)
    suspend fun enums() : Flux<Enum> = schema.enums()
    suspend fun enum(name: String) : Mono<Enum> = schema.enum(name)
    suspend fun stage(stage: String) : Mono<Stage> = schema.stage(stage)
    suspend fun stages() : Flux<Stage> = schema.stages()

    // Stage
    suspend fun existsStage(stage: String) : Mono<Boolean>  = this.stage.exists(stage)
    suspend fun export(stage: String) : Mono<SchemaData> =this.stage.export(stage)
    suspend fun import(stage: String, schemaData: SchemaData) : Mono<SchemaData>  = this.stage.callImport(stage,schemaData)

    // Expression
    suspend fun metadata(query: MetadataRequest) : Mono<Metadata> = expression.metadata(query)
  
    suspend fun parameters(query: MetadataRequest) : Flux<MetadataParameter> = expression.parameters(query)
    suspend fun getModel(query: MetadataRequest) : Flux<MetadataModel> = expression.getModel(query)
    suspend fun constraints(query: MetadataRequest) : Mono<MetadataConstraint> = expression.constraints(query)
    suspend fun sentence(query: SentenceRequest) : Flux<MetadataSentence> = expression.sentence(query)
    suspend fun execute(query: QueryRequest) : Flux<Any> = expression.execute(query)
    suspend fun executeQueued(query: QueryQueuedRequest) : Mono<QueryQueuedResponse> = expression.executeQueued(query)   
}