import java.util.*;
public class nested19 {
    public static void main(String[] args){

        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Nummber");
        N = sc.nextInt();

        for(int i=1; i<=N; i++){
            char ch = 'A';
            for(int j=N; j>=i; j--){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}