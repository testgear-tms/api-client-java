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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;-gear.client.invoker.JSON;


/**
 * CustomAttributeSearchQueryModel
 */
@JsonPropertyOrder({
  CustomAttributeSearchQueryModel.JSON_PROPERTY_NAME,
  CustomAttributeSearchQueryModel.JSON_PROPERTY_PROJECT_IDS,
  CustomAttributeSearchQueryModel.JSON_PROPERTY_CUSTOM_ATTRIBUTE_IDS,
  CustomAttributeSearchQueryModel.JSON_PROPERTY_CUSTOM_ATTRIBUTE_TYPES,
  CustomAttributeSearchQueryModel.JSON_PROPERTY_IS_GLOBAL,
  CustomAttributeSearchQueryModel.JSON_PROPERTY_IS_DELETED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomAttributeSearchQueryModel {
  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROJECT_IDS = "projectIds";
  private JsonNullable<Set<UUID>> projectIds = JsonNullable.<Set<UUID>>undefined();

  public static final String JSON_PROPERTY_CUSTOM_ATTRIBUTE_IDS = "customAttributeIds";
  private JsonNullable<Set<UUID>> customAttributeIds = JsonNullable.<Set<UUID>>undefined();

  public static final String JSON_PROPERTY_CUSTOM_ATTRIBUTE_TYPES = "customAttributeTypes";
  private JsonNullable<Set<CustomAttributeTypesEnum>> customAttributeTypes = JsonNullable.<Set<CustomAttributeTypesEnum>>undefined();

  public static final String JSON_PROPERTY_IS_GLOBAL = "isGlobal";
  private JsonNullable<Boolean> isGlobal = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_IS_DELETED = "isDeleted";
  private JsonNullable<Boolean> isDeleted = JsonNullable.<Boolean>undefined();

  public CustomAttributeSearchQueryModel() { 
  }

  public CustomAttributeSearchQueryModel name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public CustomAttributeSearchQueryModel projectIds(Set<UUID> projectIds) {
    this.projectIds = JsonNullable.<Set<UUID>>of(projectIds);
    return this;
  }

  public CustomAttributeSearchQueryModel addProjectIdsItem(UUID projectIdsItem) {
    if (this.projectIds == null || !this.projectIds.isPresent()) {
      this.projectIds = JsonNullable.<Set<UUID>>of(new LinkedHashSet<>());
    }
    try {
      this.projectIds.get().add(projectIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get projectIds
   * @return projectIds
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Set<UUID> getProjectIds() {
        return projectIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROJECT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<UUID>> getProjectIds_JsonNullable() {
    return projectIds;
  }
  
  @JsonProperty(JSON_PROPERTY_PROJECT_IDS)
  public void setProjectIds_JsonNullable(JsonNullable<Set<UUID>> projectIds) {
    this.projectIds = projectIds;
  }

  public void setProjectIds(Set<UUID> projectIds) {
    this.projectIds = JsonNullable.<Set<UUID>>of(projectIds);
  }


  public CustomAttributeSearchQueryModel customAttributeIds(Set<UUID> customAttributeIds) {
    this.customAttributeIds = JsonNullable.<Set<UUID>>of(customAttributeIds);
    return this;
  }

  public CustomAttributeSearchQueryModel addCustomAttributeIdsItem(UUID customAttributeIdsItem) {
    if (this.customAttributeIds == null || !this.customAttributeIds.isPresent()) {
      this.customAttributeIds = JsonNullable.<Set<UUID>>of(new LinkedHashSet<>());
    }
    try {
      this.customAttributeIds.get().add(customAttributeIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get customAttributeIds
   * @return customAttributeIds
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Set<UUID> getCustomAttributeIds() {
        return customAttributeIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_ATTRIBUTE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<UUID>> getCustomAttributeIds_JsonNullable() {
    return customAttributeIds;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSTOM_ATTRIBUTE_IDS)
  public void setCustomAttributeIds_JsonNullable(JsonNullable<Set<UUID>> customAttributeIds) {
    this.customAttributeIds = customAttributeIds;
  }

  public void setCustomAttributeIds(Set<UUID> customAttributeIds) {
    this.customAttributeIds = JsonNullable.<Set<UUID>>of(customAttributeIds);
  }


  public CustomAttributeSearchQueryModel customAttributeTypes(Set<CustomAttributeTypesEnum> customAttributeTypes) {
    this.customAttributeTypes = JsonNullable.<Set<CustomAttributeTypesEnum>>of(customAttributeTypes);
    return this;
  }

  public CustomAttributeSearchQueryModel addCustomAttributeTypesItem(CustomAttributeTypesEnum customAttributeTypesItem) {
    if (this.customAttributeTypes == null || !this.customAttributeTypes.isPresent()) {
      this.customAttributeTypes = JsonNullable.<Set<CustomAttributeTypesEnum>>of(new LinkedHashSet<>());
    }
    try {
      this.customAttributeTypes.get().add(customAttributeTypesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get customAttributeTypes
   * @return customAttributeTypes
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Set<CustomAttributeTypesEnum> getCustomAttributeTypes() {
        return customAttributeTypes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_ATTRIBUTE_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<CustomAttributeTypesEnum>> getCustomAttributeTypes_JsonNullable() {
    return customAttributeTypes;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSTOM_ATTRIBUTE_TYPES)
  public void setCustomAttributeTypes_JsonNullable(JsonNullable<Set<CustomAttributeTypesEnum>> customAttributeTypes) {
    this.customAttributeTypes = customAttributeTypes;
  }

  public void setCustomAttributeTypes(Set<CustomAttributeTypesEnum> customAttributeTypes) {
    this.customAttributeTypes = JsonNullable.<Set<CustomAttributeTypesEnum>>of(customAttributeTypes);
  }


  public CustomAttributeSearchQueryModel isGlobal(Boolean isGlobal) {
    this.isGlobal = JsonNullable.<Boolean>of(isGlobal);
    return this;
  }

   /**
   * Get isGlobal
   * @return isGlobal
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Boolean getIsGlobal() {
        return isGlobal.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_GLOBAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getIsGlobal_JsonNullable() {
    return isGlobal;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_GLOBAL)
  public void setIsGlobal_JsonNullable(JsonNullable<Boolean> isGlobal) {
    this.isGlobal = isGlobal;
  }

  public void setIsGlobal(Boolean isGlobal) {
    this.isGlobal = JsonNullable.<Boolean>of(isGlobal);
  }


  public CustomAttributeSearchQueryModel isDeleted(Boolean isDeleted) {
    this.isDeleted = JsonNullable.<Boolean>of(isDeleted);
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Boolean getIsDeleted() {
        return isDeleted.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getIsDeleted_JsonNullable() {
    return isDeleted;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  public void setIsDeleted_JsonNullable(JsonNullable<Boolean> isDeleted) {
    this.isDeleted = isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = JsonNullable.<Boolean>of(isDeleted);
  }


  /**
   * Return true if this CustomAttributeSearchQueryModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomAttributeSearchQueryModel customAttributeSearchQueryModel = (CustomAttributeSearchQueryModel) o;
    return equalsNullable(this.name, customAttributeSearchQueryModel.name) &&
        equalsNullable(this.projectIds, customAttributeSearchQueryModel.projectIds) &&
        equalsNullable(this.customAttributeIds, customAttributeSearchQueryModel.customAttributeIds) &&
        equalsNullable(this.customAttributeTypes, customAttributeSearchQueryModel.customAttributeTypes) &&
        equalsNullable(this.isGlobal, customAttributeSearchQueryModel.isGlobal) &&
        equalsNullable(this.isDeleted, customAttributeSearchQueryModel.isDeleted);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), hashCodeNullable(projectIds), hashCodeNullable(customAttributeIds), hashCodeNullable(customAttributeTypes), hashCodeNullable(isGlobal), hashCodeNullable(isDeleted));
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
    sb.append("class CustomAttributeSearchQueryModel {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
    sb.append("    customAttributeIds: ").append(toIndentedString(customAttributeIds)).append("\n");
    sb.append("    customAttributeTypes: ").append(toIndentedString(customAttributeTypes)).append("\n");
    sb.append("    isGlobal: ").append(toIndentedString(isGlobal)).append("\n");
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

}
