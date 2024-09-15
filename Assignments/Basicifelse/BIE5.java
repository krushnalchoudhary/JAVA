import java.util.*;

public class BIE5{

    public static void main(String[] args){

        int month;
        System.out.println("Enter Month Number");
        Scanner sc = new Scanner(System.in);
        month = sc.nextInt();
        if(month>0){
            if(month<=12){
                if(month==1){
                    System.out.println("January has 31 Days");
                }else if(month==2){
                    System.out.println("February has 28 Days");
                }else if(month == 3){
                    System.out.println("March has 31 Days");
                }else if(month==4){
                    System.out.println("April has 30 Days");
                }else if(month==5){
                    System.out.println("May has 31 Days");
                }else if(month==6){
                    System.out.println("Jone has 30 Days");
                }else if(month==7){
                    System.out.println("July has 31 Days");
                }else if(month==8){
                    System.out.println("August has 31 Days");
                }else if(month==9){
                    System.out.println("September has 30 Days");
                }else if(month==10){
                    System.out.println("Octomber has 31 Days");
                }else if(month==11){
                    System.out.println("November has 30 Days");
                }else if(month==12){
                    System.out.println("December has 31 Days");
                }
                    
                
            }else{
                System.out.println("Invalid Month");
            }
        
        }else{
            System.out.println("Month Can't be Negative");
        }
    }
}
