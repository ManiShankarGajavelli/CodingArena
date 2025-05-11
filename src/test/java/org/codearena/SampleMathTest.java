package org.codearena;

import org.junit.Assert;
import org.junit.Test;

public class SampleMathTest {

    @Test
    public void testAdd() {
        SampleMath math = new SampleMath();
        int result = math.add(2, 3);
        Assert.assertEquals(5, result);
    }


    @Test
    public void testAdd1() {
        SampleMath math = new SampleMath();
        int result = math.add(2, 5);
        Assert.assertEquals(7, result);
    }
}
