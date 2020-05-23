package com.amarjeet.android.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<Word>  {

    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }
        Word currentWord = getItem(position);


        TextView txt1 = (TextView) listItemView.findViewById(R.id.txt1);
        txt1.setText(currentWord.getData1());


        TextView txt2 = (TextView) listItemView.findViewById(R.id.txt2);
        txt2.setText(currentWord.getData2());

        TextView txt3 = (TextView) listItemView.findViewById(R.id.txt3);
        txt3.setText(currentWord.getData3());

        return listItemView;
    }
}