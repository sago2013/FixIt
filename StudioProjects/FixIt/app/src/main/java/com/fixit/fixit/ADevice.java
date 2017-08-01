package com.fixit.fixit;

/**
 * Created by saintagrro on 7/11/17.
 */

public class ADevice {
    private String name;
    private String model;
    private String brand;
    private String fixitInteractionCount;
    private String OS;
    private String userId;
    private String parts;
    private String device;
    private String fixType;
    private String lastFixDate;

    public String getFixType() {
        return fixType;
    }

    public void setFixType(String fixType) {
        this.fixType = fixType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public String getLastFixDate() {
        return lastFixDate;
    }

    public void setLastFixDate(String lastFixDate) {
        this.lastFixDate = lastFixDate;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFixitInteractionCount() {
        return fixitInteractionCount;
    }

    public void setFixitInteractionCount(String fixitInteractionCount) {
        this.fixitInteractionCount = fixitInteractionCount;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getParts() {
        return parts;
    }

    public void setParts(String parts) {
        this.parts = parts;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }
//full constructor
    public ADevice(String name, String model, String brand, String fixitInteractionCount, String OS, String userId, String parts, String device, String lastFixDate, String fixType) {
        this.name = name;
        this.model = model;
        this.brand = brand;
        this.fixitInteractionCount = fixitInteractionCount;
        this.OS = OS;
        this.userId = userId;
        this.parts = parts;
        this.device = device;
        this.lastFixDate = lastFixDate;
        this.fixType = fixType;
    }

    //default constuctor
    public ADevice() {
    }
   //constructor for test cases
    public ADevice(String name, String model, String brand, String OS, String device) {
        this.name = name;
        this.model = model;
        this.brand = brand;
        this.OS = OS;
        this.device = device;
    }
}


