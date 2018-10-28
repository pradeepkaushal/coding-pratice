package practice.algorithm;

import java.util.LinkedList;
import java.util.List;

public class SubPalinDrome {

    public static void main(String[] args) {
        String input ="abaab";
        List<String> strings = subStrings(input);
        System.out.println(isPalindrome(input));
    }
    
    public static int palinDrome(String input){
        List<String> subStrings = subStrings(input);
        int count=0;
        for(String sub:subStrings){
            if(isPalindrome(sub)){
                count++;
            }
        }
        return count;
    }

    public static boolean isPalindrome(String input){
        int last=input.length()-1;
        if(last<=0){
            return false;
        }
        int start=0;
        while(start<=last){
          if(!(input.charAt(start)==input.charAt(last))){
              return false;
          }
          start++;
          last--;
        }
        return true;
    }

    public static List<String> subStrings(String input){
        LinkedList<String> subStrings = new LinkedList<>();
        subStrings.add(input);
        for(int i=0;i<input.length()-1;i++){
            for(int j=i+1;j<input.length()+1;j++){
                subStrings.add(input.substring(i,j));
            }


        }
        return subStrings;
    }
}
