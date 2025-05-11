package org.codearena;

import org.codearena.annnotations.ProblemMetadata;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 * Tags: Sliding Window
 * Difficulty: Medium
 */
@ProblemMetadata(tags = {"String","Hash Table","Sliding Window"}, difficulty = "Medium",title = "Longest Substring Without Repeating Characters",
link = "https://leetcode.com/problems/longest-substring-without-repeating-characters/description/",
problemId = "3")
public class LongestSubstring {

    public int lengthOfLongestSubstring( String s) {

        Set<Character> set = new HashSet<>();
        int start = 0,end =0,maxValue =0;

        while(end != s.length()){
            if (!set.contains(s.charAt(end))){
                set.add(s.charAt(end++));
                maxValue = Math.max(maxValue, set.size());
            }else{
                set.remove(s.charAt(start++));
            }

        }
        return maxValue;
    }
}
