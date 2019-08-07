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
        return new Payslip(staffName, grossIncome, netIncome, superAmount, basicInfo.getPayPeriod());
    }

    private int getGrossIncome() {
        return Math.round(basicInfo.getAnnualSalary() / NUM_OF_MONTH);
    }

    private int getSuperAmount() {
        return Math.round(getGrossIncome() * basicInfo.getSuperRate() / PERCENTAGE);
    }

    private int getIncomeTax() {
        double incomeTax;
        if (basicInfo.getAnnualSalary() <= 18200) {
            incomeTax = 0;
        } else if (basicInfo.getAnnualSalary() <= 37000) {
            incomeTax = Math.floor((basicInfo.getAnnualSalary() - 18200) * 0.19);
        } else if (basicInfo.getAnnualSalary() <= 87000) {
            incomeTax = 3572 + Math.floor((basicInfo.getAnnualSalary() - 37000) * 0.325);
        } else if (basicInfo.getAnnualSalary() <= 180000) {
            incomeTax = 19822 + Math.floor((basicInfo.getAnnualSalary() - 87000) * 0.37);
        } else {
            incomeTax = 54232 + Math.floor((basicInfo.getAnnualSalary() - 180000) * 0.45);
        }
        return (int) Math.round(incomeTax / 12);
    }
}

