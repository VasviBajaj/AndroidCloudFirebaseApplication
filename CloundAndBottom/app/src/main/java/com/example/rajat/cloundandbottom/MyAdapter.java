package com.example.rajat.cloundandbottom;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Ducat on 11/30/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>
{
    private Context context;
    private List<Upload> uploads;
    public MyAdapter(Context context, List<Upload> uploads)
    {
        this.context=context;
        this.uploads=uploads;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v=LayoutInflater.from(parent.getContext()).inflate(R.layout.posting,parent,false);
        ViewHolder viewHolder=new ViewHolder(v);
        return viewHolder;  
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        Upload upload=uploads.get(position);
        holder.textView.setText(upload.getUsername());
        switch (upload.getPic())
        {
            case 1: holder.circleImageView.setImageResource(R.drawable.panda);
                break;
            case 2: holder.circleImageView.setImageResource(R.drawable.panda);
                break;
            case 3: holder.circleImageView.setImageResource(R.drawable.panda);
                break;
            case 4: holder.circleImageView.setImageResource(R.drawable.panda);
                break;
            case 5: holder.circleImageView.setImageResource(R.drawable.panda);
                break;
            case 6: holder.circleImageView.setImageResource(R.drawable.panda);
                break;
            case 7: holder.circleImageView.setImageResource(R.drawable.panda);
                break;
            case 8: holder.circleImageView.setImageResource(R.drawable.panda);
                break;
            default:holder.circleImageView.setImageResource(R.drawable.panda);
                break;
        }
        Glide.with(context).load(upload.getUrl()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return uploads.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder
    {
        public TextView textView;
        public ImageView imageView;
        public CircleImageView circleImageView;

        public ViewHolder(View itemView)
        {
            super(itemView);
            circleImageView=(CircleImageView) itemView.findViewById(R.id.userimage);
            textView=(TextView)itemView.findViewById(R.id.username);
            imageView=(ImageView)itemView.findViewById(R.id.imageView);
        }
    }

}

