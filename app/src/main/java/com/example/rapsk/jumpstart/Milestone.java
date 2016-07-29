package com.example.rapsk.jumpstart;

/**
 * Created by junvir on 7/29/2016.
 */
public class Milestone {

    public int id;
    public String[] img_url;
    public String[] vid_url;
    public String description;

    public Milestone(int id, String[] img_url, String[] vid_url, String description) {
        this.id = id;
        this.img_url = img_url;
        this.vid_url = vid_url;
        this.description = description;
    }
    public Milestone(){

    }
}
