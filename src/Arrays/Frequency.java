package Arrays;
import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc. nextInt();
        System.out.println("Enter elements: ");
        int[] arr = new int[n];
        for(int i = 0 ; i<n; i++){
            arr[i]= sc.nextInt();
        }for(int i = 0 ; i<n ; i++){
            int x = arr[i];
            int count = 0;
            if(x==-1){
                continue;
            }for(int j = 0; j<n ;j++){
                if(arr[j]==x){
                    count++;
                    arr[j]=-1;
                }
            }
            System.out.println("Frequency of " +x+ " : "+count);

        }

    }
}
