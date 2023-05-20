package com.intermedia.intermedia.data.autowallpaper;

import android.database.Cursor;
import androidx.paging.DataSource;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetDataSource;
import androidx.room.util.CursorUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.intermedia.intermedia.data.autowallpaper.model.AutoWallpaperHistory;
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
public final class AutoWallpaperHistoryDao_Impl implements AutoWallpaperHistoryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<AutoWallpaperHistory> __insertionAdapterOfAutoWallpaperHistory;

  private final EntityDeletionOrUpdateAdapter<AutoWallpaperHistory> __deletionAdapterOfAutoWallpaperHistory;

  private final EntityDeletionOrUpdateAdapter<AutoWallpaperHistory> __updateAdapterOfAutoWallpaperHistory;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllAutoWallpaperHistory;

  private final SharedSQLiteStatement __preparedStmtOfDeleteOldAutoWallpaperHistory;

  public AutoWallpaperHistoryDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAutoWallpaperHistory = new EntityInsertionAdapter<AutoWallpaperHistory>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `auto_wallpaper_history` (`photo_id`,`username`,`name`,`profile_picture`,`thumbnail_url`,`width`,`height`,`color`,`date`,`id`) VALUES (?,?,?,?,?,?,?,?,?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AutoWallpaperHistory value) {
        if (value.getPhoto_id() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getPhoto_id());
        }
        if (value.getUsername() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUsername());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getProfile_picture() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getProfile_picture());
        }
        if (value.getThumbnail_url() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getThumbnail_url());
        }
        if (value.getWidth() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getWidth());
        }
        if (value.getHeight() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getHeight());
        }
        if (value.getColor() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getColor());
        }
        if (value.getDate() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getDate());
        }
        stmt.bindLong(10, value.getId());
      }
    };
    this.__deletionAdapterOfAutoWallpaperHistory = new EntityDeletionOrUpdateAdapter<AutoWallpaperHistory>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `auto_wallpaper_history` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AutoWallpaperHistory value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfAutoWallpaperHistory = new EntityDeletionOrUpdateAdapter<AutoWallpaperHistory>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `auto_wallpaper_history` SET `photo_id` = ?,`username` = ?,`name` = ?,`profile_picture` = ?,`thumbnail_url` = ?,`width` = ?,`height` = ?,`color` = ?,`date` = ?,`id` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AutoWallpaperHistory value) {
        if (value.getPhoto_id() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getPhoto_id());
        }
        if (value.getUsername() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUsername());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getProfile_picture() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getProfile_picture());
        }
        if (value.getThumbnail_url() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getThumbnail_url());
        }
        if (value.getWidth() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getWidth());
        }
        if (value.getHeight() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getHeight());
        }
        if (value.getColor() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getColor());
        }
        if (value.getDate() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getDate());
        }
        stmt.bindLong(10, value.getId());
        stmt.bindLong(11, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAllAutoWallpaperHistory = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM auto_wallpaper_history";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteOldAutoWallpaperHistory = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM auto_wallpaper_history WHERE ? - date > ?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final AutoWallpaperHistory wallpaper,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfAutoWallpaperHistory.insert(wallpaper);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final AutoWallpaperHistory wallpaper,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfAutoWallpaperHistory.handle(wallpaper);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final AutoWallpaperHistory wallpaper,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfAutoWallpaperHistory.handle(wallpaper);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteAllAutoWallpaperHistory(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllAutoWallpaperHistory.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllAutoWallpaperHistory.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteOldAutoWallpaperHistory(final long now, final long threshold,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteOldAutoWallpaperHistory.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, now);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, threshold);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteOldAutoWallpaperHistory.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public DataSource.Factory<Integer, AutoWallpaperHistory> getAllAutoWallpaperHistory() {
    final String _sql = "SELECT * FROM auto_wallpaper_history ORDER BY date DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new DataSource.Factory<Integer, AutoWallpaperHistory>() {
      @Override
      public LimitOffsetDataSource<AutoWallpaperHistory> create() {
        return new LimitOffsetDataSource<AutoWallpaperHistory>(__db, _statement, false, true , "auto_wallpaper_history") {
          @Override
          protected List<AutoWallpaperHistory> convertRows(Cursor cursor) {
            final int _cursorIndexOfPhotoId = CursorUtil.getColumnIndexOrThrow(cursor, "photo_id");
            final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(cursor, "username");
            final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(cursor, "name");
            final int _cursorIndexOfProfilePicture = CursorUtil.getColumnIndexOrThrow(cursor, "profile_picture");
            final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(cursor, "thumbnail_url");
            final int _cursorIndexOfWidth = CursorUtil.getColumnIndexOrThrow(cursor, "width");
            final int _cursorIndexOfHeight = CursorUtil.getColumnIndexOrThrow(cursor, "height");
            final int _cursorIndexOfColor = CursorUtil.getColumnIndexOrThrow(cursor, "color");
            final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(cursor, "date");
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
            final List<AutoWallpaperHistory> _res = new ArrayList<AutoWallpaperHistory>(cursor.getCount());
            while(cursor.moveToNext()) {
              final AutoWallpaperHistory _item;
              final String _tmpPhoto_id;
              if (cursor.isNull(_cursorIndexOfPhotoId)) {
                _tmpPhoto_id = null;
              } else {
                _tmpPhoto_id = cursor.getString(_cursorIndexOfPhotoId);
              }
              final String _tmpUsername;
              if (cursor.isNull(_cursorIndexOfUsername)) {
                _tmpUsername = null;
              } else {
                _tmpUsername = cursor.getString(_cursorIndexOfUsername);
              }
              final String _tmpName;
              if (cursor.isNull(_cursorIndexOfName)) {
                _tmpName = null;
              } else {
                _tmpName = cursor.getString(_cursorIndexOfName);
              }
              final String _tmpProfile_picture;
              if (cursor.isNull(_cursorIndexOfProfilePicture)) {
                _tmpProfile_picture = null;
              } else {
                _tmpProfile_picture = cursor.getString(_cursorIndexOfProfilePicture);
              }
              final String _tmpThumbnail_url;
              if (cursor.isNull(_cursorIndexOfThumbnailUrl)) {
                _tmpThumbnail_url = null;
              } else {
                _tmpThumbnail_url = cursor.getString(_cursorIndexOfThumbnailUrl);
              }
              final Integer _tmpWidth;
              if (cursor.isNull(_cursorIndexOfWidth)) {
                _tmpWidth = null;
              } else {
                _tmpWidth = cursor.getInt(_cursorIndexOfWidth);
              }
              final Integer _tmpHeight;
              if (cursor.isNull(_cursorIndexOfHeight)) {
                _tmpHeight = null;
              } else {
                _tmpHeight = cursor.getInt(_cursorIndexOfHeight);
              }
              final String _tmpColor;
              if (cursor.isNull(_cursorIndexOfColor)) {
                _tmpColor = null;
              } else {
                _tmpColor = cursor.getString(_cursorIndexOfColor);
              }
              final Long _tmpDate;
              if (cursor.isNull(_cursorIndexOfDate)) {
                _tmpDate = null;
              } else {
                _tmpDate = cursor.getLong(_cursorIndexOfDate);
              }
              _item = new AutoWallpaperHistory(_tmpPhoto_id,_tmpUsername,_tmpName,_tmpProfile_picture,_tmpThumbnail_url,_tmpWidth,_tmpHeight,_tmpColor,_tmpDate);
              final int _tmpId;
              _tmpId = cursor.getInt(_cursorIndexOfId);
              _item.setId(_tmpId);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
