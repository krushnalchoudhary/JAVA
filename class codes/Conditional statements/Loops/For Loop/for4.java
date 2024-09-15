import java.util.*;

public class for4{
    public static void main(String[] args){

        int num;

        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i=1; i<=num; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
