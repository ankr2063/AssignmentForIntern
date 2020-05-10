package com.ankit.assignmentforintern;

public class Posts {

    private int img;
    private String title;
    private String body;

    public Posts(int img, String title, String body){
        this.body = body;
        this.img = img;
        this.title = title;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getImg() {
        return img;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
