package com.flyaction.demo.test57;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: action
 * @create: 2024/12/19 09:34
 **/
public class demo {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 26;
        Solution solution = new Solution();
        int[] result = solution.twoSum2(nums,target);
        for(int element:result){
            System.out.println(element);
        }
    }
}


class Solution{

    public int[] twoSum(int[] nums,int target){
        for(int i = 0;i < nums.length-1;i++){
            for (int j = i+1;j < nums.length;j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public int[] twoSum2(int[] nums,int target){

        Map<Integer,Integer> map = new HashMap<>(nums.length);

        for(int i = 0;i < nums.length;i++){
            int partnerNumber = target-nums[i];
            if(map.containsKey(partnerNumber)){
                return new int[]{i,map.get(partnerNumber)};
            }else{
                map.put(nums[i],i);
            }
        }
        return null;
    }
}
