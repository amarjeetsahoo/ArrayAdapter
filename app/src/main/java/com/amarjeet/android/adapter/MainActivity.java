package com.amarjeet.android.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<Word> words= new ArrayList<Word>();

        words.add(new Word("one","1","hello1"));
        words.add(new Word("two","2","hello2"));
        words.add(new Word("three","3","hello3"));
        words.add(new Word("four","4","hello4"));

        WordAdapter arrayAdapter=new WordAdapter(this,words);
        ListView listView= (ListView)findViewById(R.id.listview);
        listView.setAdapter(arrayAdapter);

    }
}
