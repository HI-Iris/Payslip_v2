package com.myob.iris;

public class BasicInfo {
    private String givenName;
    private String familyName;
    private int superRate;
    private int salary;

    public BasicInfo(String givenName, String familyName, int superRate, int salary) {
        this.givenName = givenName;
        this.familyName = familyName;
        this.superRate = superRate;
        this.salary = salary;
    }

    public int getSuperRate() {
        return superRate;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return givenName + ' ' + familyName;
    }
}
