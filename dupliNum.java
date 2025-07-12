/*
* 287. Find the Duplicate Number

Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
Example 3:

Input: nums = [3,3,3,3,3]
Output: 3
*
* */
import java.util.*;

public class dupliNum {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        int answer = findDuplicate(nums);
    }
    static int findDuplicate(int[] nums) {
        int ans=0;
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int ele:nums){
            if(freqMap.containsKey(ele)){
                int value = freqMap.get(ele);
                freqMap.put(ele, value+1);
            }else{
                freqMap.put(ele,1);
            }
        }
        Set<Integer> keySet = freqMap.keySet();
        for(int ele:keySet){
            if(freqMap.get(ele)>1){
                ans = ele;
            }
        }
        return ans;
    }
    static int findDuplicateCycleSort(int[] nums){
        int length = nums.length;
        int i=0;
        while(i<length){
            if(nums[i] != i-1){
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct]){
                    swap(nums,i,correct);
                }else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
