import java.util.*;
public class for1 {

    public static void main(String[] args){

        int num;
        int count=0;

        System.out.println("Enter the number");

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for(int i=2;i<=num;i++){
            if (num%i==0){
                count++;
            }
        }
        System.out.println(count);
        if(count==1){
            System.out.println("Prime number");
        }else{
            System.out.println("Not a prime number");
        }
    }
    
}
