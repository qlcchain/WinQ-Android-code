package com.stratagile.qlink.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "VPN_ENTITY".
*/
public class VpnEntityDao extends AbstractDao<VpnEntity, Long> {

    public static final String TABLENAME = "VPN_ENTITY";

    /**
     * Properties of entity VpnEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Country = new Property(1, String.class, "country", false, "COUNTRY");
        public final static Property IsMainNet = new Property(2, boolean.class, "isMainNet", false, "IS_MAIN_NET");
        public final static Property Hash = new Property(3, String.class, "hash", false, "HASH");
        public final static Property UserId = new Property(4, String.class, "userId", false, "USER_ID");
        public final static Property ProfileLocalPath = new Property(5, String.class, "profileLocalPath", false, "PROFILE_LOCAL_PATH");
        public final static Property Password = new Property(6, String.class, "password", false, "PASSWORD");
        public final static Property PrivateKeyPassword = new Property(7, String.class, "privateKeyPassword", false, "PRIVATE_KEY_PASSWORD");
        public final static Property ProfileUUid = new Property(8, String.class, "profileUUid", false, "PROFILE_UUID");
        public final static Property IpV4Address = new Property(9, String.class, "ipV4Address", false, "IP_V4_ADDRESS");
        public final static Property Continent = new Property(10, String.class, "continent", false, "CONTINENT");
        public final static Property Username = new Property(11, String.class, "username", false, "USERNAME");
        public final static Property GroupNum = new Property(12, int.class, "groupNum", false, "GROUP_NUM");
        public final static Property Bandwidth = new Property(13, String.class, "bandwidth", false, "BANDWIDTH");
        public final static Property ConnectMaxnumber = new Property(14, int.class, "connectMaxnumber", false, "CONNECT_MAXNUMBER");
        public final static Property AssetTranfer = new Property(15, double.class, "assetTranfer", false, "ASSET_TRANFER");
        public final static Property Avatar = new Property(16, String.class, "avatar", false, "AVATAR");
        public final static Property RegisterQlc = new Property(17, double.class, "registerQlc", false, "REGISTER_QLC");
        public final static Property OnlineTime = new Property(18, int.class, "onlineTime", false, "ONLINE_TIME");
        public final static Property ConnsuccessNum = new Property(19, int.class, "connsuccessNum", false, "CONNSUCCESS_NUM");
        public final static Property IsInMainWallet = new Property(20, boolean.class, "isInMainWallet", false, "IS_IN_MAIN_WALLET");
        public final static Property UnReadMessageCount = new Property(21, int.class, "unReadMessageCount", false, "UN_READ_MESSAGE_COUNT");
        public final static Property FriendNum = new Property(22, String.class, "friendNum", false, "FRIEND_NUM");
        public final static Property Configuration = new Property(23, String.class, "configuration", false, "CONFIGURATION");
        public final static Property VpnName = new Property(24, String.class, "vpnName", false, "VPN_NAME");
        public final static Property P2pId = new Property(25, String.class, "p2pId", false, "P2P_ID");
        public final static Property P2pIdPc = new Property(26, String.class, "p2pIdPc", false, "P2P_ID_PC");
        public final static Property Address = new Property(27, String.class, "address", false, "ADDRESS");
        public final static Property Type = new Property(28, int.class, "type", false, "TYPE");
        public final static Property CurrentConnect = new Property(29, int.class, "currentConnect", false, "CURRENT_CONNECT");
        public final static Property Qlc = new Property(30, float.class, "qlc", false, "QLC");
        public final static Property IsConnected = new Property(31, boolean.class, "isConnected", false, "IS_CONNECTED");
        public final static Property LastFreeTime = new Property(32, long.class, "lastFreeTime", false, "LAST_FREE_TIME");
        public final static Property Online = new Property(33, boolean.class, "online", false, "ONLINE");
        public final static Property IsLoadingAvater = new Property(34, boolean.class, "isLoadingAvater", false, "IS_LOADING_AVATER");
        public final static Property AvaterUpdateTime = new Property(35, long.class, "avaterUpdateTime", false, "AVATER_UPDATE_TIME");
        public final static Property Price = new Property(36, float.class, "price", false, "PRICE");
    }


    public VpnEntityDao(DaoConfig config) {
        super(config);
    }
    
    public VpnEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"VPN_ENTITY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"COUNTRY\" TEXT," + // 1: country
                "\"IS_MAIN_NET\" INTEGER NOT NULL ," + // 2: isMainNet
                "\"HASH\" TEXT," + // 3: hash
                "\"USER_ID\" TEXT," + // 4: userId
                "\"PROFILE_LOCAL_PATH\" TEXT," + // 5: profileLocalPath
                "\"PASSWORD\" TEXT," + // 6: password
                "\"PRIVATE_KEY_PASSWORD\" TEXT," + // 7: privateKeyPassword
                "\"PROFILE_UUID\" TEXT," + // 8: profileUUid
                "\"IP_V4_ADDRESS\" TEXT," + // 9: ipV4Address
                "\"CONTINENT\" TEXT," + // 10: continent
                "\"USERNAME\" TEXT," + // 11: username
                "\"GROUP_NUM\" INTEGER NOT NULL ," + // 12: groupNum
                "\"BANDWIDTH\" TEXT," + // 13: bandwidth
                "\"CONNECT_MAXNUMBER\" INTEGER NOT NULL ," + // 14: connectMaxnumber
                "\"ASSET_TRANFER\" REAL NOT NULL ," + // 15: assetTranfer
                "\"AVATAR\" TEXT," + // 16: avatar
                "\"REGISTER_QLC\" REAL NOT NULL ," + // 17: registerQlc
                "\"ONLINE_TIME\" INTEGER NOT NULL ," + // 18: onlineTime
                "\"CONNSUCCESS_NUM\" INTEGER NOT NULL ," + // 19: connsuccessNum
                "\"IS_IN_MAIN_WALLET\" INTEGER NOT NULL ," + // 20: isInMainWallet
                "\"UN_READ_MESSAGE_COUNT\" INTEGER NOT NULL ," + // 21: unReadMessageCount
                "\"FRIEND_NUM\" TEXT," + // 22: friendNum
                "\"CONFIGURATION\" TEXT," + // 23: configuration
                "\"VPN_NAME\" TEXT," + // 24: vpnName
                "\"P2P_ID\" TEXT," + // 25: p2pId
                "\"P2P_ID_PC\" TEXT," + // 26: p2pIdPc
                "\"ADDRESS\" TEXT," + // 27: address
                "\"TYPE\" INTEGER NOT NULL ," + // 28: type
                "\"CURRENT_CONNECT\" INTEGER NOT NULL ," + // 29: currentConnect
                "\"QLC\" REAL NOT NULL ," + // 30: qlc
                "\"IS_CONNECTED\" INTEGER NOT NULL ," + // 31: isConnected
                "\"LAST_FREE_TIME\" INTEGER NOT NULL ," + // 32: lastFreeTime
                "\"ONLINE\" INTEGER NOT NULL ," + // 33: online
                "\"IS_LOADING_AVATER\" INTEGER NOT NULL ," + // 34: isLoadingAvater
                "\"AVATER_UPDATE_TIME\" INTEGER NOT NULL ," + // 35: avaterUpdateTime
                "\"PRICE\" REAL NOT NULL );"); // 36: price
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"VPN_ENTITY\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, VpnEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String country = entity.getCountry();
        if (country != null) {
            stmt.bindString(2, country);
        }
        stmt.bindLong(3, entity.getIsMainNet() ? 1L: 0L);
 
        String hash = entity.getHash();
        if (hash != null) {
            stmt.bindString(4, hash);
        }
 
        String userId = entity.getUserId();
        if (userId != null) {
            stmt.bindString(5, userId);
        }
 
        String profileLocalPath = entity.getProfileLocalPath();
        if (profileLocalPath != null) {
            stmt.bindString(6, profileLocalPath);
        }
 
        String password = entity.getPassword();
        if (password != null) {
            stmt.bindString(7, password);
        }
 
        String privateKeyPassword = entity.getPrivateKeyPassword();
        if (privateKeyPassword != null) {
            stmt.bindString(8, privateKeyPassword);
        }
 
        String profileUUid = entity.getProfileUUid();
        if (profileUUid != null) {
            stmt.bindString(9, profileUUid);
        }
 
        String ipV4Address = entity.getIpV4Address();
        if (ipV4Address != null) {
            stmt.bindString(10, ipV4Address);
        }
 
        String continent = entity.getContinent();
        if (continent != null) {
            stmt.bindString(11, continent);
        }
 
        String username = entity.getUsername();
        if (username != null) {
            stmt.bindString(12, username);
        }
        stmt.bindLong(13, entity.getGroupNum());
 
        String bandwidth = entity.getBandwidth();
        if (bandwidth != null) {
            stmt.bindString(14, bandwidth);
        }
        stmt.bindLong(15, entity.getConnectMaxnumber());
        stmt.bindDouble(16, entity.getAssetTranfer());
 
        String avatar = entity.getAvatar();
        if (avatar != null) {
            stmt.bindString(17, avatar);
        }
        stmt.bindDouble(18, entity.getRegisterQlc());
        stmt.bindLong(19, entity.getOnlineTime());
        stmt.bindLong(20, entity.getConnsuccessNum());
        stmt.bindLong(21, entity.getIsInMainWallet() ? 1L: 0L);
        stmt.bindLong(22, entity.getUnReadMessageCount());
 
        String friendNum = entity.getFriendNum();
        if (friendNum != null) {
            stmt.bindString(23, friendNum);
        }
 
        String configuration = entity.getConfiguration();
        if (configuration != null) {
            stmt.bindString(24, configuration);
        }
 
        String vpnName = entity.getVpnName();
        if (vpnName != null) {
            stmt.bindString(25, vpnName);
        }
 
        String p2pId = entity.getP2pId();
        if (p2pId != null) {
            stmt.bindString(26, p2pId);
        }
 
        String p2pIdPc = entity.getP2pIdPc();
        if (p2pIdPc != null) {
            stmt.bindString(27, p2pIdPc);
        }
 
        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(28, address);
        }
        stmt.bindLong(29, entity.getType());
        stmt.bindLong(30, entity.getCurrentConnect());
        stmt.bindDouble(31, entity.getQlc());
        stmt.bindLong(32, entity.getIsConnected() ? 1L: 0L);
        stmt.bindLong(33, entity.getLastFreeTime());
        stmt.bindLong(34, entity.getOnline() ? 1L: 0L);
        stmt.bindLong(35, entity.getIsLoadingAvater() ? 1L: 0L);
        stmt.bindLong(36, entity.getAvaterUpdateTime());
        stmt.bindDouble(37, entity.getPrice());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, VpnEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String country = entity.getCountry();
        if (country != null) {
            stmt.bindString(2, country);
        }
        stmt.bindLong(3, entity.getIsMainNet() ? 1L: 0L);
 
        String hash = entity.getHash();
        if (hash != null) {
            stmt.bindString(4, hash);
        }
 
        String userId = entity.getUserId();
        if (userId != null) {
            stmt.bindString(5, userId);
        }
 
        String profileLocalPath = entity.getProfileLocalPath();
        if (profileLocalPath != null) {
            stmt.bindString(6, profileLocalPath);
        }
 
        String password = entity.getPassword();
        if (password != null) {
            stmt.bindString(7, password);
        }
 
        String privateKeyPassword = entity.getPrivateKeyPassword();
        if (privateKeyPassword != null) {
            stmt.bindString(8, privateKeyPassword);
        }
 
        String profileUUid = entity.getProfileUUid();
        if (profileUUid != null) {
            stmt.bindString(9, profileUUid);
        }
 
        String ipV4Address = entity.getIpV4Address();
        if (ipV4Address != null) {
            stmt.bindString(10, ipV4Address);
        }
 
        String continent = entity.getContinent();
        if (continent != null) {
            stmt.bindString(11, continent);
        }
 
        String username = entity.getUsername();
        if (username != null) {
            stmt.bindString(12, username);
        }
        stmt.bindLong(13, entity.getGroupNum());
 
        String bandwidth = entity.getBandwidth();
        if (bandwidth != null) {
            stmt.bindString(14, bandwidth);
        }
        stmt.bindLong(15, entity.getConnectMaxnumber());
        stmt.bindDouble(16, entity.getAssetTranfer());
 
        String avatar = entity.getAvatar();
        if (avatar != null) {
            stmt.bindString(17, avatar);
        }
        stmt.bindDouble(18, entity.getRegisterQlc());
        stmt.bindLong(19, entity.getOnlineTime());
        stmt.bindLong(20, entity.getConnsuccessNum());
        stmt.bindLong(21, entity.getIsInMainWallet() ? 1L: 0L);
        stmt.bindLong(22, entity.getUnReadMessageCount());
 
        String friendNum = entity.getFriendNum();
        if (friendNum != null) {
            stmt.bindString(23, friendNum);
        }
 
        String configuration = entity.getConfiguration();
        if (configuration != null) {
            stmt.bindString(24, configuration);
        }
 
        String vpnName = entity.getVpnName();
        if (vpnName != null) {
            stmt.bindString(25, vpnName);
        }
 
        String p2pId = entity.getP2pId();
        if (p2pId != null) {
            stmt.bindString(26, p2pId);
        }
 
        String p2pIdPc = entity.getP2pIdPc();
        if (p2pIdPc != null) {
            stmt.bindString(27, p2pIdPc);
        }
 
        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(28, address);
        }
        stmt.bindLong(29, entity.getType());
        stmt.bindLong(30, entity.getCurrentConnect());
        stmt.bindDouble(31, entity.getQlc());
        stmt.bindLong(32, entity.getIsConnected() ? 1L: 0L);
        stmt.bindLong(33, entity.getLastFreeTime());
        stmt.bindLong(34, entity.getOnline() ? 1L: 0L);
        stmt.bindLong(35, entity.getIsLoadingAvater() ? 1L: 0L);
        stmt.bindLong(36, entity.getAvaterUpdateTime());
        stmt.bindDouble(37, entity.getPrice());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public VpnEntity readEntity(Cursor cursor, int offset) {
        VpnEntity entity = new VpnEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // country
            cursor.getShort(offset + 2) != 0, // isMainNet
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // hash
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // userId
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // profileLocalPath
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // password
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // privateKeyPassword
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // profileUUid
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // ipV4Address
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // continent
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // username
            cursor.getInt(offset + 12), // groupNum
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // bandwidth
            cursor.getInt(offset + 14), // connectMaxnumber
            cursor.getDouble(offset + 15), // assetTranfer
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // avatar
            cursor.getDouble(offset + 17), // registerQlc
            cursor.getInt(offset + 18), // onlineTime
            cursor.getInt(offset + 19), // connsuccessNum
            cursor.getShort(offset + 20) != 0, // isInMainWallet
            cursor.getInt(offset + 21), // unReadMessageCount
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22), // friendNum
            cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23), // configuration
            cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24), // vpnName
            cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25), // p2pId
            cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26), // p2pIdPc
            cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27), // address
            cursor.getInt(offset + 28), // type
            cursor.getInt(offset + 29), // currentConnect
            cursor.getFloat(offset + 30), // qlc
            cursor.getShort(offset + 31) != 0, // isConnected
            cursor.getLong(offset + 32), // lastFreeTime
            cursor.getShort(offset + 33) != 0, // online
            cursor.getShort(offset + 34) != 0, // isLoadingAvater
            cursor.getLong(offset + 35), // avaterUpdateTime
            cursor.getFloat(offset + 36) // price
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, VpnEntity entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setCountry(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setIsMainNet(cursor.getShort(offset + 2) != 0);
        entity.setHash(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setUserId(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setProfileLocalPath(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setPassword(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setPrivateKeyPassword(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setProfileUUid(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setIpV4Address(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setContinent(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setUsername(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setGroupNum(cursor.getInt(offset + 12));
        entity.setBandwidth(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setConnectMaxnumber(cursor.getInt(offset + 14));
        entity.setAssetTranfer(cursor.getDouble(offset + 15));
        entity.setAvatar(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setRegisterQlc(cursor.getDouble(offset + 17));
        entity.setOnlineTime(cursor.getInt(offset + 18));
        entity.setConnsuccessNum(cursor.getInt(offset + 19));
        entity.setIsInMainWallet(cursor.getShort(offset + 20) != 0);
        entity.setUnReadMessageCount(cursor.getInt(offset + 21));
        entity.setFriendNum(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
        entity.setConfiguration(cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23));
        entity.setVpnName(cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24));
        entity.setP2pId(cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25));
        entity.setP2pIdPc(cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26));
        entity.setAddress(cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27));
        entity.setType(cursor.getInt(offset + 28));
        entity.setCurrentConnect(cursor.getInt(offset + 29));
        entity.setQlc(cursor.getFloat(offset + 30));
        entity.setIsConnected(cursor.getShort(offset + 31) != 0);
        entity.setLastFreeTime(cursor.getLong(offset + 32));
        entity.setOnline(cursor.getShort(offset + 33) != 0);
        entity.setIsLoadingAvater(cursor.getShort(offset + 34) != 0);
        entity.setAvaterUpdateTime(cursor.getLong(offset + 35));
        entity.setPrice(cursor.getFloat(offset + 36));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(VpnEntity entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(VpnEntity entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(VpnEntity entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
