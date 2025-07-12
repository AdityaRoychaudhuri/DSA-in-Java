/* Q41. => https://leetcode.com/problems/first-missing-positive/description/ */

import java.util.Arrays;

public class firstMissingPosNumber {
    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};
        System.out.println(firstMissingPositive(arr));

    }
    static int firstMissingPositive(int[] nums) {
        int length = nums.length;
        int i = 0;
        while(i<length){
            int correct = nums[i] - 1;
            if(nums[i] <= length && nums[i] > 0 && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        for(int ind=0;ind<length;ind++){
            if(nums[ind] != ind+1){
                return ind+1;
            }
        }
        return length + 1;
    }
    static void swap(int[] var0, int var1, int var2) {
        int var3 = var0[var1];
        var0[var1] = var0[var2];
        var0[var2] = var3;
    }
}


