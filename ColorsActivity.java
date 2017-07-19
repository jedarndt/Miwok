package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word ("red", "wetetti"));
        words.add(new Word ("green", "chokokki"));
        words.add(new Word ("brown", "takokki"));
        words.add(new Word ("grey", "topoppi"));
        words.add(new Word ("black", "kululli"));
        words.add(new Word ("white", "kelelli"));
        words.add(new Word ("dusty yellow", "topiisa"));
        words.add(new Word ("mustard yellow", "chiwitta"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
