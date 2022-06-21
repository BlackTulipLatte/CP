// Best time to buy and sell stock
package Java;

import java.util.*;
import java.io.*;

public class lc121 {

    // Main
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("How many days?");
        int n = Integer.parseInt(in.nextLine());
        int[] stock = new int[n];
        System.out.println("Stock prices");
        for (int i = 0; i < n; i++) {
            stock[i] = Integer.parseInt(in.next());
        }
        System.out.println(maxProfit(stock));
    }

    // Solution
    public static int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int maxProfit = 0;
        if (prices.length < 2)
            return 0;
        else {
            while (sell < prices.length) {
                if (prices[sell] - prices[buy] > maxProfit) {
                    maxProfit = prices[sell] - prices[buy];
                } else if (prices[sell] < prices[buy]) {
                    buy = sell;
                    sell++;
                }
                sell++;
            }
        }
        return maxProfit;
    }
}
