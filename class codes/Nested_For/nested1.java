import java.util.*;

public class nested1 {
    public static void main(String[] args){
        int num;
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for(int i=1; i<=num; i++){
            System.out.println("*");
        }
    }
}
