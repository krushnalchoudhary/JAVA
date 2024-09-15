import java.util.Scanner;

public class ifelse5 {
    public static void main(String[] args){
        double temp;

        System.out.println("Enter temperature");
        Scanner sc = new Scanner(System.in);
        temp = sc.nextInt();

        if(temp>98.6){
            System.out.println("High");
        }else if(temp>=98.0 && temp<=98.6 ){
            System.out.println("Normal");
        }else{
            System.out.println("Low");
        }


    }
    
}
