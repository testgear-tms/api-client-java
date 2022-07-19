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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;-gear.client.invoker.JSON;


/**
 * WorkItemStepChangeViewModelArrayWorkItemChangedFieldViewModel
 */
@JsonPropertyOrder({
  WorkItemStepChangeViewModelArrayWorkItemChangedFieldViewModel.JSON_PROPERTY_OLD_VALUE,
  WorkItemStepChangeViewModelArrayWorkItemChangedFieldViewModel.JSON_PROPERTY_NEW_VALUE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WorkItemStepChangeViewModelArrayWorkItemChangedFieldViewModel {
  public static final String JSON_PROPERTY_OLD_VALUE = "oldValue";
  private JsonNullable<List<WorkItemStepChangeViewModel>> oldValue = JsonNullable.<List<WorkItemStepChangeViewModel>>undefined();

  public static final String JSON_PROPERTY_NEW_VALUE = "newValue";
  private JsonNullable<List<WorkItemStepChangeViewModel>> newValue = JsonNullable.<List<WorkItemStepChangeViewModel>>undefined();

  public WorkItemStepChangeViewModelArrayWorkItemChangedFieldViewModel() { 
  }

  public WorkItemStepChangeViewModelArrayWorkItemChangedFieldViewModel oldValue(List<WorkItemStepChangeViewModel> oldValue) {
    this.oldValue = JsonNullable.<List<WorkItemStepChangeViewModel>>of(oldValue);
    return this;
  }

  public WorkItemStepChangeViewModelArrayWorkItemChangedFieldViewModel addOldValueItem(WorkItemStepChangeViewModel oldValueItem) {
    if (this.oldValue == null || !this.oldValue.isPresent()) {
      this.oldValue = JsonNullable.<List<WorkItemStepChangeViewModel>>of(new ArrayList<>());
    }
    try {
      this.oldValue.get().add(oldValueItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get oldValue
   * @return oldValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<WorkItemStepChangeViewModel> getOldValue() {
        return oldValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OLD_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<WorkItemStepChangeViewModel>> getOldValue_JsonNullable() {
    return oldValue;
  }
  
  @JsonProperty(JSON_PROPERTY_OLD_VALUE)
  public void setOldValue_JsonNullable(JsonNullable<List<WorkItemStepChangeViewModel>> oldValue) {
    this.oldValue = oldValue;
  }

  public void setOldValue(List<WorkItemStepChangeViewModel> oldValue) {
    this.oldValue = JsonNullable.<List<WorkItemStepChangeViewModel>>of(oldValue);
  }


  public WorkItemStepChangeViewModelArrayWorkItemChangedFieldViewModel newValue(List<WorkItemStepChangeViewModel> newValue) {
    this.newValue = JsonNullable.<List<WorkItemStepChangeViewModel>>of(newValue);
    return this;
  }

  public WorkItemStepChangeViewModelArrayWorkItemChangedFieldViewModel addNewValueItem(WorkItemStepChangeViewModel newValueItem) {
    if (this.newValue == null || !this.newValue.isPresent()) {
      this.newValue = JsonNullable.<List<WorkItemStepChangeViewModel>>of(new ArrayList<>());
    }
    try {
      this.newValue.get().add(newValueItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get newValue
   * @return newValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<WorkItemStepChangeViewModel> getNewValue() {
        return newValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEW_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<WorkItemStepChangeViewModel>> getNewValue_JsonNullable() {
    return newValue;
  }
  
  @JsonProperty(JSON_PROPERTY_NEW_VALUE)
  public void setNewValue_JsonNullable(JsonNullable<List<WorkItemStepChangeViewModel>> newValue) {
    this.newValue = newValue;
  }

  public void setNewValue(List<WorkItemStepChangeViewModel> newValue) {
    this.newValue = JsonNullable.<List<WorkItemStepChangeViewModel>>of(newValue);
  }


  /**
   * Return true if this WorkItemStepChangeViewModelArrayWorkItemChangedFieldViewModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemStepChangeViewModelArrayWorkItemChangedFieldViewModel workItemStepChangeViewModelArrayWorkItemChangedFieldViewModel = (WorkItemStepChangeViewModelArrayWorkItemChangedFieldViewModel) o;
    return equalsNullable(this.oldValue, workItemStepChangeViewModelArrayWorkItemChangedFieldViewModel.oldValue) &&
        equalsNullable(this.newValue, workItemStepChangeViewModelArrayWorkItemChangedFieldViewModel.newValue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(oldValue), hashCodeNullable(newValue));
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
    sb.append("class WorkItemStepChangeViewModelArrayWorkItemChangedFieldViewModel {\n");
    sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
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
