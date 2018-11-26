package practice.algorithm;

/**
 * https://www.hackerrank.com/tests/5b3rleldrpa/questions/ctmili3qrci
 */
public class SmallestNumber {
    public static void main(String[] args) {
        String number="1234577777771889189";
        String smallestNumber = findSmallestNumber(number);
        System.out.println(smallestNumber);
    }

    public static String findSmallestNumber(String number){
        char[] chars = number.toCharArray();

        //find trailing zero

        int index=0;
        for(;index<chars.length;index++){
            if(chars[index]!='0'){
            break;
            }

        }
        for(;index<chars.length-1;index++){
            char aChar=chars[index];
            char min=chars[index];
            int i=index+1;
            int minIndex=-1;
            for(;i<chars.length;i++){
                if(min>=chars[i]){
                    min=chars[i];
                    minIndex=i;
                }
            }
            if(aChar==min)
                continue;
            if(minIndex>index){
              chars[index]=chars[minIndex];
              chars[minIndex]=aChar;
              break;
            }
        }
        return new String(chars);
    }

}
