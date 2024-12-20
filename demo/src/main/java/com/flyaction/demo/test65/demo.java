package com.flyaction.demo.test65;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: action
 * @create: 2024/12/20 08:46
 **/
public class demo {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 26;
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums,target);
        for(int element:result){
            System.out.println(element);
        }
    }
}


class Solution{

    public int[] twoSum(int[] nums,int target){
        int left = 0;
        int right = nums.length-1;
        while (left < right){
            int sum = nums[left]+nums[right];
            if(sum == target){
                return new int[]{left+1,right+1};
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{left+1,right+1};
    }
}

