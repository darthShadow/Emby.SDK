/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.5
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.ImageType;
import io.swagger.client.model.SyncModelItemFileType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SyncModelItemFileInfo
 */


public class SyncModelItemFileInfo {
  @SerializedName("Type")
  private SyncModelItemFileType type = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Path")
  private String path = null;

  @SerializedName("ImageType")
  private ImageType imageType = null;

  @SerializedName("Index")
  private Integer index = null;

  public SyncModelItemFileInfo type(SyncModelItemFileType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public SyncModelItemFileType getType() {
    return type;
  }

  public void setType(SyncModelItemFileType type) {
    this.type = type;
  }

  public SyncModelItemFileInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SyncModelItemFileInfo path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Schema(description = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public SyncModelItemFileInfo imageType(ImageType imageType) {
    this.imageType = imageType;
    return this;
  }

   /**
   * Get imageType
   * @return imageType
  **/
  @Schema(description = "")
  public ImageType getImageType() {
    return imageType;
  }

  public void setImageType(ImageType imageType) {
    this.imageType = imageType;
  }

  public SyncModelItemFileInfo index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @Schema(description = "")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncModelItemFileInfo syncModelItemFileInfo = (SyncModelItemFileInfo) o;
    return Objects.equals(this.type, syncModelItemFileInfo.type) &&
        Objects.equals(this.name, syncModelItemFileInfo.name) &&
        Objects.equals(this.path, syncModelItemFileInfo.path) &&
        Objects.equals(this.imageType, syncModelItemFileInfo.imageType) &&
        Objects.equals(this.index, syncModelItemFileInfo.index);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, path, imageType, index);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncModelItemFileInfo {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}