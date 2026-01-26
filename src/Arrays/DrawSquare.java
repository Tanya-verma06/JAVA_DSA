package Arrays;

import java.util.*;
public class DrawSquare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int l =sc.nextInt();
            int r =sc.nextInt();
            int d=sc.nextInt();
            int u=sc.nextInt();
            if(l==r && r==u&& u==d && d==l){
                System.out.print("Yes");
            }
            else{
                System.out.print("No");
            }
        }
    }
}