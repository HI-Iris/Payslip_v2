package com.myob.iris.Model;

public class Payslip {

    private String staffName;
    private int grossIncome;
    private int netIncome;
    private int superAmount;
    private String payPeriod;

    public Payslip(String staffName, int grossIncome, int netIncome, int superAmount, String payPeriod) {
        this.staffName = staffName;
        this.grossIncome = grossIncome;
        this.netIncome = netIncome;
        this.superAmount = superAmount;
        this.payPeriod = payPeriod;
    }


    @Override
    public String toString() {
        return "Your payslip has been generated:\n" +
                "Name='" + staffName + '\n' +
                "Pay Period:" + payPeriod + '\n' +
                "Gross Income:" + grossIncome + '\n' +
                "Income Tax" + netIncome + '\n' +
                "Net Income:" + netIncome + '\n' +
                "Super:" + superAmount + '\n' +
                "Thank you for using MYOB!";
    }
}
