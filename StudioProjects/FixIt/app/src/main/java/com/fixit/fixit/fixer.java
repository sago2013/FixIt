package com.fixit.fixit;

/**
 * Created by saintagrro on 7/6/17.
 */

public class fixer {
    private String name;
    private String email;
    private String imageref;


    public fixer(String name, String email, String imageref) {
        this.name = name;
        this.email = email;
        this.imageref = imageref;
    }
    public fixer(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImageref() {
        return imageref;
    }

    public void setImageref(String imageref) {
        this.imageref = imageref;
    }
}
