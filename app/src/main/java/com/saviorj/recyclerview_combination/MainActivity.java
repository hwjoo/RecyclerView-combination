package com.saviorj.recyclerview_combination;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView listView;
    RecyclerView gridView;
    ListViewAdapter listViewAdapter;
    GridViewAdapter gridViewAdapter;
    ArrayList<RecyclerViewItem> corporations;
    ArrayList<RecyclerViewItem> operatingSystems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (RecyclerView) findViewById(R.id.list);
        gridView = (RecyclerView) findViewById(R.id.grid);
        corporations = new ArrayList<RecyclerViewItem>();
        operatingSystems = new ArrayList<RecyclerViewItem>();

        setDummyData();

        listView.setHasFixedSize(true);
        gridView.setHasFixedSize(true);

        LinearLayoutManager horizontalManager = new LinearLayoutManager(this);
        listView.setLayoutManager(horizontalManager);
        listViewAdapter = new ListViewAdapter(this, corporations);
        listView.setAdapter(listViewAdapter);

        GridLayoutManager layoutManager = new GridLayoutManager(this,2);
        gridView.setLayoutManager(layoutManager);
        gridViewAdapter = new GridViewAdapter(this, operatingSystems);
        gridView.setAdapter(gridViewAdapter);

    }
    private void setDummyData() {
//        corporations = new ArrayList<>();
        corporations.add(new RecyclerViewItem(R.mipmap.ic_launcher, "Microsoft"));
        corporations.add(new RecyclerViewItem(R.mipmap.ic_launcher, "Apple"));
        corporations.add(new RecyclerViewItem(R.mipmap.ic_launcher, "Google"));
        corporations.add(new RecyclerViewItem(R.mipmap.ic_launcher, "Oracle"));
        corporations.add(new RecyclerViewItem(R.mipmap.ic_launcher, "Yahoo"));
        corporations.add(new RecyclerViewItem(R.mipmap.ic_launcher, "Mozilla"));

//        operatingSystems = new ArrayList<>();
        operatingSystems.add(new RecyclerViewItem(R.mipmap.ic_launcher, "BlackBerry OS"));
        operatingSystems.add(new RecyclerViewItem(R.mipmap.ic_launcher, "iOS"));
        operatingSystems.add(new RecyclerViewItem(R.mipmap.ic_launcher, "Tizen"));
        operatingSystems.add(new RecyclerViewItem(R.mipmap.ic_launcher, "Android"));
        operatingSystems.add(new RecyclerViewItem(R.mipmap.ic_launcher, "Symbian"));
        operatingSystems.add(new RecyclerViewItem(R.mipmap.ic_launcher, "Firefox OS"));
        operatingSystems.add(new RecyclerViewItem(R.mipmap.ic_launcher, "Windows Phone OS"));

        Log.d("TEST", corporations.get(0).getName());
        Log.d("TEST", operatingSystems.get(0).getName());


    }
}
