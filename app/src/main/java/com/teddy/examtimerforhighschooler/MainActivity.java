package com.teddy.examtimerforhighschooler;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<Item> mItemList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mItemList = new ArrayList<>();
        mItemList.add(new Item("SAT"));
        mItemList.add(new Item("AP exams"));
        mItemList.add(new Item("ACT"));
        mItemList.add(new Item("TOEFL"));
        mItemList.add(new Item("SSAT"));
        mItemList.add(new Item("PSAT/NMSQT"));
        mItemList.add(new Item("TOEIC"));
        mItemList.add(new Item("IELTS"));
        mItemList.add(new Item("IELTS"));
        mItemList.add(new Item("IELTS"));
        mItemList.add(new Item("IELTS"));
        mItemList.add(new Item("IELTS"));
        mItemList.add(new Item("IELTS"));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ItemAdapter(mItemList, getApplicationContext());

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);



    }






}
