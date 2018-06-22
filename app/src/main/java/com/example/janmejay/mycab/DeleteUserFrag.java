package com.example.janmejay.mycab;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class DeleteUserFrag extends Fragment {
private EditText delId;
private Button ok;

    public DeleteUserFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_delete_user, container, false);
        delId=view.findViewById(R.id.editText5);
        ok=view.findViewById(R.id.button6);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=Integer.parseInt(delId.getText().toString());
                Room users=new Room();
                users.setId(id);
                New.myDatabase.myData().delete(users);
                Toast.makeText(getActivity(),"succesfully deleted",Toast.LENGTH_SHORT).show();
                delId.setText("");
            }
        });
        return view;
    }

}
