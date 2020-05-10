package com.ankit.assignmentforintern;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.MyViewHolder> {

    private ArrayList<Posts> posts;
    Context mcontext;

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView title_TV, description_TV;
        private ImageView img;

        public MyViewHolder(View view) {
            super(view);
            this.title_TV = view.findViewById(R.id.title);
            this.description_TV = view.findViewById(R.id.text);
            this.img = view.findViewById(R.id.img);
        }
    }

    public PostsAdapter(ArrayList<Posts> posts) {
        this.posts = posts;
    }

    @Override
    public PostsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_posts, parent, false);
        mcontext = parent.getContext();
        return new PostsAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final PostsAdapter.MyViewHolder holder, int position) {
        Posts post= posts.get(position);
        holder.title_TV.setText(post.getTitle());
        holder.description_TV.setText(post.getBody());
        Picasso.with(mcontext).load(post.getImg()).fit().centerCrop().into(holder.img);
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }
}