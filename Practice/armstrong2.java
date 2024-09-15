import java.util.*;

public class armstrong2 {

    public static void main(String[] args){
        int num;
        int sum=0;
        int count=0;
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        int temp1 = num;
        int temp2 = num;

        while(num!=0){
            count++;
            num = num/10;
        }

        while(temp1!=0){
            int rem = temp1%10;
            int mult=1;
            for(int i = 1; i<=count; i++){
                mult = mult * rem;
            }
            sum = sum + mult;
            temp1 = temp1/10;
        }
        if(temp2 == sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }

    }
    
}
