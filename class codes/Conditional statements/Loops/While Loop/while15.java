import java.util.*;

public class while15 {
    public static void main(String[] args){
        int num;
        System.out.println("Enter the number");

       Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

       while(num>=0){
            if (num%2==0){
                System.out.println(num);
                num--;

            }else if(num%2!=0){
                System.out.println(num);
                num = num-2;
            }
        }
    } 
}
