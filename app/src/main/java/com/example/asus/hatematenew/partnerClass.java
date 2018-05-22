package com.example.asus.hatematenew;

import android.graphics.drawable.Drawable;

public class partnerClass {

    private String name;
    private String bio;
    private String matchPercent;
    private String hateTopic;
    private Drawable displayPhoto;

    public partnerClass(String name, String bio, String matchPercent, String hateTopic, Drawable displayPhoto) {
        this.name = name;
        this.bio = bio;
        this.matchPercent = matchPercent;
        this.hateTopic = hateTopic;
        this.displayPhoto = displayPhoto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getMatchPercent() {
        return matchPercent;
    }

    public void setMatchPercent(String matchPercent) {
        this.matchPercent = matchPercent;
    }

    public String getHateTopic() {
        return hateTopic;
    }

    public void setHateTopic(String hateTopic) {
        this.hateTopic = hateTopic;
    }

    public Drawable getDisplayPhoto() {
        return displayPhoto;
    }

    public void setDisplayPhoto(Drawable displayPhoto) {
        this.displayPhoto = displayPhoto;
    }
}
