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
import java.time.OffsetDateTime;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;-gear.client.invoker.JSON;


/**
 * SharedStepReferenceModel
 */
@JsonPropertyOrder({
  SharedStepReferenceModel.JSON_PROPERTY_ID,
  SharedStepReferenceModel.JSON_PROPERTY_GLOBAL_ID,
  SharedStepReferenceModel.JSON_PROPERTY_NAME,
  SharedStepReferenceModel.JSON_PROPERTY_ENTITY_TYPE_NAME,
  SharedStepReferenceModel.JSON_PROPERTY_HAS_THIS_SHARED_STEP_AS_STEP,
  SharedStepReferenceModel.JSON_PROPERTY_HAS_THIS_SHARED_STEP_AS_PRECONDITION,
  SharedStepReferenceModel.JSON_PROPERTY_HAS_THIS_SHARED_STEP_AS_POSTCONDITION,
  SharedStepReferenceModel.JSON_PROPERTY_CREATED_BY_ID,
  SharedStepReferenceModel.JSON_PROPERTY_MODIFIED_BY_ID,
  SharedStepReferenceModel.JSON_PROPERTY_CREATED_DATE,
  SharedStepReferenceModel.JSON_PROPERTY_MODIFIED_DATE,
  SharedStepReferenceModel.JSON_PROPERTY_STATE,
  SharedStepReferenceModel.JSON_PROPERTY_PRIORITY,
  SharedStepReferenceModel.JSON_PROPERTY_IS_DELETED,
  SharedStepReferenceModel.JSON_PROPERTY_VERSION_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SharedStepReferenceModel {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_GLOBAL_ID = "globalId";
  private JsonNullable<Long> globalId = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENTITY_TYPE_NAME = "entityTypeName";
  private JsonNullable<String> entityTypeName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HAS_THIS_SHARED_STEP_AS_STEP = "hasThisSharedStepAsStep";
  private Boolean hasThisSharedStepAsStep;

  public static final String JSON_PROPERTY_HAS_THIS_SHARED_STEP_AS_PRECONDITION = "hasThisSharedStepAsPrecondition";
  private Boolean hasThisSharedStepAsPrecondition;

  public static final String JSON_PROPERTY_HAS_THIS_SHARED_STEP_AS_POSTCONDITION = "hasThisSharedStepAsPostcondition";
  private Boolean hasThisSharedStepAsPostcondition;

  public static final String JSON_PROPERTY_CREATED_BY_ID = "createdById";
  private UUID createdById;

  public static final String JSON_PROPERTY_MODIFIED_BY_ID = "modifiedById";
  private JsonNullable<UUID> modifiedById = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private JsonNullable<OffsetDateTime> createdDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_MODIFIED_DATE = "modifiedDate";
  private JsonNullable<OffsetDateTime> modifiedDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_STATE = "state";
  private JsonNullable<String> state = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private WorkItemPriorityModel priority;

  public static final String JSON_PROPERTY_IS_DELETED = "isDeleted";
  private Boolean isDeleted;

  public static final String JSON_PROPERTY_VERSION_ID = "versionId";
  private UUID versionId;

  public SharedStepReferenceModel() { 
  }

  public SharedStepReferenceModel id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public SharedStepReferenceModel globalId(Long globalId) {
    this.globalId = JsonNullable.<Long>of(globalId);
    return this;
  }

   /**
   * Get globalId
   * @return globalId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Long getGlobalId() {
        return globalId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GLOBAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getGlobalId_JsonNullable() {
    return globalId;
  }
  
  @JsonProperty(JSON_PROPERTY_GLOBAL_ID)
  public void setGlobalId_JsonNullable(JsonNullable<Long> globalId) {
    this.globalId = globalId;
  }

  public void setGlobalId(Long globalId) {
    this.globalId = JsonNullable.<Long>of(globalId);
  }


  public SharedStepReferenceModel name(String name) {
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


  public SharedStepReferenceModel entityTypeName(String entityTypeName) {
    this.entityTypeName = JsonNullable.<String>of(entityTypeName);
    return this;
  }

   /**
   * Get entityTypeName
   * @return entityTypeName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getEntityTypeName() {
        return entityTypeName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEntityTypeName_JsonNullable() {
    return entityTypeName;
  }
  
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE_NAME)
  public void setEntityTypeName_JsonNullable(JsonNullable<String> entityTypeName) {
    this.entityTypeName = entityTypeName;
  }

  public void setEntityTypeName(String entityTypeName) {
    this.entityTypeName = JsonNullable.<String>of(entityTypeName);
  }


  public SharedStepReferenceModel hasThisSharedStepAsStep(Boolean hasThisSharedStepAsStep) {
    this.hasThisSharedStepAsStep = hasThisSharedStepAsStep;
    return this;
  }

   /**
   * Get hasThisSharedStepAsStep
   * @return hasThisSharedStepAsStep
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HAS_THIS_SHARED_STEP_AS_STEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasThisSharedStepAsStep() {
    return hasThisSharedStepAsStep;
  }


  @JsonProperty(JSON_PROPERTY_HAS_THIS_SHARED_STEP_AS_STEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasThisSharedStepAsStep(Boolean hasThisSharedStepAsStep) {
    this.hasThisSharedStepAsStep = hasThisSharedStepAsStep;
  }


  public SharedStepReferenceModel hasThisSharedStepAsPrecondition(Boolean hasThisSharedStepAsPrecondition) {
    this.hasThisSharedStepAsPrecondition = hasThisSharedStepAsPrecondition;
    return this;
  }

   /**
   * Get hasThisSharedStepAsPrecondition
   * @return hasThisSharedStepAsPrecondition
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HAS_THIS_SHARED_STEP_AS_PRECONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasThisSharedStepAsPrecondition() {
    return hasThisSharedStepAsPrecondition;
  }


  @JsonProperty(JSON_PROPERTY_HAS_THIS_SHARED_STEP_AS_PRECONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasThisSharedStepAsPrecondition(Boolean hasThisSharedStepAsPrecondition) {
    this.hasThisSharedStepAsPrecondition = hasThisSharedStepAsPrecondition;
  }


  public SharedStepReferenceModel hasThisSharedStepAsPostcondition(Boolean hasThisSharedStepAsPostcondition) {
    this.hasThisSharedStepAsPostcondition = hasThisSharedStepAsPostcondition;
    return this;
  }

   /**
   * Get hasThisSharedStepAsPostcondition
   * @return hasThisSharedStepAsPostcondition
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HAS_THIS_SHARED_STEP_AS_POSTCONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasThisSharedStepAsPostcondition() {
    return hasThisSharedStepAsPostcondition;
  }


  @JsonProperty(JSON_PROPERTY_HAS_THIS_SHARED_STEP_AS_POSTCONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasThisSharedStepAsPostcondition(Boolean hasThisSharedStepAsPostcondition) {
    this.hasThisSharedStepAsPostcondition = hasThisSharedStepAsPostcondition;
  }


  public SharedStepReferenceModel createdById(UUID createdById) {
    this.createdById = createdById;
    return this;
  }

   /**
   * Get createdById
   * @return createdById
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_BY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getCreatedById() {
    return createdById;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_BY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedById(UUID createdById) {
    this.createdById = createdById;
  }


  public SharedStepReferenceModel modifiedById(UUID modifiedById) {
    this.modifiedById = JsonNullable.<UUID>of(modifiedById);
    return this;
  }

   /**
   * Get modifiedById
   * @return modifiedById
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public UUID getModifiedById() {
        return modifiedById.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODIFIED_BY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getModifiedById_JsonNullable() {
    return modifiedById;
  }
  
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY_ID)
  public void setModifiedById_JsonNullable(JsonNullable<UUID> modifiedById) {
    this.modifiedById = modifiedById;
  }

  public void setModifiedById(UUID modifiedById) {
    this.modifiedById = JsonNullable.<UUID>of(modifiedById);
  }


  public SharedStepReferenceModel createdDate(OffsetDateTime createdDate) {
    this.createdDate = JsonNullable.<OffsetDateTime>of(createdDate);
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public OffsetDateTime getCreatedDate() {
        return createdDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getCreatedDate_JsonNullable() {
    return createdDate;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  public void setCreatedDate_JsonNullable(JsonNullable<OffsetDateTime> createdDate) {
    this.createdDate = createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = JsonNullable.<OffsetDateTime>of(createdDate);
  }


  public SharedStepReferenceModel modifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = JsonNullable.<OffsetDateTime>of(modifiedDate);
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public OffsetDateTime getModifiedDate() {
        return modifiedDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getModifiedDate_JsonNullable() {
    return modifiedDate;
  }
  
  @JsonProperty(JSON_PROPERTY_MODIFIED_DATE)
  public void setModifiedDate_JsonNullable(JsonNullable<OffsetDateTime> modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = JsonNullable.<OffsetDateTime>of(modifiedDate);
  }


  public SharedStepReferenceModel state(String state) {
    this.state = JsonNullable.<String>of(state);
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getState() {
        return state.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getState_JsonNullable() {
    return state;
  }
  
  @JsonProperty(JSON_PROPERTY_STATE)
  public void setState_JsonNullable(JsonNullable<String> state) {
    this.state = state;
  }

  public void setState(String state) {
    this.state = JsonNullable.<String>of(state);
  }


  public SharedStepReferenceModel priority(WorkItemPriorityModel priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WorkItemPriorityModel getPriority() {
    return priority;
  }


  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriority(WorkItemPriorityModel priority) {
    this.priority = priority;
  }


  public SharedStepReferenceModel isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDeleted() {
    return isDeleted;
  }


  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public SharedStepReferenceModel versionId(UUID versionId) {
    this.versionId = versionId;
    return this;
  }

   /**
   * Get versionId
   * @return versionId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getVersionId() {
    return versionId;
  }


  @JsonProperty(JSON_PROPERTY_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersionId(UUID versionId) {
    this.versionId = versionId;
  }


  /**
   * Return true if this SharedStepReferenceModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedStepReferenceModel sharedStepReferenceModel = (SharedStepReferenceModel) o;
    return Objects.equals(this.id, sharedStepReferenceModel.id) &&
        equalsNullable(this.globalId, sharedStepReferenceModel.globalId) &&
        equalsNullable(this.name, sharedStepReferenceModel.name) &&
        equalsNullable(this.entityTypeName, sharedStepReferenceModel.entityTypeName) &&
        Objects.equals(this.hasThisSharedStepAsStep, sharedStepReferenceModel.hasThisSharedStepAsStep) &&
        Objects.equals(this.hasThisSharedStepAsPrecondition, sharedStepReferenceModel.hasThisSharedStepAsPrecondition) &&
        Objects.equals(this.hasThisSharedStepAsPostcondition, sharedStepReferenceModel.hasThisSharedStepAsPostcondition) &&
        Objects.equals(this.createdById, sharedStepReferenceModel.createdById) &&
        equalsNullable(this.modifiedById, sharedStepReferenceModel.modifiedById) &&
        equalsNullable(this.createdDate, sharedStepReferenceModel.createdDate) &&
        equalsNullable(this.modifiedDate, sharedStepReferenceModel.modifiedDate) &&
        equalsNullable(this.state, sharedStepReferenceModel.state) &&
        Objects.equals(this.priority, sharedStepReferenceModel.priority) &&
        Objects.equals(this.isDeleted, sharedStepReferenceModel.isDeleted) &&
        Objects.equals(this.versionId, sharedStepReferenceModel.versionId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(globalId), hashCodeNullable(name), hashCodeNullable(entityTypeName), hasThisSharedStepAsStep, hasThisSharedStepAsPrecondition, hasThisSharedStepAsPostcondition, createdById, hashCodeNullable(modifiedById), hashCodeNullable(createdDate), hashCodeNullable(modifiedDate), hashCodeNullable(state), priority, isDeleted, versionId);
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
    sb.append("class SharedStepReferenceModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    entityTypeName: ").append(toIndentedString(entityTypeName)).append("\n");
    sb.append("    hasThisSharedStepAsStep: ").append(toIndentedString(hasThisSharedStepAsStep)).append("\n");
    sb.append("    hasThisSharedStepAsPrecondition: ").append(toIndentedString(hasThisSharedStepAsPrecondition)).append("\n");
    sb.append("    hasThisSharedStepAsPostcondition: ").append(toIndentedString(hasThisSharedStepAsPostcondition)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    modifiedById: ").append(toIndentedString(modifiedById)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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
