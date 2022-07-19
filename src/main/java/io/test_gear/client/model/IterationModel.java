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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;-gear.client.invoker.JSON;


/**
 * IterationModel
 */
@JsonPropertyOrder({
  IterationModel.JSON_PROPERTY_ID,
  IterationModel.JSON_PROPERTY_PARAMETERS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IterationModel {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  private JsonNullable<List<ParameterShortModel>> parameters = JsonNullable.<List<ParameterShortModel>>undefined();

  public IterationModel() { 
  }

  public IterationModel id(UUID id) {
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


  public IterationModel parameters(List<ParameterShortModel> parameters) {
    this.parameters = JsonNullable.<List<ParameterShortModel>>of(parameters);
    return this;
  }

  public IterationModel addParametersItem(ParameterShortModel parametersItem) {
    if (this.parameters == null || !this.parameters.isPresent()) {
      this.parameters = JsonNullable.<List<ParameterShortModel>>of(new ArrayList<>());
    }
    try {
      this.parameters.get().add(parametersItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<ParameterShortModel> getParameters() {
        return parameters.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<ParameterShortModel>> getParameters_JsonNullable() {
    return parameters;
  }
  
  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  public void setParameters_JsonNullable(JsonNullable<List<ParameterShortModel>> parameters) {
    this.parameters = parameters;
  }

  public void setParameters(List<ParameterShortModel> parameters) {
    this.parameters = JsonNullable.<List<ParameterShortModel>>of(parameters);
  }


  /**
   * Return true if this IterationModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IterationModel iterationModel = (IterationModel) o;
    return Objects.equals(this.id, iterationModel.id) &&
        equalsNullable(this.parameters, iterationModel.parameters);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(parameters));
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
    sb.append("class IterationModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
