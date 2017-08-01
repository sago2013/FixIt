package com.fixit.fixit;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

/**
 * Created by saintagrro on 7/6/17.
 */

public class fixer_recycler_adapter extends RecyclerView.Adapter<fixer_recycler_adapter.ViewHolder>{
    private List <fixer> fixers;
    public fixer_recycler_adapter(List<fixer> fixers){
        this.fixers = fixers;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.balloon_fixer, parent, false);
        return new ViewHolder(view);

    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        String name = fixers.get(position).getName();
        String email = fixers.get(position).getEmail();
        String picRef = fixers.get(position).getImageref();

        holder.nameTV.setText(name);
        holder.emailTV.setText(email);
        //TODO:set up image with db imageref and bitmappoing it to the imageView

    }

    @Override
    public int getItemCount() {
        return fixers.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView nameTV;
        TextView emailTV;
        ImageView pic;

        public ViewHolder(View itemView) {
            super(itemView);
            nameTV = (TextView) itemView.findViewById(R.id.fullName);
            emailTV = (TextView) itemView.findViewById(R.id.email);
            pic = (ImageView) itemView.findViewById(R.id.profileImage);
        }
    }
}




