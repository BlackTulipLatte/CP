// Maximum product subarray
package Java;

import java.util.*;
import java.io.*;

public class lc152 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(in.next());
        }
        System.out.println(maxProduct(arr));
    }

    public static int maxProduct(int[] nums) {
        int factor = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            factor = factor * nums[i];
            max = Math.max(max, factor);
            if (factor == 0)
                factor = 1;
        }
        return max;
    }
}
