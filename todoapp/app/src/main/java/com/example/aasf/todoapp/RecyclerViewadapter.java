package com.example.aasf.todoapp;

/**
 * Created by aasf on 12/4/17.
 */
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolders> {
    private List<Task> task;
    protected Context context;
    View layoutView;
    public RecyclerViewAdapter(Context context, List<Task> task) {
        this.task = task;
        this.context = context;
    }
    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerViewHolders viewHolder = null;
        layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.to_do_list, parent, false);
        viewHolder = new RecyclerViewHolders(layoutView, task);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position)

    {
        holder.categoryTitle.setText(task.get(position).getTask());
    }
    @Override
    public int getItemCount()

    {
        return this.task.size();
    }
}