package practice.algorithm;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/help-fredo/
 */
public class HelpFredo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int input[] = new int[N];
        for(int i=0;i<N;i++){
            input[i]= sc.nextInt();
        }
        Arrays.sort(input);
        int multiply = multiply(input, input.length - 1);
        System.out.println(multiply);
       /* int i=input[0];
        for (; ; i++) {
            if(power(i,input.length-1)>multiply){
                System.out.println(i);
                break;
            }
        }*/


    }

    public static int multiply(int input[], int i){
        if(i==-1){
            return 1;
        }
        int temp=input[i]*multiply(input,--i);
        return temp;
    }



    public static int power(int i,int n){
        if(n==-1) {
            return 1;
        }
        int temp=i*power(i,--n);
        return temp;
    }


    public static int multiplyLogN(int input,int i){
        if(i==-1){
            return 1;
        }
//        int temp=input[i]*multiply(input,--i);
        return 0;
    }

}
