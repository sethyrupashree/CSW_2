import java.util.*;

public class q11 {
    public static void main(String[] args) {
        int[] a = { 2,6,7,8,2,4,-13,3 };

        int r = findSmallmissingnum(a);
        System.out.println("The smallest positive missing number is: " + r);
    }

    public static int findSmallmissingnum(int[] arr) {
        int b = arr.length;
        Map<Integer, Boolean> ptMap = new HashMap<>();

        for (int num : arr) {
            if (num > 0 && num <= b) {
                ptMap.put(num, true);
            }
        }
        for (int i = 1; i <= b; i++) {
            if (!ptMap.getOrDefault(i, false)) {
                return i;
            }
        }
        return b + 1;
    }
}
