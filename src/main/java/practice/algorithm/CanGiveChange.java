package practice.algorithm;

import java.util.Arrays;
import java.util.List;

/**
 * https://www.hackerrank.com/tests/5b3rleldrpa/questions/6fka6po4q7a
 */
public class CanGiveChange {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(5, 5, 5, 20);
        int i=can_give_change(integers);
        System.out.println(i);
    }
    // Complete the can_give_change function below.
    static int can_give_change(List<Integer> rupee_notes) {

        int shopKeeperLeftMoney=0;
        int i=0;
        for(;i<rupee_notes.size();i++){
            Integer noteValue = rupee_notes.get(i);
            if(noteValue==5){
                shopKeeperLeftMoney+=noteValue;
            } else{
                int returnValue = noteValue - 5;
                if(returnValue>shopKeeperLeftMoney)
                    return i+1;
                shopKeeperLeftMoney-=returnValue;
            }
        }
        return 0;

    }
}
