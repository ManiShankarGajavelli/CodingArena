package org.codearena;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class LongestSubstringTest {

    @Rule
    public PerformanceRule performanceRule = new PerformanceRule();

    LongestSubstring ls = new LongestSubstring();
    @Test
    public void test1() {

        int result = ls.lengthOfLongestSubstring("abcabcbb");
        Assert.assertEquals(3, result);
    }

    @Test
    public void test2() {
        int result = ls.lengthOfLongestSubstring("abcabcbb");
        Assert.assertEquals(3, result);
    }

    @Test
    public void test3() {
        int result = ls.lengthOfLongestSubstring("bbbbb");
        Assert.assertEquals(1, result);
    }

    @Test
    public void test4() {
        int result = ls.lengthOfLongestSubstring("pwwkew");
        Assert.assertEquals(3, result);
    }

    @Test
    public void test5() {
        int result = ls.lengthOfLongestSubstring("dadf");
        Assert.assertEquals(3, result);
    }

}
