import java.util.*;

public class UniqueNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x > 45) {
            System.out.println(-1);
            return;
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 9; i >= 1; i--) {
            if (x >= i) {
                ans.append(i);
                x -= i;
            }
        }

        System.out.println(ans.reverse());
    }
}