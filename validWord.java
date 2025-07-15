/* Q.3136 ==> https://leetcode.com/problems/valid-word/description/?envType=daily-question&envId=2025-07-15 */


public class validWord {
    public static void main(String[] args) {
        System.out.println(isValid("234Adas"));
    }

    static boolean isValid(String word){
        if(word.length()<3){
            return false;
        }
        boolean vow = false;
        boolean consonant = false;
        for( char ch : word.toCharArray()){
            if(!Character.isLetterOrDigit(ch)){
                return false;
            }
            if(isVowel(ch)){
                vow = true;
            }else if(Character.isLetter(ch)){
                consonant = true;
            }
        }
        return vow && consonant;
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
