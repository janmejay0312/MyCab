package com.example.janmejay.mycab;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class AddUserFrag extends Fragment {

private EditText userID,userName,userEmail;
private Button save;


    public AddUserFrag() {
        // Required empty public constructor
    }








    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_add_user, container, false);
        userID=view.findViewById(R.id.editText2);
        userName=view.findViewById(R.id.editText3);
        userEmail=view.findViewById(R.id.editText4);
        save=view.findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int userId=Integer.parseInt(userID.getText().toString());
                String username=userName.getText().toString();
                String useremail=userEmail.getText().toString();
                Room room=new Room();
                room.setId(userId);
                room.setName(username);
                room.setEmail(useremail);
                New.myDatabase.myData().addRoom(room);
                Toast.makeText(getActivity(),"data saved successfully",Toast.LENGTH_SHORT).show();
                userID.setText("");
                userName.setText("");
                userEmail.setText("");

            }
        });
        return view;
    }


}
