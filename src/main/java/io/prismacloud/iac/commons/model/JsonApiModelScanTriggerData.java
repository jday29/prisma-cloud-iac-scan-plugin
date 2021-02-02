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
import java.util.UUID;

/**
 * JsonApiModelScanTriggerData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-01-26T11:29:52.304914+05:30[Asia/Kolkata]")public class JsonApiModelScanTriggerData {

  @JsonProperty("id")

  private UUID id = null;

  @JsonProperty("attributes")

  private JsonApiModelScanTriggerDataAttributes attributes = null;
  public JsonApiModelScanTriggerData id(UUID id) {
    this.id = id;
    return this;
  }

  

  /**
  * (Optional) {json.api} scan UUID
  * @return id
  **/
  @Schema(description = "(Optional) {json.api} scan UUID")
  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }
  public JsonApiModelScanTriggerData attributes(JsonApiModelScanTriggerDataAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  

  /**
  * Get attributes
  * @return attributes
  **/
  @Schema(required = true, description = "")
  public JsonApiModelScanTriggerDataAttributes getAttributes() {
    return attributes;
  }
  public void setAttributes(JsonApiModelScanTriggerDataAttributes attributes) {
    this.attributes = attributes;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonApiModelScanTriggerData jsonApiModelScanTriggerData = (JsonApiModelScanTriggerData) o;
    return Objects.equals(this.id, jsonApiModelScanTriggerData.id) &&
        Objects.equals(this.attributes, jsonApiModelScanTriggerData.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonApiModelScanTriggerData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
