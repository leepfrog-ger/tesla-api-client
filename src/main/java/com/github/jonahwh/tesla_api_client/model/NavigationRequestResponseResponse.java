/*
 * Tesla Model S JSON API
 * TODO: Add a description
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.jonahwh.tesla_api_client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-19T22:54:18.028-07:00")
public class NavigationRequestResponseResponse {
  @SerializedName("result")
  private Boolean result = null;

  @SerializedName("queued")
  private Boolean queued = null;

  public NavigationRequestResponseResponse result(Boolean result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  public Boolean isResult() {
    return result;
  }

  public void setResult(Boolean result) {
    this.result = result;
  }

  public NavigationRequestResponseResponse queued(Boolean queued) {
    this.queued = queued;
    return this;
  }

   /**
   * Get queued
   * @return queued
  **/
  @ApiModelProperty(value = "")
  public Boolean isQueued() {
    return queued;
  }

  public void setQueued(Boolean queued) {
    this.queued = queued;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NavigationRequestResponseResponse navigationRequestResponseResponse = (NavigationRequestResponseResponse) o;
    return Objects.equals(this.result, navigationRequestResponseResponse.result) &&
        Objects.equals(this.queued, navigationRequestResponseResponse.queued);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, queued);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NavigationRequestResponseResponse {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    queued: ").append(toIndentedString(queued)).append("\n");
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

