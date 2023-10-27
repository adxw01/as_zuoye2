package com.example.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {
    List<String> list1;
    Context context1;
    public MyAdapter(Context context,List list) {
        this.context1 = context;
        this.list1 = list;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=View.inflate(context1,R.layout.item,null);
//        View view= LayoutInflater.from(context1).inflate(R.layout.item,parent,false);
        MyHolder myHolder = new MyHolder(view);
        myHolder.setIsRecyclable(false);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.textView.setText(list1.get(position));
    }

    @Override
    public int getItemCount() {

        return list1.size();
    }
    class MyHolder extends RecyclerView.ViewHolder{
        TextView textView;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView31);
        }
    }
}


