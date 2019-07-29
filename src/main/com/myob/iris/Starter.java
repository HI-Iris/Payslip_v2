package com.myob.iris;

import java.util.Scanner;

public class Starter {

    public void start() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("-*-*-*-*-Welcome to the payslip generator!-*-*-*-*-");
        System.out.println("Please select the input method: \n1. CSV file\n2. Console");
        String option = userInput.nextLine();
        switch (option){
            case "1":
                System.out.println("New features coming soon");
                break;
            case "2":
                System.out.println("nice choice");
                break;
            default:
                System.out.println("I don't understand, please select from 1 or 2");
                break;

        }
//        System.out.println("Please enter you given name:");
//        String givenName = userInput.nextLine();
//        System.out.println("Please enter you family name:");
//        String familyName = userInput.nextLine();
//        System.out.println("Please enter your annual salary:");
//        System.out.println("Please enter your super rate:");
    }

}
