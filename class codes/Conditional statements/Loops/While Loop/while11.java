import java.util.*;

public class while11 {
    public static void main(String[] args){
        long num;
        
        System.out.println("Enter a Number");

        Scanner sc = new Scanner(System.in);
        num = sc.nextLong();

        int count = 0;

       

        while(num!=0){
            long A = num%10;
            long B = num/10;
            if(A%2==0){
                count++;
                
            }
            num = B;
        }
        System.out.println(count);

    }
}
