import java.util.*;

public class BIE3 {

    public static void main(String[] args) {
        
        int num;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if(num==0){
            System.out.println("You have Entered Zero");
        }else if(num<0){
            System.out.println(num+" Is a negative number ");
        }else{
            System.out.println(num+" is positive number");
        }


    }
}
