-if class com.intermedia.intermedia.data.collection.model.Collection
-keepnames class com.intermedia.intermedia.data.collection.model.Collection
-if class com.intermedia.intermedia.data.collection.model.Collection
-keep class com.intermedia.intermedia.data.collection.model.CollectionJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
