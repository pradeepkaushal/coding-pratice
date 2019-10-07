package practice.coding.hackerearth;

import java.util.List;
import java.util.Stack;

public class FinalPrice {

    public static void finalPrice(List<Integer> prices) {
        // Write your code here
        int length = prices.size();

        Stack<Integer> stack = new Stack<>();

        stack.push(prices.get(0));

        int sum = 0;

        for (int i = 1; i < length; i++) {

            int currentPrice = prices.get(i);
            if (!stack.isEmpty() && currentPrice < stack.peek()) {
                Integer top = stack.pop();

                sum=top-currentPrice;
                stack.push(currentPrice);

            }else if(!stack.isEmpty() && currentPrice>stack.peek()){
                
            }
        }

    }
}
