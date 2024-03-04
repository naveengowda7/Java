// https://leetcode.com/problems/concatenation-of-array/

import java.util.Arrays;

public class ConcatenationArray {
    public static int[] getConcatenation(int[] nums) {
        int[] ans = Arrays.copyOf(nums, nums.length*2);
        for(int i =0;i<nums.length;i++){
            ans[nums.length+i] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args){
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}
