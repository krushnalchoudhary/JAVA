import java.util.*;

public class for3 {
    public static void main(String[] args){

        int num;

        System.out.println("Enter the number");

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i=1; i<=num; i++){
            if(num%i==0){
                System.out.println(i);
            }
        }

    }
}
