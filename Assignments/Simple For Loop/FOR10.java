import java.util.*;

public class FOR10 {
    public static void main(String[] args){
        int num;
        int sum = 1;

        System.out.println("Enter the Number");

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for(int i =1; i<=num; i++){
            sum = sum * i;

        }
        System.out.println(sum);
    }
}

