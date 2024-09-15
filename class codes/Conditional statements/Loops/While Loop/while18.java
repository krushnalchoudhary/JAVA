import java.util.*;

public class while18 {
    public static void main(String[] args){
        int num;
        int ans =0;
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int temp = num;

        while(num!=0){
            int A = num%10;
            int B = num/10;

            ans = ans *10 + A;
            num = B;

        }
        if(ans == temp){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not Pallindrome");
        }
    }
    
}
