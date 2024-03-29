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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.test_gear.client.model.FailureCategoryModel;
import io.test_gear.client.model.TestResultOutcome;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.test_gear.client.invoker.JSON;

/**
 * TestResultsFilterModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestResultsFilterModel {
  public static final String SERIALIZED_NAME_TEST_RUN_IDS = "testRunIds";
  @SerializedName(SERIALIZED_NAME_TEST_RUN_IDS)
  private Set<UUID> testRunIds;

  public static final String SERIALIZED_NAME_CONFIGURATION_IDS = "configurationIds";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_IDS)
  private Set<UUID> configurationIds;

  public static final String SERIALIZED_NAME_OUTCOMES = "outcomes";
  @SerializedName(SERIALIZED_NAME_OUTCOMES)
  private Set<TestResultOutcome> outcomes;

  public static final String SERIALIZED_NAME_FAILURE_CATEGORIES = "failureCategories";
  @SerializedName(SERIALIZED_NAME_FAILURE_CATEGORIES)
  private Set<FailureCategoryModel> failureCategories;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_CLASS_NAME = "className";
  @SerializedName(SERIALIZED_NAME_CLASS_NAME)
  private String className;

  public TestResultsFilterModel() {
  }

  public TestResultsFilterModel testRunIds(Set<UUID> testRunIds) {
    
    this.testRunIds = testRunIds;
    return this;
  }

  public TestResultsFilterModel addTestRunIdsItem(UUID testRunIdsItem) {
    this.testRunIds.add(testRunIdsItem);
    return this;
  }

   /**
   * Specifies a test result test run IDs to search for
   * @return testRunIds
  **/
  @javax.annotation.Nullable

  public Set<UUID> getTestRunIds() {
    return testRunIds;
  }


  public void setTestRunIds(Set<UUID> testRunIds) {
    this.testRunIds = testRunIds;
  }


  public TestResultsFilterModel configurationIds(Set<UUID> configurationIds) {
    
    this.configurationIds = configurationIds;
    return this;
  }

  public TestResultsFilterModel addConfigurationIdsItem(UUID configurationIdsItem) {
    this.configurationIds.add(configurationIdsItem);
    return this;
  }

   /**
   * Specifies a test result configuration IDs to search for
   * @return configurationIds
  **/
  @javax.annotation.Nullable

  public Set<UUID> getConfigurationIds() {
    return configurationIds;
  }


  public void setConfigurationIds(Set<UUID> configurationIds) {
    this.configurationIds = configurationIds;
  }


  public TestResultsFilterModel outcomes(Set<TestResultOutcome> outcomes) {
    
    this.outcomes = outcomes;
    return this;
  }

  public TestResultsFilterModel addOutcomesItem(TestResultOutcome outcomesItem) {
    this.outcomes.add(outcomesItem);
    return this;
  }

   /**
   * Specifies a test result outcomes to search for
   * @return outcomes
  **/
  @javax.annotation.Nullable

  public Set<TestResultOutcome> getOutcomes() {
    return outcomes;
  }


  public void setOutcomes(Set<TestResultOutcome> outcomes) {
    this.outcomes = outcomes;
  }


  public TestResultsFilterModel failureCategories(Set<FailureCategoryModel> failureCategories) {
    
    this.failureCategories = failureCategories;
    return this;
  }

  public TestResultsFilterModel addFailureCategoriesItem(FailureCategoryModel failureCategoriesItem) {
    this.failureCategories.add(failureCategoriesItem);
    return this;
  }

   /**
   * Specifies a test result failure categories to search for
   * @return failureCategories
  **/
  @javax.annotation.Nullable

  public Set<FailureCategoryModel> getFailureCategories() {
    return failureCategories;
  }


  public void setFailureCategories(Set<FailureCategoryModel> failureCategories) {
    this.failureCategories = failureCategories;
  }


  public TestResultsFilterModel namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Specifies a test result namespace to search for
   * @return namespace
  **/
  @javax.annotation.Nullable

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public TestResultsFilterModel className(String className) {
    
    this.className = className;
    return this;
  }

   /**
   * Specifies a test result class name to search for
   * @return className
  **/
  @javax.annotation.Nullable

  public String getClassName() {
    return className;
  }


  public void setClassName(String className) {
    this.className = className;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestResultsFilterModel testResultsFilterModel = (TestResultsFilterModel) o;
    return Objects.equals(this.testRunIds, testResultsFilterModel.testRunIds) &&
        Objects.equals(this.configurationIds, testResultsFilterModel.configurationIds) &&
        Objects.equals(this.outcomes, testResultsFilterModel.outcomes) &&
        Objects.equals(this.failureCategories, testResultsFilterModel.failureCategories) &&
        Objects.equals(this.namespace, testResultsFilterModel.namespace) &&
        Objects.equals(this.className, testResultsFilterModel.className);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(testRunIds, configurationIds, outcomes, failureCategories, namespace, className);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestResultsFilterModel {\n");
    sb.append("    testRunIds: ").append(toIndentedString(testRunIds)).append("\n");
    sb.append("    configurationIds: ").append(toIndentedString(configurationIds)).append("\n");
    sb.append("    outcomes: ").append(toIndentedString(outcomes)).append("\n");
    sb.append("    failureCategories: ").append(toIndentedString(failureCategories)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("testRunIds");
    openapiFields.add("configurationIds");
    openapiFields.add("outcomes");
    openapiFields.add("failureCategories");
    openapiFields.add("namespace");
    openapiFields.add("className");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TestResultsFilterModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TestResultsFilterModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestResultsFilterModel is not found in the empty JSON string", TestResultsFilterModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TestResultsFilterModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestResultsFilterModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("testRunIds") != null && !jsonObj.get("testRunIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `testRunIds` to be an array in the JSON string but got `%s`", jsonObj.get("testRunIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("configurationIds") != null && !jsonObj.get("configurationIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `configurationIds` to be an array in the JSON string but got `%s`", jsonObj.get("configurationIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("outcomes") != null && !jsonObj.get("outcomes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `outcomes` to be an array in the JSON string but got `%s`", jsonObj.get("outcomes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("failureCategories") != null && !jsonObj.get("failureCategories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `failureCategories` to be an array in the JSON string but got `%s`", jsonObj.get("failureCategories").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if ((jsonObj.get("className") != null && !jsonObj.get("className").isJsonNull()) && !jsonObj.get("className").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `className` to be a primitive type in the JSON string but got `%s`", jsonObj.get("className").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestResultsFilterModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestResultsFilterModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestResultsFilterModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestResultsFilterModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestResultsFilterModel>() {
           @Override
           public void write(JsonWriter out, TestResultsFilterModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestResultsFilterModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestResultsFilterModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestResultsFilterModel
  * @throws IOException if the JSON string is invalid with respect to TestResultsFilterModel
  */
  public static TestResultsFilterModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestResultsFilterModel.class);
  }

 /**
  * Convert an instance of TestResultsFilterModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

