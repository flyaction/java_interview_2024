package com.flyaction.demo.test66;

import java.util.HashMap;

/**
 * @author: action
 * @create: 2024/12/20 09:11
 **/
public class demo {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        Solution solution = new Solution();
        int result = solution.removeDuplicates(nums);
        System.out.println(result);
    }
}


class Solution{

    public int removeDuplicates(int[] nums){

        int slow = 0;
        int fast = 0;
        while (fast < nums.length){
            if (nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow+1;
    }

    public int myRemoveDuplicates(int[] nums){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i < nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }
        }

        int result = map.size();

        return result;
    }
}
