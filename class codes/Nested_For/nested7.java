import java.util.*;

public class nested7 {
    public static void main(String[] args){
        int r;
        int c;
        int num=1;

        System.out.println("Enter rows");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();

        System.out.println("Enter rows");
        c = sc.nextInt();

        for(int i= 1; i<=r; i++){
            for(int j=1; j<=c; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }

    }
}
