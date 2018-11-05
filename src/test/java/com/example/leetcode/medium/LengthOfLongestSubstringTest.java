package com.example.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class LengthOfLongestSubstringTest {


    @Test
    public void should_return_When_string_is_abcabcbb() {
        Assert.assertEquals(3, LengthOfLongestSubstring.lengthOfLongestSubstring("abcabcbb"));
    }



    @Test
    public void should_return_When_string_is_dvdf() {
        Assert.assertEquals(3, LengthOfLongestSubstring.lengthOfLongestSubstring("dvdf"));
    }

    @Test
    public void should_return_When_string_is_au() {
        Assert.assertEquals(2, LengthOfLongestSubstring.lengthOfLongestSubstring("au"));
    }

    @Test
    public void should_return_When_string_is_null_string() {
        Assert.assertEquals(0, LengthOfLongestSubstring.lengthOfLongestSubstring(""));
    }



    @Test
    public void should_return_When_string_is_bbbb() {
        Assert.assertEquals(1, LengthOfLongestSubstring.lengthOfLongestSubstring("bbbbb"));
    }


}
