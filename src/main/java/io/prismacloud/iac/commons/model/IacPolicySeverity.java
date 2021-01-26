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
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The levels of policy severity
 */
public enum IacPolicySeverity {
  HIGH("high"),
  MEDIUM("medium"),
  LOW("low");

  private String value;

  IacPolicySeverity(String value) {
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
  public static IacPolicySeverity fromValue(String text) {
    for (IacPolicySeverity b : IacPolicySeverity.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
