package com.example.janmejay.mycab;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class ReadUserFrag extends Fragment{
private TextView txtInfo;
    public ReadUserFrag() {
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_read_user, container, false);
        txtInfo=view.findViewById(R.id.text);
        List<Room> user=New.myDatabase.myData().getRoom();
        String info="";
        for(Room usr:user){
            int id=usr.getId();
            String name=usr.getName();
            String email=usr.getEmail();
            info=info+"\n\n ID:"+id+"\n Name:"+name+"\n Email:"+email;

        }
        txtInfo.setText(info);
        return view;
    }


    }



