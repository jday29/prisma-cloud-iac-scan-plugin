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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * JsonApiModelFilterParameters
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-01-26T11:29:52.304914+05:30[Asia/Kolkata]")public class JsonApiModelFilterParameters {
  /**
   * Time type
   */
  public enum TimeTypeEnum {
    TO_NOW("to_now"),
    ABSOLUTE("absolute"),
    RELATIVE("relative");

    private String value;

    TimeTypeEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static TimeTypeEnum fromValue(String text) {
      for (TimeTypeEnum b : TimeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }
  @JsonProperty("timeType")

  private TimeTypeEnum timeType = null;

  @JsonProperty("timeAmount")

  private Integer timeAmount = null;
  /**
   * Time unit
   */
  public enum TimeUnitEnum {
    EPOCH("epoch"),
    LOGIN("login"),
    HOUR("hour"),
    DAY("day"),
    WEEK("week"),
    MONTH("month"),
    YEAR("year");

    private String value;

    TimeUnitEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static TimeUnitEnum fromValue(String text) {
      for (TimeUnitEnum b : TimeUnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }
  @JsonProperty("timeUnit")

  private TimeUnitEnum timeUnit = null;

  @JsonProperty("startTime")

  private Long startTime = null;

  @JsonProperty("endTime")

  private Long endTime = null;

  @JsonProperty("resourceList")

  private List<String> resourceList = null;

  @JsonProperty("tags")

  private List<String> tags = null;

  @JsonProperty("assetType")

  private List<String> assetType = null;

  @JsonProperty("assetName")

  private List<String> assetName = null;

  @JsonProperty("failureCriteria")

  private List<String> failureCriteria = null;

  @JsonProperty("user")

  private List<String> user = null;

  @JsonProperty("status")

  private List<String> status = null;
  public JsonApiModelFilterParameters timeType(TimeTypeEnum timeType) {
    this.timeType = timeType;
    return this;
  }

  

  /**
  * Time type
  * @return timeType
  **/
  @Schema(description = "Time type")
  public TimeTypeEnum getTimeType() {
    return timeType;
  }
  public void setTimeType(TimeTypeEnum timeType) {
    this.timeType = timeType;
  }
  public JsonApiModelFilterParameters timeAmount(Integer timeAmount) {
    this.timeAmount = timeAmount;
    return this;
  }

  

  /**
  * Number of time units
  * @return timeAmount
  **/
  @Schema(example = "1", description = "Number of time units")
  public Integer getTimeAmount() {
    return timeAmount;
  }
  public void setTimeAmount(Integer timeAmount) {
    this.timeAmount = timeAmount;
  }
  public JsonApiModelFilterParameters timeUnit(TimeUnitEnum timeUnit) {
    this.timeUnit = timeUnit;
    return this;
  }

  

  /**
  * Time unit
  * @return timeUnit
  **/
  @Schema(description = "Time unit")
  public TimeUnitEnum getTimeUnit() {
    return timeUnit;
  }
  public void setTimeUnit(TimeUnitEnum timeUnit) {
    this.timeUnit = timeUnit;
  }
  public JsonApiModelFilterParameters startTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  

  /**
  * Start time in Unix time (the number of seconds that have elapsed since the Unix epoch) for the absolute time type
  * @return startTime
  **/
  @Schema(description = "Start time in Unix time (the number of seconds that have elapsed since the Unix epoch) for the absolute time type")
  public Long getStartTime() {
    return startTime;
  }
  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }
  public JsonApiModelFilterParameters endTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  

  /**
  * End time in Unix time (the number of seconds that have elapsed since the Unix epoch) for the absolute time type
  * @return endTime
  **/
  @Schema(description = "End time in Unix time (the number of seconds that have elapsed since the Unix epoch) for the absolute time type")
  public Long getEndTime() {
    return endTime;
  }
  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }
  public JsonApiModelFilterParameters resourceList(List<String> resourceList) {
    this.resourceList = resourceList;
    return this;
  }

  public JsonApiModelFilterParameters addResourceListItem(String resourceListItem) {
    if (this.resourceList == null) {
      this.resourceList = new ArrayList<>();
    }
    this.resourceList.add(resourceListItem);
    return this;
  }

  /**
  * Resource list
  * @return resourceList
  **/
  @Schema(description = "Resource list")
  public List<String> getResourceList() {
    return resourceList;
  }
  public void setResourceList(List<String> resourceList) {
    this.resourceList = resourceList;
  }
  public JsonApiModelFilterParameters tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public JsonApiModelFilterParameters addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
  * Tag string
  * @return tags
  **/
  @Schema(example = "env:proc", description = "Tag string")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }
  public JsonApiModelFilterParameters assetType(List<String> assetType) {
    this.assetType = assetType;
    return this;
  }

  public JsonApiModelFilterParameters addAssetTypeItem(String assetTypeItem) {
    if (this.assetType == null) {
      this.assetType = new ArrayList<>();
    }
    this.assetType.add(assetTypeItem);
    return this;
  }

  /**
  * Asset type
  * @return assetType
  **/
  @Schema(description = "Asset type")
  public List<String> getAssetType() {
    return assetType;
  }
  public void setAssetType(List<String> assetType) {
    this.assetType = assetType;
  }
  public JsonApiModelFilterParameters assetName(List<String> assetName) {
    this.assetName = assetName;
    return this;
  }

  public JsonApiModelFilterParameters addAssetNameItem(String assetNameItem) {
    if (this.assetName == null) {
      this.assetName = new ArrayList<>();
    }
    this.assetName.add(assetNameItem);
    return this;
  }

  /**
  * Asset name
  * @return assetName
  **/
  @Schema(description = "Asset name")
  public List<String> getAssetName() {
    return assetName;
  }
  public void setAssetName(List<String> assetName) {
    this.assetName = assetName;
  }
  public JsonApiModelFilterParameters failureCriteria(List<String> failureCriteria) {
    this.failureCriteria = failureCriteria;
    return this;
  }

  public JsonApiModelFilterParameters addFailureCriteriaItem(String failureCriteriaItem) {
    if (this.failureCriteria == null) {
      this.failureCriteria = new ArrayList<>();
    }
    this.failureCriteria.add(failureCriteriaItem);
    return this;
  }

  /**
  * Scan failure criteria expression
  * @return failureCriteria
  **/
  @Schema(example = "H:5 & M:2 & L:1", description = "Scan failure criteria expression")
  public List<String> getFailureCriteria() {
    return failureCriteria;
  }
  public void setFailureCriteria(List<String> failureCriteria) {
    this.failureCriteria = failureCriteria;
  }
  public JsonApiModelFilterParameters user(List<String> user) {
    this.user = user;
    return this;
  }

  public JsonApiModelFilterParameters addUserItem(String userItem) {
    if (this.user == null) {
      this.user = new ArrayList<>();
    }
    this.user.add(userItem);
    return this;
  }

  /**
  * Username
  * @return user
  **/
  @Schema(description = "Username")
  public List<String> getUser() {
    return user;
  }
  public void setUser(List<String> user) {
    this.user = user;
  }
  public JsonApiModelFilterParameters status(List<String> status) {
    this.status = status;
    return this;
  }

  public JsonApiModelFilterParameters addStatusItem(String statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<>();
    }
    this.status.add(statusItem);
    return this;
  }

  /**
  * Scan status
  * @return status
  **/
  @Schema(example = "passed", description = "Scan status")
  public List<String> getStatus() {
    return status;
  }
  public void setStatus(List<String> status) {
    this.status = status;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonApiModelFilterParameters jsonApiModelFilterParameters = (JsonApiModelFilterParameters) o;
    return Objects.equals(this.timeType, jsonApiModelFilterParameters.timeType) &&
        Objects.equals(this.timeAmount, jsonApiModelFilterParameters.timeAmount) &&
        Objects.equals(this.timeUnit, jsonApiModelFilterParameters.timeUnit) &&
        Objects.equals(this.startTime, jsonApiModelFilterParameters.startTime) &&
        Objects.equals(this.endTime, jsonApiModelFilterParameters.endTime) &&
        Objects.equals(this.resourceList, jsonApiModelFilterParameters.resourceList) &&
        Objects.equals(this.tags, jsonApiModelFilterParameters.tags) &&
        Objects.equals(this.assetType, jsonApiModelFilterParameters.assetType) &&
        Objects.equals(this.assetName, jsonApiModelFilterParameters.assetName) &&
        Objects.equals(this.failureCriteria, jsonApiModelFilterParameters.failureCriteria) &&
        Objects.equals(this.user, jsonApiModelFilterParameters.user) &&
        Objects.equals(this.status, jsonApiModelFilterParameters.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeType, timeAmount, timeUnit, startTime, endTime, resourceList, tags, assetType, assetName, failureCriteria, user, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonApiModelFilterParameters {\n");
    
    sb.append("    timeType: ").append(toIndentedString(timeType)).append("\n");
    sb.append("    timeAmount: ").append(toIndentedString(timeAmount)).append("\n");
    sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    resourceList: ").append(toIndentedString(resourceList)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
    sb.append("    failureCriteria: ").append(toIndentedString(failureCriteria)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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