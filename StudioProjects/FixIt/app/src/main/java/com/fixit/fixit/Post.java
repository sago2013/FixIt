package com.fixit.fixit;

import android.graphics.drawable.BitmapDrawable;

import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by saintagrro on 6/6/17.
 */

public class Post {
    private String dateTime;
    private String privacy;
    //private BitmapDrawable picture;
    private String transaction_info;
    private String status;
    private String fixer;
    private String fixey;
    private String rating;
    private String device;
    private String part;
    private String userID;
    private String likes; //just a count of how many likes a post has
    private String comments; //just a count of how many comments a post has.

    ///hashmap is used to to store data in multiple locations of our firebase db
    //flattening the data will allow us to make more efficient calls to the databse.
    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("dateTime", dateTime);
        result.put("privacy", privacy);
        result.put("transaction_info", transaction_info);
        result.put("status", status);
        result.put("fixer", fixer);
        result.put("fixey", fixey);
        result.put("rating",rating);
        result.put("device", device);
        result.put("part",part);
        result.put("userID",userID);
        result.put("likes",likes);
        result.put("comments",comments);
        return result;
    }


    // Default constructor required for calls to DataSnapshot.getValue(User.class)
    public Post(){
    }

    //constructor with everything
    public Post(String dateTime, String privacy, String transaction_info, String status, String fixer, String fixey, String rating, String device, String part, String userID, String likes, String comments) {
        this.dateTime = dateTime;
        this.privacy = privacy;
        this.transaction_info = transaction_info;
        this.status = status;
        this.fixer = fixer;
        this.fixey = fixey;
        this.rating = rating;
        this.device = device;
        this.part = part;
        this.userID = userID;
        this.likes = likes;
        this.comments = comments;
    }


    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

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

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String date) {
        this.dateTime = date;
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




    //accessors that tell us if certain elements of a post exist
    public Boolean hasDateTime(){
        return (dateTime!=null);
    }
    public Boolean hasPrivacy(){
        return (privacy!=null);
    }
    public Boolean hastransInfo(){
        return (transaction_info!=null);
    }
    public Boolean hasStatus(){
        return (status!=null);
    }
    public Boolean hasFixer(){
        return (fixer!=null);
    }
    public Boolean hasFixey(){
        return (fixey!=null);
    }
    public Boolean hasRating(){
        return (rating!=null);
    }
    public Boolean hasDevice(){
        return (device!=null);
    }
    public Boolean hasPart(){
        return (part!=null);
    }
    public Boolean hasUserID(){
        return (userID!=null);
    }
    public Boolean hasLikes(){
        return (likes!=null);
    }
    public Boolean hasComments(){
        return (comments!=null);
    }


}
