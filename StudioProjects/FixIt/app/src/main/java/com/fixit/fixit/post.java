package com.fixit.fixit;

import android.graphics.drawable.BitmapDrawable;

/**
 * Created by saintagrro on 6/6/17.
 */

public class post {
    private String date;
    private String time;
    private String privacy;
    //private BitmapDrawable picture;
    private String transaction_info;
    private String status;
    private String fixer;
    private String fixey;
    private String rating;
    private String device;
    private String part;


    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public String getTransaction_info() {
        return transaction_info;
    }

    public void setTransaction_info(String transaction_info) {
        this.transaction_info = transaction_info;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFixer() {
        return fixer;
    }

    public void setFixer(String fixer) {
        this.fixer = fixer;
    }

    public String getFixey() {
        return fixey;
    }

    public void setFixey(String fixey) {
        this.fixey = fixey;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }


    public post(String date, String time, String privacy, String transaction_info, String device, String part, String status, String fixer, String fixey, String rating) {
        this.date = date;
        this.time = time;
        this.privacy = privacy;
        this.transaction_info = transaction_info;
        this.status = status;
        this.fixer = fixer;
        this.fixey = fixey;
        this.rating = rating;
        this.device = device;
        this.part = part;
    }

}
