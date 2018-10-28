package practice.algorithm;

import java.util.Scanner;

public class TheUploadServer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < T; i++) {
            String input = sc.nextLine();
            String[] inputArr = input.split(" ");
            if (inputArr.length == 2) {
                process_data(inputArr[0], inputArr[1]);
            } else if (inputArr.length == 3) {
                process_data(inputArr[0], inputArr[1], inputArr[2]);
            }
        }

    }


    public static void process_data(String a, String b) {
        if (isString(a) && isNumber(b)) {
            System.out.println("M");
        } else {
            System.out.println("N");
        }

    }

    public static void process_data(String a, String b, String c) {
        if (isString(a) && isNumber(b) & isNumber(c)) {
            System.out.println("V");
        } else {
            System.out.println("N");
        }
    }

    public static boolean isString(String a) {
       for(int i=0;i<a.length();i++){
           if((a.charAt(i)>='a'&&a.charAt(i)<='z')||(a.charAt(i)>='A'&&a.charAt(i)<='Z')){
               return true;
           }
       }
        return false;
    }


    public static boolean isNumber(String a) {
        if(a.charAt(0)=='0'){
            return false;
        }
        for (int i = 1; i < a.length(); i++) {
            if (!(a.charAt(i) >= '0' && a.charAt(i) <= '9')) {
                return false;
            }
        }
        return true;
    }
}
