package Arrays;
import java.util.Scanner;
public class FindIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();

        for(int i=0 ; i<size ; i++){
            if(x==arr[i]){
                System.out.println(i);
            }
        }

    }
}
