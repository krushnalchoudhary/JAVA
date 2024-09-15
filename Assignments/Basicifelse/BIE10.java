import java.util.*;

public class BIE10 {
    
    public static void main(String[] args){

        float percentage;

        System.out.println("Enter Percentage");

    Scanner per = new Scanner(System.in);
    percentage = per.nextFloat();

    if(percentage>0){
        if(percentage<=100){
            if(percentage==100 && percentage>=90){
                System.out.println("Grade = A+");
            }else if(percentage<90 && percentage>=80){
                System.out.println("Grade = A");
            } else if(percentage<80 && percentage>=70){
                System.out.println("Grade = B+");
            } else if(percentage<70 && percentage>=60){
                System.out.println("Grade = B");
            } else if(percentage<60 && percentage>=55){
                System.out.println("Grade = C+");
            } else if(percentage<55 && percentage>=45){
                System.out.println("Grade = C");
            } else if(percentage<45 && percentage>=40){
                System.out.println("Grade = D");
            } else if(percentage<40){
                System.out.println("Grade = FAILED");
            } 
        }else{
            System.out.println("Invalid Entry : Percentage can't be more than 100");
        }
    }else{
        System.out.println("Invalid Entry : Percentage can't be a negative value");
    }
    }
}
