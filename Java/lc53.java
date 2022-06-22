// Max subarray
package Java;

import java.util.*;
import java.io.*;

public class lc53 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(in.next());
        }
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] array) {
        int maxSub = array[0];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (sum < 0) {
                sum = 0;
            }
            sum += array[i];
            maxSub = Math.max(maxSub, sum);
        }
        return maxSub;
    }
}
