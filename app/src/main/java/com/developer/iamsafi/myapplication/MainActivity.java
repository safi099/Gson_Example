package com.developer.iamsafi.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class MainActivity extends AppCompatActivity {
    Gson gson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gson=new Gson();
        User u = new User();
        u.setName("Safi");
        u.setRoll_no("11");
        Log.i("Check",gson.toJson(u));

        String json=gson.toJson(u);
        User u1=gson.fromJson(json,new TypeToken<User>(){}.getType());
        Log.i("check",u1.getName()+"  "+u1.getRoll_no());
    }
}
