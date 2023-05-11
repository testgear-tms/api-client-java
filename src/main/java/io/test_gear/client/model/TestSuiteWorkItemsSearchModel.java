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
import io.test_gear.client.model.DateTimeRangeSelectorModel;
import io.test_gear.client.model.Int32RangeSelectorModel;
import io.test_gear.client.model.WorkItemPriorityModel;
import io.test_gear.client.model.WorkItemStates;
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
 * TestSuiteWorkItemsSearchModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestSuiteWorkItemsSearchModel {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_GLOBAL_IDS = "globalIds";
  @SerializedName(SERIALIZED_NAME_GLOBAL_IDS)
  private Set<Long> globalIds;

  public static final String SERIALIZED_NAME_SECTION_IDS = "sectionIds";
  @SerializedName(SERIALIZED_NAME_SECTION_IDS)
  private Set<UUID> sectionIds;

  public static final String SERIALIZED_NAME_PRIORITIES = "priorities";
  @SerializedName(SERIALIZED_NAME_PRIORITIES)
  private Set<WorkItemPriorityModel> priorities;

  public static final String SERIALIZED_NAME_IS_AUTOMATED = "isAutomated";
  @SerializedName(SERIALIZED_NAME_IS_AUTOMATED)
  private Boolean isAutomated;

  public static final String SERIALIZED_NAME_STATES = "states";
  @SerializedName(SERIALIZED_NAME_STATES)
  private Set<WorkItemStates> states;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Int32RangeSelectorModel duration;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private DateTimeRangeSelectorModel createdDate;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private DateTimeRangeSelectorModel modifiedDate;

  public static final String SERIALIZED_NAME_CREATED_BY_IDS = "createdByIds";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_IDS)
  private Set<UUID> createdByIds;

  public static final String SERIALIZED_NAME_MODIFIED_BY_IDS = "modifiedByIds";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY_IDS)
  private Set<UUID> modifiedByIds;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Set<String>> attributes;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_TAG_NAMES = "tagNames";
  @SerializedName(SERIALIZED_NAME_TAG_NAMES)
  private Set<String> tagNames;

  public static final String SERIALIZED_NAME_ENTITY_TYPES = "entityTypes";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPES)
  private Set<String> entityTypes;

  public TestSuiteWorkItemsSearchModel() {
  }

  public TestSuiteWorkItemsSearchModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of work item
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TestSuiteWorkItemsSearchModel globalIds(Set<Long> globalIds) {
    
    this.globalIds = globalIds;
    return this;
  }

  public TestSuiteWorkItemsSearchModel addGlobalIdsItem(Long globalIdsItem) {
    this.globalIds.add(globalIdsItem);
    return this;
  }

   /**
   * Collection of global (integer) identifiers
   * @return globalIds
  **/
  @javax.annotation.Nullable

  public Set<Long> getGlobalIds() {
    return globalIds;
  }


  public void setGlobalIds(Set<Long> globalIds) {
    this.globalIds = globalIds;
  }


  public TestSuiteWorkItemsSearchModel sectionIds(Set<UUID> sectionIds) {
    
    this.sectionIds = sectionIds;
    return this;
  }

  public TestSuiteWorkItemsSearchModel addSectionIdsItem(UUID sectionIdsItem) {
    this.sectionIds.add(sectionIdsItem);
    return this;
  }

   /**
   * Collection of section identifiers
   * @return sectionIds
  **/
  @javax.annotation.Nullable

  public Set<UUID> getSectionIds() {
    return sectionIds;
  }


  public void setSectionIds(Set<UUID> sectionIds) {
    this.sectionIds = sectionIds;
  }


  public TestSuiteWorkItemsSearchModel priorities(Set<WorkItemPriorityModel> priorities) {
    
    this.priorities = priorities;
    return this;
  }

  public TestSuiteWorkItemsSearchModel addPrioritiesItem(WorkItemPriorityModel prioritiesItem) {
    this.priorities.add(prioritiesItem);
    return this;
  }

   /**
   * Collection of priorities of work item
   * @return priorities
  **/
  @javax.annotation.Nullable

  public Set<WorkItemPriorityModel> getPriorities() {
    return priorities;
  }


  public void setPriorities(Set<WorkItemPriorityModel> priorities) {
    this.priorities = priorities;
  }


  public TestSuiteWorkItemsSearchModel isAutomated(Boolean isAutomated) {
    
    this.isAutomated = isAutomated;
    return this;
  }

   /**
   * Is result must consist of only manual/automated work items
   * @return isAutomated
  **/
  @javax.annotation.Nullable

  public Boolean getIsAutomated() {
    return isAutomated;
  }


  public void setIsAutomated(Boolean isAutomated) {
    this.isAutomated = isAutomated;
  }


  public TestSuiteWorkItemsSearchModel states(Set<WorkItemStates> states) {
    
    this.states = states;
    return this;
  }

  public TestSuiteWorkItemsSearchModel addStatesItem(WorkItemStates statesItem) {
    this.states.add(statesItem);
    return this;
  }

   /**
   * Collection of states of work item
   * @return states
  **/
  @javax.annotation.Nullable

  public Set<WorkItemStates> getStates() {
    return states;
  }


  public void setStates(Set<WorkItemStates> states) {
    this.states = states;
  }


  public TestSuiteWorkItemsSearchModel duration(Int32RangeSelectorModel duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable

  public Int32RangeSelectorModel getDuration() {
    return duration;
  }


  public void setDuration(Int32RangeSelectorModel duration) {
    this.duration = duration;
  }


  public TestSuiteWorkItemsSearchModel createdDate(DateTimeRangeSelectorModel createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable

  public DateTimeRangeSelectorModel getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(DateTimeRangeSelectorModel createdDate) {
    this.createdDate = createdDate;
  }


  public TestSuiteWorkItemsSearchModel modifiedDate(DateTimeRangeSelectorModel modifiedDate) {
    
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @javax.annotation.Nullable

  public DateTimeRangeSelectorModel getModifiedDate() {
    return modifiedDate;
  }


  public void setModifiedDate(DateTimeRangeSelectorModel modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public TestSuiteWorkItemsSearchModel createdByIds(Set<UUID> createdByIds) {
    
    this.createdByIds = createdByIds;
    return this;
  }

  public TestSuiteWorkItemsSearchModel addCreatedByIdsItem(UUID createdByIdsItem) {
    this.createdByIds.add(createdByIdsItem);
    return this;
  }

   /**
   * Collection of identifiers of users who created work item
   * @return createdByIds
  **/
  @javax.annotation.Nullable

  public Set<UUID> getCreatedByIds() {
    return createdByIds;
  }


  public void setCreatedByIds(Set<UUID> createdByIds) {
    this.createdByIds = createdByIds;
  }


  public TestSuiteWorkItemsSearchModel modifiedByIds(Set<UUID> modifiedByIds) {
    
    this.modifiedByIds = modifiedByIds;
    return this;
  }

  public TestSuiteWorkItemsSearchModel addModifiedByIdsItem(UUID modifiedByIdsItem) {
    this.modifiedByIds.add(modifiedByIdsItem);
    return this;
  }

   /**
   * Collection of identifiers of users who applied last modification to work item
   * @return modifiedByIds
  **/
  @javax.annotation.Nullable

  public Set<UUID> getModifiedByIds() {
    return modifiedByIds;
  }


  public void setModifiedByIds(Set<UUID> modifiedByIds) {
    this.modifiedByIds = modifiedByIds;
  }


  public TestSuiteWorkItemsSearchModel attributes(Map<String, Set<String>> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public TestSuiteWorkItemsSearchModel putAttributesItem(String key, Set<String> attributesItem) {
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Custom attributes of work item
   * @return attributes
  **/
  @javax.annotation.Nullable

  public Map<String, Set<String>> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, Set<String>> attributes) {
    this.attributes = attributes;
  }


  public TestSuiteWorkItemsSearchModel isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Is result must consist of only actual/deleted work items
   * @return isDeleted
  **/
  @javax.annotation.Nullable

  public Boolean getIsDeleted() {
    return isDeleted;
  }


  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public TestSuiteWorkItemsSearchModel tagNames(Set<String> tagNames) {
    
    this.tagNames = tagNames;
    return this;
  }

  public TestSuiteWorkItemsSearchModel addTagNamesItem(String tagNamesItem) {
    this.tagNames.add(tagNamesItem);
    return this;
  }

   /**
   * Collection of tags
   * @return tagNames
  **/
  @javax.annotation.Nullable

  public Set<String> getTagNames() {
    return tagNames;
  }


  public void setTagNames(Set<String> tagNames) {
    this.tagNames = tagNames;
  }


  public TestSuiteWorkItemsSearchModel entityTypes(Set<String> entityTypes) {
    
    this.entityTypes = entityTypes;
    return this;
  }

  public TestSuiteWorkItemsSearchModel addEntityTypesItem(String entityTypesItem) {
    this.entityTypes.add(entityTypesItem);
    return this;
  }

   /**
   * Collection of types of work item  &lt;br&gt;Allowed values: &#x60;TestCases&#x60;, &#x60;CheckLists&#x60;, &#x60;SharedSteps&#x60;
   * @return entityTypes
  **/
  @javax.annotation.Nullable

  public Set<String> getEntityTypes() {
    return entityTypes;
  }


  public void setEntityTypes(Set<String> entityTypes) {
    this.entityTypes = entityTypes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestSuiteWorkItemsSearchModel testSuiteWorkItemsSearchModel = (TestSuiteWorkItemsSearchModel) o;
    return Objects.equals(this.name, testSuiteWorkItemsSearchModel.name) &&
        Objects.equals(this.globalIds, testSuiteWorkItemsSearchModel.globalIds) &&
        Objects.equals(this.sectionIds, testSuiteWorkItemsSearchModel.sectionIds) &&
        Objects.equals(this.priorities, testSuiteWorkItemsSearchModel.priorities) &&
        Objects.equals(this.isAutomated, testSuiteWorkItemsSearchModel.isAutomated) &&
        Objects.equals(this.states, testSuiteWorkItemsSearchModel.states) &&
        Objects.equals(this.duration, testSuiteWorkItemsSearchModel.duration) &&
        Objects.equals(this.createdDate, testSuiteWorkItemsSearchModel.createdDate) &&
        Objects.equals(this.modifiedDate, testSuiteWorkItemsSearchModel.modifiedDate) &&
        Objects.equals(this.createdByIds, testSuiteWorkItemsSearchModel.createdByIds) &&
        Objects.equals(this.modifiedByIds, testSuiteWorkItemsSearchModel.modifiedByIds) &&
        Objects.equals(this.attributes, testSuiteWorkItemsSearchModel.attributes) &&
        Objects.equals(this.isDeleted, testSuiteWorkItemsSearchModel.isDeleted) &&
        Objects.equals(this.tagNames, testSuiteWorkItemsSearchModel.tagNames) &&
        Objects.equals(this.entityTypes, testSuiteWorkItemsSearchModel.entityTypes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, globalIds, sectionIds, priorities, isAutomated, states, duration, createdDate, modifiedDate, createdByIds, modifiedByIds, attributes, isDeleted, tagNames, entityTypes);
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
    sb.append("class TestSuiteWorkItemsSearchModel {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    globalIds: ").append(toIndentedString(globalIds)).append("\n");
    sb.append("    sectionIds: ").append(toIndentedString(sectionIds)).append("\n");
    sb.append("    priorities: ").append(toIndentedString(priorities)).append("\n");
    sb.append("    isAutomated: ").append(toIndentedString(isAutomated)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    createdByIds: ").append(toIndentedString(createdByIds)).append("\n");
    sb.append("    modifiedByIds: ").append(toIndentedString(modifiedByIds)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    tagNames: ").append(toIndentedString(tagNames)).append("\n");
    sb.append("    entityTypes: ").append(toIndentedString(entityTypes)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("globalIds");
    openapiFields.add("sectionIds");
    openapiFields.add("priorities");
    openapiFields.add("isAutomated");
    openapiFields.add("states");
    openapiFields.add("duration");
    openapiFields.add("createdDate");
    openapiFields.add("modifiedDate");
    openapiFields.add("createdByIds");
    openapiFields.add("modifiedByIds");
    openapiFields.add("attributes");
    openapiFields.add("isDeleted");
    openapiFields.add("tagNames");
    openapiFields.add("entityTypes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TestSuiteWorkItemsSearchModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TestSuiteWorkItemsSearchModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestSuiteWorkItemsSearchModel is not found in the empty JSON string", TestSuiteWorkItemsSearchModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TestSuiteWorkItemsSearchModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestSuiteWorkItemsSearchModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("globalIds") != null && !jsonObj.get("globalIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `globalIds` to be an array in the JSON string but got `%s`", jsonObj.get("globalIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sectionIds") != null && !jsonObj.get("sectionIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sectionIds` to be an array in the JSON string but got `%s`", jsonObj.get("sectionIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("priorities") != null && !jsonObj.get("priorities").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `priorities` to be an array in the JSON string but got `%s`", jsonObj.get("priorities").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("states") != null && !jsonObj.get("states").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `states` to be an array in the JSON string but got `%s`", jsonObj.get("states").toString()));
      }
      // validate the optional field `duration`
      if (jsonObj.get("duration") != null && !jsonObj.get("duration").isJsonNull()) {
        Int32RangeSelectorModel.validateJsonObject(jsonObj.getAsJsonObject("duration"));
      }
      // validate the optional field `createdDate`
      if (jsonObj.get("createdDate") != null && !jsonObj.get("createdDate").isJsonNull()) {
        DateTimeRangeSelectorModel.validateJsonObject(jsonObj.getAsJsonObject("createdDate"));
      }
      // validate the optional field `modifiedDate`
      if (jsonObj.get("modifiedDate") != null && !jsonObj.get("modifiedDate").isJsonNull()) {
        DateTimeRangeSelectorModel.validateJsonObject(jsonObj.getAsJsonObject("modifiedDate"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("createdByIds") != null && !jsonObj.get("createdByIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdByIds` to be an array in the JSON string but got `%s`", jsonObj.get("createdByIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("modifiedByIds") != null && !jsonObj.get("modifiedByIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedByIds` to be an array in the JSON string but got `%s`", jsonObj.get("modifiedByIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tagNames") != null && !jsonObj.get("tagNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tagNames` to be an array in the JSON string but got `%s`", jsonObj.get("tagNames").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("entityTypes") != null && !jsonObj.get("entityTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityTypes` to be an array in the JSON string but got `%s`", jsonObj.get("entityTypes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestSuiteWorkItemsSearchModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestSuiteWorkItemsSearchModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestSuiteWorkItemsSearchModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestSuiteWorkItemsSearchModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestSuiteWorkItemsSearchModel>() {
           @Override
           public void write(JsonWriter out, TestSuiteWorkItemsSearchModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestSuiteWorkItemsSearchModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestSuiteWorkItemsSearchModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestSuiteWorkItemsSearchModel
  * @throws IOException if the JSON string is invalid with respect to TestSuiteWorkItemsSearchModel
  */
  public static TestSuiteWorkItemsSearchModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestSuiteWorkItemsSearchModel.class);
  }

 /**
  * Convert an instance of TestSuiteWorkItemsSearchModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

