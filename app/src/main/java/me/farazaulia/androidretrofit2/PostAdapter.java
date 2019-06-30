package me.farazaulia.androidretrofit2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostsViewHolder> {

    private Context context;
    private List<Post> postList;

    public PostAdapter(Context context, List<Post> postList) {
        this.context = context;
        this.postList = postList;
    }

    @NonNull
    @Override
    public PostsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.post_item, viewGroup, false);
        return new PostsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostsViewHolder postsViewHolder, int i) {
        Post post = postList.get(i);
        postsViewHolder.userId.setText(String.valueOf(post.getUserId()));
        postsViewHolder.id.setText(String.valueOf(post.getId()));
        postsViewHolder.title.setText(post.getTitle());
        postsViewHolder.content.setText(post.getContent());
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }
}
