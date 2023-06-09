// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN", "IMPLICIT_NOTHING_TYPE_ARGUMENT_IN_RETURN_POSITION")

package com.intermedia.intermedia.`data`.user.model

import com.intermedia.intermedia.`data`.photo.model.Photo
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.`internal`.Util
import java.lang.NullPointerException
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.emptySet
import kotlin.text.buildString

public class MeJsonAdapter(
  moshi: Moshi,
) : JsonAdapter<Me>() {
  private val options: JsonReader.Options = JsonReader.Options.of("id", "updated_at", "username",
      "first_name", "last_name", "twitter_username", "portfolio_url", "bio", "location", "links",
      "profile_image", "instagram_username", "total_likes", "total_photos", "total_collections",
      "photos", "followed_by_user", "followers_count", "following_count", "downloads",
      "uploads_remaining", "email")

  private val stringAdapter: JsonAdapter<String> = moshi.adapter(String::class.java, emptySet(),
      "id")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "username")

  private val nullableLinksAdapter: JsonAdapter<Links?> = moshi.adapter(Links::class.java,
      emptySet(), "links")

  private val nullableProfileImageAdapter: JsonAdapter<ProfileImage?> =
      moshi.adapter(ProfileImage::class.java, emptySet(), "profile_image")

  private val nullableIntAdapter: JsonAdapter<Int?> = moshi.adapter(Int::class.javaObjectType,
      emptySet(), "total_likes")

  private val nullableListOfPhotoAdapter: JsonAdapter<List<Photo>?> =
      moshi.adapter(Types.newParameterizedType(List::class.java, Photo::class.java), emptySet(),
      "photos")

  private val nullableBooleanAdapter: JsonAdapter<Boolean?> =
      moshi.adapter(Boolean::class.javaObjectType, emptySet(), "followed_by_user")

  public override fun toString(): String = buildString(24) {
      append("GeneratedJsonAdapter(").append("Me").append(')') }

  public override fun fromJson(reader: JsonReader): Me {
    var id: String? = null
    var updated_at: String? = null
    var username: String? = null
    var first_name: String? = null
    var last_name: String? = null
    var twitter_username: String? = null
    var portfolio_url: String? = null
    var bio: String? = null
    var location: String? = null
    var links: Links? = null
    var profile_image: ProfileImage? = null
    var instagram_username: String? = null
    var total_likes: Int? = null
    var total_photos: Int? = null
    var total_collections: Int? = null
    var photos: List<Photo>? = null
    var followed_by_user: Boolean? = null
    var followers_count: Int? = null
    var following_count: Int? = null
    var downloads: Int? = null
    var uploads_remaining: Int? = null
    var email: String? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> id = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("id", "id", reader)
        1 -> updated_at = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("updated_at",
            "updated_at", reader)
        2 -> username = nullableStringAdapter.fromJson(reader)
        3 -> first_name = nullableStringAdapter.fromJson(reader)
        4 -> last_name = nullableStringAdapter.fromJson(reader)
        5 -> twitter_username = nullableStringAdapter.fromJson(reader)
        6 -> portfolio_url = nullableStringAdapter.fromJson(reader)
        7 -> bio = nullableStringAdapter.fromJson(reader)
        8 -> location = nullableStringAdapter.fromJson(reader)
        9 -> links = nullableLinksAdapter.fromJson(reader)
        10 -> profile_image = nullableProfileImageAdapter.fromJson(reader)
        11 -> instagram_username = nullableStringAdapter.fromJson(reader)
        12 -> total_likes = nullableIntAdapter.fromJson(reader)
        13 -> total_photos = nullableIntAdapter.fromJson(reader)
        14 -> total_collections = nullableIntAdapter.fromJson(reader)
        15 -> photos = nullableListOfPhotoAdapter.fromJson(reader)
        16 -> followed_by_user = nullableBooleanAdapter.fromJson(reader)
        17 -> followers_count = nullableIntAdapter.fromJson(reader)
        18 -> following_count = nullableIntAdapter.fromJson(reader)
        19 -> downloads = nullableIntAdapter.fromJson(reader)
        20 -> uploads_remaining = nullableIntAdapter.fromJson(reader)
        21 -> email = nullableStringAdapter.fromJson(reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return Me(
        id = id ?: throw Util.missingProperty("id", "id", reader),
        updated_at = updated_at ?: throw Util.missingProperty("updated_at", "updated_at", reader),
        username = username,
        first_name = first_name,
        last_name = last_name,
        twitter_username = twitter_username,
        portfolio_url = portfolio_url,
        bio = bio,
        location = location,
        links = links,
        profile_image = profile_image,
        instagram_username = instagram_username,
        total_likes = total_likes,
        total_photos = total_photos,
        total_collections = total_collections,
        photos = photos,
        followed_by_user = followed_by_user,
        followers_count = followers_count,
        following_count = following_count,
        downloads = downloads,
        uploads_remaining = uploads_remaining,
        email = email
    )
  }

  public override fun toJson(writer: JsonWriter, value_: Me?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("id")
    stringAdapter.toJson(writer, value_.id)
    writer.name("updated_at")
    stringAdapter.toJson(writer, value_.updated_at)
    writer.name("username")
    nullableStringAdapter.toJson(writer, value_.username)
    writer.name("first_name")
    nullableStringAdapter.toJson(writer, value_.first_name)
    writer.name("last_name")
    nullableStringAdapter.toJson(writer, value_.last_name)
    writer.name("twitter_username")
    nullableStringAdapter.toJson(writer, value_.twitter_username)
    writer.name("portfolio_url")
    nullableStringAdapter.toJson(writer, value_.portfolio_url)
    writer.name("bio")
    nullableStringAdapter.toJson(writer, value_.bio)
    writer.name("location")
    nullableStringAdapter.toJson(writer, value_.location)
    writer.name("links")
    nullableLinksAdapter.toJson(writer, value_.links)
    writer.name("profile_image")
    nullableProfileImageAdapter.toJson(writer, value_.profile_image)
    writer.name("instagram_username")
    nullableStringAdapter.toJson(writer, value_.instagram_username)
    writer.name("total_likes")
    nullableIntAdapter.toJson(writer, value_.total_likes)
    writer.name("total_photos")
    nullableIntAdapter.toJson(writer, value_.total_photos)
    writer.name("total_collections")
    nullableIntAdapter.toJson(writer, value_.total_collections)
    writer.name("photos")
    nullableListOfPhotoAdapter.toJson(writer, value_.photos)
    writer.name("followed_by_user")
    nullableBooleanAdapter.toJson(writer, value_.followed_by_user)
    writer.name("followers_count")
    nullableIntAdapter.toJson(writer, value_.followers_count)
    writer.name("following_count")
    nullableIntAdapter.toJson(writer, value_.following_count)
    writer.name("downloads")
    nullableIntAdapter.toJson(writer, value_.downloads)
    writer.name("uploads_remaining")
    nullableIntAdapter.toJson(writer, value_.uploads_remaining)
    writer.name("email")
    nullableStringAdapter.toJson(writer, value_.email)
    writer.endObject()
  }
}
