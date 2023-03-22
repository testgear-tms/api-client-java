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
import io.test_gear.client.model.DateRangeModel;
import io.test_gear.client.model.TestPlanStatusModel;
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
 * TestPlanSearchQueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestPlanSearchQueryModel {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_BUILD = "build";
  @SerializedName(SERIALIZED_NAME_BUILD)
  private String build;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "productName";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Set<TestPlanStatusModel> status = null;

  public static final String SERIALIZED_NAME_GLOBAL_IDS = "globalIds";
  @SerializedName(SERIALIZED_NAME_GLOBAL_IDS)
  private Set<Long> globalIds = null;

  public static final String SERIALIZED_NAME_IS_LOCKED = "isLocked";
  @SerializedName(SERIALIZED_NAME_IS_LOCKED)
  private Boolean isLocked;

  public static final String SERIALIZED_NAME_LOCKED_DATE = "lockedDate";
  @SerializedName(SERIALIZED_NAME_LOCKED_DATE)
  private DateRangeModel lockedDate;

  public static final String SERIALIZED_NAME_AUTOMATIC_DURATION_TIMER = "automaticDurationTimer";
  @SerializedName(SERIALIZED_NAME_AUTOMATIC_DURATION_TIMER)
  private Set<Boolean> automaticDurationTimer = null;

  public static final String SERIALIZED_NAME_CREATED_BY_IDS = "createdByIds";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_IDS)
  private Set<UUID> createdByIds = null;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private DateRangeModel createdDate;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private DateRangeModel startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private DateRangeModel endDate;

  public static final String SERIALIZED_NAME_TAG_NAMES = "tagNames";
  @SerializedName(SERIALIZED_NAME_TAG_NAMES)
  private Set<String> tagNames = null;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Set<String>> attributes = null;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public TestPlanSearchQueryModel() {
  }

  public TestPlanSearchQueryModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TestPlanSearchQueryModel description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TestPlanSearchQueryModel build(String build) {
    
    this.build = build;
    return this;
  }

   /**
   * Get build
   * @return build
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBuild() {
    return build;
  }


  public void setBuild(String build) {
    this.build = build;
  }


  public TestPlanSearchQueryModel productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public TestPlanSearchQueryModel status(Set<TestPlanStatusModel> status) {
    
    this.status = status;
    return this;
  }

  public TestPlanSearchQueryModel addStatusItem(TestPlanStatusModel statusItem) {
    if (this.status == null) {
      this.status = new LinkedHashSet<>();
    }
    this.status.add(statusItem);
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<TestPlanStatusModel> getStatus() {
    return status;
  }


  public void setStatus(Set<TestPlanStatusModel> status) {
    this.status = status;
  }


  public TestPlanSearchQueryModel globalIds(Set<Long> globalIds) {
    
    this.globalIds = globalIds;
    return this;
  }

  public TestPlanSearchQueryModel addGlobalIdsItem(Long globalIdsItem) {
    if (this.globalIds == null) {
      this.globalIds = new LinkedHashSet<>();
    }
    this.globalIds.add(globalIdsItem);
    return this;
  }

   /**
   * Get globalIds
   * @return globalIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<Long> getGlobalIds() {
    return globalIds;
  }


  public void setGlobalIds(Set<Long> globalIds) {
    this.globalIds = globalIds;
  }


  public TestPlanSearchQueryModel isLocked(Boolean isLocked) {
    
    this.isLocked = isLocked;
    return this;
  }

   /**
   * Get isLocked
   * @return isLocked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsLocked() {
    return isLocked;
  }


  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }


  public TestPlanSearchQueryModel lockedDate(DateRangeModel lockedDate) {
    
    this.lockedDate = lockedDate;
    return this;
  }

   /**
   * Get lockedDate
   * @return lockedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DateRangeModel getLockedDate() {
    return lockedDate;
  }


  public void setLockedDate(DateRangeModel lockedDate) {
    this.lockedDate = lockedDate;
  }


  public TestPlanSearchQueryModel automaticDurationTimer(Set<Boolean> automaticDurationTimer) {
    
    this.automaticDurationTimer = automaticDurationTimer;
    return this;
  }

  public TestPlanSearchQueryModel addAutomaticDurationTimerItem(Boolean automaticDurationTimerItem) {
    if (this.automaticDurationTimer == null) {
      this.automaticDurationTimer = new LinkedHashSet<>();
    }
    this.automaticDurationTimer.add(automaticDurationTimerItem);
    return this;
  }

   /**
   * Get automaticDurationTimer
   * @return automaticDurationTimer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<Boolean> getAutomaticDurationTimer() {
    return automaticDurationTimer;
  }


  public void setAutomaticDurationTimer(Set<Boolean> automaticDurationTimer) {
    this.automaticDurationTimer = automaticDurationTimer;
  }


  public TestPlanSearchQueryModel createdByIds(Set<UUID> createdByIds) {
    
    this.createdByIds = createdByIds;
    return this;
  }

  public TestPlanSearchQueryModel addCreatedByIdsItem(UUID createdByIdsItem) {
    if (this.createdByIds == null) {
      this.createdByIds = new LinkedHashSet<>();
    }
    this.createdByIds.add(createdByIdsItem);
    return this;
  }

   /**
   * Get createdByIds
   * @return createdByIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<UUID> getCreatedByIds() {
    return createdByIds;
  }


  public void setCreatedByIds(Set<UUID> createdByIds) {
    this.createdByIds = createdByIds;
  }


  public TestPlanSearchQueryModel createdDate(DateRangeModel createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DateRangeModel getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(DateRangeModel createdDate) {
    this.createdDate = createdDate;
  }


  public TestPlanSearchQueryModel startDate(DateRangeModel startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DateRangeModel getStartDate() {
    return startDate;
  }


  public void setStartDate(DateRangeModel startDate) {
    this.startDate = startDate;
  }


  public TestPlanSearchQueryModel endDate(DateRangeModel endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DateRangeModel getEndDate() {
    return endDate;
  }


  public void setEndDate(DateRangeModel endDate) {
    this.endDate = endDate;
  }


  public TestPlanSearchQueryModel tagNames(Set<String> tagNames) {
    
    this.tagNames = tagNames;
    return this;
  }

  public TestPlanSearchQueryModel addTagNamesItem(String tagNamesItem) {
    if (this.tagNames == null) {
      this.tagNames = new LinkedHashSet<>();
    }
    this.tagNames.add(tagNamesItem);
    return this;
  }

   /**
   * Get tagNames
   * @return tagNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getTagNames() {
    return tagNames;
  }


  public void setTagNames(Set<String> tagNames) {
    this.tagNames = tagNames;
  }


  public TestPlanSearchQueryModel attributes(Map<String, Set<String>> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public TestPlanSearchQueryModel putAttributesItem(String key, Set<String> attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Set<String>> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, Set<String>> attributes) {
    this.attributes = attributes;
  }


  public TestPlanSearchQueryModel isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsDeleted() {
    return isDeleted;
  }


  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestPlanSearchQueryModel testPlanSearchQueryModel = (TestPlanSearchQueryModel) o;
    return Objects.equals(this.name, testPlanSearchQueryModel.name) &&
        Objects.equals(this.description, testPlanSearchQueryModel.description) &&
        Objects.equals(this.build, testPlanSearchQueryModel.build) &&
        Objects.equals(this.productName, testPlanSearchQueryModel.productName) &&
        Objects.equals(this.status, testPlanSearchQueryModel.status) &&
        Objects.equals(this.globalIds, testPlanSearchQueryModel.globalIds) &&
        Objects.equals(this.isLocked, testPlanSearchQueryModel.isLocked) &&
        Objects.equals(this.lockedDate, testPlanSearchQueryModel.lockedDate) &&
        Objects.equals(this.automaticDurationTimer, testPlanSearchQueryModel.automaticDurationTimer) &&
        Objects.equals(this.createdByIds, testPlanSearchQueryModel.createdByIds) &&
        Objects.equals(this.createdDate, testPlanSearchQueryModel.createdDate) &&
        Objects.equals(this.startDate, testPlanSearchQueryModel.startDate) &&
        Objects.equals(this.endDate, testPlanSearchQueryModel.endDate) &&
        Objects.equals(this.tagNames, testPlanSearchQueryModel.tagNames) &&
        Objects.equals(this.attributes, testPlanSearchQueryModel.attributes) &&
        Objects.equals(this.isDeleted, testPlanSearchQueryModel.isDeleted);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, build, productName, status, globalIds, isLocked, lockedDate, automaticDurationTimer, createdByIds, createdDate, startDate, endDate, tagNames, attributes, isDeleted);
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
    sb.append("class TestPlanSearchQueryModel {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    globalIds: ").append(toIndentedString(globalIds)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
    sb.append("    lockedDate: ").append(toIndentedString(lockedDate)).append("\n");
    sb.append("    automaticDurationTimer: ").append(toIndentedString(automaticDurationTimer)).append("\n");
    sb.append("    createdByIds: ").append(toIndentedString(createdByIds)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    tagNames: ").append(toIndentedString(tagNames)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("build");
    openapiFields.add("productName");
    openapiFields.add("status");
    openapiFields.add("globalIds");
    openapiFields.add("isLocked");
    openapiFields.add("lockedDate");
    openapiFields.add("automaticDurationTimer");
    openapiFields.add("createdByIds");
    openapiFields.add("createdDate");
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("tagNames");
    openapiFields.add("attributes");
    openapiFields.add("isDeleted");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TestPlanSearchQueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TestPlanSearchQueryModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestPlanSearchQueryModel is not found in the empty JSON string", TestPlanSearchQueryModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TestPlanSearchQueryModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestPlanSearchQueryModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("build") != null && !jsonObj.get("build").isJsonNull()) && !jsonObj.get("build").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `build` to be a primitive type in the JSON string but got `%s`", jsonObj.get("build").toString()));
      }
      if ((jsonObj.get("productName") != null && !jsonObj.get("productName").isJsonNull()) && !jsonObj.get("productName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be an array in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("globalIds") != null && !jsonObj.get("globalIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `globalIds` to be an array in the JSON string but got `%s`", jsonObj.get("globalIds").toString()));
      }
      // validate the optional field `lockedDate`
      if (jsonObj.get("lockedDate") != null && !jsonObj.get("lockedDate").isJsonNull()) {
        DateRangeModel.validateJsonObject(jsonObj.getAsJsonObject("lockedDate"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("automaticDurationTimer") != null && !jsonObj.get("automaticDurationTimer").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `automaticDurationTimer` to be an array in the JSON string but got `%s`", jsonObj.get("automaticDurationTimer").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("createdByIds") != null && !jsonObj.get("createdByIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdByIds` to be an array in the JSON string but got `%s`", jsonObj.get("createdByIds").toString()));
      }
      // validate the optional field `createdDate`
      if (jsonObj.get("createdDate") != null && !jsonObj.get("createdDate").isJsonNull()) {
        DateRangeModel.validateJsonObject(jsonObj.getAsJsonObject("createdDate"));
      }
      // validate the optional field `startDate`
      if (jsonObj.get("startDate") != null && !jsonObj.get("startDate").isJsonNull()) {
        DateRangeModel.validateJsonObject(jsonObj.getAsJsonObject("startDate"));
      }
      // validate the optional field `endDate`
      if (jsonObj.get("endDate") != null && !jsonObj.get("endDate").isJsonNull()) {
        DateRangeModel.validateJsonObject(jsonObj.getAsJsonObject("endDate"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tagNames") != null && !jsonObj.get("tagNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tagNames` to be an array in the JSON string but got `%s`", jsonObj.get("tagNames").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestPlanSearchQueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestPlanSearchQueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestPlanSearchQueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestPlanSearchQueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestPlanSearchQueryModel>() {
           @Override
           public void write(JsonWriter out, TestPlanSearchQueryModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestPlanSearchQueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestPlanSearchQueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestPlanSearchQueryModel
  * @throws IOException if the JSON string is invalid with respect to TestPlanSearchQueryModel
  */
  public static TestPlanSearchQueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestPlanSearchQueryModel.class);
  }

 /**
  * Convert an instance of TestPlanSearchQueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

