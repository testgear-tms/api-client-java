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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * WorkItemModel
 */
@JsonPropertyOrder({
  WorkItemModel.JSON_PROPERTY_VERSION_ID,
  WorkItemModel.JSON_PROPERTY_MEDIAN_DURATION,
  WorkItemModel.JSON_PROPERTY_IS_DELETED,
  WorkItemModel.JSON_PROPERTY_PROJECT_ID,
  WorkItemModel.JSON_PROPERTY_ENTITY_TYPE_NAME,
  WorkItemModel.JSON_PROPERTY_IS_AUTOMATED,
  WorkItemModel.JSON_PROPERTY_AUTO_TESTS,
  WorkItemModel.JSON_PROPERTY_ATTACHMENTS,
  WorkItemModel.JSON_PROPERTY_SECTION_PRECONDITION_STEPS,
  WorkItemModel.JSON_PROPERTY_SECTION_POSTCONDITION_STEPS,
  WorkItemModel.JSON_PROPERTY_VERSION_NUMBER,
  WorkItemModel.JSON_PROPERTY_ITERATIONS,
  WorkItemModel.JSON_PROPERTY_CREATED_DATE,
  WorkItemModel.JSON_PROPERTY_MODIFIED_DATE,
  WorkItemModel.JSON_PROPERTY_CREATED_BY_ID,
  WorkItemModel.JSON_PROPERTY_MODIFIED_BY_ID,
  WorkItemModel.JSON_PROPERTY_GLOBAL_ID,
  WorkItemModel.JSON_PROPERTY_ID,
  WorkItemModel.JSON_PROPERTY_SECTION_ID,
  WorkItemModel.JSON_PROPERTY_DESCRIPTION,
  WorkItemModel.JSON_PROPERTY_STATE,
  WorkItemModel.JSON_PROPERTY_PRIORITY,
  WorkItemModel.JSON_PROPERTY_STEPS,
  WorkItemModel.JSON_PROPERTY_PRECONDITION_STEPS,
  WorkItemModel.JSON_PROPERTY_POSTCONDITION_STEPS,
  WorkItemModel.JSON_PROPERTY_DURATION,
  WorkItemModel.JSON_PROPERTY_ATTRIBUTES,
  WorkItemModel.JSON_PROPERTY_TAGS,
  WorkItemModel.JSON_PROPERTY_LINKS,
  WorkItemModel.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WorkItemModel {
  public static final String JSON_PROPERTY_VERSION_ID = "versionId";
  private UUID versionId;

  public static final String JSON_PROPERTY_MEDIAN_DURATION = "medianDuration";
  private Long medianDuration;

  public static final String JSON_PROPERTY_IS_DELETED = "isDeleted";
  private Boolean isDeleted;

  public static final String JSON_PROPERTY_PROJECT_ID = "projectId";
  private UUID projectId;

  public static final String JSON_PROPERTY_ENTITY_TYPE_NAME = "entityTypeName";
  private WorkItemEntityTypes entityTypeName;

  public static final String JSON_PROPERTY_IS_AUTOMATED = "isAutomated";
  private Boolean isAutomated;

  public static final String JSON_PROPERTY_AUTO_TESTS = "autoTests";
  private JsonNullable<List<AutoTestModel>> autoTests = JsonNullable.<List<AutoTestModel>>undefined();

  public static final String JSON_PROPERTY_ATTACHMENTS = "attachments";
  private JsonNullable<List<AttachmentModel>> attachments = JsonNullable.<List<AttachmentModel>>undefined();

  public static final String JSON_PROPERTY_SECTION_PRECONDITION_STEPS = "sectionPreconditionSteps";
  private JsonNullable<List<StepModel>> sectionPreconditionSteps = JsonNullable.<List<StepModel>>undefined();

  public static final String JSON_PROPERTY_SECTION_POSTCONDITION_STEPS = "sectionPostconditionSteps";
  private JsonNullable<List<StepModel>> sectionPostconditionSteps = JsonNullable.<List<StepModel>>undefined();

  public static final String JSON_PROPERTY_VERSION_NUMBER = "versionNumber";
  private Integer versionNumber;

  public static final String JSON_PROPERTY_ITERATIONS = "iterations";
  private JsonNullable<List<IterationModel>> iterations = JsonNullable.<List<IterationModel>>undefined();

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private JsonNullable<OffsetDateTime> createdDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_MODIFIED_DATE = "modifiedDate";
  private JsonNullable<OffsetDateTime> modifiedDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CREATED_BY_ID = "createdById";
  private UUID createdById;

  public static final String JSON_PROPERTY_MODIFIED_BY_ID = "modifiedById";
  private JsonNullable<UUID> modifiedById = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_GLOBAL_ID = "globalId";
  private Long globalId;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_SECTION_ID = "sectionId";
  private UUID sectionId;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATE = "state";
  private WorkItemStates state;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private WorkItemPriorityModel priority;

  public static final String JSON_PROPERTY_STEPS = "steps";
  private List<StepModel> steps = new ArrayList<>();

  public static final String JSON_PROPERTY_PRECONDITION_STEPS = "preconditionSteps";
  private List<StepModel> preconditionSteps = new ArrayList<>();

  public static final String JSON_PROPERTY_POSTCONDITION_STEPS = "postconditionSteps";
  private List<StepModel> postconditionSteps = new ArrayList<>();

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Integer duration;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private Map<String, Object> attributes = new HashMap<>();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<TagShortModel> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKS = "links";
  private List<LinkModel> links = new ArrayList<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public WorkItemModel() { 
  }

  public WorkItemModel versionId(UUID versionId) {
    this.versionId = versionId;
    return this;
  }

   /**
   * used for versioning changes in workitem
   * @return versionId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ceab5447-3791-4566-954f-8f2f7347a854", value = "used for versioning changes in workitem")
  @JsonProperty(JSON_PROPERTY_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getVersionId() {
    return versionId;
  }


  @JsonProperty(JSON_PROPERTY_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersionId(UUID versionId) {
    this.versionId = versionId;
  }


  public WorkItemModel medianDuration(Long medianDuration) {
    this.medianDuration = medianDuration;
    return this;
  }

   /**
   * used for getting a median duration of all autotests related to this workitem
   * @return medianDuration
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "10000", value = "used for getting a median duration of all autotests related to this workitem")
  @JsonProperty(JSON_PROPERTY_MEDIAN_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMedianDuration() {
    return medianDuration;
  }


  @JsonProperty(JSON_PROPERTY_MEDIAN_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMedianDuration(Long medianDuration) {
    this.medianDuration = medianDuration;
  }


  public WorkItemModel isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")
  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDeleted() {
    return isDeleted;
  }


  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public WorkItemModel projectId(UUID projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ceab5447-3791-4566-954f-8f2f7347a854", value = "")
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getProjectId() {
    return projectId;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }


  public WorkItemModel entityTypeName(WorkItemEntityTypes entityTypeName) {
    this.entityTypeName = entityTypeName;
    return this;
  }

   /**
   * Get entityTypeName
   * @return entityTypeName
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public WorkItemEntityTypes getEntityTypeName() {
    return entityTypeName;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntityTypeName(WorkItemEntityTypes entityTypeName) {
    this.entityTypeName = entityTypeName;
  }


  public WorkItemModel isAutomated(Boolean isAutomated) {
    this.isAutomated = isAutomated;
    return this;
  }

   /**
   * Get isAutomated
   * @return isAutomated
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")
  @JsonProperty(JSON_PROPERTY_IS_AUTOMATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsAutomated() {
    return isAutomated;
  }


  @JsonProperty(JSON_PROPERTY_IS_AUTOMATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsAutomated(Boolean isAutomated) {
    this.isAutomated = isAutomated;
  }


  public WorkItemModel autoTests(List<AutoTestModel> autoTests) {
    this.autoTests = JsonNullable.<List<AutoTestModel>>of(autoTests);
    return this;
  }

  public WorkItemModel addAutoTestsItem(AutoTestModel autoTestsItem) {
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


  public WorkItemModel attachments(List<AttachmentModel> attachments) {
    this.attachments = JsonNullable.<List<AttachmentModel>>of(attachments);
    return this;
  }

  public WorkItemModel addAttachmentsItem(AttachmentModel attachmentsItem) {
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


  public WorkItemModel sectionPreconditionSteps(List<StepModel> sectionPreconditionSteps) {
    this.sectionPreconditionSteps = JsonNullable.<List<StepModel>>of(sectionPreconditionSteps);
    return this;
  }

  public WorkItemModel addSectionPreconditionStepsItem(StepModel sectionPreconditionStepsItem) {
    if (this.sectionPreconditionSteps == null || !this.sectionPreconditionSteps.isPresent()) {
      this.sectionPreconditionSteps = JsonNullable.<List<StepModel>>of(new ArrayList<>());
    }
    try {
      this.sectionPreconditionSteps.get().add(sectionPreconditionStepsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get sectionPreconditionSteps
   * @return sectionPreconditionSteps
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<StepModel> getSectionPreconditionSteps() {
        return sectionPreconditionSteps.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SECTION_PRECONDITION_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<StepModel>> getSectionPreconditionSteps_JsonNullable() {
    return sectionPreconditionSteps;
  }
  
  @JsonProperty(JSON_PROPERTY_SECTION_PRECONDITION_STEPS)
  public void setSectionPreconditionSteps_JsonNullable(JsonNullable<List<StepModel>> sectionPreconditionSteps) {
    this.sectionPreconditionSteps = sectionPreconditionSteps;
  }

  public void setSectionPreconditionSteps(List<StepModel> sectionPreconditionSteps) {
    this.sectionPreconditionSteps = JsonNullable.<List<StepModel>>of(sectionPreconditionSteps);
  }


  public WorkItemModel sectionPostconditionSteps(List<StepModel> sectionPostconditionSteps) {
    this.sectionPostconditionSteps = JsonNullable.<List<StepModel>>of(sectionPostconditionSteps);
    return this;
  }

  public WorkItemModel addSectionPostconditionStepsItem(StepModel sectionPostconditionStepsItem) {
    if (this.sectionPostconditionSteps == null || !this.sectionPostconditionSteps.isPresent()) {
      this.sectionPostconditionSteps = JsonNullable.<List<StepModel>>of(new ArrayList<>());
    }
    try {
      this.sectionPostconditionSteps.get().add(sectionPostconditionStepsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get sectionPostconditionSteps
   * @return sectionPostconditionSteps
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<StepModel> getSectionPostconditionSteps() {
        return sectionPostconditionSteps.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SECTION_POSTCONDITION_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<StepModel>> getSectionPostconditionSteps_JsonNullable() {
    return sectionPostconditionSteps;
  }
  
  @JsonProperty(JSON_PROPERTY_SECTION_POSTCONDITION_STEPS)
  public void setSectionPostconditionSteps_JsonNullable(JsonNullable<List<StepModel>> sectionPostconditionSteps) {
    this.sectionPostconditionSteps = sectionPostconditionSteps;
  }

  public void setSectionPostconditionSteps(List<StepModel> sectionPostconditionSteps) {
    this.sectionPostconditionSteps = JsonNullable.<List<StepModel>>of(sectionPostconditionSteps);
  }


  public WorkItemModel versionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

   /**
   * used for define chronology of workitem state in each version
   * @return versionNumber
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "10", value = "used for define chronology of workitem state in each version")
  @JsonProperty(JSON_PROPERTY_VERSION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersionNumber() {
    return versionNumber;
  }


  @JsonProperty(JSON_PROPERTY_VERSION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
  }


  public WorkItemModel iterations(List<IterationModel> iterations) {
    this.iterations = JsonNullable.<List<IterationModel>>of(iterations);
    return this;
  }

  public WorkItemModel addIterationsItem(IterationModel iterationsItem) {
    if (this.iterations == null || !this.iterations.isPresent()) {
      this.iterations = JsonNullable.<List<IterationModel>>of(new ArrayList<>());
    }
    try {
      this.iterations.get().add(iterationsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get iterations
   * @return iterations
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<IterationModel> getIterations() {
        return iterations.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ITERATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<IterationModel>> getIterations_JsonNullable() {
    return iterations;
  }
  
  @JsonProperty(JSON_PROPERTY_ITERATIONS)
  public void setIterations_JsonNullable(JsonNullable<List<IterationModel>> iterations) {
    this.iterations = iterations;
  }

  public void setIterations(List<IterationModel> iterations) {
    this.iterations = JsonNullable.<List<IterationModel>>of(iterations);
  }


  public WorkItemModel createdDate(OffsetDateTime createdDate) {
    this.createdDate = JsonNullable.<OffsetDateTime>of(createdDate);
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2022-07-14T09:52:35.620427900Z", value = "")
  @JsonIgnore

  public OffsetDateTime getCreatedDate() {
        return createdDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getCreatedDate_JsonNullable() {
    return createdDate;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  public void setCreatedDate_JsonNullable(JsonNullable<OffsetDateTime> createdDate) {
    this.createdDate = createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = JsonNullable.<OffsetDateTime>of(createdDate);
  }


  public WorkItemModel modifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = JsonNullable.<OffsetDateTime>of(modifiedDate);
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2022-07-14T09:52:35.620427900Z", value = "")
  @JsonIgnore

  public OffsetDateTime getModifiedDate() {
        return modifiedDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getModifiedDate_JsonNullable() {
    return modifiedDate;
  }
  
  @JsonProperty(JSON_PROPERTY_MODIFIED_DATE)
  public void setModifiedDate_JsonNullable(JsonNullable<OffsetDateTime> modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = JsonNullable.<OffsetDateTime>of(modifiedDate);
  }


  public WorkItemModel createdById(UUID createdById) {
    this.createdById = createdById;
    return this;
  }

   /**
   * Get createdById
   * @return createdById
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ceab5447-3791-4566-954f-8f2f7347a854", value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_BY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getCreatedById() {
    return createdById;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_BY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedById(UUID createdById) {
    this.createdById = createdById;
  }


  public WorkItemModel modifiedById(UUID modifiedById) {
    this.modifiedById = JsonNullable.<UUID>of(modifiedById);
    return this;
  }

   /**
   * Get modifiedById
   * @return modifiedById
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ceab5447-3791-4566-954f-8f2f7347a854", value = "")
  @JsonIgnore

  public UUID getModifiedById() {
        return modifiedById.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODIFIED_BY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getModifiedById_JsonNullable() {
    return modifiedById;
  }
  
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY_ID)
  public void setModifiedById_JsonNullable(JsonNullable<UUID> modifiedById) {
    this.modifiedById = modifiedById;
  }

  public void setModifiedById(UUID modifiedById) {
    this.modifiedById = JsonNullable.<UUID>of(modifiedById);
  }


  public WorkItemModel globalId(Long globalId) {
    this.globalId = globalId;
    return this;
  }

   /**
   * Get globalId
   * @return globalId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "")
  @JsonProperty(JSON_PROPERTY_GLOBAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getGlobalId() {
    return globalId;
  }


  @JsonProperty(JSON_PROPERTY_GLOBAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGlobalId(Long globalId) {
    this.globalId = globalId;
  }


  public WorkItemModel id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ceab5447-3791-4566-954f-8f2f7347a854", value = "")
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


  public WorkItemModel sectionId(UUID sectionId) {
    this.sectionId = sectionId;
    return this;
  }

   /**
   * Get sectionId
   * @return sectionId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ceab5447-3791-4566-954f-8f2f7347a854", value = "")
  @JsonProperty(JSON_PROPERTY_SECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getSectionId() {
    return sectionId;
  }


  @JsonProperty(JSON_PROPERTY_SECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSectionId(UUID sectionId) {
    this.sectionId = sectionId;
  }


  public WorkItemModel description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "This is a basic test template", value = "")
  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public WorkItemModel state(WorkItemStates state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public WorkItemStates getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setState(WorkItemStates state) {
    this.state = state;
  }


  public WorkItemModel priority(WorkItemPriorityModel priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public WorkItemPriorityModel getPriority() {
    return priority;
  }


  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPriority(WorkItemPriorityModel priority) {
    this.priority = priority;
  }


  public WorkItemModel steps(List<StepModel> steps) {
    this.steps = steps;
    return this;
  }

  public WorkItemModel addStepsItem(StepModel stepsItem) {
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<StepModel> getSteps() {
    return steps;
  }


  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSteps(List<StepModel> steps) {
    this.steps = steps;
  }


  public WorkItemModel preconditionSteps(List<StepModel> preconditionSteps) {
    this.preconditionSteps = preconditionSteps;
    return this;
  }

  public WorkItemModel addPreconditionStepsItem(StepModel preconditionStepsItem) {
    this.preconditionSteps.add(preconditionStepsItem);
    return this;
  }

   /**
   * Get preconditionSteps
   * @return preconditionSteps
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PRECONDITION_STEPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<StepModel> getPreconditionSteps() {
    return preconditionSteps;
  }


  @JsonProperty(JSON_PROPERTY_PRECONDITION_STEPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPreconditionSteps(List<StepModel> preconditionSteps) {
    this.preconditionSteps = preconditionSteps;
  }


  public WorkItemModel postconditionSteps(List<StepModel> postconditionSteps) {
    this.postconditionSteps = postconditionSteps;
    return this;
  }

  public WorkItemModel addPostconditionStepsItem(StepModel postconditionStepsItem) {
    this.postconditionSteps.add(postconditionStepsItem);
    return this;
  }

   /**
   * Get postconditionSteps
   * @return postconditionSteps
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_POSTCONDITION_STEPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<StepModel> getPostconditionSteps() {
    return postconditionSteps;
  }


  @JsonProperty(JSON_PROPERTY_POSTCONDITION_STEPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPostconditionSteps(List<StepModel> postconditionSteps) {
    this.postconditionSteps = postconditionSteps;
  }


  public WorkItemModel duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * minimum: 0
   * maximum: 86400
   * @return duration
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "10000", value = "")
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public WorkItemModel attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  public WorkItemModel putAttributesItem(String key, Object attributesItem) {
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)

  public Map<String, Object> getAttributes() {
    return attributes;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)
  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }


  public WorkItemModel tags(List<TagShortModel> tags) {
    this.tags = tags;
    return this;
  }

  public WorkItemModel addTagsItem(TagShortModel tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<TagShortModel> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTags(List<TagShortModel> tags) {
    this.tags = tags;
  }


  public WorkItemModel links(List<LinkModel> links) {
    this.links = links;
    return this;
  }

  public WorkItemModel addLinksItem(LinkModel linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<LinkModel> getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLinks(List<LinkModel> links) {
    this.links = links;
  }


  public WorkItemModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "Basic template", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Return true if this WorkItemModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemModel workItemModel = (WorkItemModel) o;
    return Objects.equals(this.versionId, workItemModel.versionId) &&
        Objects.equals(this.medianDuration, workItemModel.medianDuration) &&
        Objects.equals(this.isDeleted, workItemModel.isDeleted) &&
        Objects.equals(this.projectId, workItemModel.projectId) &&
        Objects.equals(this.entityTypeName, workItemModel.entityTypeName) &&
        Objects.equals(this.isAutomated, workItemModel.isAutomated) &&
        equalsNullable(this.autoTests, workItemModel.autoTests) &&
        equalsNullable(this.attachments, workItemModel.attachments) &&
        equalsNullable(this.sectionPreconditionSteps, workItemModel.sectionPreconditionSteps) &&
        equalsNullable(this.sectionPostconditionSteps, workItemModel.sectionPostconditionSteps) &&
        Objects.equals(this.versionNumber, workItemModel.versionNumber) &&
        equalsNullable(this.iterations, workItemModel.iterations) &&
        equalsNullable(this.createdDate, workItemModel.createdDate) &&
        equalsNullable(this.modifiedDate, workItemModel.modifiedDate) &&
        Objects.equals(this.createdById, workItemModel.createdById) &&
        equalsNullable(this.modifiedById, workItemModel.modifiedById) &&
        Objects.equals(this.globalId, workItemModel.globalId) &&
        Objects.equals(this.id, workItemModel.id) &&
        Objects.equals(this.sectionId, workItemModel.sectionId) &&
        equalsNullable(this.description, workItemModel.description) &&
        Objects.equals(this.state, workItemModel.state) &&
        Objects.equals(this.priority, workItemModel.priority) &&
        Objects.equals(this.steps, workItemModel.steps) &&
        Objects.equals(this.preconditionSteps, workItemModel.preconditionSteps) &&
        Objects.equals(this.postconditionSteps, workItemModel.postconditionSteps) &&
        Objects.equals(this.duration, workItemModel.duration) &&
        Objects.equals(this.attributes, workItemModel.attributes) &&
        Objects.equals(this.tags, workItemModel.tags) &&
        Objects.equals(this.links, workItemModel.links) &&
        Objects.equals(this.name, workItemModel.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionId, medianDuration, isDeleted, projectId, entityTypeName, isAutomated, hashCodeNullable(autoTests), hashCodeNullable(attachments), hashCodeNullable(sectionPreconditionSteps), hashCodeNullable(sectionPostconditionSteps), versionNumber, hashCodeNullable(iterations), hashCodeNullable(createdDate), hashCodeNullable(modifiedDate), createdById, hashCodeNullable(modifiedById), globalId, id, sectionId, hashCodeNullable(description), state, priority, steps, preconditionSteps, postconditionSteps, duration, attributes, tags, links, name);
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
    sb.append("class WorkItemModel {\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
    sb.append("    medianDuration: ").append(toIndentedString(medianDuration)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    entityTypeName: ").append(toIndentedString(entityTypeName)).append("\n");
    sb.append("    isAutomated: ").append(toIndentedString(isAutomated)).append("\n");
    sb.append("    autoTests: ").append(toIndentedString(autoTests)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    sectionPreconditionSteps: ").append(toIndentedString(sectionPreconditionSteps)).append("\n");
    sb.append("    sectionPostconditionSteps: ").append(toIndentedString(sectionPostconditionSteps)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    iterations: ").append(toIndentedString(iterations)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    modifiedById: ").append(toIndentedString(modifiedById)).append("\n");
    sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    preconditionSteps: ").append(toIndentedString(preconditionSteps)).append("\n");
    sb.append("    postconditionSteps: ").append(toIndentedString(postconditionSteps)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

