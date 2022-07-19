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
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SharedStepResultModel
 */
@JsonPropertyOrder({
  SharedStepResultModel.JSON_PROPERTY_STEP_ID,
  SharedStepResultModel.JSON_PROPERTY_OUTCOME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SharedStepResultModel {
  public static final String JSON_PROPERTY_STEP_ID = "stepId";
  private UUID stepId;

  public static final String JSON_PROPERTY_OUTCOME = "outcome";
  private JsonNullable<String> outcome = JsonNullable.<String>undefined();

  public SharedStepResultModel() { 
  }

  public SharedStepResultModel stepId(UUID stepId) {
    this.stepId = stepId;
    return this;
  }

   /**
   * Get stepId
   * @return stepId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STEP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getStepId() {
    return stepId;
  }


  @JsonProperty(JSON_PROPERTY_STEP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStepId(UUID stepId) {
    this.stepId = stepId;
  }


  public SharedStepResultModel outcome(String outcome) {
    this.outcome = JsonNullable.<String>of(outcome);
    return this;
  }

   /**
   * Get outcome
   * @return outcome
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getOutcome() {
        return outcome.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OUTCOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOutcome_JsonNullable() {
    return outcome;
  }
  
  @JsonProperty(JSON_PROPERTY_OUTCOME)
  public void setOutcome_JsonNullable(JsonNullable<String> outcome) {
    this.outcome = outcome;
  }

  public void setOutcome(String outcome) {
    this.outcome = JsonNullable.<String>of(outcome);
  }


  /**
   * Return true if this SharedStepResultModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedStepResultModel sharedStepResultModel = (SharedStepResultModel) o;
    return Objects.equals(this.stepId, sharedStepResultModel.stepId) &&
        equalsNullable(this.outcome, sharedStepResultModel.outcome);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(stepId, hashCodeNullable(outcome));
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
    sb.append("class SharedStepResultModel {\n");
    sb.append("    stepId: ").append(toIndentedString(stepId)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
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
