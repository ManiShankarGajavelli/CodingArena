package org.codearena.arrays;

import org.codearena.PerformanceRule;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

import java.util.Arrays;

public class ArrayProblems1Test {

    @Rule
    public PerformanceRule performanceRule = new PerformanceRule();

    ArrayProblems1 arr = new ArrayProblems1();

    @Test
    public void test1() {
        Integer[] arrList = {1,3,5,8};
        int result = arr.getLargestElementInArray(Arrays.asList(arrList));
        Assert.assertEquals(8, result);
    }

}
