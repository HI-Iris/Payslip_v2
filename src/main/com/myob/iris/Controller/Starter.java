package com.myob.iris.Controller;

import com.myob.iris.Model.BasicInfo;
import com.myob.iris.Model.Payslip;
import com.myob.iris.Service.PayslipGenerator;
import com.myob.iris.Service.Validator;

import java.util.Scanner;

public class Starter {
    private Validator validator = new Validator();

    public void start() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("-*-*-*-*-Welcome to the payslip generator!-*-*-*-*-");
        boolean inputFlag;
        Controller controller = null;
        do {
            System.out.println("Please select your preferred input method: \n1. CSV file\n2. Console");
            String option = userInput.nextLine();
            switch (option) {
                case "1":
                    System.out.println("New features coming soon");
                    controller = new FileController(validator);
                    inputFlag = true;
                    break;
                case "2":
                    System.out.println("Nice choice");
                    controller = new ConsoleController(validator);
                    inputFlag = false;
                    break;
                default:
                    System.out.println("I don't understand, please select from 1 or 2");
                    inputFlag = true;
                    break;
            }
        } while (inputFlag);
        BasicInfo basicInfo = controller.getBasicInfo();
        PayslipGenerator payslipGenerator = new PayslipGenerator(basicInfo);
        Payslip payslip = payslipGenerator.generatePayslip();
        System.out.println(payslip.toString());
    }

}
