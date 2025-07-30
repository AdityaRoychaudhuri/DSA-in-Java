/* Q.11 ==> https://leetcode.com/problems/container-with-most-water */


public class bucketOfWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    static int maxArea(int[] height) {
        int length = height.length;
        int currArea = 0;
        int maxArea = 0;

        int left = 0;
        int right = length - 1;
        while(left < right){
            currArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currArea);
            if(height[left] <= height[right]){
                left++;
            }else{
                right--;
            }
        }

        return maxArea;
    }
}
