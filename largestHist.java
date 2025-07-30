/* Q.84 ==> https://leetcode.com/problems/largest-rectangle-in-histogram */


import java.util.Stack;

public class largestHist {
    public static void main(String[] args) {

    }

    static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;

        stack.push(0);

        for(int i = 1;i< heights.length;i++){
            while(!stack.isEmpty() && heights[i] < heights[stack.peek()]){
                max = getMax(heights, stack, max, i);
            }
            stack.push(i);
        }

        int j = heights.length;
        while(!stack.isEmpty()){
            max = getMax(heights, stack, max, j);
        }

        return max;
    }

    static int getMax(int[] heights, Stack<Integer> stack, int max, int i){
        int area = 0;
        int popped = stack.pop();

        if(stack.isEmpty()){
            area = heights[popped] * i;
        }else{
            area = heights[popped] * (i-1 - stack.peek());
        }

        return Math.max(area, max);
    }

}
