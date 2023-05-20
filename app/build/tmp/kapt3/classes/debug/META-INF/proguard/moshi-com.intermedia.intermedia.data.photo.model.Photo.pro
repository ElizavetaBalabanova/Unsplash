-if class com.intermedia.intermedia.data.photo.model.Photo
-keepnames class com.intermedia.intermedia.data.photo.model.Photo
-if class com.intermedia.intermedia.data.photo.model.Photo
-keep class com.intermedia.intermedia.data.photo.model.PhotoJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.intermedia.intermedia.data.photo.model.Photo
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.intermedia.intermedia.data.photo.model.Photo
-keepclassmembers class com.intermedia.intermedia.data.photo.model.Photo {
    public synthetic <init>(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer,java.lang.Integer,java.lang.String,java.lang.String,java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Boolean,java.lang.String,java.lang.String,com.intermedia.intermedia.data.photo.model.Exif,com.intermedia.intermedia.data.photo.model.Location,java.util.List,java.util.List,com.intermedia.intermedia.data.photo.model.Sponsorship,com.intermedia.intermedia.data.photo.model.Urls,com.intermedia.intermedia.data.photo.model.Links,com.intermedia.intermedia.data.user.model.User,com.intermedia.intermedia.data.common.model.PhotoStatistics,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
