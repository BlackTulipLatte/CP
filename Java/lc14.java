// Longest common prefix
package Java;

import java.util.*;

public class lc14 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = in.next();
        }
        System.out.println(longestCommonPrefix(s));
    }

    public static String longestCommonPrefix(String arr[]) {
        String prefix = arr[0];
        for (int i = 1; i < arr.length; i++) {
            while (prefix.indexOf(arr[i]) >= 0) {
                prefix = prefix.substring(0, prefix.length() - 2);
            }
        }
        return prefix;
        // [flower,flow,flight]
    }

}