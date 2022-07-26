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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel
 */
@JsonPropertyOrder({
  AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel.JSON_PROPERTY_OLD_VALUE,
  AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel.JSON_PROPERTY_NEW_VALUE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel {
  public static final String JSON_PROPERTY_OLD_VALUE = "oldValue";
  private JsonNullable<List<AutoTestChangeViewModel>> oldValue = JsonNullable.<List<AutoTestChangeViewModel>>undefined();

  public static final String JSON_PROPERTY_NEW_VALUE = "newValue";
  private JsonNullable<List<AutoTestChangeViewModel>> newValue = JsonNullable.<List<AutoTestChangeViewModel>>undefined();

  public AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel() { 
  }

  public AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel oldValue(List<AutoTestChangeViewModel> oldValue) {
    this.oldValue = JsonNullable.<List<AutoTestChangeViewModel>>of(oldValue);
    return this;
  }

  public AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel addOldValueItem(AutoTestChangeViewModel oldValueItem) {
    if (this.oldValue == null || !this.oldValue.isPresent()) {
      this.oldValue = JsonNullable.<List<AutoTestChangeViewModel>>of(new ArrayList<>());
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

  public List<AutoTestChangeViewModel> getOldValue() {
        return oldValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OLD_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<AutoTestChangeViewModel>> getOldValue_JsonNullable() {
    return oldValue;
  }
  
  @JsonProperty(JSON_PROPERTY_OLD_VALUE)
  public void setOldValue_JsonNullable(JsonNullable<List<AutoTestChangeViewModel>> oldValue) {
    this.oldValue = oldValue;
  }

  public void setOldValue(List<AutoTestChangeViewModel> oldValue) {
    this.oldValue = JsonNullable.<List<AutoTestChangeViewModel>>of(oldValue);
  }


  public AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel newValue(List<AutoTestChangeViewModel> newValue) {
    this.newValue = JsonNullable.<List<AutoTestChangeViewModel>>of(newValue);
    return this;
  }

  public AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel addNewValueItem(AutoTestChangeViewModel newValueItem) {
    if (this.newValue == null || !this.newValue.isPresent()) {
      this.newValue = JsonNullable.<List<AutoTestChangeViewModel>>of(new ArrayList<>());
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

  public List<AutoTestChangeViewModel> getNewValue() {
        return newValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEW_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<AutoTestChangeViewModel>> getNewValue_JsonNullable() {
    return newValue;
  }
  
  @JsonProperty(JSON_PROPERTY_NEW_VALUE)
  public void setNewValue_JsonNullable(JsonNullable<List<AutoTestChangeViewModel>> newValue) {
    this.newValue = newValue;
  }

  public void setNewValue(List<AutoTestChangeViewModel> newValue) {
    this.newValue = JsonNullable.<List<AutoTestChangeViewModel>>of(newValue);
  }


  /**
   * Return true if this AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel autoTestChangeViewModelArrayWorkItemChangedFieldViewModel = (AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel) o;
    return equalsNullable(this.oldValue, autoTestChangeViewModelArrayWorkItemChangedFieldViewModel.oldValue) &&
        equalsNullable(this.newValue, autoTestChangeViewModelArrayWorkItemChangedFieldViewModel.newValue);
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
    sb.append("class AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel {\n");
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

