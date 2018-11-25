package practice.algorithm;

public class SmallestNumber {

    static String findSmalleselement(String number ){
        char[] chars=number.toCharArray();
        int[] rightMin = new int[chars.length];

        //Find start index of non zero element
        int startIndex=0;
        for(;startIndex<chars.length;startIndex++){
            if(chars[startIndex]!='0'){
                break;
            }
        }
        //Fill the index if the trailing with zero
        if(startIndex!=0){
            for(int i=0;i<startIndex;i++){
                rightMin[i]=-1;
            }
        }

        for(;startIndex<chars.length;startIndex++){
            int smallestIndex = findSmallestIndex(chars, startIndex);
            rightMin[startIndex]=smallestIndex;
        }

        for(int i=0;i<chars.length;i++){
            if(rightMin[i]!=-1){
                char temp = chars[i];
                chars[i]=chars[rightMin[i]];
                chars[rightMin[i]]=temp;
            }
        }
        return new String(chars);

    }

    static int findSmallestIndex(char[] chars,int ind){

        if(ind>=chars.length){
            return -1;
        }
        char temp=chars[ind];
        int index=-1;
        for(int i=ind+1;i<chars.length;i++){
            if(chars[i]>temp){
                index=i;
                temp=chars[i];
            }
        }
        return index;
    }

}
