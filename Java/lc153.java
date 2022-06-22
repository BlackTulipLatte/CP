// Find minimum in sorted array 
package Java;

import java.util.*;
import java.io.*;

public class lc153 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(in.next());
        }
        System.out.println(findMin(arr));
    }

    // Binary search implementation
    public static int findMin(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        if (arr.length == 1) {
            return arr[0];
        }
        while (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[right] > arr[0]) {
                return arr[0];
            }
            if (arr[mid] > arr[mid + 1]) {
                return arr[mid + 1];
            }
            if (arr[mid - 1] > arr[mid]) {
                return arr[mid];
            }
            if (arr[mid] > arr[left]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
