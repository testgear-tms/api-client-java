/*
 * API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.test_gear.client.model;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets CustomAttributeTypesEnum
 */
public enum CustomAttributeTypesEnum {
  
  STRING("string"),
  
  DATETIME("datetime"),
  
  OPTIONS("options"),
  
  USER("user"),
  
  MULTIPLEOPTIONS("multipleOptions");

  private String value;

  CustomAttributeTypesEnum(String value) {
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
  public static CustomAttributeTypesEnum fromValue(String value) {
    for (CustomAttributeTypesEnum b : CustomAttributeTypesEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

