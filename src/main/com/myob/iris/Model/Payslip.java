package com.myob.iris.Model;

public class Payslip {

    private String staffName;
    private int annualSalary;
    private int grossIncome;
    private int netIncome;
    private int superAmount;


    @Override
    public String toString() {
        return "Your payslip has been generated:\n" +
                "Name='" + staffName + '\n' +
                "Pay Period:" + annualSalary + '\n' +
                "Gross Income:" + grossIncome + '\n' +
                "Income Tax" + netIncome + '\n' +
                "Net Income:" + netIncome + '\n' +
                "Super:" + superAmount + '\n' +
                "Thank you for using MYOB!";
    }
}
