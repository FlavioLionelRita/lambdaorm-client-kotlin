package io.github.flaviolionelrita.lambdaorm.client
import io.github.flaviolionelrita.lambdaorm.client.api.*
import io.github.flaviolionelrita.lambdaorm.client.model.*
import io.github.flaviolionelrita.lambdaorm.client.model.Enum

class OrmClient {

    private val expression:ExpressionApi	
    private val general:GeneralApi
    private val schema:SchemaApi
    private val stage:StageApi

    constructor (basePath: String) {
        this.expression = ExpressionApi(basePath)
        this.general = GeneralApi(basePath)
        this.schema = SchemaApi(basePath)
        this.stage = StageApi(basePath)
    }

    // General
    fun ping() : Ping {
        return this.general.ping()
    }

    fun health() : Health {
        return this.general.health()
    }

    fun metrics() : Any {
        return this.general.metrics()
    }

    // Expression

    fun metadata(queryRequest: QueryRequest? = null) : Metadata {
        return this.expression.metadata(queryRequest)
    }

    fun sentence(queryRequest: QueryRequest) : MetadataSentence {
        return this.expression.sentence(queryRequest)
    }

    fun parameters(queryRequest: QueryRequest? = null) : List<MetadataParameter> {
        return this.expression.parameters(queryRequest)
    }

    fun model(queryRequest: QueryRequest? = null) : List<MetadataModel> {
        return this.expression.model(queryRequest)
    }

    fun constraints(queryRequest: QueryRequest? = null) : MetadataConstraint {
        return this.expression.constraints(queryRequest)
    }

    fun executeQueued(queryQueuedRequest: QueryQueuedRequest) : Any {
        return this.expression.executeQueued(queryQueuedRequest)
    }

    fun execute(queryRequest: QueryRequest) : Any {
        return this.expression.execute(queryRequest)
    }

    //    Schema
    fun entities() : List<Entity>  {
        return this.schema.entities()
    }

    fun entity(entity: String) : Entity {
        return this.schema.entity(entity)
    }

    fun enums() : List<Enum> {
        return this.schema.enums()
    }
    
    fun stage(stage: String) : Stage {
        return this.schema.stage(stage)
    }

    fun stages() : List<Stage> {
        return this.schema.stages()
    }

    // Stage

    fun existsStage(stage: String) : Boolean  {
        return this.stage.exists(stage)
    }

    fun export(stage: String) : SchemaData {
        return this.stage.export(stage)
    }

    fun import(stage: String, schemaData: SchemaData) : Any  {
        return this.stage.callImport(stage,schemaData)
    }

}