package com.fixit.fixit;

/**
 * Created by saintagrro on 6/26/17.
 */

public class User {
    private String name;
    private String phone;
    //private String profPicURL;
    private String bio;
    private String rating;
    private String email;

    // Default constructor required for calls to DataSnapshot.getValue(User.class)
    public User(){
    }
    //regular constructor
    public User(String name, String phone, String bio, String rating,String email) {
        this.name = name;
        this.phone = phone;
        //this.profPicURL = profPicURL;
        this.bio = bio;
        this.rating = rating;
        this.email = email;
    }

    public Boolean hasrating(){
        return (rating!=null);
    }
    public Boolean hasbio(){
        return (bio!=null);
    }
    public Boolean hasphone(){
        return (phone!=null);
    }
    public Boolean hasname(){
        return (name!=null);
    }


    //getters and setters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }



    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
