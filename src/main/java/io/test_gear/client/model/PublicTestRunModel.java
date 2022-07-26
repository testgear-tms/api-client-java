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
 * PublicTestRunModel
 */
@JsonPropertyOrder({
  PublicTestRunModel.JSON_PROPERTY_TEST_RUN_ID,
  PublicTestRunModel.JSON_PROPERTY_TEST_PLAN_ID,
  PublicTestRunModel.JSON_PROPERTY_TEST_PLAN_GLOBAL_ID,
  PublicTestRunModel.JSON_PROPERTY_NAME,
  PublicTestRunModel.JSON_PROPERTY_PRODUCT_NAME,
  PublicTestRunModel.JSON_PROPERTY_BUILD,
  PublicTestRunModel.JSON_PROPERTY_CONFIGURATIONS,
  PublicTestRunModel.JSON_PROPERTY_AUTO_TESTS,
  PublicTestRunModel.JSON_PROPERTY_TEST_POINTS,
  PublicTestRunModel.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PublicTestRunModel {
  public static final String JSON_PROPERTY_TEST_RUN_ID = "testRunId";
  private UUID testRunId;

  public static final String JSON_PROPERTY_TEST_PLAN_ID = "testPlanId";
  private JsonNullable<UUID> testPlanId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_TEST_PLAN_GLOBAL_ID = "testPlanGlobalId";
  private Long testPlanGlobalId;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PRODUCT_NAME = "productName";
  private JsonNullable<String> productName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BUILD = "build";
  private JsonNullable<String> build = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONFIGURATIONS = "configurations";
  private JsonNullable<List<ConfigurationModel>> configurations = JsonNullable.<List<ConfigurationModel>>undefined();

  public static final String JSON_PROPERTY_AUTO_TESTS = "autoTests";
  private JsonNullable<List<AutoTestModel>> autoTests = JsonNullable.<List<AutoTestModel>>undefined();

  public static final String JSON_PROPERTY_TEST_POINTS = "testPoints";
  private JsonNullable<List<PublicTestPointModel>> testPoints = JsonNullable.<List<PublicTestPointModel>>undefined();

  public static final String JSON_PROPERTY_STATUS = "status";
  private JsonNullable<String> status = JsonNullable.<String>undefined();

  public PublicTestRunModel() { 
  }

  public PublicTestRunModel testRunId(UUID testRunId) {
    this.testRunId = testRunId;
    return this;
  }

   /**
   * Get testRunId
   * @return testRunId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEST_RUN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getTestRunId() {
    return testRunId;
  }


  @JsonProperty(JSON_PROPERTY_TEST_RUN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestRunId(UUID testRunId) {
    this.testRunId = testRunId;
  }


  public PublicTestRunModel testPlanId(UUID testPlanId) {
    this.testPlanId = JsonNullable.<UUID>of(testPlanId);
    return this;
  }

   /**
   * Get testPlanId
   * @return testPlanId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public UUID getTestPlanId() {
        return testPlanId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEST_PLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getTestPlanId_JsonNullable() {
    return testPlanId;
  }
  
  @JsonProperty(JSON_PROPERTY_TEST_PLAN_ID)
  public void setTestPlanId_JsonNullable(JsonNullable<UUID> testPlanId) {
    this.testPlanId = testPlanId;
  }

  public void setTestPlanId(UUID testPlanId) {
    this.testPlanId = JsonNullable.<UUID>of(testPlanId);
  }


  public PublicTestRunModel testPlanGlobalId(Long testPlanGlobalId) {
    this.testPlanGlobalId = testPlanGlobalId;
    return this;
  }

   /**
   * Get testPlanGlobalId
   * @return testPlanGlobalId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEST_PLAN_GLOBAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTestPlanGlobalId() {
    return testPlanGlobalId;
  }


  @JsonProperty(JSON_PROPERTY_TEST_PLAN_GLOBAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestPlanGlobalId(Long testPlanGlobalId) {
    this.testPlanGlobalId = testPlanGlobalId;
  }


  public PublicTestRunModel name(String name) {
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


  public PublicTestRunModel productName(String productName) {
    this.productName = JsonNullable.<String>of(productName);
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getProductName() {
        return productName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRODUCT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getProductName_JsonNullable() {
    return productName;
  }
  
  @JsonProperty(JSON_PROPERTY_PRODUCT_NAME)
  public void setProductName_JsonNullable(JsonNullable<String> productName) {
    this.productName = productName;
  }

  public void setProductName(String productName) {
    this.productName = JsonNullable.<String>of(productName);
  }


  public PublicTestRunModel build(String build) {
    this.build = JsonNullable.<String>of(build);
    return this;
  }

   /**
   * Get build
   * @return build
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getBuild() {
        return build.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BUILD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBuild_JsonNullable() {
    return build;
  }
  
  @JsonProperty(JSON_PROPERTY_BUILD)
  public void setBuild_JsonNullable(JsonNullable<String> build) {
    this.build = build;
  }

  public void setBuild(String build) {
    this.build = JsonNullable.<String>of(build);
  }


  public PublicTestRunModel configurations(List<ConfigurationModel> configurations) {
    this.configurations = JsonNullable.<List<ConfigurationModel>>of(configurations);
    return this;
  }

  public PublicTestRunModel addConfigurationsItem(ConfigurationModel configurationsItem) {
    if (this.configurations == null || !this.configurations.isPresent()) {
      this.configurations = JsonNullable.<List<ConfigurationModel>>of(new ArrayList<>());
    }
    try {
      this.configurations.get().add(configurationsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get configurations
   * @return configurations
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<ConfigurationModel> getConfigurations() {
        return configurations.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<ConfigurationModel>> getConfigurations_JsonNullable() {
    return configurations;
  }
  
  @JsonProperty(JSON_PROPERTY_CONFIGURATIONS)
  public void setConfigurations_JsonNullable(JsonNullable<List<ConfigurationModel>> configurations) {
    this.configurations = configurations;
  }

  public void setConfigurations(List<ConfigurationModel> configurations) {
    this.configurations = JsonNullable.<List<ConfigurationModel>>of(configurations);
  }


  public PublicTestRunModel autoTests(List<AutoTestModel> autoTests) {
    this.autoTests = JsonNullable.<List<AutoTestModel>>of(autoTests);
    return this;
  }

  public PublicTestRunModel addAutoTestsItem(AutoTestModel autoTestsItem) {
    if (this.autoTests == null || !this.autoTests.isPresent()) {
      this.autoTests = JsonNullable.<List<AutoTestModel>>of(new ArrayList<>());
    }
    try {
      this.autoTests.get().add(autoTestsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get autoTests
   * @return autoTests
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<AutoTestModel> getAutoTests() {
        return autoTests.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AUTO_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<AutoTestModel>> getAutoTests_JsonNullable() {
    return autoTests;
  }
  
  @JsonProperty(JSON_PROPERTY_AUTO_TESTS)
  public void setAutoTests_JsonNullable(JsonNullable<List<AutoTestModel>> autoTests) {
    this.autoTests = autoTests;
  }

  public void setAutoTests(List<AutoTestModel> autoTests) {
    this.autoTests = JsonNullable.<List<AutoTestModel>>of(autoTests);
  }


  public PublicTestRunModel testPoints(List<PublicTestPointModel> testPoints) {
    this.testPoints = JsonNullable.<List<PublicTestPointModel>>of(testPoints);
    return this;
  }

  public PublicTestRunModel addTestPointsItem(PublicTestPointModel testPointsItem) {
    if (this.testPoints == null || !this.testPoints.isPresent()) {
      this.testPoints = JsonNullable.<List<PublicTestPointModel>>of(new ArrayList<>());
    }
    try {
      this.testPoints.get().add(testPointsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get testPoints
   * @return testPoints
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<PublicTestPointModel> getTestPoints() {
        return testPoints.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEST_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<PublicTestPointModel>> getTestPoints_JsonNullable() {
    return testPoints;
  }
  
  @JsonProperty(JSON_PROPERTY_TEST_POINTS)
  public void setTestPoints_JsonNullable(JsonNullable<List<PublicTestPointModel>> testPoints) {
    this.testPoints = testPoints;
  }

  public void setTestPoints(List<PublicTestPointModel> testPoints) {
    this.testPoints = JsonNullable.<List<PublicTestPointModel>>of(testPoints);
  }


  public PublicTestRunModel status(String status) {
    this.status = JsonNullable.<String>of(status);
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getStatus() {
        return status.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getStatus_JsonNullable() {
    return status;
  }
  
  @JsonProperty(JSON_PROPERTY_STATUS)
  public void setStatus_JsonNullable(JsonNullable<String> status) {
    this.status = status;
  }

  public void setStatus(String status) {
    this.status = JsonNullable.<String>of(status);
  }


  /**
   * Return true if this PublicTestRunModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicTestRunModel publicTestRunModel = (PublicTestRunModel) o;
    return Objects.equals(this.testRunId, publicTestRunModel.testRunId) &&
        equalsNullable(this.testPlanId, publicTestRunModel.testPlanId) &&
        Objects.equals(this.testPlanGlobalId, publicTestRunModel.testPlanGlobalId) &&
        equalsNullable(this.name, publicTestRunModel.name) &&
        equalsNullable(this.productName, publicTestRunModel.productName) &&
        equalsNullable(this.build, publicTestRunModel.build) &&
        equalsNullable(this.configurations, publicTestRunModel.configurations) &&
        equalsNullable(this.autoTests, publicTestRunModel.autoTests) &&
        equalsNullable(this.testPoints, publicTestRunModel.testPoints) &&
        equalsNullable(this.status, publicTestRunModel.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(testRunId, hashCodeNullable(testPlanId), testPlanGlobalId, hashCodeNullable(name), hashCodeNullable(productName), hashCodeNullable(build), hashCodeNullable(configurations), hashCodeNullable(autoTests), hashCodeNullable(testPoints), hashCodeNullable(status));
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
    sb.append("class PublicTestRunModel {\n");
    sb.append("    testRunId: ").append(toIndentedString(testRunId)).append("\n");
    sb.append("    testPlanId: ").append(toIndentedString(testPlanId)).append("\n");
    sb.append("    testPlanGlobalId: ").append(toIndentedString(testPlanGlobalId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
    sb.append("    autoTests: ").append(toIndentedString(autoTests)).append("\n");
    sb.append("    testPoints: ").append(toIndentedString(testPoints)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

