package Arrays;
import java.util.Scanner;
public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter elements of an array :");
        int[] arr = new int[size];
        for(int i=0 ; i<size; i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        for(int i =0; i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Largest element is: "+max);
    }
}
