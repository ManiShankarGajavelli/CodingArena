package org.codearena.arrays;

import org.codearena.annnotations.ProblemMetadata;

import java.util.List;

@ProblemMetadata( tags = {"Loops","Patterns"},difficulty = "Easy",title = "Larget Element in an array")
public class ArrayProblems1 {

    public int getLargestElementInArray (List<Integer> arr){
        int largestElement = 0;
        for (Integer i : arr) {
            if(largestElement<= i  ){
                largestElement = i;
            }
        }
        return largestElement;
    }

}
