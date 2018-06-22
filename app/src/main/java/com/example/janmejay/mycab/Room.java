package com.example.janmejay.mycab;
import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by janmejay on 20/6/18.
 */
@Entity(tableName = "Room")
public class Room {
    @PrimaryKey
private int id;
    @ColumnInfo(name = "username")
private String name;
    @ColumnInfo(name = "useremail")
private String email;
    public int getId()
    {
       return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
}
