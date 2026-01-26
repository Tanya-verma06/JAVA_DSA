package Arrays;

import java.util.Scanner;

public class MostFrequentElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int element = 0 ;
        int max = 0 ;
        System.out.println("Enter elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }for(int i = 0 ; i<n;i++){
            int count = 0;
            for(int j = 0 ; j < n ;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }if(count>max){
                max=count;
                element = arr[i];
            }

        }
        System.out.println("Element : " +element +" ,"+ " count " + max);
    }


}