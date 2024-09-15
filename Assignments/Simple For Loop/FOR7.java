import java.util.*;

public class FOR7 {
    public static void main(String[] args){
        int num;
        int Ans;

        System.out.println("Enter the number");

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for(int i =1; i<=10; i++){
            Ans = num * i;
            System.out.println(Ans);
        }
    }
}
