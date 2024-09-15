import java.util.Scanner;

public class ifelse8 {
    public static void main(String[] args){
        System.out.println("Enter number");

        Scanner num = new Scanner(System.in);
        int number = num.nextInt();

        if(number%3==0 && number%5==0){
            System.out.println("Fizz-buzz");
        }else if(number %3 == 0){
            System.out.println("Fizz");
        }else if(number%5==0){
            System.out.println("buzz");
        }else{
            System.out.println("Not Divisible by both");
        }

    


    }
    
}
