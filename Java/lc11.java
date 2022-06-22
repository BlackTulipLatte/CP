//Container with most water
package Java;

import java.util.*;
import java.io.*;

public class lc11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(in.next());
        }
        System.out.println(maxArea(nums));
    }

    public static int maxArea(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int area = 0;
        while (right > left) {
            int height = Math.min(arr[left], arr[right]);
            int width = right - left;
            area = Math.max(area, height * width);
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        return area;
    }
}
