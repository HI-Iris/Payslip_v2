package com.myob.iris;

public class FileController extends Controller{
    public FileController(Validator validator) {
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
}
