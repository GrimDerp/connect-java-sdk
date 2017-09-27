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
import com.squareup.connect.models.Error;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Defines the fields that are included in the response body of a request to the [RegisterDomain](#endpoint-registerdomain) endpoint.  Either &#x60;errors&#x60; or &#x60;status&#x60; will be present in a given response (never both).
 */
@ApiModel(description = "Defines the fields that are included in the response body of a request to the [RegisterDomain](#endpoint-registerdomain) endpoint.  Either `errors` or `status` will be present in a given response (never both).")

public class RegisterDomainResponse {
  @JsonProperty("errors")
  private List<Error> errors = new ArrayList<Error>();

  /**
   * Status of the domain registration.  See [RegisterDomainResponseStatus](#type-registerdomainresponsestatus) for possible values.
   */
  public enum StatusEnum {
    PENDING("PENDING"),
    
    VERIFIED("VERIFIED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  public RegisterDomainResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public RegisterDomainResponse addErrorsItem(Error errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Any errors that occurred during the request.
   * @return errors
  **/
  @ApiModelProperty(value = "Any errors that occurred during the request.")
  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public RegisterDomainResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the domain registration.  See [RegisterDomainResponseStatus](#type-registerdomainresponsestatus) for possible values.
   * @return status
  **/
  @ApiModelProperty(value = "Status of the domain registration.  See [RegisterDomainResponseStatus](#type-registerdomainresponsestatus) for possible values.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
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
    RegisterDomainResponse registerDomainResponse = (RegisterDomainResponse) o;
    return Objects.equals(this.errors, registerDomainResponse.errors) &&
        Objects.equals(this.status, registerDomainResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterDomainResponse {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

