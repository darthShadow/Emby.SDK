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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * LiveTvLiveTvInfo
 */


public class LiveTvLiveTvInfo {
  @SerializedName("IsEnabled")
  private Boolean isEnabled = null;

  @SerializedName("EnabledUsers")
  private List<String> enabledUsers = null;

  public LiveTvLiveTvInfo isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Get isEnabled
   * @return isEnabled
  **/
  @Schema(description = "")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public LiveTvLiveTvInfo enabledUsers(List<String> enabledUsers) {
    this.enabledUsers = enabledUsers;
    return this;
  }

  public LiveTvLiveTvInfo addEnabledUsersItem(String enabledUsersItem) {
    if (this.enabledUsers == null) {
      this.enabledUsers = new ArrayList<String>();
    }
    this.enabledUsers.add(enabledUsersItem);
    return this;
  }

   /**
   * Get enabledUsers
   * @return enabledUsers
  **/
  @Schema(description = "")
  public List<String> getEnabledUsers() {
    return enabledUsers;
  }

  public void setEnabledUsers(List<String> enabledUsers) {
    this.enabledUsers = enabledUsers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveTvLiveTvInfo liveTvLiveTvInfo = (LiveTvLiveTvInfo) o;
    return Objects.equals(this.isEnabled, liveTvLiveTvInfo.isEnabled) &&
        Objects.equals(this.enabledUsers, liveTvLiveTvInfo.enabledUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled, enabledUsers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveTvLiveTvInfo {\n");
    
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    enabledUsers: ").append(toIndentedString(enabledUsers)).append("\n");
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