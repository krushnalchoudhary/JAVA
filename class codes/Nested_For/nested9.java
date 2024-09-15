import java.util.*;

public class nested9 {
    public static void main(String[] args){
        int r;
        int c;
        char ch ='A';

        System.out.println("Enter rows");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();

        System.out.println("Enter rows");
        c = sc.nextInt();

        for(int i= 1; i<=r; i++){
            for(int j=1; j<=c; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }

    }
}
