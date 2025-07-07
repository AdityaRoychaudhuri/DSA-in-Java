/* Ques ==>  https://leetcode.com/problems/set-mismatch/description/*/

import java.util.Arrays;

public class setMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    static int[] findErrorNums(int[] nums){
        int length = nums.length;
        int i = 0;
        while(i<length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int ind = 0;ind<length;ind++){
            if(nums[ind] != ind+1){
                return new int[] {nums[ind], ind +1};
            }
        }
        return new int[] {-1,-1};
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
