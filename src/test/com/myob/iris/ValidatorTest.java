package com.myob.iris;

import com.myob.iris.Service.Validator;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class ValidatorTest {
    private Validator validator = new Validator();

    @Test
    public void givenLettersTestIsLetterShouldReturnTrue() {
        String testString = "thisIsLetter";
        assertTrue(validator.isLetter(testString));
    }

    @Test
    public void givenNumbersTestIsLetterShouldReturnFalse() {
        String testString = "123";
        assertFalse(validator.isLetter(testString));
    }

    @Test
    public void givenLettersAndNumbersTestIsLetterShouldReturnFalse() {
        String testString = "123ABC";
        assertFalse(validator.isLetter(testString));
    }

    @Test
    public void givenLettersTestIsNumberShouldReturnFalse() {
        String testString = "thisIsLetter";
        assertFalse(validator.isNumber(testString));
    }

    @Test
    public void givenNumbersTestIsNumberShouldReturnTrue() {
        String testString = "1234";
        assertTrue(validator.isNumber(testString));
    }

    @Test
    public void givenLettersAndNumbersTestIsNumberShouldReturnFalse() {
        String testString = "123ABC";
        assertFalse(validator.isNumber(testString));
    }

    @Test
    public void givenLettersTestIsDateShouldReturnFalse() {
        String testString = "thisIsLetter";
        assertFalse(validator.isDate(testString));
    }

    @Test
    public void givenNumbersTestIsDateShouldReturnFalse() {
        String testString = "1234";
        assertFalse(validator.isDate(testString));
    }

    @Test
    public void givenLettersAndNumbersTestIsDateShouldReturnFalse() {
        String testString = "123ABC";
        assertFalse(validator.isDate(testString));
    }

    @Test
    public void givenDateString1TestIsDateShouldReturnTrue() {
        String testString = "10 March";
        assertTrue(validator.isDate(testString));
    }

    @Test
    public void givenDateString2TestIsDateShouldReturnTrue() {
        String testString = "10 Mar";
        assertTrue(validator.isDate(testString));
    }

    @Test
    public void givenDateStringTestIsDateShouldReturnTrue() {
        String testString = "20 Feb";
        assertTrue(validator.isDate(testString));
    }
}
