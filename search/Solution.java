package search;

import java.util.*;


public class Solution {

    public static void main(String[] args) {
        int []nums = {1,2,3,4,5,6,7,8,9};
        int target = 10;
        System.out.println(search(nums,target));
    }

    public static int search(int []nums, int target) {
        // Write your code here.
        int low =0;
        int high = nums.length-1;
        int mid = 0 ;
        int count = high;
        
        while(low<= high && count>=0){
            System.out.println("low: "+low+" high: "+high + " mid: "+mid+" target: "+target+" nums[mid]: "+nums[mid]+ " count: "+count);
            mid = (low + high)/2;
            if(target == nums[mid]){
                return mid;
            }
            if(low>=high){
                return -1;
            }
            if(target > nums[mid]){
                low = mid;
            }else{
                high=mid;
            }
            count--;
        }
        return -1;
    }
}