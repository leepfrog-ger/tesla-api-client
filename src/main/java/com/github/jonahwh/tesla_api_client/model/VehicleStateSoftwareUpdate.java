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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * VehicleStateSoftwareUpdate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-27T18:43:45.566-07:00")
public class VehicleStateSoftwareUpdate {
  @SerializedName("expected_duration_sec")
  private BigDecimal expectedDurationSec = null;

  @SerializedName("status")
  private String status = null;

  public VehicleStateSoftwareUpdate expectedDurationSec(BigDecimal expectedDurationSec) {
    this.expectedDurationSec = expectedDurationSec;
    return this;
  }

   /**
   * Get expectedDurationSec
   * @return expectedDurationSec
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getExpectedDurationSec() {
    return expectedDurationSec;
  }

  public void setExpectedDurationSec(BigDecimal expectedDurationSec) {
    this.expectedDurationSec = expectedDurationSec;
  }

  public VehicleStateSoftwareUpdate status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleStateSoftwareUpdate vehicleStateSoftwareUpdate = (VehicleStateSoftwareUpdate) o;
    return Objects.equals(this.expectedDurationSec, vehicleStateSoftwareUpdate.expectedDurationSec) &&
        Objects.equals(this.status, vehicleStateSoftwareUpdate.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expectedDurationSec, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleStateSoftwareUpdate {\n");
    
    sb.append("    expectedDurationSec: ").append(toIndentedString(expectedDurationSec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

