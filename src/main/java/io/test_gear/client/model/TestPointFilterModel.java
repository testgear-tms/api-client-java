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
import io.test_gear.client.model.DateTimeRangeSelectorModel;
import io.test_gear.client.model.Int64RangeSelectorModel;
import io.test_gear.client.model.TestPointStatus;
import io.test_gear.client.model.WorkItemPriorityModel;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
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
 * TestPointFilterModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestPointFilterModel {
  public static final String SERIALIZED_NAME_TEST_SUITE_IDS = "testSuiteIds";
  @SerializedName(SERIALIZED_NAME_TEST_SUITE_IDS)
  private Set<UUID> testSuiteIds = null;

  public static final String SERIALIZED_NAME_WORK_ITEM_GLOBAL_IDS = "workItemGlobalIds";
  @SerializedName(SERIALIZED_NAME_WORK_ITEM_GLOBAL_IDS)
  private Set<Long> workItemGlobalIds = null;

  public static final String SERIALIZED_NAME_STATUSES = "statuses";
  @SerializedName(SERIALIZED_NAME_STATUSES)
  private Set<TestPointStatus> statuses = null;

  public static final String SERIALIZED_NAME_PRIORITIES = "priorities";
  @SerializedName(SERIALIZED_NAME_PRIORITIES)
  private Set<WorkItemPriorityModel> priorities = null;

  public static final String SERIALIZED_NAME_IS_AUTOMATED = "isAutomated";
  @SerializedName(SERIALIZED_NAME_IS_AUTOMATED)
  private Boolean isAutomated;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CONFIGURATION_IDS = "configurationIds";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_IDS)
  private Set<UUID> configurationIds = null;

  public static final String SERIALIZED_NAME_TESTER_IDS = "testerIds";
  @SerializedName(SERIALIZED_NAME_TESTER_IDS)
  private Set<UUID> testerIds = null;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Int64RangeSelectorModel duration;

  public static final String SERIALIZED_NAME_SECTION_IDS = "sectionIds";
  @SerializedName(SERIALIZED_NAME_SECTION_IDS)
  private Set<UUID> sectionIds = null;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private DateTimeRangeSelectorModel createdDate;

  public static final String SERIALIZED_NAME_CREATED_BY_IDS = "createdByIds";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_IDS)
  private Set<UUID> createdByIds = null;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private DateTimeRangeSelectorModel modifiedDate;

  public static final String SERIALIZED_NAME_MODIFIED_BY_IDS = "modifiedByIds";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY_IDS)
  private Set<UUID> modifiedByIds = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Set<String> tags = null;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Set<String>> attributes = null;

  public TestPointFilterModel() {
  }

  public TestPointFilterModel testSuiteIds(Set<UUID> testSuiteIds) {
    
    this.testSuiteIds = testSuiteIds;
    return this;
  }

  public TestPointFilterModel addTestSuiteIdsItem(UUID testSuiteIdsItem) {
    if (this.testSuiteIds == null) {
      this.testSuiteIds = new LinkedHashSet<>();
    }
    this.testSuiteIds.add(testSuiteIdsItem);
    return this;
  }

   /**
   * Specifies a test point test suite IDs to search for
   * @return testSuiteIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a test point test suite IDs to search for")

  public Set<UUID> getTestSuiteIds() {
    return testSuiteIds;
  }


  public void setTestSuiteIds(Set<UUID> testSuiteIds) {
    this.testSuiteIds = testSuiteIds;
  }


  public TestPointFilterModel workItemGlobalIds(Set<Long> workItemGlobalIds) {
    
    this.workItemGlobalIds = workItemGlobalIds;
    return this;
  }

  public TestPointFilterModel addWorkItemGlobalIdsItem(Long workItemGlobalIdsItem) {
    if (this.workItemGlobalIds == null) {
      this.workItemGlobalIds = new LinkedHashSet<>();
    }
    this.workItemGlobalIds.add(workItemGlobalIdsItem);
    return this;
  }

   /**
   * Specifies a test point work item global IDs to search for
   * @return workItemGlobalIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a test point work item global IDs to search for")

  public Set<Long> getWorkItemGlobalIds() {
    return workItemGlobalIds;
  }


  public void setWorkItemGlobalIds(Set<Long> workItemGlobalIds) {
    this.workItemGlobalIds = workItemGlobalIds;
  }


  public TestPointFilterModel statuses(Set<TestPointStatus> statuses) {
    
    this.statuses = statuses;
    return this;
  }

  public TestPointFilterModel addStatusesItem(TestPointStatus statusesItem) {
    if (this.statuses == null) {
      this.statuses = new LinkedHashSet<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * Specifies a test point statuses to search for
   * @return statuses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a test point statuses to search for")

  public Set<TestPointStatus> getStatuses() {
    return statuses;
  }


  public void setStatuses(Set<TestPointStatus> statuses) {
    this.statuses = statuses;
  }


  public TestPointFilterModel priorities(Set<WorkItemPriorityModel> priorities) {
    
    this.priorities = priorities;
    return this;
  }

  public TestPointFilterModel addPrioritiesItem(WorkItemPriorityModel prioritiesItem) {
    if (this.priorities == null) {
      this.priorities = new LinkedHashSet<>();
    }
    this.priorities.add(prioritiesItem);
    return this;
  }

   /**
   * Specifies a test point priorities to search for
   * @return priorities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a test point priorities to search for")

  public Set<WorkItemPriorityModel> getPriorities() {
    return priorities;
  }


  public void setPriorities(Set<WorkItemPriorityModel> priorities) {
    this.priorities = priorities;
  }


  public TestPointFilterModel isAutomated(Boolean isAutomated) {
    
    this.isAutomated = isAutomated;
    return this;
  }

   /**
   * Specifies a test point automation status to search for
   * @return isAutomated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a test point automation status to search for")

  public Boolean getIsAutomated() {
    return isAutomated;
  }


  public void setIsAutomated(Boolean isAutomated) {
    this.isAutomated = isAutomated;
  }


  public TestPointFilterModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Specifies a test point name to search for
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a test point name to search for")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TestPointFilterModel configurationIds(Set<UUID> configurationIds) {
    
    this.configurationIds = configurationIds;
    return this;
  }

  public TestPointFilterModel addConfigurationIdsItem(UUID configurationIdsItem) {
    if (this.configurationIds == null) {
      this.configurationIds = new LinkedHashSet<>();
    }
    this.configurationIds.add(configurationIdsItem);
    return this;
  }

   /**
   * Specifies a test point configuration IDs to search for
   * @return configurationIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a test point configuration IDs to search for")

  public Set<UUID> getConfigurationIds() {
    return configurationIds;
  }


  public void setConfigurationIds(Set<UUID> configurationIds) {
    this.configurationIds = configurationIds;
  }


  public TestPointFilterModel testerIds(Set<UUID> testerIds) {
    
    this.testerIds = testerIds;
    return this;
  }

  public TestPointFilterModel addTesterIdsItem(UUID testerIdsItem) {
    if (this.testerIds == null) {
      this.testerIds = new LinkedHashSet<>();
    }
    this.testerIds.add(testerIdsItem);
    return this;
  }

   /**
   * Specifies a test point assigned user IDs to search for
   * @return testerIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a test point assigned user IDs to search for")

  public Set<UUID> getTesterIds() {
    return testerIds;
  }


  public void setTesterIds(Set<UUID> testerIds) {
    this.testerIds = testerIds;
  }


  public TestPointFilterModel duration(Int64RangeSelectorModel duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Int64RangeSelectorModel getDuration() {
    return duration;
  }


  public void setDuration(Int64RangeSelectorModel duration) {
    this.duration = duration;
  }


  public TestPointFilterModel sectionIds(Set<UUID> sectionIds) {
    
    this.sectionIds = sectionIds;
    return this;
  }

  public TestPointFilterModel addSectionIdsItem(UUID sectionIdsItem) {
    if (this.sectionIds == null) {
      this.sectionIds = new LinkedHashSet<>();
    }
    this.sectionIds.add(sectionIdsItem);
    return this;
  }

   /**
   * Specifies a test point work item section IDs to search for
   * @return sectionIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a test point work item section IDs to search for")

  public Set<UUID> getSectionIds() {
    return sectionIds;
  }


  public void setSectionIds(Set<UUID> sectionIds) {
    this.sectionIds = sectionIds;
  }


  public TestPointFilterModel createdDate(DateTimeRangeSelectorModel createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DateTimeRangeSelectorModel getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(DateTimeRangeSelectorModel createdDate) {
    this.createdDate = createdDate;
  }


  public TestPointFilterModel createdByIds(Set<UUID> createdByIds) {
    
    this.createdByIds = createdByIds;
    return this;
  }

  public TestPointFilterModel addCreatedByIdsItem(UUID createdByIdsItem) {
    if (this.createdByIds == null) {
      this.createdByIds = new LinkedHashSet<>();
    }
    this.createdByIds.add(createdByIdsItem);
    return this;
  }

   /**
   * Specifies a test point creator IDs to search for
   * @return createdByIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a test point creator IDs to search for")

  public Set<UUID> getCreatedByIds() {
    return createdByIds;
  }


  public void setCreatedByIds(Set<UUID> createdByIds) {
    this.createdByIds = createdByIds;
  }


  public TestPointFilterModel modifiedDate(DateTimeRangeSelectorModel modifiedDate) {
    
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DateTimeRangeSelectorModel getModifiedDate() {
    return modifiedDate;
  }


  public void setModifiedDate(DateTimeRangeSelectorModel modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public TestPointFilterModel modifiedByIds(Set<UUID> modifiedByIds) {
    
    this.modifiedByIds = modifiedByIds;
    return this;
  }

  public TestPointFilterModel addModifiedByIdsItem(UUID modifiedByIdsItem) {
    if (this.modifiedByIds == null) {
      this.modifiedByIds = new LinkedHashSet<>();
    }
    this.modifiedByIds.add(modifiedByIdsItem);
    return this;
  }

   /**
   * Specifies a test point last editor IDs to search for
   * @return modifiedByIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a test point last editor IDs to search for")

  public Set<UUID> getModifiedByIds() {
    return modifiedByIds;
  }


  public void setModifiedByIds(Set<UUID> modifiedByIds) {
    this.modifiedByIds = modifiedByIds;
  }


  public TestPointFilterModel tags(Set<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public TestPointFilterModel addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new LinkedHashSet<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Specifies a test point tags to search for
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a test point tags to search for")

  public Set<String> getTags() {
    return tags;
  }


  public void setTags(Set<String> tags) {
    this.tags = tags;
  }


  public TestPointFilterModel attributes(Map<String, Set<String>> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public TestPointFilterModel putAttributesItem(String key, Set<String> attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Specifies a test point attributes to search for
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a test point attributes to search for")

  public Map<String, Set<String>> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, Set<String>> attributes) {
    this.attributes = attributes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestPointFilterModel testPointFilterModel = (TestPointFilterModel) o;
    return Objects.equals(this.testSuiteIds, testPointFilterModel.testSuiteIds) &&
        Objects.equals(this.workItemGlobalIds, testPointFilterModel.workItemGlobalIds) &&
        Objects.equals(this.statuses, testPointFilterModel.statuses) &&
        Objects.equals(this.priorities, testPointFilterModel.priorities) &&
        Objects.equals(this.isAutomated, testPointFilterModel.isAutomated) &&
        Objects.equals(this.name, testPointFilterModel.name) &&
        Objects.equals(this.configurationIds, testPointFilterModel.configurationIds) &&
        Objects.equals(this.testerIds, testPointFilterModel.testerIds) &&
        Objects.equals(this.duration, testPointFilterModel.duration) &&
        Objects.equals(this.sectionIds, testPointFilterModel.sectionIds) &&
        Objects.equals(this.createdDate, testPointFilterModel.createdDate) &&
        Objects.equals(this.createdByIds, testPointFilterModel.createdByIds) &&
        Objects.equals(this.modifiedDate, testPointFilterModel.modifiedDate) &&
        Objects.equals(this.modifiedByIds, testPointFilterModel.modifiedByIds) &&
        Objects.equals(this.tags, testPointFilterModel.tags) &&
        Objects.equals(this.attributes, testPointFilterModel.attributes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(testSuiteIds, workItemGlobalIds, statuses, priorities, isAutomated, name, configurationIds, testerIds, duration, sectionIds, createdDate, createdByIds, modifiedDate, modifiedByIds, tags, attributes);
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
    sb.append("class TestPointFilterModel {\n");
    sb.append("    testSuiteIds: ").append(toIndentedString(testSuiteIds)).append("\n");
    sb.append("    workItemGlobalIds: ").append(toIndentedString(workItemGlobalIds)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    priorities: ").append(toIndentedString(priorities)).append("\n");
    sb.append("    isAutomated: ").append(toIndentedString(isAutomated)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    configurationIds: ").append(toIndentedString(configurationIds)).append("\n");
    sb.append("    testerIds: ").append(toIndentedString(testerIds)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    sectionIds: ").append(toIndentedString(sectionIds)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdByIds: ").append(toIndentedString(createdByIds)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    modifiedByIds: ").append(toIndentedString(modifiedByIds)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
    openapiFields.add("testSuiteIds");
    openapiFields.add("workItemGlobalIds");
    openapiFields.add("statuses");
    openapiFields.add("priorities");
    openapiFields.add("isAutomated");
    openapiFields.add("name");
    openapiFields.add("configurationIds");
    openapiFields.add("testerIds");
    openapiFields.add("duration");
    openapiFields.add("sectionIds");
    openapiFields.add("createdDate");
    openapiFields.add("createdByIds");
    openapiFields.add("modifiedDate");
    openapiFields.add("modifiedByIds");
    openapiFields.add("tags");
    openapiFields.add("attributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TestPointFilterModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TestPointFilterModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestPointFilterModel is not found in the empty JSON string", TestPointFilterModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TestPointFilterModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestPointFilterModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("testSuiteIds") != null && !jsonObj.get("testSuiteIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `testSuiteIds` to be an array in the JSON string but got `%s`", jsonObj.get("testSuiteIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("workItemGlobalIds") != null && !jsonObj.get("workItemGlobalIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `workItemGlobalIds` to be an array in the JSON string but got `%s`", jsonObj.get("workItemGlobalIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("statuses") != null && !jsonObj.get("statuses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `statuses` to be an array in the JSON string but got `%s`", jsonObj.get("statuses").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("priorities") != null && !jsonObj.get("priorities").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `priorities` to be an array in the JSON string but got `%s`", jsonObj.get("priorities").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("configurationIds") != null && !jsonObj.get("configurationIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `configurationIds` to be an array in the JSON string but got `%s`", jsonObj.get("configurationIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("testerIds") != null && !jsonObj.get("testerIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `testerIds` to be an array in the JSON string but got `%s`", jsonObj.get("testerIds").toString()));
      }
      // validate the optional field `duration`
      if (jsonObj.get("duration") != null && !jsonObj.get("duration").isJsonNull()) {
        Int64RangeSelectorModel.validateJsonObject(jsonObj.getAsJsonObject("duration"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sectionIds") != null && !jsonObj.get("sectionIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sectionIds` to be an array in the JSON string but got `%s`", jsonObj.get("sectionIds").toString()));
      }
      // validate the optional field `createdDate`
      if (jsonObj.get("createdDate") != null && !jsonObj.get("createdDate").isJsonNull()) {
        DateTimeRangeSelectorModel.validateJsonObject(jsonObj.getAsJsonObject("createdDate"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("createdByIds") != null && !jsonObj.get("createdByIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdByIds` to be an array in the JSON string but got `%s`", jsonObj.get("createdByIds").toString()));
      }
      // validate the optional field `modifiedDate`
      if (jsonObj.get("modifiedDate") != null && !jsonObj.get("modifiedDate").isJsonNull()) {
        DateTimeRangeSelectorModel.validateJsonObject(jsonObj.getAsJsonObject("modifiedDate"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("modifiedByIds") != null && !jsonObj.get("modifiedByIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedByIds` to be an array in the JSON string but got `%s`", jsonObj.get("modifiedByIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestPointFilterModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestPointFilterModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestPointFilterModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestPointFilterModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestPointFilterModel>() {
           @Override
           public void write(JsonWriter out, TestPointFilterModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestPointFilterModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestPointFilterModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestPointFilterModel
  * @throws IOException if the JSON string is invalid with respect to TestPointFilterModel
  */
  public static TestPointFilterModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestPointFilterModel.class);
  }

 /**
  * Convert an instance of TestPointFilterModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
