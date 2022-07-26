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
 * LastTestResultModel
 */
@JsonPropertyOrder({
  LastTestResultModel.JSON_PROPERTY_ID,
  LastTestResultModel.JSON_PROPERTY_TEST_RUN_ID,
  LastTestResultModel.JSON_PROPERTY_AUTO_TEST_ID,
  LastTestResultModel.JSON_PROPERTY_COMMENT,
  LastTestResultModel.JSON_PROPERTY_LINKS,
  LastTestResultModel.JSON_PROPERTY_WORK_ITEM_VERSION_ID,
  LastTestResultModel.JSON_PROPERTY_ATTACHMENTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LastTestResultModel {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_TEST_RUN_ID = "testRunId";
  private UUID testRunId;

  public static final String JSON_PROPERTY_AUTO_TEST_ID = "autoTestId";
  private JsonNullable<UUID> autoTestId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_COMMENT = "comment";
  private JsonNullable<String> comment = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LINKS = "links";
  private JsonNullable<List<LinkModel>> links = JsonNullable.<List<LinkModel>>undefined();

  public static final String JSON_PROPERTY_WORK_ITEM_VERSION_ID = "workItemVersionId";
  private UUID workItemVersionId;

  public static final String JSON_PROPERTY_ATTACHMENTS = "attachments";
  private JsonNullable<List<AttachmentModel>> attachments = JsonNullable.<List<AttachmentModel>>undefined();

  public LastTestResultModel() { 
  }

  public LastTestResultModel id(UUID id) {
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


  public LastTestResultModel testRunId(UUID testRunId) {
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


  public LastTestResultModel autoTestId(UUID autoTestId) {
    this.autoTestId = JsonNullable.<UUID>of(autoTestId);
    return this;
  }

   /**
   * Get autoTestId
   * @return autoTestId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public UUID getAutoTestId() {
        return autoTestId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AUTO_TEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getAutoTestId_JsonNullable() {
    return autoTestId;
  }
  
  @JsonProperty(JSON_PROPERTY_AUTO_TEST_ID)
  public void setAutoTestId_JsonNullable(JsonNullable<UUID> autoTestId) {
    this.autoTestId = autoTestId;
  }

  public void setAutoTestId(UUID autoTestId) {
    this.autoTestId = JsonNullable.<UUID>of(autoTestId);
  }


  public LastTestResultModel comment(String comment) {
    this.comment = JsonNullable.<String>of(comment);
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getComment() {
        return comment.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getComment_JsonNullable() {
    return comment;
  }
  
  @JsonProperty(JSON_PROPERTY_COMMENT)
  public void setComment_JsonNullable(JsonNullable<String> comment) {
    this.comment = comment;
  }

  public void setComment(String comment) {
    this.comment = JsonNullable.<String>of(comment);
  }


  public LastTestResultModel links(List<LinkModel> links) {
    this.links = JsonNullable.<List<LinkModel>>of(links);
    return this;
  }

  public LastTestResultModel addLinksItem(LinkModel linksItem) {
    if (this.links == null || !this.links.isPresent()) {
      this.links = JsonNullable.<List<LinkModel>>of(new ArrayList<>());
    }
    try {
      this.links.get().add(linksItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<LinkModel> getLinks() {
        return links.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<LinkModel>> getLinks_JsonNullable() {
    return links;
  }
  
  @JsonProperty(JSON_PROPERTY_LINKS)
  public void setLinks_JsonNullable(JsonNullable<List<LinkModel>> links) {
    this.links = links;
  }

  public void setLinks(List<LinkModel> links) {
    this.links = JsonNullable.<List<LinkModel>>of(links);
  }


  public LastTestResultModel workItemVersionId(UUID workItemVersionId) {
    this.workItemVersionId = workItemVersionId;
    return this;
  }

   /**
   * Get workItemVersionId
   * @return workItemVersionId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WORK_ITEM_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getWorkItemVersionId() {
    return workItemVersionId;
  }


  @JsonProperty(JSON_PROPERTY_WORK_ITEM_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorkItemVersionId(UUID workItemVersionId) {
    this.workItemVersionId = workItemVersionId;
  }


  public LastTestResultModel attachments(List<AttachmentModel> attachments) {
    this.attachments = JsonNullable.<List<AttachmentModel>>of(attachments);
    return this;
  }

  public LastTestResultModel addAttachmentsItem(AttachmentModel attachmentsItem) {
    if (this.attachments == null || !this.attachments.isPresent()) {
      this.attachments = JsonNullable.<List<AttachmentModel>>of(new ArrayList<>());
    }
    try {
      this.attachments.get().add(attachmentsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<AttachmentModel> getAttachments() {
        return attachments.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<AttachmentModel>> getAttachments_JsonNullable() {
    return attachments;
  }
  
  @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
  public void setAttachments_JsonNullable(JsonNullable<List<AttachmentModel>> attachments) {
    this.attachments = attachments;
  }

  public void setAttachments(List<AttachmentModel> attachments) {
    this.attachments = JsonNullable.<List<AttachmentModel>>of(attachments);
  }


  /**
   * Return true if this LastTestResultModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LastTestResultModel lastTestResultModel = (LastTestResultModel) o;
    return Objects.equals(this.id, lastTestResultModel.id) &&
        Objects.equals(this.testRunId, lastTestResultModel.testRunId) &&
        equalsNullable(this.autoTestId, lastTestResultModel.autoTestId) &&
        equalsNullable(this.comment, lastTestResultModel.comment) &&
        equalsNullable(this.links, lastTestResultModel.links) &&
        Objects.equals(this.workItemVersionId, lastTestResultModel.workItemVersionId) &&
        equalsNullable(this.attachments, lastTestResultModel.attachments);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, testRunId, hashCodeNullable(autoTestId), hashCodeNullable(comment), hashCodeNullable(links), workItemVersionId, hashCodeNullable(attachments));
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
    sb.append("class LastTestResultModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    testRunId: ").append(toIndentedString(testRunId)).append("\n");
    sb.append("    autoTestId: ").append(toIndentedString(autoTestId)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    workItemVersionId: ").append(toIndentedString(workItemVersionId)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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

