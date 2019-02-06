package practice.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * https://practice.geeksforgeeks.org/problems/k-largest-elements/0
 */
public class KLargestElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        List<Wrapper> arrays = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            String[] split = sc.nextLine().split(" ");
            int element = Integer.parseInt(split[0]);
            int k = Integer.parseInt(split[1]);
            int[] arr = new int[element];
            String[] intStr = sc.nextLine().split(" ");
            for (int j = 0; j < element; j++) {
                arr[j] = Integer.parseInt(intStr[j]);
            }

            Wrapper wrapper = new Wrapper(arr, k);
            arrays.add(wrapper);

        }
        for(Wrapper wrapper:arrays){
            print(wrapper.arr,wrapper.k);
            System.out.println();
        }

    }

    private static void sort(int[] arr) {
        Arrays.sort(arr);
    }

    private static void print(int arr[],int k){
        sort(arr);
        for(int i=arr.length-1;;i--){
            System.out.print(arr[i]+" ");
            k--;
            if(k==0){
                break;
            }
        }
    }

    static class Wrapper{
        int []arr;
        int k;

        public Wrapper(int[] arr, int k) {
            this.arr = arr;
            this.k = k;
        }
    }
}
