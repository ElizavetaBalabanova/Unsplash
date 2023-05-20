-if class com.intermedia.intermedia.data.photo.model.Tag
-keepnames class com.intermedia.intermedia.data.photo.model.Tag
-if class com.intermedia.intermedia.data.photo.model.Tag
-keep class com.intermedia.intermedia.data.photo.model.TagJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
