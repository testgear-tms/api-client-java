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
import io.test_gear.client.model.AttachmentPutModel;
import io.test_gear.client.model.AttachmentPutModelAutoTestStepResultsModel;
import io.test_gear.client.model.AvailableTestResultOutcome;
import io.test_gear.client.model.FailureCategoryModel;
import io.test_gear.client.model.LinkPostModel;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * AutoTestResultsForTestRunModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AutoTestResultsForTestRunModel {
  public static final String SERIALIZED_NAME_CONFIGURATION_ID = "configurationId";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_ID)
  private UUID configurationId;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<LinkPostModel> links;

  public static final String SERIALIZED_NAME_FAILURE_REASON_NAMES = "failureReasonNames";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON_NAMES)
  private List<FailureCategoryModel> failureReasonNames;

  public static final String SERIALIZED_NAME_AUTO_TEST_EXTERNAL_ID = "autoTestExternalId";
  @SerializedName(SERIALIZED_NAME_AUTO_TEST_EXTERNAL_ID)
  private String autoTestExternalId;

  public static final String SERIALIZED_NAME_OUTCOME = "outcome";
  @SerializedName(SERIALIZED_NAME_OUTCOME)
  private AvailableTestResultOutcome outcome;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_TRACES = "traces";
  @SerializedName(SERIALIZED_NAME_TRACES)
  private String traces;

  public static final String SERIALIZED_NAME_STARTED_ON = "startedOn";
  @SerializedName(SERIALIZED_NAME_STARTED_ON)
  private OffsetDateTime startedOn;

  public static final String SERIALIZED_NAME_COMPLETED_ON = "completedOn";
  @SerializedName(SERIALIZED_NAME_COMPLETED_ON)
  private OffsetDateTime completedOn;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Long duration;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<AttachmentPutModel> attachments;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private Map<String, String> parameters;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, String> properties;

  public static final String SERIALIZED_NAME_STEP_RESULTS = "stepResults";
  @SerializedName(SERIALIZED_NAME_STEP_RESULTS)
  private List<AttachmentPutModelAutoTestStepResultsModel> stepResults;

  public static final String SERIALIZED_NAME_SETUP_RESULTS = "setupResults";
  @SerializedName(SERIALIZED_NAME_SETUP_RESULTS)
  private List<AttachmentPutModelAutoTestStepResultsModel> setupResults;

  public static final String SERIALIZED_NAME_TEARDOWN_RESULTS = "teardownResults";
  @SerializedName(SERIALIZED_NAME_TEARDOWN_RESULTS)
  private List<AttachmentPutModelAutoTestStepResultsModel> teardownResults;

  public AutoTestResultsForTestRunModel() {
  }

  public AutoTestResultsForTestRunModel configurationId(UUID configurationId) {
    
    this.configurationId = configurationId;
    return this;
  }

   /**
   * Specifies the GUID of the autotest configuration, which was specified when the test run was created.
   * @return configurationId
  **/
  @javax.annotation.Nonnull

  public UUID getConfigurationId() {
    return configurationId;
  }


  public void setConfigurationId(UUID configurationId) {
    this.configurationId = configurationId;
  }


  public AutoTestResultsForTestRunModel links(List<LinkPostModel> links) {
    
    this.links = links;
    return this;
  }

  public AutoTestResultsForTestRunModel addLinksItem(LinkPostModel linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * Specifies the links in the autotest.
   * @return links
  **/
  @javax.annotation.Nullable

  public List<LinkPostModel> getLinks() {
    return links;
  }


  public void setLinks(List<LinkPostModel> links) {
    this.links = links;
  }


  public AutoTestResultsForTestRunModel failureReasonNames(List<FailureCategoryModel> failureReasonNames) {
    
    this.failureReasonNames = failureReasonNames;
    return this;
  }

  public AutoTestResultsForTestRunModel addFailureReasonNamesItem(FailureCategoryModel failureReasonNamesItem) {
    this.failureReasonNames.add(failureReasonNamesItem);
    return this;
  }

   /**
   * Specifies the cause of autotest failure.
   * @return failureReasonNames
  **/
  @javax.annotation.Nullable

  public List<FailureCategoryModel> getFailureReasonNames() {
    return failureReasonNames;
  }


  public void setFailureReasonNames(List<FailureCategoryModel> failureReasonNames) {
    this.failureReasonNames = failureReasonNames;
  }


  public AutoTestResultsForTestRunModel autoTestExternalId(String autoTestExternalId) {
    
    this.autoTestExternalId = autoTestExternalId;
    return this;
  }

   /**
   * Specifies the external ID of the autotest, which was specified when the test run was created.
   * @return autoTestExternalId
  **/
  @javax.annotation.Nonnull

  public String getAutoTestExternalId() {
    return autoTestExternalId;
  }


  public void setAutoTestExternalId(String autoTestExternalId) {
    this.autoTestExternalId = autoTestExternalId;
  }


  public AutoTestResultsForTestRunModel outcome(AvailableTestResultOutcome outcome) {
    
    this.outcome = outcome;
    return this;
  }

   /**
   * Get outcome
   * @return outcome
  **/
  @javax.annotation.Nonnull

  public AvailableTestResultOutcome getOutcome() {
    return outcome;
  }


  public void setOutcome(AvailableTestResultOutcome outcome) {
    this.outcome = outcome;
  }


  public AutoTestResultsForTestRunModel message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * A comment for the result.
   * @return message
  **/
  @javax.annotation.Nullable

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public AutoTestResultsForTestRunModel traces(String traces) {
    
    this.traces = traces;
    return this;
  }

   /**
   * An extended comment or a stack trace.
   * @return traces
  **/
  @javax.annotation.Nullable

  public String getTraces() {
    return traces;
  }


  public void setTraces(String traces) {
    this.traces = traces;
  }


  public AutoTestResultsForTestRunModel startedOn(OffsetDateTime startedOn) {
    
    this.startedOn = startedOn;
    return this;
  }

   /**
   * Test run start date.
   * @return startedOn
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getStartedOn() {
    return startedOn;
  }


  public void setStartedOn(OffsetDateTime startedOn) {
    this.startedOn = startedOn;
  }


  public AutoTestResultsForTestRunModel completedOn(OffsetDateTime completedOn) {
    
    this.completedOn = completedOn;
    return this;
  }

   /**
   * Test run end date.
   * @return completedOn
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getCompletedOn() {
    return completedOn;
  }


  public void setCompletedOn(OffsetDateTime completedOn) {
    this.completedOn = completedOn;
  }


  public AutoTestResultsForTestRunModel duration(Long duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Expected or actual duration of the test run execution in milliseconds.
   * minimum: 0
   * @return duration
  **/
  @javax.annotation.Nullable

  public Long getDuration() {
    return duration;
  }


  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public AutoTestResultsForTestRunModel attachments(List<AttachmentPutModel> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public AutoTestResultsForTestRunModel addAttachmentsItem(AttachmentPutModel attachmentsItem) {
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Specifies an attachment GUID. Multiple values can be sent.
   * @return attachments
  **/
  @javax.annotation.Nullable

  public List<AttachmentPutModel> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<AttachmentPutModel> attachments) {
    this.attachments = attachments;
  }


  public AutoTestResultsForTestRunModel parameters(Map<String, String> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public AutoTestResultsForTestRunModel putParametersItem(String key, String parametersItem) {
    this.parameters.put(key, parametersItem);
    return this;
  }

   /**
   * \&quot;&lt;b&gt;parameter&lt;/b&gt;\&quot;: \&quot;&lt;b&gt;value&lt;/b&gt;\&quot; pair with arbitrary custom parameters. Multiple parameters can be sent.
   * @return parameters
  **/
  @javax.annotation.Nullable

  public Map<String, String> getParameters() {
    return parameters;
  }


  public void setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
  }


  public AutoTestResultsForTestRunModel properties(Map<String, String> properties) {
    
    this.properties = properties;
    return this;
  }

  public AutoTestResultsForTestRunModel putPropertiesItem(String key, String propertiesItem) {
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * \&quot;&lt;b&gt;property&lt;/b&gt;\&quot;: \&quot;&lt;b&gt;value&lt;/b&gt;\&quot; pair with arbitrary custom properties. Multiple properties can be sent.
   * @return properties
  **/
  @javax.annotation.Nullable

  public Map<String, String> getProperties() {
    return properties;
  }


  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }


  public AutoTestResultsForTestRunModel stepResults(List<AttachmentPutModelAutoTestStepResultsModel> stepResults) {
    
    this.stepResults = stepResults;
    return this;
  }

  public AutoTestResultsForTestRunModel addStepResultsItem(AttachmentPutModelAutoTestStepResultsModel stepResultsItem) {
    this.stepResults.add(stepResultsItem);
    return this;
  }

   /**
   * Specifies the results of individual steps.
   * @return stepResults
  **/
  @javax.annotation.Nullable

  public List<AttachmentPutModelAutoTestStepResultsModel> getStepResults() {
    return stepResults;
  }


  public void setStepResults(List<AttachmentPutModelAutoTestStepResultsModel> stepResults) {
    this.stepResults = stepResults;
  }


  public AutoTestResultsForTestRunModel setupResults(List<AttachmentPutModelAutoTestStepResultsModel> setupResults) {
    
    this.setupResults = setupResults;
    return this;
  }

  public AutoTestResultsForTestRunModel addSetupResultsItem(AttachmentPutModelAutoTestStepResultsModel setupResultsItem) {
    this.setupResults.add(setupResultsItem);
    return this;
  }

   /**
   * Specifies the results of setup steps. For information on supported values, see the &#x60;stepResults&#x60; parameter above.
   * @return setupResults
  **/
  @javax.annotation.Nullable

  public List<AttachmentPutModelAutoTestStepResultsModel> getSetupResults() {
    return setupResults;
  }


  public void setSetupResults(List<AttachmentPutModelAutoTestStepResultsModel> setupResults) {
    this.setupResults = setupResults;
  }


  public AutoTestResultsForTestRunModel teardownResults(List<AttachmentPutModelAutoTestStepResultsModel> teardownResults) {
    
    this.teardownResults = teardownResults;
    return this;
  }

  public AutoTestResultsForTestRunModel addTeardownResultsItem(AttachmentPutModelAutoTestStepResultsModel teardownResultsItem) {
    this.teardownResults.add(teardownResultsItem);
    return this;
  }

   /**
   * Specifies the results of the teardown steps. For information on supported values, see the &#x60;stepResults&#x60; parameter above.
   * @return teardownResults
  **/
  @javax.annotation.Nullable

  public List<AttachmentPutModelAutoTestStepResultsModel> getTeardownResults() {
    return teardownResults;
  }


  public void setTeardownResults(List<AttachmentPutModelAutoTestStepResultsModel> teardownResults) {
    this.teardownResults = teardownResults;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoTestResultsForTestRunModel autoTestResultsForTestRunModel = (AutoTestResultsForTestRunModel) o;
    return Objects.equals(this.configurationId, autoTestResultsForTestRunModel.configurationId) &&
        Objects.equals(this.links, autoTestResultsForTestRunModel.links) &&
        Objects.equals(this.failureReasonNames, autoTestResultsForTestRunModel.failureReasonNames) &&
        Objects.equals(this.autoTestExternalId, autoTestResultsForTestRunModel.autoTestExternalId) &&
        Objects.equals(this.outcome, autoTestResultsForTestRunModel.outcome) &&
        Objects.equals(this.message, autoTestResultsForTestRunModel.message) &&
        Objects.equals(this.traces, autoTestResultsForTestRunModel.traces) &&
        Objects.equals(this.startedOn, autoTestResultsForTestRunModel.startedOn) &&
        Objects.equals(this.completedOn, autoTestResultsForTestRunModel.completedOn) &&
        Objects.equals(this.duration, autoTestResultsForTestRunModel.duration) &&
        Objects.equals(this.attachments, autoTestResultsForTestRunModel.attachments) &&
        Objects.equals(this.parameters, autoTestResultsForTestRunModel.parameters) &&
        Objects.equals(this.properties, autoTestResultsForTestRunModel.properties) &&
        Objects.equals(this.stepResults, autoTestResultsForTestRunModel.stepResults) &&
        Objects.equals(this.setupResults, autoTestResultsForTestRunModel.setupResults) &&
        Objects.equals(this.teardownResults, autoTestResultsForTestRunModel.teardownResults);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationId, links, failureReasonNames, autoTestExternalId, outcome, message, traces, startedOn, completedOn, duration, attachments, parameters, properties, stepResults, setupResults, teardownResults);
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
    sb.append("class AutoTestResultsForTestRunModel {\n");
    sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    failureReasonNames: ").append(toIndentedString(failureReasonNames)).append("\n");
    sb.append("    autoTestExternalId: ").append(toIndentedString(autoTestExternalId)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    traces: ").append(toIndentedString(traces)).append("\n");
    sb.append("    startedOn: ").append(toIndentedString(startedOn)).append("\n");
    sb.append("    completedOn: ").append(toIndentedString(completedOn)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    stepResults: ").append(toIndentedString(stepResults)).append("\n");
    sb.append("    setupResults: ").append(toIndentedString(setupResults)).append("\n");
    sb.append("    teardownResults: ").append(toIndentedString(teardownResults)).append("\n");
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
    openapiFields.add("configurationId");
    openapiFields.add("links");
    openapiFields.add("failureReasonNames");
    openapiFields.add("autoTestExternalId");
    openapiFields.add("outcome");
    openapiFields.add("message");
    openapiFields.add("traces");
    openapiFields.add("startedOn");
    openapiFields.add("completedOn");
    openapiFields.add("duration");
    openapiFields.add("attachments");
    openapiFields.add("parameters");
    openapiFields.add("properties");
    openapiFields.add("stepResults");
    openapiFields.add("setupResults");
    openapiFields.add("teardownResults");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("configurationId");
    openapiRequiredFields.add("autoTestExternalId");
    openapiRequiredFields.add("outcome");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AutoTestResultsForTestRunModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AutoTestResultsForTestRunModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AutoTestResultsForTestRunModel is not found in the empty JSON string", AutoTestResultsForTestRunModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AutoTestResultsForTestRunModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AutoTestResultsForTestRunModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AutoTestResultsForTestRunModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("configurationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configurationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configurationId").toString()));
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
          }

          // validate the optional field `links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            LinkPostModel.validateJsonObject(jsonArraylinks.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("failureReasonNames") != null && !jsonObj.get("failureReasonNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `failureReasonNames` to be an array in the JSON string but got `%s`", jsonObj.get("failureReasonNames").toString()));
      }
      if (!jsonObj.get("autoTestExternalId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `autoTestExternalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("autoTestExternalId").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("traces") != null && !jsonObj.get("traces").isJsonNull()) && !jsonObj.get("traces").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `traces` to be a primitive type in the JSON string but got `%s`", jsonObj.get("traces").toString()));
      }
      if (jsonObj.get("attachments") != null && !jsonObj.get("attachments").isJsonNull()) {
        JsonArray jsonArrayattachments = jsonObj.getAsJsonArray("attachments");
        if (jsonArrayattachments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attachments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attachments` to be an array in the JSON string but got `%s`", jsonObj.get("attachments").toString()));
          }

          // validate the optional field `attachments` (array)
          for (int i = 0; i < jsonArrayattachments.size(); i++) {
            AttachmentPutModel.validateJsonObject(jsonArrayattachments.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("stepResults") != null && !jsonObj.get("stepResults").isJsonNull()) {
        JsonArray jsonArraystepResults = jsonObj.getAsJsonArray("stepResults");
        if (jsonArraystepResults != null) {
          // ensure the json data is an array
          if (!jsonObj.get("stepResults").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `stepResults` to be an array in the JSON string but got `%s`", jsonObj.get("stepResults").toString()));
          }

          // validate the optional field `stepResults` (array)
          for (int i = 0; i < jsonArraystepResults.size(); i++) {
            AttachmentPutModelAutoTestStepResultsModel.validateJsonObject(jsonArraystepResults.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("setupResults") != null && !jsonObj.get("setupResults").isJsonNull()) {
        JsonArray jsonArraysetupResults = jsonObj.getAsJsonArray("setupResults");
        if (jsonArraysetupResults != null) {
          // ensure the json data is an array
          if (!jsonObj.get("setupResults").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `setupResults` to be an array in the JSON string but got `%s`", jsonObj.get("setupResults").toString()));
          }

          // validate the optional field `setupResults` (array)
          for (int i = 0; i < jsonArraysetupResults.size(); i++) {
            AttachmentPutModelAutoTestStepResultsModel.validateJsonObject(jsonArraysetupResults.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("teardownResults") != null && !jsonObj.get("teardownResults").isJsonNull()) {
        JsonArray jsonArrayteardownResults = jsonObj.getAsJsonArray("teardownResults");
        if (jsonArrayteardownResults != null) {
          // ensure the json data is an array
          if (!jsonObj.get("teardownResults").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `teardownResults` to be an array in the JSON string but got `%s`", jsonObj.get("teardownResults").toString()));
          }

          // validate the optional field `teardownResults` (array)
          for (int i = 0; i < jsonArrayteardownResults.size(); i++) {
            AttachmentPutModelAutoTestStepResultsModel.validateJsonObject(jsonArrayteardownResults.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AutoTestResultsForTestRunModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AutoTestResultsForTestRunModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AutoTestResultsForTestRunModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AutoTestResultsForTestRunModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AutoTestResultsForTestRunModel>() {
           @Override
           public void write(JsonWriter out, AutoTestResultsForTestRunModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AutoTestResultsForTestRunModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AutoTestResultsForTestRunModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AutoTestResultsForTestRunModel
  * @throws IOException if the JSON string is invalid with respect to AutoTestResultsForTestRunModel
  */
  public static AutoTestResultsForTestRunModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AutoTestResultsForTestRunModel.class);
  }

 /**
  * Convert an instance of AutoTestResultsForTestRunModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

