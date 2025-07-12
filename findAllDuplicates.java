/* Ques => https://leetcode.com/problems/find-all-duplicates-in-an-array/description/ */

import java.util.*;

public class findAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicate(arr));
    }
    static List<Integer> findDuplicate(int[] nums){
        List<Integer> list = new ArrayList<>();
        int length = nums.length;
        int i=0;
        while(i<length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int ind=0;ind<length;ind++){
            if(nums[ind] != ind+1){
                list.add(nums[ind]);
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
