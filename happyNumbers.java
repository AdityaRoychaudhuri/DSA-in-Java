/*Q.202 ==> https://leetcode.com/problems/happy-number/description*/


public class happyNumbers {
    public static void main(String[] args) {
        System.out.println(isHappy(3));
    }

    static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = sq(slow);
            fast = sq(sq(fast));
        } while(slow != fast);

        if(slow == 1){
            return true;
        }

        return false;
    }

    static int sq(int n){
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            sum += rem * rem;
            n /= 10;
        }
        return sum;
    }
}
