import java.util.*;

public class armstrong {
    public static void main(String[] args){
        int num;
        
        int count=0;
        int sum=0;
        

        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        int temp1 = num;
        int temp2 = num;

        while(num!=0){
            count++;
           num = num/10;
        }
        
        while(temp1!=0){
            int A = temp1%10;
            int B = temp1/10;
            int mult=1;
            for(int i=1; i<=count; i++){
            mult = mult * A;    
            }
            sum = sum+mult;
            temp1 = B;
    }
        if(sum == temp2){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
    
}
