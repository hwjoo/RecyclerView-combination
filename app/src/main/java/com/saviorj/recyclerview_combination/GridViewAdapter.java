package com.saviorj.recyclerview_combination;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by hwjoo on 2016-12-15.
 */

public class GridViewAdapter extends RecyclerView.Adapter<GridViewAdapter.ViewHolder> {
    private List<RecyclerViewItem> items;
    private Activity activity;
    public GridViewAdapter(Activity activity, List<RecyclerViewItem> items){
        this.activity = activity;
        this.items = items;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View view = inflater.inflate(R.layout.item_grid, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GridViewAdapter.ViewHolder holder, int position) {
        holder.imageView.setImageResource(items.get(position).getDrawableId());
        holder.textView.setText(items.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    protected class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;
        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.grid_image);
            textView = (TextView) itemView.findViewById(R.id.grid_text);
        }
    }
}
