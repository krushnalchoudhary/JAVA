import java.util.*;

public class Automorphic_number {
    public static void main(String[] args){
        int num;
        int count=0;
        int Square;
        int sum = 0;
        int Final=0;
        
        System.out.println("Enter Number");

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        int temp1;
        temp1=num;

        Square = num*num;

        while(num!=0){
            int A = num%10;
            count++;
            num = num/10;
        }
        for(int i=1; i<=count;i++){
            int B = Square%10;
            sum = sum*10+B;
            Square = Square/10;
        }
        while(sum!=0){
            int C = sum%10;
            Final = Final*10+C;
            sum = sum/10;
        }
        if(Final==temp1){
            System.out.println("Automorphic");
        }else{
            System.out.println("Not Automorphic");
        }
    }
}
