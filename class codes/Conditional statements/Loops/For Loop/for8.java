import java.util.*;

public class for8 {
    public static void main(String[] args){

        int num;
        int fact=0;
        System.out.println("Enter number");

        Scanner sc = new Scanner (System.in);
        num = sc.nextInt();

        for(int i =1; i<num; i++){
            if(num%i==0){
                fact = fact + i;
            }
        }
        if(num==fact){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not a perfect number");
        }
    }
}
