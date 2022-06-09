package com.example.week11;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder>{
    ArrayList<Movie> items = new ArrayList<Movie>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType){
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.movie_item, viewGroup, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Movie item = items.get(position);
        viewHolder.setItem(item);
    }




    @Override
    public int getItemCount(){return items.size();}
    public void addItem(Movie item){items.add(item);}
    public void setItems(ArrayList<Movie> items){this.items=items;}
    public Movie getItem(int position){return items.get(position);}



    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView mName;
        TextView pCount;
        TextView mRank;
        TextView openDt;

        public ViewHolder(View itemView) {
            super(itemView);
            mName = itemView.findViewById(R.id.mName);
            pCount = itemView.findViewById(R.id.pCount);
            mRank = itemView.findViewById(R.id.mRank);
            openDt = itemView.findViewById(R.id.openDt);
        }
        public void setItem(Movie item){
            mName.setText(item.movieNm);
            pCount.setText(item.audiCnt);
            mRank.setText(item.rank);
            openDt.setText(item.openDt);
        }
    }

}
