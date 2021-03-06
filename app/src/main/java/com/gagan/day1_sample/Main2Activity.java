package com.gagan.day1_sample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    private static final String TAG = "Main2Activity";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d(TAG,"onCreate :Started.");
        initImageBitmaps();
    }
    private void   initImageBitmaps(){
        Log.d(TAG,"  initImageBitmaps:preparing bitmaps.");
        mImageUrls.add("https://media1.picsearch.com/is?kFbHfprJq4unGL6SXd6v5bL7JK_HozKD9cIoYo14VF4&height=161");
        mNames.add("Nigara Fall");
        mImageUrls.add("https://media4.picsearch.com/is?E9YZaJ4lwxO1RTHLeHbs7tNzuPYjQyTW3EeEpk6Z9A4&height=255");
        mImageUrls.add("CN tower");
        initRecyclerview();
    }
    private void initRecyclerview(){
        Log.d(TAG,"initRecyclerview:init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerviewadapter adapter = new recyclerviewadapter(this,mNames,mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
