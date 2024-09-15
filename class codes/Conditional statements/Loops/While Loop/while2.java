import java.util.*;
public class while2 {
    public static void main(String[] args){
        int x;
        

        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        x= sc.nextInt();

        while (x>=0){
            System.out.println(x);
            x--;
        }
    }
}
