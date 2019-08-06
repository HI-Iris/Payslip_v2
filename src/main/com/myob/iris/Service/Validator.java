package com.myob.iris.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Validator {
    public boolean isLetter(String testString) {
        return testString.matches("[a-zA-Z]+");
    }

    public boolean isNumber(String testString) {
        return testString.matches("[0-9]+");
    }

    public boolean isDate(String testString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM", Locale.ENGLISH);
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(testString.trim());
        } catch (ParseException e) {
            System.out.println(e);
            return false;
        }
        return true;
    }
}
