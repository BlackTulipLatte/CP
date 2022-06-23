// Divide 2 numbers
package Java;

import java.util.*;
import java.io.*;

public class lc29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = Integer.parseInt(in.next());
        int b = Integer.parseInt(in.next());
        System.out.println(divide(a, b));
    }

    public static int divide(int a, int b) {
        if (b == 0 || Math.abs(b) > Math.abs(a))
            return 0;
        else if (a < 0 && b > 0)
            return -1 + divide(a + Math.abs(b), b);
        else if (a > 0 && b < 0) {
            return -1 + divide(a - Math.abs(b), b);
        }
        return 1 + divide(a - b, b);
    }
}
