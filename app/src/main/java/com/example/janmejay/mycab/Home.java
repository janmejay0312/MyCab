package com.example.janmejay.mycab;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment implements View.OnClickListener {

private Button button,bnShow,bnDelete,bnUpdate;
    public Home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
     View view =  inflater.inflate(R.layout.fragment_home, container, false);
     button=view.findViewById(R.id.button2);
     bnShow=view.findViewById(R.id.button3);
     bnDelete=view.findViewById(R.id.button5);
     bnUpdate=view.findViewById(R.id.button4);
     button.setOnClickListener(this);
     bnShow.setOnClickListener(this);
     bnDelete.setOnClickListener(this);
     bnUpdate.setOnClickListener(this);
     return view;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.button2:
                New.fragmentManager.beginTransaction().replace(R.id.fragment,new AddUserFrag()).addToBackStack(null).commit();
                break;
            case R.id.button3:
                New.fragmentManager.beginTransaction().replace(R.id.fragment,new ReadUserFrag()).addToBackStack(null).commit();
                break;
            case R.id.button5:
                New.fragmentManager.beginTransaction().replace(R.id.fragment,new DeleteUserFrag()).addToBackStack(null).commit();
                break;
            case R.id.button4:
                New.fragmentManager.beginTransaction().replace(R.id.fragment,new UpdateUserFrag()).addToBackStack(null).commit();
                break;
        }

    }
}