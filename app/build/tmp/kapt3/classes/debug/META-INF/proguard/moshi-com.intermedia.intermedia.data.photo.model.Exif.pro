-if class com.intermedia.intermedia.data.photo.model.Exif
-keepnames class com.intermedia.intermedia.data.photo.model.Exif
-if class com.intermedia.intermedia.data.photo.model.Exif
-keep class com.intermedia.intermedia.data.photo.model.ExifJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
