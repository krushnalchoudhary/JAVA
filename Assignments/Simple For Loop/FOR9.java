import java.util.*;

public class FOR9 {
    public static void main(String[] args){
        int num;
        int sum = 0;

        System.out.println("Enter the Number");

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for(int i =1; i<=num; i++){
            sum = sum + i;

        }
        System.out.println(sum);
    }
}
