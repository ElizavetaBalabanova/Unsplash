// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN", "IMPLICIT_NOTHING_TYPE_ARGUMENT_IN_RETURN_POSITION")

package com.intermedia.intermedia.`data`.common.model

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.`internal`.Util
import java.lang.NullPointerException
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.emptySet
import kotlin.text.buildString

public class LikesJsonAdapter(
  moshi: Moshi,
) : JsonAdapter<Likes>() {
  private val options: JsonReader.Options = JsonReader.Options.of("total", "historical")

  private val intAdapter: JsonAdapter<Int> = moshi.adapter(Int::class.java, emptySet(), "total")

  private val historicalAdapter: JsonAdapter<Historical> = moshi.adapter(Historical::class.java,
      emptySet(), "historical")

  public override fun toString(): String = buildString(27) {
      append("GeneratedJsonAdapter(").append("Likes").append(')') }

  public override fun fromJson(reader: JsonReader): Likes {
    var total: Int? = null
    var historical: Historical? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> total = intAdapter.fromJson(reader) ?: throw Util.unexpectedNull("total", "total",
            reader)
        1 -> historical = historicalAdapter.fromJson(reader) ?:
            throw Util.unexpectedNull("historical", "historical", reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return Likes(
        total = total ?: throw Util.missingProperty("total", "total", reader),
        historical = historical ?: throw Util.missingProperty("historical", "historical", reader)
    )
  }

  public override fun toJson(writer: JsonWriter, value_: Likes?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("total")
    intAdapter.toJson(writer, value_.total)
    writer.name("historical")
    historicalAdapter.toJson(writer, value_.historical)
    writer.endObject()
  }
}