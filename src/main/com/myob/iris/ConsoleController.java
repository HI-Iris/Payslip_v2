package com.myob.iris;

import java.util.Scanner;

public class ConsoleController extends Controller {

    public ConsoleController(Validator validator) {
        super(validator);
    }


    @Override
    BasicInfo getBasicInfo() {
        String givenName = getGivenName();
        String familyName = getFamilyName();
        int superRate = getSuperRate();
        int salary = getSalary();
        return new BasicInfo(givenName, familyName, superRate, salary);
    }

    @Override
    String getGivenName() {
        Scanner scanner = new Scanner(System.in);
        String givenName;
        do{
            System.out.println("Please enter your given name:");
            givenName = scanner.nextLine();
        }while(!validator.isLetter(givenName));

        return null;
    }

    @Override
    String getFamilyName() {
        return null;
    }

    @Override
    int getSuperRate() {
        return 0;
    }

    @Override
    int getSalary() {
        return 0;
    }
}
