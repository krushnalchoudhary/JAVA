import java.util.*;

public class nested2 {
    public static void main(String[] args){
        int r;
        int c;
        System.out.println("Enter the Number of rows");
        Scanner sc = new Scanner(System.in);
        r= sc.nextInt();
        System.out.println("Enter number of Columns");
        c = sc.nextInt();

        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
            System.out.print("*"+" ");
        }
        System.out.println(" ");
     }
    }
}
