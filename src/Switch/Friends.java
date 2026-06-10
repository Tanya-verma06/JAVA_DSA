package Switch;
import java.util.*;
public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter friend name");
        String friend = sc.next();


        switch(friend){
            case "Manali":
                System.out.println("My best friend");
                break;
            case "Nandni":
                System.out.println("Always my favourite. I LOVE YOU MOTUUUUUUU");
                break;
            case "Vaishnavi":
                System.out.println("Gossip partner");
                break;
            case "Artika":
                System.out.println("My topper friend");
                break;

            default:
                System.out.println("NO ONE IS WITH ME");
        }

    }
}

