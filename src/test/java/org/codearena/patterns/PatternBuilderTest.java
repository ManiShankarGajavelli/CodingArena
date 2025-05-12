package org.codearena.patterns;

import org.codearena.annnotations.ProblemMetadata;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.codearena.PerformanceRule;

@ProblemMetadata( tags = {"Loops","Patterns"},difficulty = "Medium",title = "Different Patterns")
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

    @Test
    public void testGenerateLeftAlignedStars() {
        String currentOutput = pb.generateLeftAlignedStars(5);
        String expectedOutput =
                "*\n" +
                        "**\n" +
                        "***\n" +
                        "****\n" +
                        "*****\n";
        Assert.assertEquals(expectedOutput, currentOutput);
    }

    @Test
    public void testGenerateLeftAlignedStars1() {
        String currentOutput = pb.generateLeftAlignedStars(6);
        String expectedOutput =
                "*\n" +
                        "**\n" +
                        "***\n" +
                        "****\n" +
                        "*****\n" +
                        "******\n";
        Assert.assertEquals(expectedOutput, currentOutput);
    }

    @Test
    public void testGenerateLeftAlignedSequencialNumbers() {
        String currentOutput = pb.generateLeftAlignedSequencialNumbers(6);
        String expectedOutput =
                        "1\n" +
                        "12\n" +
                        "123\n" +
                        "1234\n" +
                        "12345\n" +
                        "123456\n";
        Assert.assertEquals(expectedOutput, currentOutput);
    }

    @Test
    public void testGenerateLeftAlignedSameNumbers() {
        String currentOutput = pb.generateLeftAlignedSameNumbers(6);
        String expectedOutput =
                "1\n" +
                        "22\n" +
                        "333\n" +
                        "4444\n" +
                        "55555\n" +
                        "666666\n";
        Assert.assertEquals(expectedOutput, currentOutput);
    }

    @Test
    public void testGenerateLeftAlignedInvertedStarTriangle() {
        String currentOutput = pb.generateLeftAlignedInvertedStarTriangle(5);
        String expectedOutput =
                        "*****\n" +
                        "****\n" +
                        "***\n" +
                        "**\n" +
                        "*\n" ;
        Assert.assertEquals(expectedOutput, currentOutput);
    }

    @Test
    public void testGenerateLeftAlignedInvertedSequenceNumber() {
        String currentOutput = pb.generateLeftAlignedInvertedSequenceNumber(5);
        String expectedOutput =
                "12345\n" +
                        "1234\n" +
                        "123\n" +
                        "12\n" +
                        "1\n" ;
        Assert.assertEquals(expectedOutput, currentOutput);
    }
    @Test
    public void testGeneratePyramidOfStars() {
        String currentOutput = pb.generatePyramidOfStars(3);
        String expectedOutput =
                        " *\n" +
                        "***\n" +
                        "*****\n";
        Assert.assertEquals(expectedOutput, currentOutput);
    }

    @Test
    public void testGeneratePyramidOfStars1() {
        String currentOutput = pb.generatePyramidOfStars(4);
        String expectedOutput =
                       " *\n" +
                        "***\n" +
                        "*****\n" +
                        "*******\n";
                ;
        Assert.assertEquals(expectedOutput, currentOutput);
    }
}
