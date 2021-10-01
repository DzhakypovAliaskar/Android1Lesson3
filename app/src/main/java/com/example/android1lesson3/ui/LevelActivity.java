package com.example.android1lesson3.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.android1lesson3.data.QuestionModel;
import com.example.android1lesson3.R;
import com.example.android1lesson3.adapter.LevelAdapter;
import com.example.android1lesson3.data.QuizClient;
import com.example.android1lesson3.interf.ItemListener;

import java.util.ArrayList;
import java.util.List;

public class LevelActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LevelAdapter adapter;
    List<QuestionModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);
        initAdapter();
    }
    private void initAdapter() {
        recyclerView = findViewById(R.id.recycler_view);
        list = QuizClient.getLevel();
        adapter = new LevelAdapter(list);
        recyclerView.setAdapter(adapter);
        adapter.setListener(new ItemListener() {
            @Override
            public void onItemClick(QuestionModel model) {
                Intent intent = new Intent(LevelActivity.this, GameActivity.class);
                intent.putExtra("model",model);
                startActivity(intent);
            }
        });
    }




}