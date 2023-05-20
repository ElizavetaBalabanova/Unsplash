-if class com.intermedia.intermedia.data.common.model.Value
-keepnames class com.intermedia.intermedia.data.common.model.Value
-if class com.intermedia.intermedia.data.common.model.Value
-keep class com.intermedia.intermedia.data.common.model.ValueJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
