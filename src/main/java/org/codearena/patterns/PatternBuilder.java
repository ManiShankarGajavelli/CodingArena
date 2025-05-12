package org.codearena.patterns;

import org.codearena.annnotations.ProblemMetadata;

public class PatternBuilder {

    @ProblemMetadata(tags = "Patterns",title = "Full Array of Stars",difficulty = "Easy")
    public String getFullStars(int starsCount) {

        StringBuilder output = new StringBuilder("");

        for (int i = 0; i < starsCount; i++) {
            for (int j = 0; j < starsCount; j++) {
                System.out.print("*");
                output.append("*");
            }
            System.out.println("");
            output.append("\n");
        }
    return output.toString();
    }

    @ProblemMetadata(tags = {"Patterns","Loops"},title = "Generate Left Aligned Stars",difficulty = "Easy")
    public String generateLeftAlignedStars(int rows) {

        StringBuilder output = new StringBuilder("");

        for (int i = 0; i <rows; i++) {
            for (int j = 0; j <= i; j++) {
                output.append("*");
            }
            output.append("\n");
        }
        return output.toString();
    }

    @ProblemMetadata(tags = {"Patterns","Loops"},title = "Generate Left Aligned Sequencial Numbers",difficulty = "Easy")
    public String generateLeftAlignedSequencialNumbers(int rows) {

        StringBuilder output = new StringBuilder("");

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                output.append(j);
            }
            output.append("\n");
        }
        return output.toString();
    }

    @ProblemMetadata(tags = {"Patterns","Loops"},title = "Generate Left Aligned Same Numbers",difficulty = "Easy")
    public String generateLeftAlignedSameNumbers(int rows) {

        StringBuilder output = new StringBuilder("");

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                output.append(i);
            }
            output.append("\n");
        }
        return output.toString();
    }




    @ProblemMetadata(tags = {"Patterns","Loops"},title = "Generate Left Aligned Inverted start",difficulty = "Easy")
    public String generateLeftAlignedInvertedStarTriangle(int rows) {

        StringBuilder output = new StringBuilder("");

        for (int i = rows; i > 0; i--) {
            for (int j = i; j >0; j--) {
                output.append("*");
            }
            output.append("\n");
        }
        return output.toString();
    }

    @ProblemMetadata(tags = {"Patterns","Loops"},title = "Generate Left Aligned Inverted Sequence Numbers",difficulty = "Easy")
    public String generateLeftAlignedInvertedSequenceNumber(int rows) {

        StringBuilder output = new StringBuilder("");

        for (int i = rows; i > 0; i--) {
            for (int j = 1; j <i; j++) {
                output.append(j);
            }
            output.append("\n");
        }
        return output.toString();
    }

    @ProblemMetadata(tags = {"Patterns","Loops"},title = "Generate pyramid Of Stars",difficulty = "Medium")
    public String generatePyramidOfStars(int rows) {

        StringBuilder output = new StringBuilder(" ");

        // This is the outer loop which will loop for the rows.
        for (int i = 0; i <rows; i++) {

            // For printing the spaces before stars in each row
            for (int j =0; j<rows-i-1; j++)
            {
                System.out.print(" ");
            }

            for (int j = 0; j <2*i+1; j++) {
                output.append("*");
            }
            // For printing the spaces after the stars in each row
            for (int j =0; j<rows-i-1; j++)
            {
                System.out.print(" ");
            }

            output.append("\n");
        }
        return output.toString();
    }



}