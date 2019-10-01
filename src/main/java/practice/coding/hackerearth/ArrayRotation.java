package practice.coding.hackerearth;

public class ArrayRotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        while (d>0){
            int temp=a[0];
            for(int i=0;i<a.length-1;i++){
                a[i]=a[i+1];
            }
            a[a.length-1]=temp;
            d--;
        }

        return a;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        rotLeft(a,4);
    }
}
