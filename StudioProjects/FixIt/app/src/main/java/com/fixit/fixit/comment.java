package com.fixit.fixit;

/**
 * Created by saintagrro on 7/3/17.
 */

public class comment {
    private String Author;
    private String body;
    private String likes;


    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    //regular constructor
    public comment(String author, String body, String likes) {
        Author = author;
        this.body = body;
        this.likes = likes;
    }

    // Default constructor required for calls to DataSnapshot.getValue(User.class)
    public comment() {
    }



}