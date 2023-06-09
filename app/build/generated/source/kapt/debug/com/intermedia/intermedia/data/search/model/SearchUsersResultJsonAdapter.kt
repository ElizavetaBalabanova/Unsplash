// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN", "IMPLICIT_NOTHING_TYPE_ARGUMENT_IN_RETURN_POSITION")

package com.intermedia.intermedia.`data`.search.model

import com.intermedia.intermedia.`data`.user.model.User
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.`internal`.Util
import java.lang.NullPointerException
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.emptySet
import kotlin.text.buildString

public class SearchUsersResultJsonAdapter(
  moshi: Moshi,
) : JsonAdapter<SearchUsersResult>() {
  private val options: JsonReader.Options = JsonReader.Options.of("total", "total_pages", "results")

  private val intAdapter: JsonAdapter<Int> = moshi.adapter(Int::class.java, emptySet(), "total")

  private val listOfUserAdapter: JsonAdapter<List<User>> =
      moshi.adapter(Types.newParameterizedType(List::class.java, User::class.java), emptySet(),
      "results")

  public override fun toString(): String = buildString(39) {
      append("GeneratedJsonAdapter(").append("SearchUsersResult").append(')') }

  public override fun fromJson(reader: JsonReader): SearchUsersResult {
    var total: Int? = null
    var total_pages: Int? = null
    var results: List<User>? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> total = intAdapter.fromJson(reader) ?: throw Util.unexpectedNull("total", "total",
            reader)
        1 -> total_pages = intAdapter.fromJson(reader) ?: throw Util.unexpectedNull("total_pages",
            "total_pages", reader)
        2 -> results = listOfUserAdapter.fromJson(reader) ?: throw Util.unexpectedNull("results",
            "results", reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return SearchUsersResult(
        total = total ?: throw Util.missingProperty("total", "total", reader),
        total_pages = total_pages ?: throw Util.missingProperty("total_pages", "total_pages",
            reader),
        results = results ?: throw Util.missingProperty("results", "results", reader)
    )
  }

  public override fun toJson(writer: JsonWriter, value_: SearchUsersResult?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("total")
    intAdapter.toJson(writer, value_.total)
    writer.name("total_pages")
    intAdapter.toJson(writer, value_.total_pages)
    writer.name("results")
    listOfUserAdapter.toJson(writer, value_.results)
    writer.endObject()
  }
}
