-if class com.intermedia.intermedia.data.user.model.User
-keepnames class com.intermedia.intermedia.data.user.model.User
-if class com.intermedia.intermedia.data.user.model.User
-keep class com.intermedia.intermedia.data.user.model.UserJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
