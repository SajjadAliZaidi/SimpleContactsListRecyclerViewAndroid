package com.smsaz.class14;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {

    LayoutInflater mInflator;
    String[] wordList;

    public WordListAdapter(Context context, String[] wordList) {
        this.mInflator = LayoutInflater.from(context);
        this.wordList = wordList;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View wordView = mInflator.inflate(R.layout.word_layout, parent, false);
        return new WordViewHolder(wordView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        String word = this.wordList[position];
        holder.textViewWord.setText(word);
    }

    @Override
    public int getItemCount() {
        return this.wordList.length;
    }

    public class WordViewHolder extends RecyclerView.ViewHolder{
        WordListAdapter wordListAdapter;
        TextView textViewWord;

        public WordViewHolder(@NonNull View itemView,
                              WordListAdapter wordListAdapter) {
            super(itemView);
            this.textViewWord = itemView.findViewById(R.id.textViewWord);
            this.wordListAdapter = wordListAdapter;
        }
    }

}
