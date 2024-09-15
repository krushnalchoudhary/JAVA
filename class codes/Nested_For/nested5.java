import java.util.*;

public class nested5 {
    public static void main(String[] args){
        int r;
        int c;

        System.out.println("Enter rows");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();

        System.out.println("Enter rows");
        c = sc.nextInt();

        for(int i= 1; i<=r; i++){
            for(int j=1; j<=c; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
