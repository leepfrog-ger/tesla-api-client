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

/**
 * VehicleStateSoftwareUpdate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-11T20:35:46.716-07:00")
public class VehicleStateSoftwareUpdate {
  @SerializedName("expected_duration_sec")
  private Integer expectedDurationSec = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("download_perc")
  private Integer downloadPerc = null;

  @SerializedName("install_perc")
  private Integer installPerc = null;

  @SerializedName("version")
  private Object version = null;

  public VehicleStateSoftwareUpdate expectedDurationSec(Integer expectedDurationSec) {
    this.expectedDurationSec = expectedDurationSec;
    return this;
  }

   /**
   * Get expectedDurationSec
   * @return expectedDurationSec
  **/
  @ApiModelProperty(value = "")
  public Integer getExpectedDurationSec() {
    return expectedDurationSec;
  }

  public void setExpectedDurationSec(Integer expectedDurationSec) {
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

  public VehicleStateSoftwareUpdate downloadPerc(Integer downloadPerc) {
    this.downloadPerc = downloadPerc;
    return this;
  }

   /**
   * Get downloadPerc
   * @return downloadPerc
  **/
  @ApiModelProperty(value = "")
  public Integer getDownloadPerc() {
    return downloadPerc;
  }

  public void setDownloadPerc(Integer downloadPerc) {
    this.downloadPerc = downloadPerc;
  }

  public VehicleStateSoftwareUpdate installPerc(Integer installPerc) {
    this.installPerc = installPerc;
    return this;
  }

   /**
   * Get installPerc
   * @return installPerc
  **/
  @ApiModelProperty(value = "")
  public Integer getInstallPerc() {
    return installPerc;
  }

  public void setInstallPerc(Integer installPerc) {
    this.installPerc = installPerc;
  }

  public VehicleStateSoftwareUpdate version(Object version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public Object getVersion() {
    return version;
  }

  public void setVersion(Object version) {
    this.version = version;
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
        Objects.equals(this.status, vehicleStateSoftwareUpdate.status) &&
        Objects.equals(this.downloadPerc, vehicleStateSoftwareUpdate.downloadPerc) &&
        Objects.equals(this.installPerc, vehicleStateSoftwareUpdate.installPerc) &&
        Objects.equals(this.version, vehicleStateSoftwareUpdate.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expectedDurationSec, status, downloadPerc, installPerc, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleStateSoftwareUpdate {\n");
    
    sb.append("    expectedDurationSec: ").append(toIndentedString(expectedDurationSec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    downloadPerc: ").append(toIndentedString(downloadPerc)).append("\n");
    sb.append("    installPerc: ").append(toIndentedString(installPerc)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

