// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN", "IMPLICIT_NOTHING_TYPE_ARGUMENT_IN_RETURN_POSITION")

package com.intermedia.intermedia.`data`.photo.model

import com.intermedia.intermedia.`data`.collection.model.Collection
import com.intermedia.intermedia.`data`.common.model.PhotoStatistics
import com.intermedia.intermedia.`data`.user.model.User
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.`internal`.Util
import java.lang.NullPointerException
import java.lang.reflect.Constructor
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.emptySet
import kotlin.jvm.Volatile
import kotlin.text.buildString

public class PhotoJsonAdapter(
  moshi: Moshi,
) : JsonAdapter<Photo>() {
  private val options: JsonReader.Options = JsonReader.Options.of("id", "created_at", "updated_at",
      "width", "height", "color", "blur_hash", "views", "downloads", "likes", "liked_by_user",
      "description", "alt_description", "exif", "location", "tags", "current_user_collections",
      "sponsorship", "urls", "links", "user", "statistics")

  private val stringAdapter: JsonAdapter<String> = moshi.adapter(String::class.java, emptySet(),
      "id")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "created_at")

  private val nullableIntAdapter: JsonAdapter<Int?> = moshi.adapter(Int::class.javaObjectType,
      emptySet(), "width")

  private val nullableBooleanAdapter: JsonAdapter<Boolean?> =
      moshi.adapter(Boolean::class.javaObjectType, emptySet(), "liked_by_user")

  private val nullableExifAdapter: JsonAdapter<Exif?> = moshi.adapter(Exif::class.java, emptySet(),
      "exif")

  private val nullableLocationAdapter: JsonAdapter<Location?> = moshi.adapter(Location::class.java,
      emptySet(), "location")

  private val nullableListOfTagAdapter: JsonAdapter<List<Tag>?> =
      moshi.adapter(Types.newParameterizedType(List::class.java, Tag::class.java), emptySet(),
      "tags")

  private val nullableListOfCollectionAdapter: JsonAdapter<List<Collection>?> =
      moshi.adapter(Types.newParameterizedType(List::class.java, Collection::class.java),
      emptySet(), "current_user_collections")

  private val nullableSponsorshipAdapter: JsonAdapter<Sponsorship?> =
      moshi.adapter(Sponsorship::class.java, emptySet(), "sponsorship")

  private val urlsAdapter: JsonAdapter<Urls> = moshi.adapter(Urls::class.java, emptySet(), "urls")

  private val nullableLinksAdapter: JsonAdapter<Links?> = moshi.adapter(Links::class.java,
      emptySet(), "links")

  private val nullableUserAdapter: JsonAdapter<User?> = moshi.adapter(User::class.java, emptySet(),
      "user")

  private val nullablePhotoStatisticsAdapter: JsonAdapter<PhotoStatistics?> =
      moshi.adapter(PhotoStatistics::class.java, emptySet(), "statistics")

  @Volatile
  private var constructorRef: Constructor<Photo>? = null

  public override fun toString(): String = buildString(27) {
      append("GeneratedJsonAdapter(").append("Photo").append(')') }

  public override fun fromJson(reader: JsonReader): Photo {
    var id: String? = null
    var created_at: String? = null
    var updated_at: String? = null
    var width: Int? = null
    var height: Int? = null
    var color: String? = null
    var blur_hash: String? = null
    var views: Int? = null
    var downloads: Int? = null
    var likes: Int? = null
    var liked_by_user: Boolean? = null
    var description: String? = null
    var alt_description: String? = null
    var exif: Exif? = null
    var location: Location? = null
    var tags: List<Tag>? = null
    var current_user_collections: List<Collection>? = null
    var sponsorship: Sponsorship? = null
    var urls: Urls? = null
    var links: Links? = null
    var user: User? = null
    var statistics: PhotoStatistics? = null
    var mask0 = -1
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> id = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("id", "id", reader)
        1 -> created_at = nullableStringAdapter.fromJson(reader)
        2 -> updated_at = nullableStringAdapter.fromJson(reader)
        3 -> width = nullableIntAdapter.fromJson(reader)
        4 -> height = nullableIntAdapter.fromJson(reader)
        5 -> {
          color = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 5).inv()
          mask0 = mask0 and 0xffffffdf.toInt()
        }
        6 -> blur_hash = nullableStringAdapter.fromJson(reader)
        7 -> views = nullableIntAdapter.fromJson(reader)
        8 -> downloads = nullableIntAdapter.fromJson(reader)
        9 -> likes = nullableIntAdapter.fromJson(reader)
        10 -> liked_by_user = nullableBooleanAdapter.fromJson(reader)
        11 -> description = nullableStringAdapter.fromJson(reader)
        12 -> alt_description = nullableStringAdapter.fromJson(reader)
        13 -> exif = nullableExifAdapter.fromJson(reader)
        14 -> location = nullableLocationAdapter.fromJson(reader)
        15 -> tags = nullableListOfTagAdapter.fromJson(reader)
        16 -> current_user_collections = nullableListOfCollectionAdapter.fromJson(reader)
        17 -> sponsorship = nullableSponsorshipAdapter.fromJson(reader)
        18 -> urls = urlsAdapter.fromJson(reader) ?: throw Util.unexpectedNull("urls", "urls",
            reader)
        19 -> links = nullableLinksAdapter.fromJson(reader)
        20 -> user = nullableUserAdapter.fromJson(reader)
        21 -> statistics = nullablePhotoStatisticsAdapter.fromJson(reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    if (mask0 == 0xffffffdf.toInt()) {
      // All parameters with defaults are set, invoke the constructor directly
      return  Photo(
          id = id ?: throw Util.missingProperty("id", "id", reader),
          created_at = created_at,
          updated_at = updated_at,
          width = width,
          height = height,
          color = color,
          blur_hash = blur_hash,
          views = views,
          downloads = downloads,
          likes = likes,
          liked_by_user = liked_by_user,
          description = description,
          alt_description = alt_description,
          exif = exif,
          location = location,
          tags = tags,
          current_user_collections = current_user_collections,
          sponsorship = sponsorship,
          urls = urls ?: throw Util.missingProperty("urls", "urls", reader),
          links = links,
          user = user,
          statistics = statistics
      )
    } else {
      // Reflectively invoke the synthetic defaults constructor
      @Suppress("UNCHECKED_CAST")
      val localConstructor: Constructor<Photo> = this.constructorRef ?:
          Photo::class.java.getDeclaredConstructor(String::class.java, String::class.java,
          String::class.java, Int::class.javaObjectType, Int::class.javaObjectType,
          String::class.java, String::class.java, Int::class.javaObjectType,
          Int::class.javaObjectType, Int::class.javaObjectType, Boolean::class.javaObjectType,
          String::class.java, String::class.java, Exif::class.java, Location::class.java,
          List::class.java, List::class.java, Sponsorship::class.java, Urls::class.java,
          Links::class.java, User::class.java, PhotoStatistics::class.java,
          Int::class.javaPrimitiveType, Util.DEFAULT_CONSTRUCTOR_MARKER).also {
          this.constructorRef = it }
      return localConstructor.newInstance(
          id ?: throw Util.missingProperty("id", "id", reader),
          created_at,
          updated_at,
          width,
          height,
          color,
          blur_hash,
          views,
          downloads,
          likes,
          liked_by_user,
          description,
          alt_description,
          exif,
          location,
          tags,
          current_user_collections,
          sponsorship,
          urls ?: throw Util.missingProperty("urls", "urls", reader),
          links,
          user,
          statistics,
          mask0,
          /* DefaultConstructorMarker */ null
      )
    }
  }

  public override fun toJson(writer: JsonWriter, value_: Photo?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("id")
    stringAdapter.toJson(writer, value_.id)
    writer.name("created_at")
    nullableStringAdapter.toJson(writer, value_.created_at)
    writer.name("updated_at")
    nullableStringAdapter.toJson(writer, value_.updated_at)
    writer.name("width")
    nullableIntAdapter.toJson(writer, value_.width)
    writer.name("height")
    nullableIntAdapter.toJson(writer, value_.height)
    writer.name("color")
    nullableStringAdapter.toJson(writer, value_.color)
    writer.name("blur_hash")
    nullableStringAdapter.toJson(writer, value_.blur_hash)
    writer.name("views")
    nullableIntAdapter.toJson(writer, value_.views)
    writer.name("downloads")
    nullableIntAdapter.toJson(writer, value_.downloads)
    writer.name("likes")
    nullableIntAdapter.toJson(writer, value_.likes)
    writer.name("liked_by_user")
    nullableBooleanAdapter.toJson(writer, value_.liked_by_user)
    writer.name("description")
    nullableStringAdapter.toJson(writer, value_.description)
    writer.name("alt_description")
    nullableStringAdapter.toJson(writer, value_.alt_description)
    writer.name("exif")
    nullableExifAdapter.toJson(writer, value_.exif)
    writer.name("location")
    nullableLocationAdapter.toJson(writer, value_.location)
    writer.name("tags")
    nullableListOfTagAdapter.toJson(writer, value_.tags)
    writer.name("current_user_collections")
    nullableListOfCollectionAdapter.toJson(writer, value_.current_user_collections)
    writer.name("sponsorship")
    nullableSponsorshipAdapter.toJson(writer, value_.sponsorship)
    writer.name("urls")
    urlsAdapter.toJson(writer, value_.urls)
    writer.name("links")
    nullableLinksAdapter.toJson(writer, value_.links)
    writer.name("user")
    nullableUserAdapter.toJson(writer, value_.user)
    writer.name("statistics")
    nullablePhotoStatisticsAdapter.toJson(writer, value_.statistics)
    writer.endObject()
  }
}
