package com.intermedia.intermedia.data.autowallpaper;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.intermedia.intermedia.data.autowallpaper.model.AutoWallpaperCollection;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AutoWallpaperCollectionDao_Impl implements AutoWallpaperCollectionDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<AutoWallpaperCollection> __insertionAdapterOfAutoWallpaperCollection;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public AutoWallpaperCollectionDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAutoWallpaperCollection = new EntityInsertionAdapter<AutoWallpaperCollection>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `auto_wallpaper_collections` (`id`,`title`,`user_name`,`cover_photo`,`date_added`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AutoWallpaperCollection value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getUser_name() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUser_name());
        }
        if (value.getCover_photo() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCover_photo());
        }
        if (value.getDate_added() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getDate_added());
        }
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM auto_wallpaper_collections WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final AutoWallpaperCollection collection,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfAutoWallpaperCollection.insert(collection);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final String id, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
        int _argIndex = 1;
        if (id == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, id);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDelete.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<AutoWallpaperCollection>> getSelectedAutoWallpaperCollections() {
    final String _sql = "SELECT * FROM auto_wallpaper_collections ORDER BY date_added DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"auto_wallpaper_collections"}, false, new Callable<List<AutoWallpaperCollection>>() {
      @Override
      public List<AutoWallpaperCollection> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfUserName = CursorUtil.getColumnIndexOrThrow(_cursor, "user_name");
          final int _cursorIndexOfCoverPhoto = CursorUtil.getColumnIndexOrThrow(_cursor, "cover_photo");
          final int _cursorIndexOfDateAdded = CursorUtil.getColumnIndexOrThrow(_cursor, "date_added");
          final List<AutoWallpaperCollection> _result = new ArrayList<AutoWallpaperCollection>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final AutoWallpaperCollection _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpUser_name;
            if (_cursor.isNull(_cursorIndexOfUserName)) {
              _tmpUser_name = null;
            } else {
              _tmpUser_name = _cursor.getString(_cursorIndexOfUserName);
            }
            final String _tmpCover_photo;
            if (_cursor.isNull(_cursorIndexOfCoverPhoto)) {
              _tmpCover_photo = null;
            } else {
              _tmpCover_photo = _cursor.getString(_cursorIndexOfCoverPhoto);
            }
            final Long _tmpDate_added;
            if (_cursor.isNull(_cursorIndexOfDateAdded)) {
              _tmpDate_added = null;
            } else {
              _tmpDate_added = _cursor.getLong(_cursorIndexOfDateAdded);
            }
            _item = new AutoWallpaperCollection(_tmpId,_tmpTitle,_tmpUser_name,_tmpCover_photo,_tmpDate_added);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<String>> getSelectedAutoWallpaperCollectionIds() {
    final String _sql = "SELECT id FROM auto_wallpaper_collections";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"auto_wallpaper_collections"}, false, new Callable<List<String>>() {
      @Override
      public List<String> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final List<String> _result = new ArrayList<String>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final String _item;
            if (_cursor.isNull(0)) {
              _item = null;
            } else {
              _item = _cursor.getString(0);
            }
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getRandomAutoWallpaperCollectionId(final int offset,
      final Continuation<? super String> continuation) {
    final String _sql = "SELECT id FROM auto_wallpaper_collections LIMIT 1 OFFSET ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, offset);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<String>() {
      @Override
      public String call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final String _result;
          if(_cursor.moveToFirst()) {
            if (_cursor.isNull(0)) {
              _result = null;
            } else {
              _result = _cursor.getString(0);
            }
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object getNumberOfAutoWallpaperCollections(
      final Continuation<? super Integer> continuation) {
    final String _sql = "SELECT COUNT(*) FROM auto_wallpaper_collections";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<Integer> getNumberOfAutoWallpaperCollectionsLiveData() {
    final String _sql = "SELECT COUNT(*) FROM auto_wallpaper_collections";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"auto_wallpaper_collections"}, false, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<Integer> getCountById(final String id) {
    final String _sql = "SELECT COUNT(*) FROM auto_wallpaper_collections WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"auto_wallpaper_collections"}, false, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public AutoWallpaperCollection getAutoWallpaperCollection(final String id) {
    final String _sql = "SELECT * FROM auto_wallpaper_collections WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfUserName = CursorUtil.getColumnIndexOrThrow(_cursor, "user_name");
      final int _cursorIndexOfCoverPhoto = CursorUtil.getColumnIndexOrThrow(_cursor, "cover_photo");
      final int _cursorIndexOfDateAdded = CursorUtil.getColumnIndexOrThrow(_cursor, "date_added");
      final AutoWallpaperCollection _result;
      if(_cursor.moveToFirst()) {
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpUser_name;
        if (_cursor.isNull(_cursorIndexOfUserName)) {
          _tmpUser_name = null;
        } else {
          _tmpUser_name = _cursor.getString(_cursorIndexOfUserName);
        }
        final String _tmpCover_photo;
        if (_cursor.isNull(_cursorIndexOfCoverPhoto)) {
          _tmpCover_photo = null;
        } else {
          _tmpCover_photo = _cursor.getString(_cursorIndexOfCoverPhoto);
        }
        final Long _tmpDate_added;
        if (_cursor.isNull(_cursorIndexOfDateAdded)) {
          _tmpDate_added = null;
        } else {
          _tmpDate_added = _cursor.getLong(_cursorIndexOfDateAdded);
        }
        _result = new AutoWallpaperCollection(_tmpId,_tmpTitle,_tmpUser_name,_tmpCover_photo,_tmpDate_added);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
