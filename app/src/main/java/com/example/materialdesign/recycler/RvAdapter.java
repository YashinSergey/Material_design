package com.example.materialdesign.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.materialdesign.R;

import java.util.List;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.MyViewHolder> {

    private Context context;
    private List<String> list;

    public RvAdapter(Context context, List<String> list) {
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_recycler, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
      holder.textView.setText(list.get(position));
      holder.bind(position);
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;
        private ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_view_recycler);
            imageView = itemView.findViewById(R.id.image_view_recycler);
        }

        public void bind(int position) {
            textView.setText(list.get(position));
            switch (position % 4){
                case 0:
                    imageView.setImageResource(R.drawable.mountain_lake);
                    break;
                case 1:
                    imageView.setImageResource(R.drawable.hills);
                    break;
                case 2:
                    imageView.setImageResource(R.drawable.new_york_city);
                    break;
                case 3:
                    imageView.setImageResource(R.drawable.sea_shore);
                    break;
            }

        }
    }
}
