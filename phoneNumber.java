/* Q.17 ==> https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/ */


import java.util.ArrayList;

public class phoneNumber {
    public static void main(String[] args) {
        System.out.println(permutRet("293", ""));
    }

    static  String[] stringLetters = {
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };

    static ArrayList<String> permutRet(String initial, String ans){
        if(initial.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        int digit = initial.charAt(0) - '0';
        ArrayList<String> ansList = new ArrayList<>();
        String letters = stringLetters[digit - 2];
        for(char ch : letters.toCharArray()){
            ansList.addAll(permutRet(initial.substring(1), ans + ch));
        }

        return ansList;
    }
}
