import java.util.Scanner;

public class ifelse7 {

    public static void main(String[] args){
        System.out.println("Enter number");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();

        if(number%2==0){
            System.out.println(number+"is Even");
        }else{
            System.out.println(number+"is Odd");
        }
    }
}
