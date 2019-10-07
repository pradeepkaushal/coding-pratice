package practice.coding.hackerearth;

import java.util.HashSet;
import java.util.Set;

public class MakeAnagram {
    public static int makeAnagram(String a, String  b){
        int count=0;
        Set<Character> aSet = new HashSet<>();
        Set<Character> bSet = new HashSet<>();
        char[] charsA = a.toCharArray();
        for(Character aC:charsA){
            aSet.add(aC);
        }

        char[] charsB = b.toCharArray();
        for(Character aB:charsB){
            if(!aSet.contains(aB)){
                count++;
            }else{
                bSet.add(aB);
            }
        }

        int diff=aSet.size()-bSet.size();
        return count+diff;


    }
}
