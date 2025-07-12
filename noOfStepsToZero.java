/* Q. 1342 ==> https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/ */


public class noOfStepsToZero {
    public static void main(String[] args) {
        System.out.println(steps(14));
    }
    static int steps(int n){
        return helper(n, 0);
    }

    static int helper(int n, int steps){
        if(n == 0){
            return steps;
        }
        int last = n%10;
        if((last & 1) == 1){
            return helper(n-1, steps+1);
        }
        return helper(n/2, steps+1);
    }
}
