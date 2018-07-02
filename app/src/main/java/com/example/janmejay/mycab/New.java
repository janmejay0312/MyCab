package com.example.janmejay.mycab;

import android.arch.persistence.room.*;
import android.arch.persistence.room.Room;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;


public class New extends AppCompatActivity {
public  static android.support.v4.app.FragmentManager fragmentManager;
public static MyDatabase myDatabase;
private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        fragmentManager=getSupportFragmentManager();
        myDatabase= Room.databaseBuilder(getApplication(),MyDatabase.class,"userDb").allowMainThreadQueries().build();
        if(findViewById(R.id.fragment)!=null){
            if(savedInstanceState!=null)
            {
                return;
            }
            fragmentManager.beginTransaction().add(R.id.fragment,new Home()).commit();
        }
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.app_bar_menu,menu);
        return true;
    }

}
