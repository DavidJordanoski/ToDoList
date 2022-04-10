package com.example.mytodo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ToDoAdapter extends RecyclerView.Adapter<ToDoAdapter.MyViewHolder> {

    Context context;
    ArrayList<TaskModel> taskModels;

    public ToDoAdapter(Context context, ArrayList<TaskModel> taskModels){
        this.context = context;
        this.taskModels = taskModels;
    }

    @NonNull
    @Override
    public ToDoAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycker_view_row, parent, false);
        return new ToDoAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ToDoAdapter.MyViewHolder holder, int position) {
        holder.h1.setText(taskModels.get(position).getHeader());
        holder.t1.setText(taskModels.get(position).getText());
    }

    @Override
    public int getItemCount() {
        return taskModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView h1, t1;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            h1 = itemView.findViewById(R.id.heading1);
            t1 = itemView.findViewById(R.id.text1);
        }
    }
}
