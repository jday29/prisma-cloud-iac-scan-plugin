/*
 * IaC Scan API Version 2
 * The IaC scan-service receives and assesses customer IaC resources
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.prismacloud.iac.commons.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * JsonApiModelScanStatusResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-01-26T11:29:52.304914+05:30[Asia/Kolkata]")public class JsonApiModelScanStatusResponse {

  @JsonProperty("data")

  private JsonApiModelScanStatusResponseData data = null;
  public JsonApiModelScanStatusResponse data(JsonApiModelScanStatusResponseData data) {
    this.data = data;
    return this;
  }

  

  /**
  * Get data
  * @return data
  **/
  @Schema(required = true, description = "")
  public JsonApiModelScanStatusResponseData getData() {
    return data;
  }
  public void setData(JsonApiModelScanStatusResponseData data) {
    this.data = data;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonApiModelScanStatusResponse jsonApiModelScanStatusResponse = (JsonApiModelScanStatusResponse) o;
    return Objects.equals(this.data, jsonApiModelScanStatusResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonApiModelScanStatusResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
