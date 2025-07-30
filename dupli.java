/* Q.217 ==> https://leetcode.com/problems/contains-duplicate */


import java.util.HashSet;

public class dupli {
    public static void main(String[] args) {

    }

    static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums){
            if(set.contains(ele)){
                return true;
            }else{
                set.add(ele);
            }
        }
        return false;
    }
}
