package com.fasterxml.jackson.module.scala.deser

import org.codehaus.jackson.`type`.JavaType
import org.codehaus.jackson.map._
import deser.StdDeserializer
import org.codehaus.jackson.{JsonToken,JsonParser}
import collection.JavaConversions._

class ScalaMapDeserializer extends JsonDeserializer[Map[Any,Any]] {

	def deserialize(jp: JsonParser, ctxt: DeserializationContext) = {
		//val javaMap = javaDeserializer.deserialize(jp, ctxt)//.asInstanceOf[java.util.Map]
		//asMap[Any, Any](javaMap)

		null
	}
}