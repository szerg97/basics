package com.solid.ocp;

public class Video{

    private String title;
    private int likes;
    private int views;
    private VideoCategory category;

    public Video(String title, int likes, int views, VideoCategory category) {
        this.title = title;
        this.likes = likes;
        this.views = views;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public VideoCategory getCategory() {
        return category;
    }

    public void setCategory(VideoCategory category) {
        this.category = category;
    }

    public enum VideoCategory{
        GAMING,
        DIY,
        ENTERTAINING
    }
}
