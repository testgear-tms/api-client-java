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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CustomAttributeTestPlanProjectRelationPutModel
 */
@JsonPropertyOrder({
  CustomAttributeTestPlanProjectRelationPutModel.JSON_PROPERTY_ID,
  CustomAttributeTestPlanProjectRelationPutModel.JSON_PROPERTY_ENABLED,
  CustomAttributeTestPlanProjectRelationPutModel.JSON_PROPERTY_REQUIRED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomAttributeTestPlanProjectRelationPutModel {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_REQUIRED = "required";
  private Boolean required;

  public CustomAttributeTestPlanProjectRelationPutModel() { 
  }

  public CustomAttributeTestPlanProjectRelationPutModel id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "ceab5447-3791-4566-954f-8f2f7347a854", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(UUID id) {
    this.id = id;
  }


  public CustomAttributeTestPlanProjectRelationPutModel enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public CustomAttributeTestPlanProjectRelationPutModel required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getRequired() {
    return required;
  }


  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRequired(Boolean required) {
    this.required = required;
  }


  /**
   * Return true if this CustomAttributeTestPlanProjectRelationPutModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomAttributeTestPlanProjectRelationPutModel customAttributeTestPlanProjectRelationPutModel = (CustomAttributeTestPlanProjectRelationPutModel) o;
    return Objects.equals(this.id, customAttributeTestPlanProjectRelationPutModel.id) &&
        Objects.equals(this.enabled, customAttributeTestPlanProjectRelationPutModel.enabled) &&
        Objects.equals(this.required, customAttributeTestPlanProjectRelationPutModel.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, enabled, required);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomAttributeTestPlanProjectRelationPutModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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

