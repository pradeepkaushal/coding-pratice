package practice.coding.hackerearth;

import java.util.Scanner;
import java.util.Stack;

public class SuperReducedString {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(superReducedString(input));
    }


    public static String superReducedString(String input){
        Stack<Character> stack = new Stack<>();
        char[] chars = input.toCharArray();

        stack.push(chars[0]);
        for(int i=1;i<chars.length;i++){
            if(stack.isEmpty()){
                stack.push(chars[i]);
            }else if(stack.peek()==chars[i]){
                stack.pop();
            }else{
                stack.push(chars[i]);
            }
        }
        if(stack.isEmpty()){
            return "";
        }
        return String.valueOf(stack.toArray());
    }
}
