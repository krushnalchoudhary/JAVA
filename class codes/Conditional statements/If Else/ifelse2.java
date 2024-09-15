

import java.util.Scanner;


public class ifelse2 {
    public static void main(String[] args){
        int age;
        System.out.println("Enter age");
        Scanner sc = new Scanner(System.in);
         age = sc.nextInt();
        if(age>=18){
            System.out.println("Eligible to Vote");
        } else{
            System.out.println("Not Eligible to vote");
        }

        



    }
    
}
