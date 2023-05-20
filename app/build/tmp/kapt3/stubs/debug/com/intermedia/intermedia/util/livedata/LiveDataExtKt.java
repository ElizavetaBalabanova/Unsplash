package com.intermedia.intermedia.util.livedata;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u00006\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a2\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0005\u001aD\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u0001H\t\u0012\u0006\u0012\u0004\u0018\u0001H\n0\b0\u0007\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n*\n\u0012\u0006\u0012\u0004\u0018\u0001H\t0\u00072\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\n0\u0007\u001a@\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\t*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\u000e0\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0014\b\u0004\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\r0\u0005H\u0086\b\u00f8\u0001\u0000\u001a@\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\t0\u0013\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0014\b\u0004\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\r0\u0005H\u0086\b\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0015"}, d2 = {"lazyMap", "", "K", "V", "initializer", "Lkotlin/Function1;", "combineWith", "Landroidx/lifecycle/LiveData;", "Lkotlin/Pair;", "T", "S", "other", "observeEvent", "", "Lcom/intermedia/intermedia/util/livedata/Event;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onEventUnhandledContent", "observeOnce", "Landroidx/lifecycle/Observer;", "onChanged", "app_debug"})
public final class LiveDataExtKt {
    
    public static final <T extends java.lang.Object>void observeEvent(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<com.intermedia.intermedia.util.livedata.Event<T>> $this$observeEvent, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onEventUnhandledContent) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Object>androidx.lifecycle.Observer<T> observeOnce(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<T> $this$observeOnce, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onChanged) {
        return null;
    }
    
    /**
     * Example usage:
     *
     *   private val contactsLiveData: Map<Parameters, LiveData<Contacts>> = lazyMap { parameters ->
     *       val liveData = MutableLiveData<Contacts>()
     *       getContactsUseCase.loadContacts(parameters) { liveData.value = it }
     *       return@lazyMap liveData
     *   }
     *
     *   fun contacts(parameters: Parameters): LiveData<Contacts> = contactsLiveData.getValue(parameters)
     */
    @org.jetbrains.annotations.NotNull
    public static final <K extends java.lang.Object, V extends java.lang.Object>java.util.Map<K, V> lazyMap(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super K, ? extends V> initializer) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Object, S extends java.lang.Object>androidx.lifecycle.LiveData<kotlin.Pair<T, S>> combineWith(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<T> $this$combineWith, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<S> other) {
        return null;
    }
}