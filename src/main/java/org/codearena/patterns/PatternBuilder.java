package org.codearena.patterns;

public class PatternBuilder {

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
}