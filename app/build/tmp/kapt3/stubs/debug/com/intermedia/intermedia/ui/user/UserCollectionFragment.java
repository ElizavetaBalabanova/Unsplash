package com.intermedia.intermedia.ui.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\"\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/intermedia/intermedia/ui/user/UserCollectionFragment;", "Lcom/intermedia/intermedia/ui/collection/CollectionFragment;", "()V", "pagedListAdapter", "Lcom/intermedia/intermedia/ui/collection/CollectionAdapter;", "getPagedListAdapter", "()Lcom/intermedia/intermedia/ui/collection/CollectionAdapter;", "sharedViewModel", "Lcom/intermedia/intermedia/ui/user/UserViewModel;", "getSharedViewModel", "()Lcom/intermedia/intermedia/ui/user/UserViewModel;", "sharedViewModel$delegate", "Lkotlin/Lazy;", "observeEvents", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "Companion", "app_debug"})
public final class UserCollectionFragment extends com.intermedia.intermedia.ui.collection.CollectionFragment {
    private final kotlin.Lazy sharedViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final com.intermedia.intermedia.ui.collection.CollectionAdapter pagedListAdapter = null;
    @org.jetbrains.annotations.NotNull
    public static final com.intermedia.intermedia.ui.user.UserCollectionFragment.Companion Companion = null;
    public static final int RESULT_CODE_USER_COLLECTION_UPDATE = 0;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_USER_COLLECTION_DELETE_FLAG = "extra_user_collection_delete_flag";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_USER_COLLECTION_MODIFY_FLAG = "extra_user_collection_modify_flag";
    
    public UserCollectionFragment() {
        super();
    }
    
    private final com.intermedia.intermedia.ui.user.UserViewModel getSharedViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.intermedia.intermedia.ui.collection.CollectionAdapter getPagedListAdapter() {
        return null;
    }
    
    @java.lang.Override
    public void observeEvents() {
    }
    
    @java.lang.Override
    @java.lang.Deprecated
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/intermedia/intermedia/ui/user/UserCollectionFragment$Companion;", "", "()V", "EXTRA_USER_COLLECTION_DELETE_FLAG", "", "EXTRA_USER_COLLECTION_MODIFY_FLAG", "RESULT_CODE_USER_COLLECTION_UPDATE", "", "newInstance", "Lcom/intermedia/intermedia/ui/user/UserCollectionFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.intermedia.intermedia.ui.user.UserCollectionFragment newInstance() {
            return null;
        }
    }
}