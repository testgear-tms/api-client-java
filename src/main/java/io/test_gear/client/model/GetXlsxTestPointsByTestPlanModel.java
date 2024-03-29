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
 * GetXlsxTestPointsByTestPlanModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetXlsxTestPointsByTestPlanModel {
  public static final String SERIALIZED_NAME_INCLUDE_NAME = "includeName";
  @SerializedName(SERIALIZED_NAME_INCLUDE_NAME)
  private Boolean includeName;

  public static final String SERIALIZED_NAME_INCLUDE_SECTION = "includeSection";
  @SerializedName(SERIALIZED_NAME_INCLUDE_SECTION)
  private Boolean includeSection;

  public static final String SERIALIZED_NAME_INCLUDE_PRIORITY = "includePriority";
  @SerializedName(SERIALIZED_NAME_INCLUDE_PRIORITY)
  private Boolean includePriority;

  public static final String SERIALIZED_NAME_INCLUDE_AUTOMATED = "includeAutomated";
  @SerializedName(SERIALIZED_NAME_INCLUDE_AUTOMATED)
  private Boolean includeAutomated;

  public static final String SERIALIZED_NAME_INCLUDE_STATUS = "includeStatus";
  @SerializedName(SERIALIZED_NAME_INCLUDE_STATUS)
  private Boolean includeStatus;

  public static final String SERIALIZED_NAME_INCLUDE_DURATION = "includeDuration";
  @SerializedName(SERIALIZED_NAME_INCLUDE_DURATION)
  private Boolean includeDuration;

  public static final String SERIALIZED_NAME_INCLUDE_CREATION_DATE = "includeCreationDate";
  @SerializedName(SERIALIZED_NAME_INCLUDE_CREATION_DATE)
  private Boolean includeCreationDate;

  public static final String SERIALIZED_NAME_INCLUDE_AUTHOR = "includeAuthor";
  @SerializedName(SERIALIZED_NAME_INCLUDE_AUTHOR)
  private Boolean includeAuthor;

  public static final String SERIALIZED_NAME_INCLUDE_MODIFICATION_DATE = "includeModificationDate";
  @SerializedName(SERIALIZED_NAME_INCLUDE_MODIFICATION_DATE)
  private Boolean includeModificationDate;

  public static final String SERIALIZED_NAME_INCLUDE_MODIFIED_BY = "includeModifiedBy";
  @SerializedName(SERIALIZED_NAME_INCLUDE_MODIFIED_BY)
  private Boolean includeModifiedBy;

  public static final String SERIALIZED_NAME_INCLUDE_TAGS = "includeTags";
  @SerializedName(SERIALIZED_NAME_INCLUDE_TAGS)
  private Boolean includeTags;

  public static final String SERIALIZED_NAME_INCLUDE_ITERATIONS = "includeIterations";
  @SerializedName(SERIALIZED_NAME_INCLUDE_ITERATIONS)
  private Boolean includeIterations;

  public static final String SERIALIZED_NAME_CUSTOM_ATTRIBUTES_IDS = "customAttributesIds";
  @SerializedName(SERIALIZED_NAME_CUSTOM_ATTRIBUTES_IDS)
  private List<UUID> customAttributesIds;

  public static final String SERIALIZED_NAME_CONFIGURATION_IDS = "configurationIds";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_IDS)
  private List<UUID> configurationIds;

  public GetXlsxTestPointsByTestPlanModel() {
  }

  public GetXlsxTestPointsByTestPlanModel includeName(Boolean includeName) {
    
    this.includeName = includeName;
    return this;
  }

   /**
   * Get includeName
   * @return includeName
  **/
  @javax.annotation.Nullable

  public Boolean getIncludeName() {
    return includeName;
  }


  public void setIncludeName(Boolean includeName) {
    this.includeName = includeName;
  }


  public GetXlsxTestPointsByTestPlanModel includeSection(Boolean includeSection) {
    
    this.includeSection = includeSection;
    return this;
  }

   /**
   * Get includeSection
   * @return includeSection
  **/
  @javax.annotation.Nullable

  public Boolean getIncludeSection() {
    return includeSection;
  }


  public void setIncludeSection(Boolean includeSection) {
    this.includeSection = includeSection;
  }


  public GetXlsxTestPointsByTestPlanModel includePriority(Boolean includePriority) {
    
    this.includePriority = includePriority;
    return this;
  }

   /**
   * Get includePriority
   * @return includePriority
  **/
  @javax.annotation.Nullable

  public Boolean getIncludePriority() {
    return includePriority;
  }


  public void setIncludePriority(Boolean includePriority) {
    this.includePriority = includePriority;
  }


  public GetXlsxTestPointsByTestPlanModel includeAutomated(Boolean includeAutomated) {
    
    this.includeAutomated = includeAutomated;
    return this;
  }

   /**
   * Get includeAutomated
   * @return includeAutomated
  **/
  @javax.annotation.Nullable

  public Boolean getIncludeAutomated() {
    return includeAutomated;
  }


  public void setIncludeAutomated(Boolean includeAutomated) {
    this.includeAutomated = includeAutomated;
  }


  public GetXlsxTestPointsByTestPlanModel includeStatus(Boolean includeStatus) {
    
    this.includeStatus = includeStatus;
    return this;
  }

   /**
   * Get includeStatus
   * @return includeStatus
  **/
  @javax.annotation.Nullable

  public Boolean getIncludeStatus() {
    return includeStatus;
  }


  public void setIncludeStatus(Boolean includeStatus) {
    this.includeStatus = includeStatus;
  }


  public GetXlsxTestPointsByTestPlanModel includeDuration(Boolean includeDuration) {
    
    this.includeDuration = includeDuration;
    return this;
  }

   /**
   * Get includeDuration
   * @return includeDuration
  **/
  @javax.annotation.Nullable

  public Boolean getIncludeDuration() {
    return includeDuration;
  }


  public void setIncludeDuration(Boolean includeDuration) {
    this.includeDuration = includeDuration;
  }


  public GetXlsxTestPointsByTestPlanModel includeCreationDate(Boolean includeCreationDate) {
    
    this.includeCreationDate = includeCreationDate;
    return this;
  }

   /**
   * Get includeCreationDate
   * @return includeCreationDate
  **/
  @javax.annotation.Nullable

  public Boolean getIncludeCreationDate() {
    return includeCreationDate;
  }


  public void setIncludeCreationDate(Boolean includeCreationDate) {
    this.includeCreationDate = includeCreationDate;
  }


  public GetXlsxTestPointsByTestPlanModel includeAuthor(Boolean includeAuthor) {
    
    this.includeAuthor = includeAuthor;
    return this;
  }

   /**
   * Get includeAuthor
   * @return includeAuthor
  **/
  @javax.annotation.Nullable

  public Boolean getIncludeAuthor() {
    return includeAuthor;
  }


  public void setIncludeAuthor(Boolean includeAuthor) {
    this.includeAuthor = includeAuthor;
  }


  public GetXlsxTestPointsByTestPlanModel includeModificationDate(Boolean includeModificationDate) {
    
    this.includeModificationDate = includeModificationDate;
    return this;
  }

   /**
   * Get includeModificationDate
   * @return includeModificationDate
  **/
  @javax.annotation.Nullable

  public Boolean getIncludeModificationDate() {
    return includeModificationDate;
  }


  public void setIncludeModificationDate(Boolean includeModificationDate) {
    this.includeModificationDate = includeModificationDate;
  }


  public GetXlsxTestPointsByTestPlanModel includeModifiedBy(Boolean includeModifiedBy) {
    
    this.includeModifiedBy = includeModifiedBy;
    return this;
  }

   /**
   * Get includeModifiedBy
   * @return includeModifiedBy
  **/
  @javax.annotation.Nullable

  public Boolean getIncludeModifiedBy() {
    return includeModifiedBy;
  }


  public void setIncludeModifiedBy(Boolean includeModifiedBy) {
    this.includeModifiedBy = includeModifiedBy;
  }


  public GetXlsxTestPointsByTestPlanModel includeTags(Boolean includeTags) {
    
    this.includeTags = includeTags;
    return this;
  }

   /**
   * Get includeTags
   * @return includeTags
  **/
  @javax.annotation.Nullable

  public Boolean getIncludeTags() {
    return includeTags;
  }


  public void setIncludeTags(Boolean includeTags) {
    this.includeTags = includeTags;
  }


  public GetXlsxTestPointsByTestPlanModel includeIterations(Boolean includeIterations) {
    
    this.includeIterations = includeIterations;
    return this;
  }

   /**
   * Get includeIterations
   * @return includeIterations
  **/
  @javax.annotation.Nullable

  public Boolean getIncludeIterations() {
    return includeIterations;
  }


  public void setIncludeIterations(Boolean includeIterations) {
    this.includeIterations = includeIterations;
  }


  public GetXlsxTestPointsByTestPlanModel customAttributesIds(List<UUID> customAttributesIds) {
    
    this.customAttributesIds = customAttributesIds;
    return this;
  }

  public GetXlsxTestPointsByTestPlanModel addCustomAttributesIdsItem(UUID customAttributesIdsItem) {
    this.customAttributesIds.add(customAttributesIdsItem);
    return this;
  }

   /**
   * Get customAttributesIds
   * @return customAttributesIds
  **/
  @javax.annotation.Nullable

  public List<UUID> getCustomAttributesIds() {
    return customAttributesIds;
  }


  public void setCustomAttributesIds(List<UUID> customAttributesIds) {
    this.customAttributesIds = customAttributesIds;
  }


  public GetXlsxTestPointsByTestPlanModel configurationIds(List<UUID> configurationIds) {
    
    this.configurationIds = configurationIds;
    return this;
  }

  public GetXlsxTestPointsByTestPlanModel addConfigurationIdsItem(UUID configurationIdsItem) {
    this.configurationIds.add(configurationIdsItem);
    return this;
  }

   /**
   * Get configurationIds
   * @return configurationIds
  **/
  @javax.annotation.Nullable

  public List<UUID> getConfigurationIds() {
    return configurationIds;
  }


  public void setConfigurationIds(List<UUID> configurationIds) {
    this.configurationIds = configurationIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetXlsxTestPointsByTestPlanModel getXlsxTestPointsByTestPlanModel = (GetXlsxTestPointsByTestPlanModel) o;
    return Objects.equals(this.includeName, getXlsxTestPointsByTestPlanModel.includeName) &&
        Objects.equals(this.includeSection, getXlsxTestPointsByTestPlanModel.includeSection) &&
        Objects.equals(this.includePriority, getXlsxTestPointsByTestPlanModel.includePriority) &&
        Objects.equals(this.includeAutomated, getXlsxTestPointsByTestPlanModel.includeAutomated) &&
        Objects.equals(this.includeStatus, getXlsxTestPointsByTestPlanModel.includeStatus) &&
        Objects.equals(this.includeDuration, getXlsxTestPointsByTestPlanModel.includeDuration) &&
        Objects.equals(this.includeCreationDate, getXlsxTestPointsByTestPlanModel.includeCreationDate) &&
        Objects.equals(this.includeAuthor, getXlsxTestPointsByTestPlanModel.includeAuthor) &&
        Objects.equals(this.includeModificationDate, getXlsxTestPointsByTestPlanModel.includeModificationDate) &&
        Objects.equals(this.includeModifiedBy, getXlsxTestPointsByTestPlanModel.includeModifiedBy) &&
        Objects.equals(this.includeTags, getXlsxTestPointsByTestPlanModel.includeTags) &&
        Objects.equals(this.includeIterations, getXlsxTestPointsByTestPlanModel.includeIterations) &&
        Objects.equals(this.customAttributesIds, getXlsxTestPointsByTestPlanModel.customAttributesIds) &&
        Objects.equals(this.configurationIds, getXlsxTestPointsByTestPlanModel.configurationIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeName, includeSection, includePriority, includeAutomated, includeStatus, includeDuration, includeCreationDate, includeAuthor, includeModificationDate, includeModifiedBy, includeTags, includeIterations, customAttributesIds, configurationIds);
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
    sb.append("class GetXlsxTestPointsByTestPlanModel {\n");
    sb.append("    includeName: ").append(toIndentedString(includeName)).append("\n");
    sb.append("    includeSection: ").append(toIndentedString(includeSection)).append("\n");
    sb.append("    includePriority: ").append(toIndentedString(includePriority)).append("\n");
    sb.append("    includeAutomated: ").append(toIndentedString(includeAutomated)).append("\n");
    sb.append("    includeStatus: ").append(toIndentedString(includeStatus)).append("\n");
    sb.append("    includeDuration: ").append(toIndentedString(includeDuration)).append("\n");
    sb.append("    includeCreationDate: ").append(toIndentedString(includeCreationDate)).append("\n");
    sb.append("    includeAuthor: ").append(toIndentedString(includeAuthor)).append("\n");
    sb.append("    includeModificationDate: ").append(toIndentedString(includeModificationDate)).append("\n");
    sb.append("    includeModifiedBy: ").append(toIndentedString(includeModifiedBy)).append("\n");
    sb.append("    includeTags: ").append(toIndentedString(includeTags)).append("\n");
    sb.append("    includeIterations: ").append(toIndentedString(includeIterations)).append("\n");
    sb.append("    customAttributesIds: ").append(toIndentedString(customAttributesIds)).append("\n");
    sb.append("    configurationIds: ").append(toIndentedString(configurationIds)).append("\n");
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
    openapiFields.add("includeName");
    openapiFields.add("includeSection");
    openapiFields.add("includePriority");
    openapiFields.add("includeAutomated");
    openapiFields.add("includeStatus");
    openapiFields.add("includeDuration");
    openapiFields.add("includeCreationDate");
    openapiFields.add("includeAuthor");
    openapiFields.add("includeModificationDate");
    openapiFields.add("includeModifiedBy");
    openapiFields.add("includeTags");
    openapiFields.add("includeIterations");
    openapiFields.add("customAttributesIds");
    openapiFields.add("configurationIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetXlsxTestPointsByTestPlanModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetXlsxTestPointsByTestPlanModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetXlsxTestPointsByTestPlanModel is not found in the empty JSON string", GetXlsxTestPointsByTestPlanModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetXlsxTestPointsByTestPlanModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetXlsxTestPointsByTestPlanModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("customAttributesIds") != null && !jsonObj.get("customAttributesIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `customAttributesIds` to be an array in the JSON string but got `%s`", jsonObj.get("customAttributesIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("configurationIds") != null && !jsonObj.get("configurationIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `configurationIds` to be an array in the JSON string but got `%s`", jsonObj.get("configurationIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetXlsxTestPointsByTestPlanModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetXlsxTestPointsByTestPlanModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetXlsxTestPointsByTestPlanModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetXlsxTestPointsByTestPlanModel.class));

       return (TypeAdapter<T>) new TypeAdapter<GetXlsxTestPointsByTestPlanModel>() {
           @Override
           public void write(JsonWriter out, GetXlsxTestPointsByTestPlanModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetXlsxTestPointsByTestPlanModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetXlsxTestPointsByTestPlanModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetXlsxTestPointsByTestPlanModel
  * @throws IOException if the JSON string is invalid with respect to GetXlsxTestPointsByTestPlanModel
  */
  public static GetXlsxTestPointsByTestPlanModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetXlsxTestPointsByTestPlanModel.class);
  }

 /**
  * Convert an instance of GetXlsxTestPointsByTestPlanModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

