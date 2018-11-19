package practice.algorithm;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] arr={2,2,2,2,2,2};
        removeDuplicate(arr);
        for(int el:arr){
            if(el!=-1){
                System.out.print(el+" ");

            }

        }
    }

    public static void removeDuplicate(int[] arr){
        int i=0;
        for(;i<arr.length-1;){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[j]=-1;
                }else{
                    i++;

                }
            }
            i++;
        }

    }
}
