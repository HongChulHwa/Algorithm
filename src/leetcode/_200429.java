package leetcode;

import java.util.Arrays;

public class _200429 {
    public static void main(String[] args) {
       // class Solution {
            //public int[] twoSum(int[] nums, int target) {

            int[] nums = {2,7,11,15};

            int target = 9;

                for(int i= 0; i< nums.length; i++){

                    for(int j=1; j<nums.length; j++){

                        if(nums[i]+nums[j]==target){

                            int [] temps = new int[] { nums[i] , nums[j] };

                            System.out.println(Arrays.toString(temps));

                        }


                    }

                }


                       }


                    }

