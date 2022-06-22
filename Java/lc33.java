// Search in a rotated array
package Java;

import java.util.*;
import java.io.*;

public class lc33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = Integer.parseInt(in.next());
        int targetNum = Integer.parseInt(in.nextLine());
        System.out.println(search(nums, targetNum));
    }

    // Binary search implementation
    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left - (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                // [3,4,5,1,2] target --> 2
                if (arr[right] >= target && arr[left] < target && arr[right] <= arr[mid]) {
                    left = mid + 1;
                }
                // [3,4,5,1,2]target --> 4
                else {
                    right = mid - 1;
                }
            } else {
                // [4,5,1,2,3] target --> 5
                if (arr[right] < target && arr[left] <= target && arr[mid] <= target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}
