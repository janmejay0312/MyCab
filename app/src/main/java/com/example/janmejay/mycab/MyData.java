package com.example.janmejay.mycab;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by janmejay on 20/6/18.
 */
@Dao
public interface MyData {
    @Insert
    public void addRoom(Room room);
@Query("select * from Room")
    public List<Room> getRoom();
@Delete
public void delete(Room room);
@Update
public void update(Room room);
}
