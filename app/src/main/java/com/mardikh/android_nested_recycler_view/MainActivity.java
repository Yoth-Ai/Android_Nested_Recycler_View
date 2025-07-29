package com.mardikh.android_nested_recycler_view;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mardikh.android_nested_recycler_view.adapter.CategoryAdapter;
import com.mardikh.android_nested_recycler_view.data.SampleData;

public class MainActivity extends AppCompatActivity {

    RecyclerView categoryRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        categoryRecyclerView = findViewById(R.id.categoryRecyclerView);

        categoryRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        categoryRecyclerView.setAdapter(new CategoryAdapter(this, SampleData.getCategories()));
    }
}
