package com.training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberPatternTest {
    private NumberPattern numberPattern = new NumberPattern();

    @Test
    public void legalCases() {
        Assert.assertEquals(numberPattern.getCellVall(1,1), 1);
        Assert.assertEquals(numberPattern.getCellVall(2,1), 1);
        Assert.assertEquals(numberPattern.getCellVall(3,3), 1);
        Assert.assertEquals(numberPattern.getCellVall(3,2), 2);
    }
//
//    @Test (expectedExceptions = IllegalArgumentException.class)
//    public void illegalCase1() {
//        numberPattern.factorialUsingRecursion(-6);
//    }
//
//    @Test (expectedExceptions = IllegalArgumentException.class)
//    public void illegalCase2() {
//        numberPattern.factorialUsingIteration(-6);
//    }
//
//    @Test (expectedExceptions = IllegalArgumentException.class)
//    public void illegalCase3() {
//        numberPattern.factorialUsingRecursion(13);
//    }
//
//    @Test (expectedExceptions = IllegalArgumentException.class)
//    public void illegalCase4() {
//        numberPattern.factorialUsingIteration(13);
//    }
}
