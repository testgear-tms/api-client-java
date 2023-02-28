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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.test_gear.client.model.AutotestResultOutcome;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * AutotestResultHistoricalGetModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AutotestResultHistoricalGetModel {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_CREATED_BY_ID = "createdById";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_ID)
  private UUID createdById;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private OffsetDateTime modifiedDate;

  public static final String SERIALIZED_NAME_MODIFIED_BY_ID = "modifiedById";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY_ID)
  private UUID modifiedById;

  public static final String SERIALIZED_NAME_TEST_RUN_ID = "testRunId";
  @SerializedName(SERIALIZED_NAME_TEST_RUN_ID)
  private UUID testRunId;

  public static final String SERIALIZED_NAME_TEST_RUN_NAME = "testRunName";
  @SerializedName(SERIALIZED_NAME_TEST_RUN_NAME)
  private String testRunName;

  public static final String SERIALIZED_NAME_TEST_PLAN_ID = "testPlanId";
  @SerializedName(SERIALIZED_NAME_TEST_PLAN_ID)
  private UUID testPlanId;

  public static final String SERIALIZED_NAME_TEST_PLAN_GLOBAL_ID = "testPlanGlobalId";
  @SerializedName(SERIALIZED_NAME_TEST_PLAN_GLOBAL_ID)
  private Long testPlanGlobalId;

  public static final String SERIALIZED_NAME_TEST_PLAN_NAME = "testPlanName";
  @SerializedName(SERIALIZED_NAME_TEST_PLAN_NAME)
  private String testPlanName;

  public static final String SERIALIZED_NAME_CONFIGURATION_ID = "configurationId";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_ID)
  private UUID configurationId;

  public static final String SERIALIZED_NAME_OUTCOME = "outcome";
  @SerializedName(SERIALIZED_NAME_OUTCOME)
  private AutotestResultOutcome outcome;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Long duration;

  public static final String SERIALIZED_NAME_LAUNCH_SOURCE = "launchSource";
  @SerializedName(SERIALIZED_NAME_LAUNCH_SOURCE)
  private String launchSource;

  public AutotestResultHistoricalGetModel() {
  }

  
  public AutotestResultHistoricalGetModel(
     OffsetDateTime modifiedDate, 
     UUID modifiedById
  ) {
    this();
    this.modifiedDate = modifiedDate;
    this.modifiedById = modifiedById;
  }

  public AutotestResultHistoricalGetModel id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public AutotestResultHistoricalGetModel createdDate(OffsetDateTime createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public AutotestResultHistoricalGetModel createdById(UUID createdById) {
    
    this.createdById = createdById;
    return this;
  }

   /**
   * Get createdById
   * @return createdById
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getCreatedById() {
    return createdById;
  }


  public void setCreatedById(UUID createdById) {
    this.createdById = createdById;
  }


   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }




   /**
   * Get modifiedById
   * @return modifiedById
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getModifiedById() {
    return modifiedById;
  }




  public AutotestResultHistoricalGetModel testRunId(UUID testRunId) {
    
    this.testRunId = testRunId;
    return this;
  }

   /**
   * Get testRunId
   * @return testRunId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getTestRunId() {
    return testRunId;
  }


  public void setTestRunId(UUID testRunId) {
    this.testRunId = testRunId;
  }


  public AutotestResultHistoricalGetModel testRunName(String testRunName) {
    
    this.testRunName = testRunName;
    return this;
  }

   /**
   * Get testRunName
   * @return testRunName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTestRunName() {
    return testRunName;
  }


  public void setTestRunName(String testRunName) {
    this.testRunName = testRunName;
  }


  public AutotestResultHistoricalGetModel testPlanId(UUID testPlanId) {
    
    this.testPlanId = testPlanId;
    return this;
  }

   /**
   * Get testPlanId
   * @return testPlanId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getTestPlanId() {
    return testPlanId;
  }


  public void setTestPlanId(UUID testPlanId) {
    this.testPlanId = testPlanId;
  }


  public AutotestResultHistoricalGetModel testPlanGlobalId(Long testPlanGlobalId) {
    
    this.testPlanGlobalId = testPlanGlobalId;
    return this;
  }

   /**
   * Get testPlanGlobalId
   * @return testPlanGlobalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTestPlanGlobalId() {
    return testPlanGlobalId;
  }


  public void setTestPlanGlobalId(Long testPlanGlobalId) {
    this.testPlanGlobalId = testPlanGlobalId;
  }


  public AutotestResultHistoricalGetModel testPlanName(String testPlanName) {
    
    this.testPlanName = testPlanName;
    return this;
  }

   /**
   * Get testPlanName
   * @return testPlanName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTestPlanName() {
    return testPlanName;
  }


  public void setTestPlanName(String testPlanName) {
    this.testPlanName = testPlanName;
  }


  public AutotestResultHistoricalGetModel configurationId(UUID configurationId) {
    
    this.configurationId = configurationId;
    return this;
  }

   /**
   * Get configurationId
   * @return configurationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getConfigurationId() {
    return configurationId;
  }


  public void setConfigurationId(UUID configurationId) {
    this.configurationId = configurationId;
  }


  public AutotestResultHistoricalGetModel outcome(AutotestResultOutcome outcome) {
    
    this.outcome = outcome;
    return this;
  }

   /**
   * Get outcome
   * @return outcome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AutotestResultOutcome getOutcome() {
    return outcome;
  }


  public void setOutcome(AutotestResultOutcome outcome) {
    this.outcome = outcome;
  }


  public AutotestResultHistoricalGetModel duration(Long duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getDuration() {
    return duration;
  }


  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public AutotestResultHistoricalGetModel launchSource(String launchSource) {
    
    this.launchSource = launchSource;
    return this;
  }

   /**
   * Get launchSource
   * @return launchSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLaunchSource() {
    return launchSource;
  }


  public void setLaunchSource(String launchSource) {
    this.launchSource = launchSource;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutotestResultHistoricalGetModel autotestResultHistoricalGetModel = (AutotestResultHistoricalGetModel) o;
    return Objects.equals(this.id, autotestResultHistoricalGetModel.id) &&
        Objects.equals(this.createdDate, autotestResultHistoricalGetModel.createdDate) &&
        Objects.equals(this.createdById, autotestResultHistoricalGetModel.createdById) &&
        Objects.equals(this.modifiedDate, autotestResultHistoricalGetModel.modifiedDate) &&
        Objects.equals(this.modifiedById, autotestResultHistoricalGetModel.modifiedById) &&
        Objects.equals(this.testRunId, autotestResultHistoricalGetModel.testRunId) &&
        Objects.equals(this.testRunName, autotestResultHistoricalGetModel.testRunName) &&
        Objects.equals(this.testPlanId, autotestResultHistoricalGetModel.testPlanId) &&
        Objects.equals(this.testPlanGlobalId, autotestResultHistoricalGetModel.testPlanGlobalId) &&
        Objects.equals(this.testPlanName, autotestResultHistoricalGetModel.testPlanName) &&
        Objects.equals(this.configurationId, autotestResultHistoricalGetModel.configurationId) &&
        Objects.equals(this.outcome, autotestResultHistoricalGetModel.outcome) &&
        Objects.equals(this.duration, autotestResultHistoricalGetModel.duration) &&
        Objects.equals(this.launchSource, autotestResultHistoricalGetModel.launchSource);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdDate, createdById, modifiedDate, modifiedById, testRunId, testRunName, testPlanId, testPlanGlobalId, testPlanName, configurationId, outcome, duration, launchSource);
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
    sb.append("class AutotestResultHistoricalGetModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    modifiedById: ").append(toIndentedString(modifiedById)).append("\n");
    sb.append("    testRunId: ").append(toIndentedString(testRunId)).append("\n");
    sb.append("    testRunName: ").append(toIndentedString(testRunName)).append("\n");
    sb.append("    testPlanId: ").append(toIndentedString(testPlanId)).append("\n");
    sb.append("    testPlanGlobalId: ").append(toIndentedString(testPlanGlobalId)).append("\n");
    sb.append("    testPlanName: ").append(toIndentedString(testPlanName)).append("\n");
    sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    launchSource: ").append(toIndentedString(launchSource)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("createdDate");
    openapiFields.add("createdById");
    openapiFields.add("modifiedDate");
    openapiFields.add("modifiedById");
    openapiFields.add("testRunId");
    openapiFields.add("testRunName");
    openapiFields.add("testPlanId");
    openapiFields.add("testPlanGlobalId");
    openapiFields.add("testPlanName");
    openapiFields.add("configurationId");
    openapiFields.add("outcome");
    openapiFields.add("duration");
    openapiFields.add("launchSource");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AutotestResultHistoricalGetModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AutotestResultHistoricalGetModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AutotestResultHistoricalGetModel is not found in the empty JSON string", AutotestResultHistoricalGetModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AutotestResultHistoricalGetModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AutotestResultHistoricalGetModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("createdById") != null && !jsonObj.get("createdById").isJsonNull()) && !jsonObj.get("createdById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdById").toString()));
      }
      if ((jsonObj.get("modifiedById") != null && !jsonObj.get("modifiedById").isJsonNull()) && !jsonObj.get("modifiedById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedById").toString()));
      }
      if ((jsonObj.get("testRunId") != null && !jsonObj.get("testRunId").isJsonNull()) && !jsonObj.get("testRunId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testRunId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testRunId").toString()));
      }
      if ((jsonObj.get("testRunName") != null && !jsonObj.get("testRunName").isJsonNull()) && !jsonObj.get("testRunName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testRunName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testRunName").toString()));
      }
      if ((jsonObj.get("testPlanId") != null && !jsonObj.get("testPlanId").isJsonNull()) && !jsonObj.get("testPlanId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testPlanId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testPlanId").toString()));
      }
      if ((jsonObj.get("testPlanName") != null && !jsonObj.get("testPlanName").isJsonNull()) && !jsonObj.get("testPlanName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testPlanName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testPlanName").toString()));
      }
      if ((jsonObj.get("configurationId") != null && !jsonObj.get("configurationId").isJsonNull()) && !jsonObj.get("configurationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configurationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configurationId").toString()));
      }
      if ((jsonObj.get("launchSource") != null && !jsonObj.get("launchSource").isJsonNull()) && !jsonObj.get("launchSource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `launchSource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("launchSource").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AutotestResultHistoricalGetModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AutotestResultHistoricalGetModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AutotestResultHistoricalGetModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AutotestResultHistoricalGetModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AutotestResultHistoricalGetModel>() {
           @Override
           public void write(JsonWriter out, AutotestResultHistoricalGetModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AutotestResultHistoricalGetModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AutotestResultHistoricalGetModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AutotestResultHistoricalGetModel
  * @throws IOException if the JSON string is invalid with respect to AutotestResultHistoricalGetModel
  */
  public static AutotestResultHistoricalGetModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AutotestResultHistoricalGetModel.class);
  }

 /**
  * Convert an instance of AutotestResultHistoricalGetModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
