/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.5
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets Updates.PackageTargetSystem
 */
@JsonAdapter(UpdatesPackageTargetSystem.Adapter.class)
public enum UpdatesPackageTargetSystem {
  SERVER("Server"),
  MBTHEATER("MBTheater"),
  MBCLASSIC("MBClassic"),
  OTHER("Other");

  private String value;

  UpdatesPackageTargetSystem(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UpdatesPackageTargetSystem fromValue(String input) {
    for (UpdatesPackageTargetSystem b : UpdatesPackageTargetSystem.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<UpdatesPackageTargetSystem> {
    @Override
    public void write(final JsonWriter jsonWriter, final UpdatesPackageTargetSystem enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public UpdatesPackageTargetSystem read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return UpdatesPackageTargetSystem.fromValue((String)(value));
    }
  }
}