package com.example.rapsk.jumpstart;

/**
 * Created by junvir on 7/29/2016.
 */
public class Project {

    public int id;
    public String name;
    public String description;
    public String ads_url;
    public int needed_fund;
    public String project_category;
    public int wishlist_counter;
    public int received_funds;
    //[]milestones
    public int progress;
    public double start_date;
    public double end_date;
    public int sme_id;
    //logo


    public Project(int id, String name, String description, String ads_url, int needed_fund, String project_category, int wishlist_counter, int received_funds, int progress, double start_date, double end_date, int sme_id) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.ads_url = ads_url;
        this.needed_fund = needed_fund;
        this.project_category = project_category;
        this.wishlist_counter = wishlist_counter;
        this.received_funds = received_funds;
        this.progress = progress;
        this.start_date = start_date;
        this.end_date = end_date;
        this.sme_id = sme_id;
    }

    public Project() {
    }
}
