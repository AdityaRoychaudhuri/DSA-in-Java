/* */

import java.util.*;

public class removeDupli {
    public static void main(String[] args) {
        int[] ques = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(solSet(ques) + " : " + solutionEasy(ques));
    }
    static int solSet(int[] nums){
        int length = nums.length;
        int ind = 0;
        Set<Integer> set = new LinkedHashSet<>();
        for(int ele:nums){
            set.add(ele);
        }
        int ans = set.size();
        for(int ele:set){
            nums[ind++]=ele;
        }
        return ind;
    }
    static int solutionEasy(int[] nums){
        int length = nums.length;
        int count = 0;
        for(int i=1;i<length;i++){
            if(nums[i] != nums[count]){
                count++;
                nums[count] = nums[i];
            }
        }
        return count+1;
    }
}
