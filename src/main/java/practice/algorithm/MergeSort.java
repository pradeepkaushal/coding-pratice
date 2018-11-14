package practice.algorithm;

public class MergeSort {

    public static void merge(int[] arr, int l,int m, int r){
        int n1=m-l+1;
        int n2=r-m;

        int[] lArr=new int[n1];
        int[] rArr=new int[n2];

        for(int i=0;i<n1;i++){
            lArr[i]=arr[l+i];
        }

        for(int i=0;i<n1;i++){
            rArr[i]=arr[m+1+i];
        }

        int i=0;
        int j=0;
        int k=l;
        

    }
}
