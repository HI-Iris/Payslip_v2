package com.myob.iris;

public class Validator {
    public boolean isLetter(String testString) {
        return testString.matches("[a-zA-Z]+");
    }

    public boolean isNumber(String testString){
        return testString.matches("[0-9]+");
    }
}
