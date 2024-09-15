
import java.util.Scanner;

public class ifelse3 {
    public static void main(String... args){

        int x;
        int y;
       
        System.out.println("Enter x");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        System.out.println("Enter y");
        Scanner a = new Scanner(System.in);
        y = a.nextInt();

        if(x>y){
            System.out.println("X is greater");
        }else{
            System.out.println("Y is greater");
        }


    }
    
}
