package com.flyaction.demo.test67;

import java.util.HashMap;

/**
 * @author: action
 * @create: 2024/12/20 09:41
 **/
public class demo {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12,0};
        Solution solution = new Solution();
        int[] result = solution.moveZeroes(nums);
        for (int i:result){
            System.out.println(i);
        }
    }
}


class Solution{

    public int[] moveZeroes(int[] nums){

        if(nums == null){
            return null;
        }
        int slow = 0;
        int fast = 0;
        while (fast < nums.length){
           if(nums[fast] != 0){
               int tmp = nums[fast];
               nums[fast] = nums[slow];
               nums[slow] = tmp;
               slow++;
           }
           fast++;
        }
        return nums;
    }

    public int[] myMoveZeroes2(int[] nums){
        int slow = 0;
        int fast = 0;
        while (fast < nums.length){
            if(nums[slow] == nums[fast]){
                fast++;
            }else{
                if(nums[slow] == 0){
                    nums[slow] = nums[fast];
                    nums[fast] = 0;
                    slow++;
                }
                fast++;
            }


        }
        return nums;
    }


    public int[] myMoveZeroes(int[] nums){
        int slow = 0;
        int fast = 0;
        while (fast < nums.length){
            if(nums[slow] == 0) {
                if (nums[slow] != nums[fast]) {
                    nums[slow] = nums[fast];
                    nums[fast] = 0;
                    slow++;
                    fast++;
                } else {
                    fast++;
                }
            }else{
                slow++;
                fast++;
            }
        }
        return nums;
    }
}

