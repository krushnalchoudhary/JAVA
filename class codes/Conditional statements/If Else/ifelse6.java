import java.util.Scanner;

public class ifelse6 {

    public static void main(String[] args){
        int n;
        System.out.println("Enter number");
        Scanner num = new Scanner(System.in);
        n = num.nextInt();

        if(n%4==0){
            System.out.println("Divisible by 4");
        }else{
            System.out.println("Not Divisible by 4");
        }

     

    }
    
}
