package com.example.janmejay.mycab;

import android.arch.persistence.room.*;
import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class New extends AppCompatActivity {
public  static android.support.v4.app.FragmentManager fragmentManager;
public static MyDatabase myDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        fragmentManager=getSupportFragmentManager();
        myDatabase= Room.databaseBuilder(getApplication(),MyDatabase.class,"userDb").allowMainThreadQueries().build();
        if(findViewById(R.id.fragment)!=null){
            if(savedInstanceState!=null)
            {
                return;
            }
            fragmentManager.beginTransaction().add(R.id.fragment,new Home()).commit();
        }
    }
}
