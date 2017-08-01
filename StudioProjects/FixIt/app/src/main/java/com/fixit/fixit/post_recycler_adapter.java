package com.fixit.fixit;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by saintagrro on 6/6/17.
 */

public class post_recycler_adapter extends RecyclerView.Adapter<post_recycler_adapter.ViewHolder> {
 List<Post> posts;
    StorageReference profileImageRef;

    public post_recycler_adapter(List<Post> posts){
        this.posts = posts;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.balloon_post, parent, false);
        return new ViewHolder(view);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        String fixer =  posts.get(position).getFixer();
        String fixey =  posts.get(position).getFixey();
        String transaction_info =  posts.get(position).getTransaction_info();
        String device = posts.get(position).getDevice();
        String part= posts.get(position).getPart();
        String userID = posts.get(position).getUserID();
        profileImageRef = FirebaseStorage.getInstance().getReference().child("images/"+userID+"/profile_pic");
        profileImageRef.getBytes(Long.MAX_VALUE).addOnSuccessListener(new OnSuccessListener<byte[]>() {
            @Override
            public void onSuccess(byte[] bytes) {
                Bitmap bm = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
                DisplayMetrics dm = new DisplayMetrics();

                holder.prof_pic.setMinimumHeight(dm.heightPixels);
                holder.prof_pic.setMinimumWidth(dm.widthPixels);
                holder.prof_pic.setImageBitmap(bm);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception) {
                holder.prof_pic.setImageResource(R.mipmap.no_pic);
            }
        });

        holder.b_status.setText(posts.get(position).getStatus());
        holder.b_date.setText(posts.get(position).getDateTime());

        holder.b_ratingbar.setRating(Float.parseFloat(posts.get(position).getRating()));


        holder.b_transaction.setText(Html.fromHtml("<b>"+ fixer +" </b>"+ transaction_info +" "+ "<b>"+ fixey + "</b>" + "'s " + device +" "+ part,0));
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
        CircleImageView prof_pic;

        public ViewHolder(View itemView){
            super(itemView);
            b_status = (TextView) itemView.findViewById(R.id.status);
            b_date = (TextView) itemView.findViewById(R.id.date);
            b_ratingbar = (RatingBar) itemView.findViewById(R.id.ratingBar);
            b_transaction = (TextView) itemView.findViewById(R.id.transaction_info);
            //b_fixey = (TextView) itemView.findViewById(R.id.fixey);
            //b_fixer = (TextView) itemView.findViewById(R.id.fixer);
            prof_pic = (CircleImageView) itemView.findViewById(R.id.post_pic_fixey);
        }
    }


}
