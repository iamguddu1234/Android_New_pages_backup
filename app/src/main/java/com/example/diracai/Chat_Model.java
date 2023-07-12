package com.example.diracai;

public class Chat_Model {
    String image;
    String title;
    String subTitle;
    String time;
    String nu_of_msg;



    public Chat_Model(String title, String subTitle, String time) {
        this.title = title;
        this.subTitle = subTitle;
        this.time = time;
    }

    public Chat_Model(String image, String title, String subTitle, String time, String nu_of_msg) {
        this.image = image;
        this.title = title;
        this.subTitle = subTitle;
        this.time = time;
        this.nu_of_msg = nu_of_msg;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNu_of_msg() {
        return nu_of_msg;
    }

    public void setNu_of_msg(String nu_of_msg) {
        this.nu_of_msg = nu_of_msg;
    }
}
