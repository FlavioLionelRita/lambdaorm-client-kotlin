package io.github.flaviolionelrita.lambdaorm.client
import org.springframework.util.LinkedMultiValueMap
import org.springframework.util.MultiValueMap
import reactor.core.publisher.Flux
import io.github.flaviolionelrita.lambdaorm.client.model.QueryRequest
import io.github.flaviolionelrita.lambdaorm.client.model.QueryOptions
import io.github.flaviolionelrita.lambdaorm.client.Result

abstract class Repository<TEntity : Any>(
    private val entityName: String,
    private val client: OrmClient,
    private val stage: String
) {
  private suspend fun query(
      head: String,
      filter: String?,
      include: String?,
      sort: String? = null,
      limit: Int? = null,
      offset: Int? = null,
      data: MultiValueMap<String, Any> = LinkedMultiValueMap<String, Any>()
  ): Flux<Any> {
    var expression = "$head"
    if (filter != null) expression = "$expression.filter($filter)"
    if (include != null) expression = "$expression.include($include)"
    if (sort != null) expression = "$expression.sort($sort)"
    if (limit != null || offset != null) {
      val _limit = if (limit != null) limit else 20
      val _offset = if (offset != null) offset else 0
      expression = "$expression.page($_limit,$_offset)"
    }
    val options =  QueryOptions(stage)
    val queryRequest = QueryRequest(expression,options,data)
    return this.client.execute(queryRequest)
  }

  private suspend fun execute(
      head: String,
      filter: String?,
      include: String?,
      data: Any
  ): Flux<Any> {
    var expression = "$head"
    if (filter != null) expression = "$expression.filter($filter)"
    if (include != null) expression = "$expression.include($include)"
    
    val options =  QueryOptions(stage)
    val queryRequest = QueryRequest(expression,options,data)
    return this.client.execute(queryRequest)   
  }

  suspend fun list(
      filter: String? = null,
      include: String? = null,
      sort: String? = null,
      limit: Int? = null,
      offset: Int? = null,
      parameters: MultiValueMap<String, Any> = LinkedMultiValueMap<String, Any>()
  ): Flux<Any> = this.query(entityName, filter, include, sort, limit, offset, parameters)

  suspend fun distinct(
      filter: String? = null,
      include: String? = null,
      sort: String? = null,
      limit: Int? = null,
      offset: Int? = null,
      parameters: MultiValueMap<String, Any> = LinkedMultiValueMap<String, Any>()
  ): Flux<Any> = this.query("$entityName.distinct()", filter, include, sort, limit, offset, parameters)

  suspend fun first(
      filter: String? = null,
      include: String? = null,
      sort: String? = null,
      parameters: MultiValueMap<String, Any> = LinkedMultiValueMap<String, Any>()
  ): Flux<Any> = this.query("$entityName.first()", filter, include, sort, null, null, parameters)

  suspend fun last(
      filter: String? = null,
      include: String? = null,
      sort: String? = null,
      parameters: MultiValueMap<String, Any> = LinkedMultiValueMap<String, Any>()
  ): Flux<Any> = this.query("$entityName.last()", filter, include, sort, null, null, parameters)

  suspend fun take(
      filter: String? = null,
      include: String? = null,
      sort: String? = null,
      parameters: MultiValueMap<String, Any> = LinkedMultiValueMap<String, Any>()
  ): Flux<Any> = this.query("$entityName.take()", filter, include, sort, null, null, parameters)

  suspend fun insert(entity: TEntity, include: String? = null)
  : Flux<Any> = this.execute("$entityName.insert()", null, include, entity)

  suspend fun bulkInsert(entities: List<TEntity>, include: String? = null)
  : Flux<Any> = this.execute("$entityName.bulkInsert()", null, include, entities)

  suspend fun update(entity: TEntity, include: String? = null)
  : Flux<Any> = this.execute("$entityName.update()", null, include, entity)

  suspend fun updateAll(
      map: String,
      filter: String? = null,
      include: String? = null,
      parameters: Any = {}
  ): Flux<Any> = this.execute("$entityName.updateAll($map)", filter, include, parameters)

  suspend fun delete(entity: TEntity, include: String? = null)
  : Flux<Any> = this.execute("$entityName.delete()", null, include, entity)

  suspend fun deleteAll(
      filter: String? = null,
      include: String? = null,
      parameters: Any = {}
  ): Flux<Any> = this.execute("$entityName.deleteAll()", filter, include, parameters)
}
