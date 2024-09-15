import java.util.*;
public class nested14 {
    public static void main(String[] args){

        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Nummber");
        N = sc.nextInt();

        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
