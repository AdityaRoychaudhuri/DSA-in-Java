import java.util.*;

public class removeSplChar {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s = "thw$ g##bjhdwd vdg*gh$vvdd#bdudhc";
        int spaces = 0;
        int length = s.length();
        for(int i=length-1;i>=0;i--){
            char c = s.charAt(i);
            if(c == '*' || c == '$' || c == '#'){
                if(sb.length()>=0  && sb.charAt(sb.length()-1) == ' '){
                    sb.deleteCharAt(sb.length() - spaces);
                    spaces=0;
                }else{
                    sb.deleteCharAt(sb.length() - 1);
                    spaces=0;
                }
            }else{
                sb.append(c);
                spaces++;
            }
        }
        System.out.println(sb.reverse().toString());
    }
}
