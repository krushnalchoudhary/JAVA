import java.util.*;

public class BIE8 {
    public static void main(String[] args){
        int day;

        System.out.println("Enter number (1-7)");
        Scanner d = new Scanner(System.in);
        day = d.nextInt();
        
        if(day>0){
            if(day==1){
                System.out.println("MONDAY");
            }else if(day==2){
                System.out.println("TUESDAY");
            }else if(day==3){
                System.out.println("WEDNESDAY");
            }else if(day==4){
                System.out.println("THURSDAY");
            }else if(day==5){
                System.out.println("FRIDAY");
            }else if(day==6){
                System.out.println("SATURDAY");
            }else if(day==7){
                System.out.println("SUNDAY");
            }else{
                System.out.println("Out of range ");
            }
        }else{
            System.out.println("Invalid Entry: Day can't be a negative number or zero");
        }


    }
}
