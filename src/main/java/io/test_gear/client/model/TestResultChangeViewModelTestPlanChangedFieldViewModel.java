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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.test_gear.client.model.TestResultChangeViewModel;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.test_gear.client.invoker.JSON;

/**
 * TestResultChangeViewModelTestPlanChangedFieldViewModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestResultChangeViewModelTestPlanChangedFieldViewModel {
  public static final String SERIALIZED_NAME_OLD_VALUE = "oldValue";
  @SerializedName(SERIALIZED_NAME_OLD_VALUE)
  private TestResultChangeViewModel oldValue;

  public static final String SERIALIZED_NAME_NEW_VALUE = "newValue";
  @SerializedName(SERIALIZED_NAME_NEW_VALUE)
  private TestResultChangeViewModel newValue;

  public TestResultChangeViewModelTestPlanChangedFieldViewModel() {
  }

  public TestResultChangeViewModelTestPlanChangedFieldViewModel oldValue(TestResultChangeViewModel oldValue) {
    
    this.oldValue = oldValue;
    return this;
  }

   /**
   * Get oldValue
   * @return oldValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TestResultChangeViewModel getOldValue() {
    return oldValue;
  }


  public void setOldValue(TestResultChangeViewModel oldValue) {
    this.oldValue = oldValue;
  }


  public TestResultChangeViewModelTestPlanChangedFieldViewModel newValue(TestResultChangeViewModel newValue) {
    
    this.newValue = newValue;
    return this;
  }

   /**
   * Get newValue
   * @return newValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TestResultChangeViewModel getNewValue() {
    return newValue;
  }


  public void setNewValue(TestResultChangeViewModel newValue) {
    this.newValue = newValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestResultChangeViewModelTestPlanChangedFieldViewModel testResultChangeViewModelTestPlanChangedFieldViewModel = (TestResultChangeViewModelTestPlanChangedFieldViewModel) o;
    return Objects.equals(this.oldValue, testResultChangeViewModelTestPlanChangedFieldViewModel.oldValue) &&
        Objects.equals(this.newValue, testResultChangeViewModelTestPlanChangedFieldViewModel.newValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldValue, newValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestResultChangeViewModelTestPlanChangedFieldViewModel {\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("oldValue");
    openapiFields.add("newValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TestResultChangeViewModelTestPlanChangedFieldViewModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TestResultChangeViewModelTestPlanChangedFieldViewModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestResultChangeViewModelTestPlanChangedFieldViewModel is not found in the empty JSON string", TestResultChangeViewModelTestPlanChangedFieldViewModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TestResultChangeViewModelTestPlanChangedFieldViewModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestResultChangeViewModelTestPlanChangedFieldViewModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `oldValue`
      if (jsonObj.get("oldValue") != null && !jsonObj.get("oldValue").isJsonNull()) {
        TestResultChangeViewModel.validateJsonObject(jsonObj.getAsJsonObject("oldValue"));
      }
      // validate the optional field `newValue`
      if (jsonObj.get("newValue") != null && !jsonObj.get("newValue").isJsonNull()) {
        TestResultChangeViewModel.validateJsonObject(jsonObj.getAsJsonObject("newValue"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestResultChangeViewModelTestPlanChangedFieldViewModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestResultChangeViewModelTestPlanChangedFieldViewModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestResultChangeViewModelTestPlanChangedFieldViewModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestResultChangeViewModelTestPlanChangedFieldViewModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestResultChangeViewModelTestPlanChangedFieldViewModel>() {
           @Override
           public void write(JsonWriter out, TestResultChangeViewModelTestPlanChangedFieldViewModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestResultChangeViewModelTestPlanChangedFieldViewModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestResultChangeViewModelTestPlanChangedFieldViewModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestResultChangeViewModelTestPlanChangedFieldViewModel
  * @throws IOException if the JSON string is invalid with respect to TestResultChangeViewModelTestPlanChangedFieldViewModel
  */
  public static TestResultChangeViewModelTestPlanChangedFieldViewModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestResultChangeViewModelTestPlanChangedFieldViewModel.class);
  }

 /**
  * Convert an instance of TestResultChangeViewModelTestPlanChangedFieldViewModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

