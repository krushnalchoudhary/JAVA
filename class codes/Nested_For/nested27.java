import java.util.*;

public class nested27 {
    public static void main(String[] args){
        int N;
        int num = 1;
        int ch;

        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

       

        for(int i= 1; i<=N; i++){
            ch = 71;
            ch = ch -i;
            for(int j=1; j<=i; j++){
                if(j%2==0){
                    System.out.print(num+" ");
                    num++;
                    
                }else{
                    System.out.print((char) ch+" ");
                    ch++;
                }
            }
            System.out.println();
        }

    }
}
