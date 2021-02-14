package com.vjain.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TwoSumTest {

    private TwoSum twoSum;

    private void printArray(int result[]){


    }

    @Before
    public void setUp() throws Exception {
        twoSum = new TwoSum();
    }

    /**
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
     */
    @Test
    public void twoSumExample1() {
        int expectedResult [] = {0,1};
        int nums[] = {2,7,11,15};
        int target = 9;
        int actualResult[] = twoSum.twoSum(nums, target);
        assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     */
    @Test
    public void twoSumExample2() {
        int expectedResult [] = {1,2};
        int nums[] = {3,2,4};
        int target = 6;
        int actualResult[] = twoSum.twoSum(nums, target);
        assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     */
    @Test
    public void twoSumExample3() {
        int expectedResult [] = {0,1};
        int nums[] = {3,3};
        int target = 6;
        int actualResult[] = twoSum.twoSum(nums, target);
        assertArrayEquals(expectedResult, actualResult);
    }


    /**
     * Input: nums = [2,4,6,8,9,1,3], target = 5
     * Output: [0,6]
     */
    @Test
    public void twoSumExample4() {
        int expectedResult [] = {0,6};
        int nums[] = {2,4,6,8,9,1,3};
        int target = 5;
        int actualResult[] = twoSum.twoSum(nums, target);
        assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Input: nums = [0,4,3,0], target = 5
     * Output: [0,6]
     */
    @Test
    public void twoSumExample5() {
        int expectedResult [] = {0,3};
        int nums[] = {0,4,3,0};
        int target = 0;
        int actualResult[] = twoSum.twoSum(nums, target);
        assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Input: nums = [-3,4,3,90], target = 5
     * Output: [0,6]
     */
    @Test
    public void twoSumExample6() {
        int expectedResult [] = {0,2};
        int nums[] = {-3,4,3,90};
        int target = 0;
        int actualResult[] = twoSum.twoSum(nums, target);
        assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Input: nums = [-1,-2,-3,-4,-5], target = -8
     * Output: [2,4]
     */
    @Test
    public void twoSumExample7() {
        int expectedResult [] = {2,4};
        int nums[] = {-1,-2,-3,-4,-5};
        int target = -8;
        int actualResult[] = twoSum.twoSum(nums, target);
        assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Input: nums = [-10,7,19,15], target = 9
     * Output: [2,4]
     */
    @Test
    public void twoSumExample8() {
        int expectedResult [] = {0,2};
        int nums[] = {-10,7,19,15};
        int target = 9;
        int actualResult[] = twoSum.twoSum(nums, target);
        assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Input: nums = [3,2,95,4,-3], target = 92
     * Output: [2,4]
     */
    @Test
    public void twoSumExample9() {
        int expectedResult [] = {2,4};
        int nums[] = {3,2,95,4,-3};
        int target = 92;
        int actualResult[] = twoSum.twoSum(nums, target);
        assertArrayEquals(expectedResult, actualResult);
    }
}