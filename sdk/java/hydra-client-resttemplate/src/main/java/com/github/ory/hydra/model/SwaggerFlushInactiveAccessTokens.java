/*
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * OpenAPI spec version: latest
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.ory.hydra.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.github.ory.hydra.model.FlushInactiveOAuth2TokensRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SwaggerFlushInactiveAccessTokens swagger flush inactive access tokens
 */
@ApiModel(description = "SwaggerFlushInactiveAccessTokens swagger flush inactive access tokens")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-17T17:51:30.376+02:00")
public class SwaggerFlushInactiveAccessTokens {
  @JsonProperty("Body")
  private FlushInactiveOAuth2TokensRequest body = null;

  public SwaggerFlushInactiveAccessTokens body(FlushInactiveOAuth2TokensRequest body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @ApiModelProperty(value = "")
  public FlushInactiveOAuth2TokensRequest getBody() {
    return body;
  }

  public void setBody(FlushInactiveOAuth2TokensRequest body) {
    this.body = body;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwaggerFlushInactiveAccessTokens swaggerFlushInactiveAccessTokens = (SwaggerFlushInactiveAccessTokens) o;
    return Objects.equals(this.body, swaggerFlushInactiveAccessTokens.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwaggerFlushInactiveAccessTokens {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

