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
import io.test_gear.client.model.LinkModel;
import io.test_gear.client.model.StepResultModel;
import io.test_gear.client.model.TestResultStepCommentPutModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * TestResultUpdateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestResultUpdateModel {
  public static final String SERIALIZED_NAME_SETUP_RESULTS = "setupResults";
  @SerializedName(SERIALIZED_NAME_SETUP_RESULTS)
  private List<AttachmentPutModelAutoTestStepResultsModel> setupResults;

  public static final String SERIALIZED_NAME_TEARDOWN_RESULTS = "teardownResults";
  @SerializedName(SERIALIZED_NAME_TEARDOWN_RESULTS)
  private List<AttachmentPutModelAutoTestStepResultsModel> teardownResults;

  public static final String SERIALIZED_NAME_DURATION_IN_MS = "durationInMs";
  @SerializedName(SERIALIZED_NAME_DURATION_IN_MS)
  private Long durationInMs;

  public static final String SERIALIZED_NAME_STEP_COMMENTS = "stepComments";
  @SerializedName(SERIALIZED_NAME_STEP_COMMENTS)
  private List<TestResultStepCommentPutModel> stepComments;

  public static final String SERIALIZED_NAME_FAILURE_CLASS_IDS = "failureClassIds";
  @SerializedName(SERIALIZED_NAME_FAILURE_CLASS_IDS)
  private List<UUID> failureClassIds;

  public static final String SERIALIZED_NAME_OUTCOME = "outcome";
  @SerializedName(SERIALIZED_NAME_OUTCOME)
  private String outcome;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<LinkModel> links;

  public static final String SERIALIZED_NAME_STEP_RESULTS = "stepResults";
  @SerializedName(SERIALIZED_NAME_STEP_RESULTS)
  private List<StepResultModel> stepResults;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<AttachmentPutModel> attachments;

  public TestResultUpdateModel() {
  }

  public TestResultUpdateModel setupResults(List<AttachmentPutModelAutoTestStepResultsModel> setupResults) {
    
    this.setupResults = setupResults;
    return this;
  }

  public TestResultUpdateModel addSetupResultsItem(AttachmentPutModelAutoTestStepResultsModel setupResultsItem) {
    this.setupResults.add(setupResultsItem);
    return this;
  }

   /**
   * Get setupResults
   * @return setupResults
  **/
  @javax.annotation.Nullable

  public List<AttachmentPutModelAutoTestStepResultsModel> getSetupResults() {
    return setupResults;
  }


  public void setSetupResults(List<AttachmentPutModelAutoTestStepResultsModel> setupResults) {
    this.setupResults = setupResults;
  }


  public TestResultUpdateModel teardownResults(List<AttachmentPutModelAutoTestStepResultsModel> teardownResults) {
    
    this.teardownResults = teardownResults;
    return this;
  }

  public TestResultUpdateModel addTeardownResultsItem(AttachmentPutModelAutoTestStepResultsModel teardownResultsItem) {
    this.teardownResults.add(teardownResultsItem);
    return this;
  }

   /**
   * Get teardownResults
   * @return teardownResults
  **/
  @javax.annotation.Nullable

  public List<AttachmentPutModelAutoTestStepResultsModel> getTeardownResults() {
    return teardownResults;
  }


  public void setTeardownResults(List<AttachmentPutModelAutoTestStepResultsModel> teardownResults) {
    this.teardownResults = teardownResults;
  }


  public TestResultUpdateModel durationInMs(Long durationInMs) {
    
    this.durationInMs = durationInMs;
    return this;
  }

   /**
   * Get durationInMs
   * minimum: 0
   * @return durationInMs
  **/
  @javax.annotation.Nullable

  public Long getDurationInMs() {
    return durationInMs;
  }


  public void setDurationInMs(Long durationInMs) {
    this.durationInMs = durationInMs;
  }


  public TestResultUpdateModel stepComments(List<TestResultStepCommentPutModel> stepComments) {
    
    this.stepComments = stepComments;
    return this;
  }

  public TestResultUpdateModel addStepCommentsItem(TestResultStepCommentPutModel stepCommentsItem) {
    this.stepComments.add(stepCommentsItem);
    return this;
  }

   /**
   * Get stepComments
   * @return stepComments
  **/
  @javax.annotation.Nullable

  public List<TestResultStepCommentPutModel> getStepComments() {
    return stepComments;
  }


  public void setStepComments(List<TestResultStepCommentPutModel> stepComments) {
    this.stepComments = stepComments;
  }


  public TestResultUpdateModel failureClassIds(List<UUID> failureClassIds) {
    
    this.failureClassIds = failureClassIds;
    return this;
  }

  public TestResultUpdateModel addFailureClassIdsItem(UUID failureClassIdsItem) {
    this.failureClassIds.add(failureClassIdsItem);
    return this;
  }

   /**
   * Get failureClassIds
   * @return failureClassIds
  **/
  @javax.annotation.Nullable

  public List<UUID> getFailureClassIds() {
    return failureClassIds;
  }


  public void setFailureClassIds(List<UUID> failureClassIds) {
    this.failureClassIds = failureClassIds;
  }


  public TestResultUpdateModel outcome(String outcome) {
    
    this.outcome = outcome;
    return this;
  }

   /**
   * Get outcome
   * @return outcome
  **/
  @javax.annotation.Nullable

  public String getOutcome() {
    return outcome;
  }


  public void setOutcome(String outcome) {
    this.outcome = outcome;
  }


  public TestResultUpdateModel comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public TestResultUpdateModel links(List<LinkModel> links) {
    
    this.links = links;
    return this;
  }

  public TestResultUpdateModel addLinksItem(LinkModel linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable

  public List<LinkModel> getLinks() {
    return links;
  }


  public void setLinks(List<LinkModel> links) {
    this.links = links;
  }


  public TestResultUpdateModel stepResults(List<StepResultModel> stepResults) {
    
    this.stepResults = stepResults;
    return this;
  }

  public TestResultUpdateModel addStepResultsItem(StepResultModel stepResultsItem) {
    this.stepResults.add(stepResultsItem);
    return this;
  }

   /**
   * Get stepResults
   * @return stepResults
  **/
  @javax.annotation.Nullable

  public List<StepResultModel> getStepResults() {
    return stepResults;
  }


  public void setStepResults(List<StepResultModel> stepResults) {
    this.stepResults = stepResults;
  }


  public TestResultUpdateModel attachments(List<AttachmentPutModel> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public TestResultUpdateModel addAttachmentsItem(AttachmentPutModel attachmentsItem) {
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @javax.annotation.Nullable

  public List<AttachmentPutModel> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<AttachmentPutModel> attachments) {
    this.attachments = attachments;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestResultUpdateModel testResultUpdateModel = (TestResultUpdateModel) o;
    return Objects.equals(this.setupResults, testResultUpdateModel.setupResults) &&
        Objects.equals(this.teardownResults, testResultUpdateModel.teardownResults) &&
        Objects.equals(this.durationInMs, testResultUpdateModel.durationInMs) &&
        Objects.equals(this.stepComments, testResultUpdateModel.stepComments) &&
        Objects.equals(this.failureClassIds, testResultUpdateModel.failureClassIds) &&
        Objects.equals(this.outcome, testResultUpdateModel.outcome) &&
        Objects.equals(this.comment, testResultUpdateModel.comment) &&
        Objects.equals(this.links, testResultUpdateModel.links) &&
        Objects.equals(this.stepResults, testResultUpdateModel.stepResults) &&
        Objects.equals(this.attachments, testResultUpdateModel.attachments);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(setupResults, teardownResults, durationInMs, stepComments, failureClassIds, outcome, comment, links, stepResults, attachments);
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
    sb.append("class TestResultUpdateModel {\n");
    sb.append("    setupResults: ").append(toIndentedString(setupResults)).append("\n");
    sb.append("    teardownResults: ").append(toIndentedString(teardownResults)).append("\n");
    sb.append("    durationInMs: ").append(toIndentedString(durationInMs)).append("\n");
    sb.append("    stepComments: ").append(toIndentedString(stepComments)).append("\n");
    sb.append("    failureClassIds: ").append(toIndentedString(failureClassIds)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    stepResults: ").append(toIndentedString(stepResults)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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
    openapiFields.add("setupResults");
    openapiFields.add("teardownResults");
    openapiFields.add("durationInMs");
    openapiFields.add("stepComments");
    openapiFields.add("failureClassIds");
    openapiFields.add("outcome");
    openapiFields.add("comment");
    openapiFields.add("links");
    openapiFields.add("stepResults");
    openapiFields.add("attachments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TestResultUpdateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TestResultUpdateModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestResultUpdateModel is not found in the empty JSON string", TestResultUpdateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TestResultUpdateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestResultUpdateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if (jsonObj.get("stepComments") != null && !jsonObj.get("stepComments").isJsonNull()) {
        JsonArray jsonArraystepComments = jsonObj.getAsJsonArray("stepComments");
        if (jsonArraystepComments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("stepComments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `stepComments` to be an array in the JSON string but got `%s`", jsonObj.get("stepComments").toString()));
          }

          // validate the optional field `stepComments` (array)
          for (int i = 0; i < jsonArraystepComments.size(); i++) {
            TestResultStepCommentPutModel.validateJsonObject(jsonArraystepComments.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("failureClassIds") != null && !jsonObj.get("failureClassIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `failureClassIds` to be an array in the JSON string but got `%s`", jsonObj.get("failureClassIds").toString()));
      }
      if ((jsonObj.get("outcome") != null && !jsonObj.get("outcome").isJsonNull()) && !jsonObj.get("outcome").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outcome` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outcome").toString()));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
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
            LinkModel.validateJsonObject(jsonArraylinks.get(i).getAsJsonObject());
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
            StepResultModel.validateJsonObject(jsonArraystepResults.get(i).getAsJsonObject());
          };
        }
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestResultUpdateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestResultUpdateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestResultUpdateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestResultUpdateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestResultUpdateModel>() {
           @Override
           public void write(JsonWriter out, TestResultUpdateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestResultUpdateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestResultUpdateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestResultUpdateModel
  * @throws IOException if the JSON string is invalid with respect to TestResultUpdateModel
  */
  public static TestResultUpdateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestResultUpdateModel.class);
  }

 /**
  * Convert an instance of TestResultUpdateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

