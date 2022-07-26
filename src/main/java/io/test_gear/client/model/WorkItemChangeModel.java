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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * WorkItemChangeModel
 */
@JsonPropertyOrder({
  WorkItemChangeModel.JSON_PROPERTY_ID,
  WorkItemChangeModel.JSON_PROPERTY_WORK_ITEM_ID,
  WorkItemChangeModel.JSON_PROPERTY_OLD_VERSION_ID,
  WorkItemChangeModel.JSON_PROPERTY_NEW_VERSION_ID,
  WorkItemChangeModel.JSON_PROPERTY_WORK_ITEM_CHANGED_FIELDS,
  WorkItemChangeModel.JSON_PROPERTY_CREATED_BY_ID,
  WorkItemChangeModel.JSON_PROPERTY_CREATED_DATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WorkItemChangeModel {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_WORK_ITEM_ID = "workItemId";
  private UUID workItemId;

  public static final String JSON_PROPERTY_OLD_VERSION_ID = "oldVersionId";
  private UUID oldVersionId;

  public static final String JSON_PROPERTY_NEW_VERSION_ID = "newVersionId";
  private UUID newVersionId;

  public static final String JSON_PROPERTY_WORK_ITEM_CHANGED_FIELDS = "workItemChangedFields";
  private WorkItemChangedFieldsViewModel workItemChangedFields;

  public static final String JSON_PROPERTY_CREATED_BY_ID = "createdById";
  private UUID createdById;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private JsonNullable<OffsetDateTime> createdDate = JsonNullable.<OffsetDateTime>undefined();

  public WorkItemChangeModel() { 
  }

  public WorkItemChangeModel id(UUID id) {
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


  public WorkItemChangeModel workItemId(UUID workItemId) {
    this.workItemId = workItemId;
    return this;
  }

   /**
   * Get workItemId
   * @return workItemId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WORK_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getWorkItemId() {
    return workItemId;
  }


  @JsonProperty(JSON_PROPERTY_WORK_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorkItemId(UUID workItemId) {
    this.workItemId = workItemId;
  }


  public WorkItemChangeModel oldVersionId(UUID oldVersionId) {
    this.oldVersionId = oldVersionId;
    return this;
  }

   /**
   * Get oldVersionId
   * @return oldVersionId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OLD_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getOldVersionId() {
    return oldVersionId;
  }


  @JsonProperty(JSON_PROPERTY_OLD_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOldVersionId(UUID oldVersionId) {
    this.oldVersionId = oldVersionId;
  }


  public WorkItemChangeModel newVersionId(UUID newVersionId) {
    this.newVersionId = newVersionId;
    return this;
  }

   /**
   * Get newVersionId
   * @return newVersionId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEW_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getNewVersionId() {
    return newVersionId;
  }


  @JsonProperty(JSON_PROPERTY_NEW_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNewVersionId(UUID newVersionId) {
    this.newVersionId = newVersionId;
  }


  public WorkItemChangeModel workItemChangedFields(WorkItemChangedFieldsViewModel workItemChangedFields) {
    this.workItemChangedFields = workItemChangedFields;
    return this;
  }

   /**
   * Get workItemChangedFields
   * @return workItemChangedFields
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WORK_ITEM_CHANGED_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WorkItemChangedFieldsViewModel getWorkItemChangedFields() {
    return workItemChangedFields;
  }


  @JsonProperty(JSON_PROPERTY_WORK_ITEM_CHANGED_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorkItemChangedFields(WorkItemChangedFieldsViewModel workItemChangedFields) {
    this.workItemChangedFields = workItemChangedFields;
  }


  public WorkItemChangeModel createdById(UUID createdById) {
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


  public WorkItemChangeModel createdDate(OffsetDateTime createdDate) {
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


  /**
   * Return true if this WorkItemChangeModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemChangeModel workItemChangeModel = (WorkItemChangeModel) o;
    return Objects.equals(this.id, workItemChangeModel.id) &&
        Objects.equals(this.workItemId, workItemChangeModel.workItemId) &&
        Objects.equals(this.oldVersionId, workItemChangeModel.oldVersionId) &&
        Objects.equals(this.newVersionId, workItemChangeModel.newVersionId) &&
        Objects.equals(this.workItemChangedFields, workItemChangeModel.workItemChangedFields) &&
        Objects.equals(this.createdById, workItemChangeModel.createdById) &&
        equalsNullable(this.createdDate, workItemChangeModel.createdDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, workItemId, oldVersionId, newVersionId, workItemChangedFields, createdById, hashCodeNullable(createdDate));
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
    sb.append("class WorkItemChangeModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    workItemId: ").append(toIndentedString(workItemId)).append("\n");
    sb.append("    oldVersionId: ").append(toIndentedString(oldVersionId)).append("\n");
    sb.append("    newVersionId: ").append(toIndentedString(newVersionId)).append("\n");
    sb.append("    workItemChangedFields: ").append(toIndentedString(workItemChangedFields)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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

