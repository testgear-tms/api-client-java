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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets TestResultOutcome
 */
@JsonAdapter(TestResultOutcome.Adapter.class)
public enum TestResultOutcome {
  
  INPROGRESS("InProgress"),
  
  PASSED("Passed"),
  
  FAILED("Failed"),
  
  SKIPPED("Skipped"),
  
  BLOCKED("Blocked");

  private String value;

  TestResultOutcome(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TestResultOutcome fromValue(String value) {
    for (TestResultOutcome b : TestResultOutcome.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TestResultOutcome> {
    @Override
    public void write(final JsonWriter jsonWriter, final TestResultOutcome enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TestResultOutcome read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TestResultOutcome.fromValue(value);
    }
  }
}

