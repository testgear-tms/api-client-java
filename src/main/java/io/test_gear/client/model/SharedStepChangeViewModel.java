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
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SharedStepChangeViewModel
 */
@JsonPropertyOrder({
  SharedStepChangeViewModel.JSON_PROPERTY_ID,
  SharedStepChangeViewModel.JSON_PROPERTY_GLOBAL_ID,
  SharedStepChangeViewModel.JSON_PROPERTY_NAME,
  SharedStepChangeViewModel.JSON_PROPERTY_STEPS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SharedStepChangeViewModel {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_GLOBAL_ID = "globalId";
  private JsonNullable<Long> globalId = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STEPS = "steps";
  private JsonNullable<List<WorkItemStepChangeViewModel>> steps = JsonNullable.<List<WorkItemStepChangeViewModel>>undefined();

  public SharedStepChangeViewModel() { 
  }

  public SharedStepChangeViewModel id(UUID id) {
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


  public SharedStepChangeViewModel globalId(Long globalId) {
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


  public SharedStepChangeViewModel name(String name) {
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


  public SharedStepChangeViewModel steps(List<WorkItemStepChangeViewModel> steps) {
    this.steps = JsonNullable.<List<WorkItemStepChangeViewModel>>of(steps);
    return this;
  }

  public SharedStepChangeViewModel addStepsItem(WorkItemStepChangeViewModel stepsItem) {
    if (this.steps == null || !this.steps.isPresent()) {
      this.steps = JsonNullable.<List<WorkItemStepChangeViewModel>>of(new ArrayList<>());
    }
    try {
      this.steps.get().add(stepsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<WorkItemStepChangeViewModel> getSteps() {
        return steps.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<WorkItemStepChangeViewModel>> getSteps_JsonNullable() {
    return steps;
  }
  
  @JsonProperty(JSON_PROPERTY_STEPS)
  public void setSteps_JsonNullable(JsonNullable<List<WorkItemStepChangeViewModel>> steps) {
    this.steps = steps;
  }

  public void setSteps(List<WorkItemStepChangeViewModel> steps) {
    this.steps = JsonNullable.<List<WorkItemStepChangeViewModel>>of(steps);
  }


  /**
   * Return true if this SharedStepChangeViewModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedStepChangeViewModel sharedStepChangeViewModel = (SharedStepChangeViewModel) o;
    return Objects.equals(this.id, sharedStepChangeViewModel.id) &&
        equalsNullable(this.globalId, sharedStepChangeViewModel.globalId) &&
        equalsNullable(this.name, sharedStepChangeViewModel.name) &&
        equalsNullable(this.steps, sharedStepChangeViewModel.steps);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(globalId), hashCodeNullable(name), hashCodeNullable(steps));
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
    sb.append("class SharedStepChangeViewModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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

