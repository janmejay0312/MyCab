package com.example.janmejay.mycab;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by janmejay on 20/6/18.
 */
@Database(entities = {Room.class},version = 1)
public abstract class MyDatabase extends RoomDatabase {
    public abstract MyData myData();
}
