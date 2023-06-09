package com.intermedia.intermedia.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJC\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u00a2\u0006\u0002\u0010\u0018J6\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u0016\u001a\u00020\u0017J$\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001b2\b\b\u0002\u0010 \u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\u0005H\u0002J\u0018\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u001dH\u0002J\u0010\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u0005H\u0002J \u0010\'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J \u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J\u0010\u0010*\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u001dH\u0002J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u001dH\u0002J\u0010\u0010,\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u0005H\u0002J4\u0010-\u001a\u00020.*\u00020\u00062\u0006\u0010(\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/intermedia/intermedia/util/BlurHashDecoder;", "", "()V", "cacheCosinesX", "Ljava/util/HashMap;", "", "", "cacheCosinesY", "charMap", "", "", "clearCache", "", "composeBitmap", "Landroid/graphics/Bitmap;", "width", "height", "numCompX", "numCompY", "colors", "", "", "useCache", "", "(IIII[[FZ)Landroid/graphics/Bitmap;", "decode", "blurHash", "", "punch", "", "decode83", "str", "from", "to", "decodeAc", "value", "maxAc", "decodeDc", "colorEnc", "getArrayForCosinesX", "calculate", "getArrayForCosinesY", "linearToSrgb", "signedPow2", "srgbToLinear", "getCos", "", "x", "numComp", "y", "size", "app_debug"})
public final class BlurHashDecoder {
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.util.BlurHashDecoder INSTANCE = null;
    private static final java.util.HashMap<java.lang.Integer, double[]> cacheCosinesX = null;
    private static final java.util.HashMap<java.lang.Integer, double[]> cacheCosinesY = null;
    private static final java.util.Map<java.lang.Character, java.lang.Integer> charMap = null;
    
    private BlurHashDecoder() {
        super();
    }
    
    /**
     * Clear calculations stored in memory cache.
     * The cache is not big, but will increase when many image sizes are used,
     * if the app needs memory it is recommended to clear it.
     */
    public final void clearCache() {
    }
    
    /**
     * Decode a blur hash into a new bitmap.
     *
     * @param useCache use in memory cache for the calculated math, reused by images with same size.
     *                if the cache does not exist yet it will be created and populated with new
     *                calculations. By default it is true.
     */
    @org.jetbrains.annotations.Nullable
    public final android.graphics.Bitmap decode(@org.jetbrains.annotations.Nullable
    java.lang.String blurHash, int width, int height, float punch, boolean useCache) {
        return null;
    }
    
    private final int decode83(java.lang.String str, int from, int to) {
        return 0;
    }
    
    private final float[] decodeDc(int colorEnc) {
        return null;
    }
    
    private final float srgbToLinear(int colorEnc) {
        return 0.0F;
    }
    
    private final float[] decodeAc(int value, float maxAc) {
        return null;
    }
    
    private final float signedPow2(float value) {
        return 0.0F;
    }
    
    private final android.graphics.Bitmap composeBitmap(int width, int height, int numCompX, int numCompY, float[][] colors, boolean useCache) {
        return null;
    }
    
    private final double[] getArrayForCosinesY(boolean calculate, int height, int numCompY) {
        return null;
    }
    
    private final double[] getArrayForCosinesX(boolean calculate, int width, int numCompX) {
        return null;
    }
    
    private final double getCos(double[] $this$getCos, boolean calculate, int x, int numComp, int y, int size) {
        return 0.0;
    }
    
    private final int linearToSrgb(float value) {
        return 0;
    }
}