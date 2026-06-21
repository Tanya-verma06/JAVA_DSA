package Arrays;
import java.util.*;
public class Average {

    static double getAvg(int[] arr){
        double sum=0;
        for(int i : arr){
            sum+=i;
        }
        return sum/arr.length;


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Average = " + getAvg(arr));

    }
}
