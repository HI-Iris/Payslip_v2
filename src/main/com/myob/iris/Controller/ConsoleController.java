package com.myob.iris.Controller;

import com.myob.iris.Model.BasicInfo;
import com.myob.iris.Service.Validator;

import java.util.Scanner;

public class ConsoleController extends Controller {
    private Scanner scanner = new Scanner(System.in);

    ConsoleController(Validator validator) {
        super(validator);
    }

    @Override
    BasicInfo getBasicInfo() {
        String givenName = getGivenName();
        String familyName = getFamilyName();
        int superRate = getSuperRate();
        int salary = getSalary();
        String startDate = getStartDate();
        String endDate = getEndDate();
        return new BasicInfo(givenName, familyName, superRate, salary, startDate, endDate);
    }

    @Override
    String getGivenName() {
        String givenName;
        do {
            System.out.println("Please enter your given name:");
            givenName = scanner.nextLine();
        } while (!validator.isLetter(givenName));
        return givenName;
    }

    @Override
    String getFamilyName() {
        String familyName;
        do {
            System.out.println("Please enter your family name:");
            familyName = scanner.nextLine();
        } while (!validator.isLetter(familyName));
        return familyName;
    }

    @Override
    int getSuperRate() {
        String superRate;
        do {
            System.out.println("Please enter your super rate:");
            superRate = scanner.nextLine();
        } while (!validator.isNumber(superRate));
        return Integer.parseInt(superRate);
    }

    @Override
    int getSalary() {
        String salary;
        do {
            System.out.println("Please enter your salary:");
            salary = scanner.nextLine();
        } while (!validator.isNumber(salary));
        return Integer.parseInt(salary);
    }

    @Override
    String getStartDate() {
        String startDate;
        do {
            System.out.println("Please enter your pay start date:");
            startDate = scanner.nextLine();
        } while (!validator.isDate(startDate));
        return startDate;
    }

    @Override
    String getEndDate() {
        String endDate;
        do {
            System.out.println("Please enter your pay start date:");
            endDate = scanner.nextLine();
        } while (!validator.isDate(endDate));
        return endDate;
    }
}
