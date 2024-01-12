package org.encetech.web.schema;

import java.lang.reflect.Field;
import java.util.Objects;

public class SObject {
  public String id;
  public String name;
  public String label;
  public String keyPrefix;
  public String labelPlural;
  public String custom;
  public String customSetting;
  public String deploymentStatus;
  public String sharingModel;
  public String fieldName;
  public String nameFieldLabel;
  public String keyPrefixField;
  public String labelField;
  public String pluralLabelField;
  public String sharingModelField;
  public String deploymentStatusField;
  public String customSettingField;
  public String customField;
  public String nameFieldRelationshipName;
  public String nameFieldRelationshipLabel;
  public String nameFieldRelationshipCustom;
  public String nameFieldRelationshipCustomSetting;
  public String nameFieldRelationshipDeploymentStatus;
  public String nameFieldRelationshipSharingModel;

  public SObject() {}

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public String getKeyPrefix() {
    return keyPrefix;
  }

  public void setKeyPrefix(String keyPrefix) {
    this.keyPrefix = keyPrefix;
  }

  public String getLabelPlural() {
    return labelPlural;
  }

  public void setLabelPlural(String labelPlural) {
    this.labelPlural = labelPlural;
  }

  public String getCustom() {
    return custom;
  }

  public void setCustom(String custom) {
    this.custom = custom;
  }

  public String getCustomSetting() {
    return customSetting;
  }

  public void setCustomSetting(String customSetting) {
    this.customSetting = customSetting;
  }

  public String getDeploymentStatus() {
    return deploymentStatus;
  }

  public void setDeploymentStatus(String deploymentStatus) {
    this.deploymentStatus = deploymentStatus;
  }

  public String getSharingModel() {
    return sharingModel;
  }

  public void setSharingModel(String sharingModel) {
    this.sharingModel = sharingModel;
  }

  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public String getNameFieldLabel() {
    return nameFieldLabel;
  }

  public void setNameFieldLabel(String nameFieldLabel) {
    this.nameFieldLabel = nameFieldLabel;
  }

  public String getKeyPrefixField() {
    return keyPrefixField;
  }

  public void setKeyPrefixField(String keyPrefixField) {
    this.keyPrefixField = keyPrefixField;
  }

  public String getLabelField() {
    return labelField;
  }

  public void setLabelField(String labelField) {
    this.labelField = labelField;
  }

  public String getPluralLabelField() {
    return pluralLabelField;
  }

  public void setPluralLabelField(String pluralLabelField) {
    this.pluralLabelField = pluralLabelField;
  }

  public String getSharingModelField() {
    return sharingModelField;
  }

  public void setSharingModelField(String sharingModelField) {
    this.sharingModelField = sharingModelField;
  }

  public String getDeploymentStatusField() {
    return deploymentStatusField;
  }

  public void setDeploymentStatusField(String deploymentStatusField) {
    this.deploymentStatusField = deploymentStatusField;
  }

  public String getCustomSettingField() {
    return customSettingField;
  }

  public void setCustomSettingField(String customSettingField) {
    this.customSettingField = customSettingField;
  }

  public String getCustomField() {
    return customField;
  }

  public void setCustomField(String customField) {
    this.customField = customField;
  }

  public String getNameFieldRelationshipName() {
    return nameFieldRelationshipName;
  }

  public void setNameFieldRelationshipName(String nameFieldRelationshipName) {
    this.nameFieldRelationshipName = nameFieldRelationshipName;
  }

  public String getNameFieldRelationshipLabel() {
    return nameFieldRelationshipLabel;
  }

  public void setNameFieldRelationshipLabel(String nameFieldRelationshipLabel) {
    this.nameFieldRelationshipLabel = nameFieldRelationshipLabel;
  }

  public String getNameFieldRelationshipCustom() {
    return nameFieldRelationshipCustom;
  }

  public void setNameFieldRelationshipCustom(
    String nameFieldRelationshipCustom
  ) {
    this.nameFieldRelationshipCustom = nameFieldRelationshipCustom;
  }

  public String getNameFieldRelationshipCustomSetting() {
    return nameFieldRelationshipCustomSetting;
  }

  public void setNameFieldRelationshipCustomSetting(
    String nameFieldRelationshipCustomSetting
  ) {
    this.nameFieldRelationshipCustomSetting =
      nameFieldRelationshipCustomSetting;
  }

  public String getNameFieldRelationshipDeploymentStatus() {
    return nameFieldRelationshipDeploymentStatus;
  }

  public void setNameFieldRelationshipDeploymentStatus(
    String nameFieldRelationshipDeploymentStatus
  ) {
    this.nameFieldRelationshipDeploymentStatus =
      nameFieldRelationshipDeploymentStatus;
  }

  public String getNameFieldRelationshipSharingModel() {
    return nameFieldRelationshipSharingModel;
  }

  public void setNameFieldRelationshipSharingModel(
    String nameFieldRelationshipSharingModel
  ) {
    this.nameFieldRelationshipSharingModel = nameFieldRelationshipSharingModel;
  }

  public SObject(
    String id,
    String name,
    String label,
    String keyPrefix,
    String labelPlural,
    String custom,
    String customSetting,
    String deploymentStatus,
    String sharingModel,
    String fieldName,
    String nameFieldLabel,
    String keyPrefixField,
    String labelField,
    String pluralLabelField,
    String sharingModelField,
    String deploymentStatusField,
    String customSettingField,
    String customField,
    String nameFieldRelationshipName,
    String nameFieldRelationshipLabel,
    String nameFieldRelationshipCustom,
    String nameFieldRelationshipCustomSetting,
    String nameFieldRelationshipDeploymentStatus,
    String nameFieldRelationshipSharingModel
  ) {
    this.id = id;
    this.name = name;
    this.label = label;
    this.keyPrefix = keyPrefix;
    this.labelPlural = labelPlural;
    this.custom = custom;
    this.customSetting = customSetting;
    this.deploymentStatus = deploymentStatus;
    this.sharingModel = sharingModel;
    this.fieldName = fieldName;
    this.nameFieldLabel = nameFieldLabel;
    this.keyPrefixField = keyPrefixField;
    this.labelField = labelField;
    this.pluralLabelField = pluralLabelField;
    this.sharingModelField = sharingModelField;
    this.deploymentStatusField = deploymentStatusField;
    this.customSettingField = customSettingField;
    this.customField = customField;
    this.nameFieldRelationshipName = nameFieldRelationshipName;
    this.nameFieldRelationshipLabel = nameFieldRelationshipLabel;
    this.nameFieldRelationshipCustom = nameFieldRelationshipCustom;
    this.nameFieldRelationshipCustomSetting =
      nameFieldRelationshipCustomSetting;
    this.nameFieldRelationshipDeploymentStatus =
      nameFieldRelationshipDeploymentStatus;
    this.nameFieldRelationshipSharingModel = nameFieldRelationshipSharingModel;
  }

  public SObject clone() {
    SObject sObject = new SObject();
    sObject.id = this.id;
    sObject.name = this.name;
    sObject.label = this.label;
    sObject.keyPrefix = this.keyPrefix;
    sObject.labelPlural = this.labelPlural;
    sObject.custom = this.custom;
    sObject.customSetting = this.customSetting;
    sObject.deploymentStatus = this.deploymentStatus;
    sObject.sharingModel = this.sharingModel;
    sObject.fieldName = this.fieldName;
    sObject.nameFieldLabel = this.nameFieldLabel;
    sObject.keyPrefixField = this.keyPrefixField;
    sObject.labelField = this.labelField;
    sObject.pluralLabelField = this.pluralLabelField;
    sObject.sharingModelField = this.sharingModelField;
    sObject.deploymentStatusField = this.deploymentStatusField;
    sObject.customSettingField = this.customSettingField;
    sObject.customField = this.customField;
    sObject.nameFieldRelationshipName = this.nameFieldRelationshipName;
    sObject.nameFieldRelationshipLabel = this.nameFieldRelationshipLabel;
    sObject.nameFieldRelationshipCustom = this.nameFieldRelationshipCustom;
    sObject.nameFieldRelationshipCustomSetting =
      this.nameFieldRelationshipCustomSetting;
    sObject.nameFieldRelationshipDeploymentStatus =
      this.nameFieldRelationshipDeploymentStatus;
    sObject.nameFieldRelationshipSharingModel =
      this.nameFieldRelationshipSharingModel;
    return sObject;
  }

  public Boolean equals(SObject sObject) {
    if (this == sObject) return true;
    if (sObject == null) return false;
    for (Field field : this.getClass().getDeclaredFields()) {
      field.setAccessible(true);
      try {
        Object thisValue = field.get(this);
        Object sObjectValue = field.get(sObject);
        if (
          !(
            thisValue == null
              ? sObjectValue == null
              : thisValue.equals(sObjectValue)
          )
        ) {
          return false;
        }
      } catch (IllegalAccessException e) {
        throw new RuntimeException("Error while comparing object fields", e);
      }
    }
    return true;
  }

  public Object get(String fieldName) {
    if (Objects.equals(this.fieldName, fieldName)) {
      return this.fieldName;
    } else {
      return null;
    }
  }

  public void put(String fieldName, String value) {
    if (Objects.equals(this.fieldName, fieldName)) {
      this.fieldName = value;
    }
  }

  public String toString() {
    return (
      this.id +
      this.name +
      this.label +
      this.keyPrefix +
      this.labelPlural +
      this.custom +
      this.customSetting +
      this.deploymentStatus +
      this.sharingModel +
      this.fieldName +
      this.nameFieldLabel +
      this.keyPrefixField +
      this.labelField +
      this.pluralLabelField +
      this.sharingModelField +
      this.deploymentStatusField +
      this.customSettingField +
      this.customField +
      this.nameFieldRelationshipName +
      this.nameFieldRelationshipLabel +
      this.nameFieldRelationshipCustom +
      this.nameFieldRelationshipCustomSetting +
      this.nameFieldRelationshipDeploymentStatus +
      this.nameFieldRelationshipSharingModel
    );
  }

  public void clear() {
    this.id = null;
    this.name = null;
    this.label = null;
    this.keyPrefix = null;
    this.labelPlural = null;
    this.custom = null;
    this.customSetting = null;
    this.deploymentStatus = null;
    this.sharingModel = null;
    this.fieldName = null;
    this.nameFieldLabel = null;
    this.keyPrefixField = null;
    this.labelField = null;
    this.pluralLabelField = null;
    this.sharingModelField = null;
    this.deploymentStatusField = null;
    this.customSettingField = null;
    this.customField = null;
    this.nameFieldRelationshipName = null;
    this.nameFieldRelationshipLabel = null;
    this.nameFieldRelationshipCustom = null;
    this.nameFieldRelationshipCustomSetting = null;
    this.nameFieldRelationshipDeploymentStatus = null;
    this.nameFieldRelationshipSharingModel = null;
  }
}
