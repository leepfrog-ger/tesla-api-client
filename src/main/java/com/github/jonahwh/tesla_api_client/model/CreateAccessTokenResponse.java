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
 * CreateAccessTokenResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-06T14:33:05.796-07:00")
public class CreateAccessTokenResponse {
  @SerializedName("access_token")
  private String accessToken = null;

  @SerializedName("token_type")
  private String tokenType = null;

  @SerializedName("expires_in")
  private Integer expiresIn = null;

  @SerializedName("created_at")
  private Integer createdAt = null;

  @SerializedName("refresh_token")
  private String refreshToken = null;

  public CreateAccessTokenResponse accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * 
   * @return accessToken
  **/
  @ApiModelProperty(example = "abc123", required = true, value = "")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public CreateAccessTokenResponse tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * 
   * @return tokenType
  **/
  @ApiModelProperty(example = "bearer", required = true, value = "")
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public CreateAccessTokenResponse expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * 
   * @return expiresIn
  **/
  @ApiModelProperty(example = "7776000", required = true, value = "")
  public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  public CreateAccessTokenResponse createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * 
   * @return createdAt
  **/
  @ApiModelProperty(example = "1457385291", required = true, value = "")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public CreateAccessTokenResponse refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * 
   * @return refreshToken
  **/
  @ApiModelProperty(example = "cba321", required = true, value = "")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAccessTokenResponse createAccessTokenResponse = (CreateAccessTokenResponse) o;
    return Objects.equals(this.accessToken, createAccessTokenResponse.accessToken) &&
        Objects.equals(this.tokenType, createAccessTokenResponse.tokenType) &&
        Objects.equals(this.expiresIn, createAccessTokenResponse.expiresIn) &&
        Objects.equals(this.createdAt, createAccessTokenResponse.createdAt) &&
        Objects.equals(this.refreshToken, createAccessTokenResponse.refreshToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, tokenType, expiresIn, createdAt, refreshToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAccessTokenResponse {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
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

