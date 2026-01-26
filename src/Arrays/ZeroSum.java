package Arrays;
import java.util.*;

public class ZeroSum {
    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};

        // HashSet to store prefix sums
        HashSet<Integer> set = new HashSet<>();
        int prefixSum = 0;
        boolean found = false;

        for (int num : arr) {
            prefixSum += num;


            if (prefixSum == 0 || set.contains(prefixSum)) {
                found = true;
                break;
            }
            set.add(prefixSum);
        }

        System.out.println("Subarray with sum 0 exists? " + found);
    }
}