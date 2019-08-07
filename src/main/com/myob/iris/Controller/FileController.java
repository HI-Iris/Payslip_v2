package com.myob.iris.Controller;

import com.myob.iris.Model.BasicInfo;
import com.myob.iris.Service.Validator;

public class FileController extends Controller {
    FileController(Validator validator) {
        super(validator);
    }

    @Override
    BasicInfo getBasicInfo() {
        return null;
    }

    @Override
    String getGivenName() {
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

    @Override
    String getStartDate() {
        return null;
    }

    @Override
    String getEndDate() {
        return null;
    }
}
