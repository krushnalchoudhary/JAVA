
import java.util.Scanner;

public class ifelse9 {
    public static void main(String[] args){
        System.out.println("Enter Units");
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();

        int ans1= units;
        int ans2 = (units-100)*2+100;

        if(units<100){
            System.out.println(ans1);
        }else if(units>100){
            System.out.println(ans2);
        }
    }
    
}
