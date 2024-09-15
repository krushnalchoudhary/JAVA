import java.util.*;

public class for5 {
    public static void main(String[] args){

        int num;
        int fact = 1;

        System.out.println("Enter the Number");

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for(int i=1; i<=num; i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
