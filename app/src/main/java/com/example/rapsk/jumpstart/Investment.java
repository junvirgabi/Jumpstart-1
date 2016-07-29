package com.example.rapsk.jumpstart;

/**
 * Created by junvir on 7/29/2016.
 */
public class Investment {

    public String project;
    public int disbursed_fund;
    public int returnOfInvestment;

    public Investment(String project, int disbursed_fund, int returnOfInvestment) {
        this.project = project;
        this.disbursed_fund = disbursed_fund;
        this.returnOfInvestment = returnOfInvestment;
    }

    public Investment() {
    }
}
