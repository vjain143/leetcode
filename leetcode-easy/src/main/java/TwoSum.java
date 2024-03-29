/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 *
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *
 * Constraints:
 *
 * 2 <= nums.length <= 103
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 */

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for(int index1 = 0; index1<nums.length; index1++ ){
            for(int index2 = index1+1; index2<nums.length; index2++){
                if((nums[index2] + nums[index1]) == target) {
                        return new int[]{index1, index2};
                }
            }
        }
        return new int[]{0,0};
    }
}
