package com.myob.iris.Service;

import com.myob.iris.Model.BasicInfo;
import com.myob.iris.Model.Payslip;

public class PayslipGenerator {
    private BasicInfo basicInfo;

    public PayslipGenerator(BasicInfo basicInfo) {
        this.basicInfo = basicInfo;
    }

    private static final int PERCENTAGE = 100;
    private static final float NUM_OF_MONTH = 12;

    public Payslip generatePayslip() {
        int grossIncome = getGrossIncome();
        int superAmount = getSuperAmount();
        int incomeTax = getIncomeTax();
        int netIncome = grossIncome - incomeTax;
        String staffName = basicInfo.getFullName();
        return new Payslip(staffName, basicInfo.getSalary(),grossIncome,netIncome,superAmount);
    }

    int getGrossIncome() {
        return Math.round(basicInfo.getSalary() / NUM_OF_MONTH);
    }

    int getSuperAmount() {
        return Math.round(basicInfo.getSalary() * basicInfo.getSuperRate() / PERCENTAGE);
    }

    int getIncomeTax() {
        double grossTax;
        if (basicInfo.getSalary() <= 18200) {
            grossTax = 0;
        } else if (basicInfo.getSalary() <= 37000) {
            grossTax = Math.floor((basicInfo.getSalary() - 18200) * 0.19);
        } else if (basicInfo.getSalary() <= 87000) {
            grossTax = 3572 + Math.floor((basicInfo.getSalary() - 37000) * 0.325);
        } else if (basicInfo.getSalary() <= 180000) {
            grossTax = 19822 + Math.floor((basicInfo.getSalary() - 87000) * 0.37);
        } else {
            grossTax = 54232 + Math.floor((basicInfo.getSalary() - 180000) * 0.45);
        }
        return (int) Math.round(grossTax / 12);
    }
}

