package com.example.mynotes;

import java.util.Date;

public class Note {
    private String title;
    private String description;
    private Date createdTime;
    private boolean mSaved;

    public Note() {
        this.createdTime = new Date();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public boolean isSaved() {
        return mSaved;
    }

    public void setSaved(boolean mSaved) {
        this.mSaved = mSaved;
    }
}
