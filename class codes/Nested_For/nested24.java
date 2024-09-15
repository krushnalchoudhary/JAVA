import java.util.*;

public class nested24 {
    public static void main(String[] args){
        int N;
        int num = 1;

        System.out.println("Enter rows");
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

       

        for(int i= 1; i<=N; i++){
            for(int j=N; j>=i; j--){
                if(num%2==0){
                    System.out.print(num*num+" ");
                    
                }else{
                    System.out.print(num+" ");
                }
                num++;
            }
            System.out.println();
        }

    }
}

