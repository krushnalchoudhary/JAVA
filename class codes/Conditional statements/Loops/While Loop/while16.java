import java.util.*;

public class while16 {
    public static void main(String[] aegs){
        int Days;
        System.out.println("Enter the day");
        Scanner sc = new Scanner(System.in);
        Days = sc.nextInt();
        
        while(Days>=0 && Days<=7){
            if(Days==7){
                System.out.println("7 Days are Remaining");
                Days--;
            } else if(Days==6){
                System.out.println("6 Days are Remaining");
                Days--;
            } else if(Days==5){
                System.out.println("5 Days are Remaining");
                Days--;
            } else if(Days==4){
                System.out.println("4 Days are Remaining");
                Days--;
            }else if(Days==3){
                System.out.println("3 Days are Remaining");
                Days--;
            }else if(Days==2){
                System.out.println("2 Days are Remaining");
                Days--;
            }else if(Days==1){
                System.out.println("1 Days are Remaining");
                Days--;
            }else{
                System.out.println("Assignment Overdue");
            }
        }
    }
}
