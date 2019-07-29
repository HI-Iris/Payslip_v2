package com.myob.iris;

public abstract class Controller {
    Validator validator;

    public Controller(Validator validator) {
        this.validator = validator;
    }

    abstract BasicInfo getBasicInfo();
    abstract String getGivenName();
    abstract String getFamilyName();
    abstract int getSuperRate();
    abstract int getSalary();
}
