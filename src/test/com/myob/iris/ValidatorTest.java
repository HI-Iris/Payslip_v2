package com.myob.iris;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class ValidatorTest {
    private Validator validator = new Validator();

    @Test
    public void givenLettersShouldReturnTrue() {
        String testString = "t";
        assertTrue(validator.isLetter(testString));
    }

    @Test
    public void givenNumberShouldReturnFalse(){
        String testString = "123";
        assertFalse(validator.isLetter(testString));
    }

    @Test
    public void givenLettersAndNumbersShouldReturnFalse(){
        String testString = "123ABC";
        assertFalse(validator.isLetter(testString));
    }

    @Test
    public void givenLettersShouldReturnFalse(){
        String testString = "this is invalid";
        assertFalse(validator.isNumber(testString));
    }

    @Test
    public void givenNumberShouldReturnTrue(){
        String testString = "1234";
        assertTrue(validator.isNumber(testString));
    }
}
