// Two sum
package Java;

import java.util.*;
import java.io.*;

public class lc1 {
    public static void main(String[] args) {

        // Input
        Scanner in = new Scanner(System.in);

        // Array size
        System.out.println("Enter array size");
        int size = Integer.parseInt(in.nextLine());
        int arr[] = new int[size];
        System.out.println("Enter array");
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(in.next());
        }

        // Target number
        System.out.println("Enter target number");
        String target = in.next();
        int targetNum = Integer.parseInt(target);
        // Answer array
        int[] ansArr = twoSum(arr, targetNum);

        // Printing the answer
        for (int i = 0; i < ansArr.length; i++) {
            System.out.println(ansArr[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {

        // Hashmap to store the data
        HashMap<Integer, Integer> map = new HashMap();

        // Answer array
        int[] ans = new int[2];

        // Checks each element
        for (int i = 0; i < nums.length; i++) {

            if (!map.containsKey(target - nums[i])) {

                map.put(nums[i], i);

            } else {
                ans[0] = i;
                ans[1] = map.get(target - nums[i]);
                break;
            }
        }
        return ans;
    }
}
