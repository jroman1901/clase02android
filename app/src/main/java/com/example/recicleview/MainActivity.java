package com.example.recicleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView reyclerViewUser;
    private RecyclerView.Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reyclerViewUser = (RecyclerView) findViewById(R.id.rviewuser);
        reyclerViewUser.setHasFixedSize(true);
        reyclerViewUser.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new UserAdapter(getData());

        reyclerViewUser.setAdapter(mAdapter);

    }


    public List<UserModel> getData() {

        List<UserModel> userModels = new ArrayList<>();
        userModels.add(new UserModel("Gustavo"));
        userModels.add(new UserModel("Daniel"));
        userModels.add(new UserModel("Cecilia"));
        userModels.add(new UserModel("Diego"));
        userModels.add(new UserModel("Carlos"));
        userModels.add(new UserModel("Juan"));


        return userModels;
    }
}