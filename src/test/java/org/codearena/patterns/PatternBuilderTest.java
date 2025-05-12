package org.codearena.patterns;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.codearena.PerformanceRule;

public class PatternBuilderTest {

    @Rule
    public PerformanceRule performanceRule = new PerformanceRule();

    PatternBuilder pb = new PatternBuilder();

    @Test
    public void testFullStars() {
        String currentOutput = pb.getFullStars(4);
        String expectedOutput = "****\n" +
                        "****\n" +
                        "****\n" +
                        "****\n";
        Assert.assertEquals(expectedOutput, currentOutput);
    }

    @Test
    public void testFullStars1() {
        String currentOutput = pb.getFullStars(5);
        String expectedOutput = "*****\n" +
                "*****\n" +
                "*****\n" +
                "*****\n" +
                "*****\n";
        Assert.assertEquals(expectedOutput, currentOutput);
    }


}
