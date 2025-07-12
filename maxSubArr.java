/*Given a binary array nums, return the maximum number of consecutive 1's in the array.


Example 1:
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2
*/

public class maxSubArr {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        System.out.println(maxSub(arr));
    }
    static int maxSub(int[] nums){
        int length = nums.length;
        int count = 0;
        int max = 0;
        for(int i=0;i<length;i++){
            if(nums[i] == 1){
                count++;
                if(count>max){
                    max = count;
                }
            }else{
                count=0;
            }
        }
        return max;
    }
}
