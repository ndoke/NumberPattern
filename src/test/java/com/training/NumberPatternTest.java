package com.training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberPatternTest {
    private NumberPattern numberPattern = new NumberPattern();

    @Test
    public void test() {
        Assert.assertEquals(numberPattern.getCellVall(1,1), 1);
        Assert.assertEquals(numberPattern.getCellVall(2,1), 1);
        Assert.assertEquals(numberPattern.getCellVall(3,3), 1);
        Assert.assertEquals(numberPattern.getCellVall(3,2), 2);

        Assert.assertEquals(numberPattern.getCellVallEfficient(5, 2), 4);
        Assert.assertEquals(numberPattern.getCellVallEfficient(5, 3), 6);
        Assert.assertEquals(numberPattern.getCellVallEfficient(6, 4), 10);
        Assert.assertEquals(numberPattern.getCellVallEfficient(7, 3), 15);
    }
}
