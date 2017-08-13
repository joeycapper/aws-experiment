package com.boilerplate

import java.util.{List => JavaList, Map => JavaMap}

import com.amazonaws.regions.{Region, Regions}
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient
import com.amazonaws.services.dynamodbv2.model.{AttributeValue, PutItemRequest}
import com.amazonaws.services.lambda.runtime.Context

import scala.collection.JavaConverters._

object Main {
  def runLambda(javaRequest: JavaMap[String, Object], context: Context): JavaList[String] = {
    val request = javaRequest.asScala
    request foreach println
    val result = dynamoClient.putItem(new PutItemRequest("Test", Map("id" -> new AttributeValue("value")).asJava))
    List("cunts", result.toString).asJava
  }

  private val dynamoClient: AmazonDynamoDBClient = new AmazonDynamoDBClient() { self =>
    setRegion(Region.getRegion(Regions.EU_WEST_1))
  }
}
