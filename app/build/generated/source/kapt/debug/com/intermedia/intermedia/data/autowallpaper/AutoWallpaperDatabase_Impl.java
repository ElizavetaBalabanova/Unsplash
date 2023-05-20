package com.intermedia.intermedia.data.autowallpaper;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AutoWallpaperDatabase_Impl extends AutoWallpaperDatabase {
  private volatile AutoWallpaperHistoryDao _autoWallpaperHistoryDao;

  private volatile AutoWallpaperCollectionDao _autoWallpaperCollectionDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `auto_wallpaper_history` (`photo_id` TEXT, `username` TEXT, `name` TEXT, `profile_picture` TEXT, `thumbnail_url` TEXT, `width` INTEGER, `height` INTEGER, `color` TEXT, `date` INTEGER, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_auto_wallpaper_history_date` ON `auto_wallpaper_history` (`date`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `auto_wallpaper_collections` (`id` TEXT NOT NULL, `title` TEXT, `user_name` TEXT, `cover_photo` TEXT, `date_added` INTEGER, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_auto_wallpaper_collections_date_added` ON `auto_wallpaper_collections` (`date_added`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '78c5ec26a98b8b75003848b9f3ab98b3')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `auto_wallpaper_history`");
        _db.execSQL("DROP TABLE IF EXISTS `auto_wallpaper_collections`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsAutoWallpaperHistory = new HashMap<String, TableInfo.Column>(10);
        _columnsAutoWallpaperHistory.put("photo_id", new TableInfo.Column("photo_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAutoWallpaperHistory.put("username", new TableInfo.Column("username", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAutoWallpaperHistory.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAutoWallpaperHistory.put("profile_picture", new TableInfo.Column("profile_picture", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAutoWallpaperHistory.put("thumbnail_url", new TableInfo.Column("thumbnail_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAutoWallpaperHistory.put("width", new TableInfo.Column("width", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAutoWallpaperHistory.put("height", new TableInfo.Column("height", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAutoWallpaperHistory.put("color", new TableInfo.Column("color", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAutoWallpaperHistory.put("date", new TableInfo.Column("date", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAutoWallpaperHistory.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAutoWallpaperHistory = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAutoWallpaperHistory = new HashSet<TableInfo.Index>(1);
        _indicesAutoWallpaperHistory.add(new TableInfo.Index("index_auto_wallpaper_history_date", false, Arrays.asList("date"), Arrays.asList("ASC")));
        final TableInfo _infoAutoWallpaperHistory = new TableInfo("auto_wallpaper_history", _columnsAutoWallpaperHistory, _foreignKeysAutoWallpaperHistory, _indicesAutoWallpaperHistory);
        final TableInfo _existingAutoWallpaperHistory = TableInfo.read(_db, "auto_wallpaper_history");
        if (! _infoAutoWallpaperHistory.equals(_existingAutoWallpaperHistory)) {
          return new RoomOpenHelper.ValidationResult(false, "auto_wallpaper_history(com.intermedia.intermedia.data.autowallpaper.model.AutoWallpaperHistory).\n"
                  + " Expected:\n" + _infoAutoWallpaperHistory + "\n"
                  + " Found:\n" + _existingAutoWallpaperHistory);
        }
        final HashMap<String, TableInfo.Column> _columnsAutoWallpaperCollections = new HashMap<String, TableInfo.Column>(5);
        _columnsAutoWallpaperCollections.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAutoWallpaperCollections.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAutoWallpaperCollections.put("user_name", new TableInfo.Column("user_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAutoWallpaperCollections.put("cover_photo", new TableInfo.Column("cover_photo", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAutoWallpaperCollections.put("date_added", new TableInfo.Column("date_added", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAutoWallpaperCollections = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAutoWallpaperCollections = new HashSet<TableInfo.Index>(1);
        _indicesAutoWallpaperCollections.add(new TableInfo.Index("index_auto_wallpaper_collections_date_added", false, Arrays.asList("date_added"), Arrays.asList("ASC")));
        final TableInfo _infoAutoWallpaperCollections = new TableInfo("auto_wallpaper_collections", _columnsAutoWallpaperCollections, _foreignKeysAutoWallpaperCollections, _indicesAutoWallpaperCollections);
        final TableInfo _existingAutoWallpaperCollections = TableInfo.read(_db, "auto_wallpaper_collections");
        if (! _infoAutoWallpaperCollections.equals(_existingAutoWallpaperCollections)) {
          return new RoomOpenHelper.ValidationResult(false, "auto_wallpaper_collections(com.intermedia.intermedia.data.autowallpaper.model.AutoWallpaperCollection).\n"
                  + " Expected:\n" + _infoAutoWallpaperCollections + "\n"
                  + " Found:\n" + _existingAutoWallpaperCollections);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "78c5ec26a98b8b75003848b9f3ab98b3", "057ee2d05198b2728bb3572744ea91d7");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "auto_wallpaper_history","auto_wallpaper_collections");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `auto_wallpaper_history`");
      _db.execSQL("DELETE FROM `auto_wallpaper_collections`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(AutoWallpaperHistoryDao.class, AutoWallpaperHistoryDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(AutoWallpaperCollectionDao.class, AutoWallpaperCollectionDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public AutoWallpaperHistoryDao autoWallpaperHistoryDao() {
    if (_autoWallpaperHistoryDao != null) {
      return _autoWallpaperHistoryDao;
    } else {
      synchronized(this) {
        if(_autoWallpaperHistoryDao == null) {
          _autoWallpaperHistoryDao = new AutoWallpaperHistoryDao_Impl(this);
        }
        return _autoWallpaperHistoryDao;
      }
    }
  }

  @Override
  public AutoWallpaperCollectionDao autoWallpaperCollectionDao() {
    if (_autoWallpaperCollectionDao != null) {
      return _autoWallpaperCollectionDao;
    } else {
      synchronized(this) {
        if(_autoWallpaperCollectionDao == null) {
          _autoWallpaperCollectionDao = new AutoWallpaperCollectionDao_Impl(this);
        }
        return _autoWallpaperCollectionDao;
      }
    }
  }
}
