import java.util.*;

public class while3 {
    public static void main(String[] args){
        int num;
        int i = 4;

        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while(i<=num){
            if(i%4==0){
                System.out.println(i);
                
            }
            i++;
        }

        
    }
}
