// Ques -> https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

import java.util.*;

public class allDisappearNumber {
    public static void main(String[] args) {
        int[] arr = new int[8];
        System.out.println(findMissingNumbers(arr));
    }
    static List<Integer> findMissingNumbers(int[] nums){
        int length = nums.length;
        int i = 0;
        while(i<length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int ind=0;ind<length;ind++){
            if(nums[ind] != ind+1){
                list.add(ind+1);
            }
        }
        return list;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
