package Arrays;

import java.util.Scanner;

public class UniqueElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0 ; i< n ; i++){
            arr[i]=sc.nextInt();
        }


        for (int i = 0; i < n; i++) {
            int count = 0 ;
            for(int j = 0 ; j< n ; j++){
                if(arr[i]==arr[j] && i!=j){
                    count++;
                    break;
                }
            }if(count == 0){
                System.out.println("Unique element " + arr[i]);
            }
        }




    }
}
