package com.fixit.fixit;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.List;

/**
 * Created by saintagrro on 4/23/17.
 */

class mode__specific_adapter extends RecyclerView.Adapter<mode__specific_adapter.ViewHolder> {
    List<model_spec> model_list;
    private Context context;

    public mode__specific_adapter(List<model_spec> model_list, Context context){
        super();
        //Getting all the superheroes
        this.model_list = model_list;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.baloon_model_specifics, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int i) {

        model_spec Item =  model_list.get(i);
        viewHolder.name.setText(Item.getName());
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        public TextView name;

        public ViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.model_name_tv);

        }
    }

    @Override
    public int getItemCount() {
        return model_list.size();
    }
}
