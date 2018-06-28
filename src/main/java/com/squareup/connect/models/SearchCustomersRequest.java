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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.squareup.connect.models.CustomerQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Defines the fields included in the request body for the [SearchCustomers](#endpoint-searchcustomer) endpoint.
 */
@ApiModel(description = "Defines the fields included in the request body for the [SearchCustomers](#endpoint-searchcustomer) endpoint.")

public class SearchCustomersRequest {
  @JsonProperty("cursor")
  private String cursor = null;

  @JsonProperty("limit")
  private Long limit = null;

  @JsonProperty("query")
  private CustomerQuery query = null;

  public SearchCustomersRequest cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * Include the pagination cursor in subsequent calls to this endpoint to retrieve the next set of results associated with the original query.  See [Paginating results](#paginatingresults) for more information.
   * @return cursor
  **/
  @ApiModelProperty(value = "Include the pagination cursor in subsequent calls to this endpoint to retrieve the next set of results associated with the original query.  See [Paginating results](#paginatingresults) for more information.")
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  public SearchCustomersRequest limit(Long limit) {
    this.limit = limit;
    return this;
  }

   /**
   * A limit on the number of results to be returned in a single page. The limit is advisory - the implementation may return more or fewer results. If the supplied limit is negative, zero, or is higher than the maximum limit of 1,000, it will be ignored.
   * @return limit
  **/
  @ApiModelProperty(value = "A limit on the number of results to be returned in a single page. The limit is advisory - the implementation may return more or fewer results. If the supplied limit is negative, zero, or is higher than the maximum limit of 1,000, it will be ignored.")
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public SearchCustomersRequest query(CustomerQuery query) {
    this.query = query;
    return this;
  }

   /**
   * Query customers based on the given conditions and sort order. Calling SearchCustomers without an explicit query parameter will return all customers ordered alphabetically based on `given_name` and `family_name`.
   * @return query
  **/
  @ApiModelProperty(value = "Query customers based on the given conditions and sort order. Calling SearchCustomers without an explicit query parameter will return all customers ordered alphabetically based on `given_name` and `family_name`.")
  public CustomerQuery getQuery() {
    return query;
  }

  public void setQuery(CustomerQuery query) {
    this.query = query;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchCustomersRequest searchCustomersRequest = (SearchCustomersRequest) o;
    return Objects.equals(this.cursor, searchCustomersRequest.cursor) &&
        Objects.equals(this.limit, searchCustomersRequest.limit) &&
        Objects.equals(this.query, searchCustomersRequest.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, limit, query);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchCustomersRequest {\n");
    
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

