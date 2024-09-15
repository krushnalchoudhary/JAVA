import java.util.*;

public class Fibonacci {
    public static void main(String[] args){
        int num1 = 0;
        int count;
        int num3 =1;
        int Ans = 0;
        int Ans1 = 0;
        
        
        System.out.println("Enter Number");

        Scanner sc =new Scanner(System.in);
        count = sc.nextInt();

        for(int i=0; i<=count; i++){
        Ans = num1 + num3;

        Ans1 = num1;
        num1 = num3;
        Ans = num3;

        System.out.println(Ans1);
        }
        
    }
}
