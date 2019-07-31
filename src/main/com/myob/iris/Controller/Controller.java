package com.myob.iris.Controller;

import com.myob.iris.Model.BasicInfo;
import com.myob.iris.Service.Validator;

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
