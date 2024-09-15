import java.util.*;

public class while17 {
    private static final long Ans = 0;

    public static void main(String[] args){
        long num;
        long Ans=0;

        

        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextLong();
       
        while(num!=0){
            long A = num%10;
            long B = num/10;
            num = B;
            Ans = Ans * 10 + A;
           
           
        }
        
        System.out.println(Ans);
    }
}
