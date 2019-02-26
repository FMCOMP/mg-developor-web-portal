/**
 * Moving Goods Microservices
 * FSM - Moving Goods Core Microservice - Delivery Service
 *
 * OpenAPI spec version: 0.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class Address (
  houseNumber: Option[String] = None,
  street: Option[String] = None,
  city: Option[String] = None,
  county: Option[String] = None,
  district: Option[String] = None,
  state: Option[String] = None,
  countryCode: Option[String] = None,
  postalCode: Option[String] = None
) extends ApiModel

