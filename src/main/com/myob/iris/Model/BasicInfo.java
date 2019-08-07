package com.myob.iris.Model;

import java.util.Date;

public class BasicInfo {
    private String givenName;
    private String familyName;
    private int superRate;
    private int annualSalary;
    private String startDate;
    private String endDate;

    public BasicInfo(String givenName, String familyName, int superRate, int annualSalary, String startDate, String endDate) {
        this.givenName = givenName;
        this.familyName = familyName;
        this.superRate = superRate;
        this.annualSalary = annualSalary;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getSuperRate() {
        return superRate;
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public String getFullName() {
        return givenName + " " + familyName;
    }

    public String getPayPeriod() {
        return startDate + " - " + endDate;
    }

}
