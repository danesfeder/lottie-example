package com.nesfeder.lottieexample;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class LottieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottie);

        RecyclerView listOptions = (RecyclerView) findViewById(R.id.rvListOptions);
        listOptions.setLayoutManager(new LinearLayoutManager(this));

        List<String> listItems = initMockData();
        ListAdapter listAdapter = new ListAdapter(listItems);
        listOptions.setAdapter(listAdapter);
    }

    @NonNull
    private List<String> initMockData() {
        List<String> listItems = new ArrayList<>();
        listItems.add("Example Text 1");
        listItems.add("Example Text 2");
        listItems.add("Example Text 3");
        listItems.add("Example Text 4");
        listItems.add("Example Text 5");
        return listItems;
    }
}
