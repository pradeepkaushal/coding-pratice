package practice.algorithm;

import java.util.Scanner;

public class FindMinAndMaxEle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for(int i=0;i<T;i++){
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            int N=Integer.parseInt(sc.nextLine());
            int[] arr=new int[N];
            String in=sc.nextLine();
            String[] s = in.split(" ");
            for(int j=0;j<s.length;j++){
                arr[j]=Integer.parseInt(s[j]);
            }
            for(int ele:arr){
                if(ele<min){
                    min=ele;
                }
                if(ele>max){
                    max=ele;
                }
            }
            System.out.println(min+" "+max);

        }
    }
}
