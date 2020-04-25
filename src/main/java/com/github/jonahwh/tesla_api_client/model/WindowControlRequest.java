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
 * WindowControlRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-11T20:35:46.716-07:00")
public class WindowControlRequest {
  @SerializedName("lat")
  private Double lat = null;

  @SerializedName("long")
  private Double _long = null;

  /**
   * Gets or Sets command
   */
  @JsonAdapter(CommandEnum.Adapter.class)
  public enum CommandEnum {
    VENT("vent"),
    
    CLOSE("close");

    private String value;

    CommandEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CommandEnum fromValue(String text) {
      for (CommandEnum b : CommandEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CommandEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CommandEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CommandEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CommandEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("command")
  private CommandEnum command = null;

  public WindowControlRequest lat(Double lat) {
    this.lat = lat;
    return this;
  }

   /**
   * Get lat
   * @return lat
  **/
  @ApiModelProperty(value = "")
  public Double getLat() {
    return lat;
  }

  public void setLat(Double lat) {
    this.lat = lat;
  }

  public WindowControlRequest _long(Double _long) {
    this._long = _long;
    return this;
  }

   /**
   * Get _long
   * @return _long
  **/
  @ApiModelProperty(value = "")
  public Double getLong() {
    return _long;
  }

  public void setLong(Double _long) {
    this._long = _long;
  }

  public WindowControlRequest command(CommandEnum command) {
    this.command = command;
    return this;
  }

   /**
   * Get command
   * @return command
  **/
  @ApiModelProperty(value = "")
  public CommandEnum getCommand() {
    return command;
  }

  public void setCommand(CommandEnum command) {
    this.command = command;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WindowControlRequest windowControlRequest = (WindowControlRequest) o;
    return Objects.equals(this.lat, windowControlRequest.lat) &&
        Objects.equals(this._long, windowControlRequest._long) &&
        Objects.equals(this.command, windowControlRequest.command);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, _long, command);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WindowControlRequest {\n");
    
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    _long: ").append(toIndentedString(_long)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
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

