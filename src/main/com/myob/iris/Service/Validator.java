package com.myob.iris.Service;

public class Validator {
    public boolean isLetter(String testString) {
        return testString.matches("[a-zA-Z]+");
    }

    public boolean isNumber(String testString){
        return testString.matches("[0-9]+");
    }

    public boolean isDate(String testString){
        return false;
    }
}
