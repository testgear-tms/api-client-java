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
 * TestPointAnalyticResult
 */
@JsonPropertyOrder({
  TestPointAnalyticResult.JSON_PROPERTY_COUNT_GROUP_BY_STATUS,
  TestPointAnalyticResult.JSON_PROPERTY_SUM_GROUP_BY_TESTER,
  TestPointAnalyticResult.JSON_PROPERTY_COUNT_GROUP_BY_TESTER,
  TestPointAnalyticResult.JSON_PROPERTY_COUNT_GROUP_BY_TEST_SUITE,
  TestPointAnalyticResult.JSON_PROPERTY_COUNT_GROUP_BY_TESTER_AND_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestPointAnalyticResult {
  public static final String JSON_PROPERTY_COUNT_GROUP_BY_STATUS = "countGroupByStatus";
  private JsonNullable<List<TestPlanGroupByStatus>> countGroupByStatus = JsonNullable.<List<TestPlanGroupByStatus>>undefined();

  public static final String JSON_PROPERTY_SUM_GROUP_BY_TESTER = "sumGroupByTester";
  private JsonNullable<List<TestPlanGroupByTester>> sumGroupByTester = JsonNullable.<List<TestPlanGroupByTester>>undefined();

  public static final String JSON_PROPERTY_COUNT_GROUP_BY_TESTER = "countGroupByTester";
  private JsonNullable<List<TestPlanGroupByTester>> countGroupByTester = JsonNullable.<List<TestPlanGroupByTester>>undefined();

  public static final String JSON_PROPERTY_COUNT_GROUP_BY_TEST_SUITE = "countGroupByTestSuite";
  private JsonNullable<List<TestPlanGroupByTestSuite>> countGroupByTestSuite = JsonNullable.<List<TestPlanGroupByTestSuite>>undefined();

  public static final String JSON_PROPERTY_COUNT_GROUP_BY_TESTER_AND_STATUS = "countGroupByTesterAndStatus";
  private JsonNullable<List<TestPlanGroupByTesterAndStatus>> countGroupByTesterAndStatus = JsonNullable.<List<TestPlanGroupByTesterAndStatus>>undefined();

  public TestPointAnalyticResult() { 
  }

  public TestPointAnalyticResult countGroupByStatus(List<TestPlanGroupByStatus> countGroupByStatus) {
    this.countGroupByStatus = JsonNullable.<List<TestPlanGroupByStatus>>of(countGroupByStatus);
    return this;
  }

  public TestPointAnalyticResult addCountGroupByStatusItem(TestPlanGroupByStatus countGroupByStatusItem) {
    if (this.countGroupByStatus == null || !this.countGroupByStatus.isPresent()) {
      this.countGroupByStatus = JsonNullable.<List<TestPlanGroupByStatus>>of(new ArrayList<>());
    }
    try {
      this.countGroupByStatus.get().add(countGroupByStatusItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get countGroupByStatus
   * @return countGroupByStatus
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<TestPlanGroupByStatus> getCountGroupByStatus() {
        return countGroupByStatus.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COUNT_GROUP_BY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<TestPlanGroupByStatus>> getCountGroupByStatus_JsonNullable() {
    return countGroupByStatus;
  }
  
  @JsonProperty(JSON_PROPERTY_COUNT_GROUP_BY_STATUS)
  public void setCountGroupByStatus_JsonNullable(JsonNullable<List<TestPlanGroupByStatus>> countGroupByStatus) {
    this.countGroupByStatus = countGroupByStatus;
  }

  public void setCountGroupByStatus(List<TestPlanGroupByStatus> countGroupByStatus) {
    this.countGroupByStatus = JsonNullable.<List<TestPlanGroupByStatus>>of(countGroupByStatus);
  }


  public TestPointAnalyticResult sumGroupByTester(List<TestPlanGroupByTester> sumGroupByTester) {
    this.sumGroupByTester = JsonNullable.<List<TestPlanGroupByTester>>of(sumGroupByTester);
    return this;
  }

  public TestPointAnalyticResult addSumGroupByTesterItem(TestPlanGroupByTester sumGroupByTesterItem) {
    if (this.sumGroupByTester == null || !this.sumGroupByTester.isPresent()) {
      this.sumGroupByTester = JsonNullable.<List<TestPlanGroupByTester>>of(new ArrayList<>());
    }
    try {
      this.sumGroupByTester.get().add(sumGroupByTesterItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get sumGroupByTester
   * @return sumGroupByTester
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<TestPlanGroupByTester> getSumGroupByTester() {
        return sumGroupByTester.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUM_GROUP_BY_TESTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<TestPlanGroupByTester>> getSumGroupByTester_JsonNullable() {
    return sumGroupByTester;
  }
  
  @JsonProperty(JSON_PROPERTY_SUM_GROUP_BY_TESTER)
  public void setSumGroupByTester_JsonNullable(JsonNullable<List<TestPlanGroupByTester>> sumGroupByTester) {
    this.sumGroupByTester = sumGroupByTester;
  }

  public void setSumGroupByTester(List<TestPlanGroupByTester> sumGroupByTester) {
    this.sumGroupByTester = JsonNullable.<List<TestPlanGroupByTester>>of(sumGroupByTester);
  }


  public TestPointAnalyticResult countGroupByTester(List<TestPlanGroupByTester> countGroupByTester) {
    this.countGroupByTester = JsonNullable.<List<TestPlanGroupByTester>>of(countGroupByTester);
    return this;
  }

  public TestPointAnalyticResult addCountGroupByTesterItem(TestPlanGroupByTester countGroupByTesterItem) {
    if (this.countGroupByTester == null || !this.countGroupByTester.isPresent()) {
      this.countGroupByTester = JsonNullable.<List<TestPlanGroupByTester>>of(new ArrayList<>());
    }
    try {
      this.countGroupByTester.get().add(countGroupByTesterItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get countGroupByTester
   * @return countGroupByTester
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<TestPlanGroupByTester> getCountGroupByTester() {
        return countGroupByTester.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COUNT_GROUP_BY_TESTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<TestPlanGroupByTester>> getCountGroupByTester_JsonNullable() {
    return countGroupByTester;
  }
  
  @JsonProperty(JSON_PROPERTY_COUNT_GROUP_BY_TESTER)
  public void setCountGroupByTester_JsonNullable(JsonNullable<List<TestPlanGroupByTester>> countGroupByTester) {
    this.countGroupByTester = countGroupByTester;
  }

  public void setCountGroupByTester(List<TestPlanGroupByTester> countGroupByTester) {
    this.countGroupByTester = JsonNullable.<List<TestPlanGroupByTester>>of(countGroupByTester);
  }


  public TestPointAnalyticResult countGroupByTestSuite(List<TestPlanGroupByTestSuite> countGroupByTestSuite) {
    this.countGroupByTestSuite = JsonNullable.<List<TestPlanGroupByTestSuite>>of(countGroupByTestSuite);
    return this;
  }

  public TestPointAnalyticResult addCountGroupByTestSuiteItem(TestPlanGroupByTestSuite countGroupByTestSuiteItem) {
    if (this.countGroupByTestSuite == null || !this.countGroupByTestSuite.isPresent()) {
      this.countGroupByTestSuite = JsonNullable.<List<TestPlanGroupByTestSuite>>of(new ArrayList<>());
    }
    try {
      this.countGroupByTestSuite.get().add(countGroupByTestSuiteItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get countGroupByTestSuite
   * @return countGroupByTestSuite
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<TestPlanGroupByTestSuite> getCountGroupByTestSuite() {
        return countGroupByTestSuite.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COUNT_GROUP_BY_TEST_SUITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<TestPlanGroupByTestSuite>> getCountGroupByTestSuite_JsonNullable() {
    return countGroupByTestSuite;
  }
  
  @JsonProperty(JSON_PROPERTY_COUNT_GROUP_BY_TEST_SUITE)
  public void setCountGroupByTestSuite_JsonNullable(JsonNullable<List<TestPlanGroupByTestSuite>> countGroupByTestSuite) {
    this.countGroupByTestSuite = countGroupByTestSuite;
  }

  public void setCountGroupByTestSuite(List<TestPlanGroupByTestSuite> countGroupByTestSuite) {
    this.countGroupByTestSuite = JsonNullable.<List<TestPlanGroupByTestSuite>>of(countGroupByTestSuite);
  }


  public TestPointAnalyticResult countGroupByTesterAndStatus(List<TestPlanGroupByTesterAndStatus> countGroupByTesterAndStatus) {
    this.countGroupByTesterAndStatus = JsonNullable.<List<TestPlanGroupByTesterAndStatus>>of(countGroupByTesterAndStatus);
    return this;
  }

  public TestPointAnalyticResult addCountGroupByTesterAndStatusItem(TestPlanGroupByTesterAndStatus countGroupByTesterAndStatusItem) {
    if (this.countGroupByTesterAndStatus == null || !this.countGroupByTesterAndStatus.isPresent()) {
      this.countGroupByTesterAndStatus = JsonNullable.<List<TestPlanGroupByTesterAndStatus>>of(new ArrayList<>());
    }
    try {
      this.countGroupByTesterAndStatus.get().add(countGroupByTesterAndStatusItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get countGroupByTesterAndStatus
   * @return countGroupByTesterAndStatus
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<TestPlanGroupByTesterAndStatus> getCountGroupByTesterAndStatus() {
        return countGroupByTesterAndStatus.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COUNT_GROUP_BY_TESTER_AND_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<TestPlanGroupByTesterAndStatus>> getCountGroupByTesterAndStatus_JsonNullable() {
    return countGroupByTesterAndStatus;
  }
  
  @JsonProperty(JSON_PROPERTY_COUNT_GROUP_BY_TESTER_AND_STATUS)
  public void setCountGroupByTesterAndStatus_JsonNullable(JsonNullable<List<TestPlanGroupByTesterAndStatus>> countGroupByTesterAndStatus) {
    this.countGroupByTesterAndStatus = countGroupByTesterAndStatus;
  }

  public void setCountGroupByTesterAndStatus(List<TestPlanGroupByTesterAndStatus> countGroupByTesterAndStatus) {
    this.countGroupByTesterAndStatus = JsonNullable.<List<TestPlanGroupByTesterAndStatus>>of(countGroupByTesterAndStatus);
  }


  /**
   * Return true if this TestPointAnalyticResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestPointAnalyticResult testPointAnalyticResult = (TestPointAnalyticResult) o;
    return equalsNullable(this.countGroupByStatus, testPointAnalyticResult.countGroupByStatus) &&
        equalsNullable(this.sumGroupByTester, testPointAnalyticResult.sumGroupByTester) &&
        equalsNullable(this.countGroupByTester, testPointAnalyticResult.countGroupByTester) &&
        equalsNullable(this.countGroupByTestSuite, testPointAnalyticResult.countGroupByTestSuite) &&
        equalsNullable(this.countGroupByTesterAndStatus, testPointAnalyticResult.countGroupByTesterAndStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(countGroupByStatus), hashCodeNullable(sumGroupByTester), hashCodeNullable(countGroupByTester), hashCodeNullable(countGroupByTestSuite), hashCodeNullable(countGroupByTesterAndStatus));
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
    sb.append("class TestPointAnalyticResult {\n");
    sb.append("    countGroupByStatus: ").append(toIndentedString(countGroupByStatus)).append("\n");
    sb.append("    sumGroupByTester: ").append(toIndentedString(sumGroupByTester)).append("\n");
    sb.append("    countGroupByTester: ").append(toIndentedString(countGroupByTester)).append("\n");
    sb.append("    countGroupByTestSuite: ").append(toIndentedString(countGroupByTestSuite)).append("\n");
    sb.append("    countGroupByTesterAndStatus: ").append(toIndentedString(countGroupByTesterAndStatus)).append("\n");
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

