package com.flyaction.demo.test63;

/**
 * @author: action
 * @create: 2024/12/19 14:47
 **/
public class demo {
    public static void main(String[] args) {

        char[] strArr = {'h','e','l','l','o','1'};
        for (char str:strArr){
            System.out.print(str);
        }

        System.out.println("===========");

        Solution solution = new Solution();
        char[] newStrArr = solution.myReverseString(strArr);
        for (char str:newStrArr){
            System.out.print(str);
        }

    }

}


class Solution{

    public char[] reverseString(char[] s){
        int left = 0;
        int right = s.length - 1;
        while (left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        return s;
    }


    public char[] myReverseString(char[] s){
        int length = s.length;
        int quotient = length/2;
        for (int i = 0; i< quotient;i++){
            char first = s[i];
            s[i] = s[length-i-1];
            s[length-i-1] = first;
        }

        return s;
    }
}
