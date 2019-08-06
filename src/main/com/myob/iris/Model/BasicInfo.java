package com.myob.iris.Model;

import java.util.Date;

public class BasicInfo {
    private String givenName;
    private String familyName;
    private int superRate;
    private int annualSalary;
    private Date startDate;
    private Date endDate;

    public BasicInfo(String givenName, String familyName, int superRate, int annualSalary, Date startDate, Date endDate) {
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
        return givenName + ' ' + familyName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
}
