-if class com.intermedia.intermedia.data.common.model.Historical
-keepnames class com.intermedia.intermedia.data.common.model.Historical
-if class com.intermedia.intermedia.data.common.model.Historical
-keep class com.intermedia.intermedia.data.common.model.HistoricalJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
