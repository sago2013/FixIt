package com.fixit.fixit;

import android.media.Rating;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.view.ViewGroupCompat;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by saintagrro on 6/6/17.
 */

public class post_recycler_adapter extends RecyclerView.Adapter<post_recycler_adapter.ViewHolder> {
 List<post> posts;

    public post_recycler_adapter(List<post> posts){
        this.posts = posts;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.balloon_post, parent, false);
        return new ViewHolder(view);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String fixer =  posts.get(position).getFixer();
        String fixey =  posts.get(position).getFixey();
        String transaction_info =  posts.get(position).getTransaction_info();
        String device = posts.get(position).getDevice();
        String part= posts.get(position).getPart();

        holder.b_status.setText(posts.get(position).getStatus());
        holder.b_date.setText(posts.get(position).getDate());

        holder.b_ratingbar.setRating(Float.parseFloat(posts.get(position).getRating()));


        holder.b_transaction.setText(Html.fromHtml("<b>"+ fixer +"</b>"+ transaction_info +" "+ "<b>"+ fixey + "</b>" + "'s " + device +" "+ part,0));
        //holder.b_fixer.setText(posts.get(position).getFixer());
        //holder.b_fixey.setText(posts.get(position).getFixey());
    }
    @Override
    public int getItemCount() {
        return posts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView b_status;
        TextView b_date;
        TextView b_transaction;
        TextView b_fixer;
        TextView b_fixey;
        RatingBar b_ratingbar;

        public ViewHolder(View itemView){
            super(itemView);
            b_status = (TextView) itemView.findViewById(R.id.status);
            b_date = (TextView) itemView.findViewById(R.id.date);
            b_ratingbar = (RatingBar) itemView.findViewById(R.id.ratingBar);
            b_transaction = (TextView) itemView.findViewById(R.id.transaction_info);
            //b_fixey = (TextView) itemView.findViewById(R.id.fixey);
            //b_fixer = (TextView) itemView.findViewById(R.id.fixer);
        }
    }


}
