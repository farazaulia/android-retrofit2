package me.farazaulia.androidretrofit2;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class PostsViewHolder extends RecyclerView.ViewHolder {

    public TextView userId;
    public TextView id;
    public TextView title;
    public TextView content;

    public PostsViewHolder(@NonNull View itemView) {
        super(itemView);

        userId = (TextView) itemView.findViewById(R.id.post_userId);
        id = (TextView) itemView.findViewById(R.id.post_id);
        title = (TextView) itemView.findViewById(R.id.post_title);
        content = (TextView) itemView.findViewById(R.id.post_content);
    }
}
