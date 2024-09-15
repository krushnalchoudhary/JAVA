import java.util.*;

public class nested13 {
    public static void main(String[] args){
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        N = sc.nextInt();

        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                if(j==1||j==N){
                    System.out.print("*"+" ");
                }else{
                    System.out.print("_"+" ");
                }
            }
            System.out.println();
        }
    }
}
