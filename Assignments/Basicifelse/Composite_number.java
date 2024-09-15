import java.util.*;

public class Composite_number {
    
    public static void main(String[] args){

        int num;
        int count=0;

        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for(int i=1; i<=num; i++){
            if(num%i==0){

                count++;
            }
        }
        if(count>2){
            System.out.println("Composite");
        }else{
            System.out.println("Not Composite");
        }
    }
}
