package com.flyaction.demo.test65;

/**
 * @author: action
 * @create: 2024/12/20 08:54
 **/
public class demo2 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 2;
        Solution2 solution = new Solution2();
        int result = solution.search2(nums,target);
        System.out.println(result);
    }
}


class Solution2{

    public int search(int[] nums,int target){
        int middle = nums.length/2;
        while (true){
            if(nums[middle] > target){
                middle--;
            }else if(nums[middle] < target){
                middle++;
            }else{
                return middle;
            }
        }
    }

    public int search2(int[] nums,int target){
        int left = 0;
        int right = nums.length-1;
        while (left < right){
            int middle = (left+right)/2;
            if(nums[middle] == target){
                return middle;
            }else if(nums[middle] > target){
                right = middle-1;
            }else if(nums[middle] < target) {
                left = middle+1;
            }
        }
        return  -1;
    }
}
