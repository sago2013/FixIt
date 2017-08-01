package com.fixit.fixit;

import android.support.v7.widget.DrawableUtils;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by saintagrro on 7/21/17.
 */

public class ADeviceRecyclerAdapter extends RecyclerView.Adapter<ADeviceRecyclerAdapter.ViewHolder> {
    private List <ADevice> devices;
    public ADeviceRecyclerAdapter(List<ADevice> devices){
        this.devices = devices;
    }

    @Override
    public  ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from((parent.getContext())).inflate(R.layout.balloon_device, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        String name = devices.get(position).getName();
        String os = devices.get(position).getOS();
        String brand = devices.get(position).getBrand();
        String  fixDate = devices.get(position).getLastFixDate();
        String model = devices.get(position).getModel();
        String deviceType = devices.get(position).getDevice();
        String fixType = devices.get(position).getFixType();
        String parts = devices.get(position).getParts();

        if (parts.length()>0){
            holder.partsTV.setText(parts);
        }

        if (deviceType.equals("phone")){
            holder.DevicePic.setImageResource(R.drawable.ic_phone_black_24dp);

        }else if (deviceType.equals("tablet")){
            holder.DevicePic.setImageResource(R.drawable.ic_tables_black_24dp);

        }else if (deviceType.equals("laptop")){
            holder.DevicePic.setImageResource(R.drawable.ic_laptop_black_24dp);

        }else if (deviceType.equals("desktop")){
            holder.DevicePic.setImageResource(R.drawable.ic_desktop_black_24dp);
        }else{
            holder.DevicePic.setImageResource(R.drawable.ic_help_black_24dp);
        }

        holder.nameTV.setText(name);
        holder.osTV.setText(os);
        holder.brandTV.setText(brand);
        holder.fixDateTV.setText(" | "+fixDate+" | ") ;
        holder.modelTV.setText(model);
        holder.typeTV.setText(fixType + " ");

    }

    @Override
    public int getItemCount() {
        return devices.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.deviceName) TextView nameTV;
        @BindView(R.id.os) TextView osTV;
        @BindView(R.id.brand) TextView brandTV;
        @BindView(R.id.model) TextView modelTV;
        @BindView(R.id.repairType) TextView typeTV;
        @BindView(R.id.typeImage) CircleImageView DevicePic;
        @BindView(R.id.fixDate) TextView fixDateTV;
        @BindView(R.id.deviceParts) TextView partsTV;


        public ViewHolder(View itemview){
            super(itemview);
            ButterKnife.bind(this, itemview);
        }
    }
}


