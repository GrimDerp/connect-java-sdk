/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.models;

import java.util.Objects;
import io.swagger.annotations.ApiModel;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Indicates whether customers should be included in, or excluded from, the result set when they match the filtering criteria.
 */
public enum CustomerInclusionExclusion {
  
  INCLUDE("INCLUDE"),
  
  EXCLUDE("EXCLUDE");

  private String value;

  CustomerInclusionExclusion(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CustomerInclusionExclusion fromValue(String text) {
    for (CustomerInclusionExclusion b : CustomerInclusionExclusion.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

