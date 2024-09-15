import java.util.*;

public class while5 {
    public static void main(String[] args){
        int num;
        int ans = 0;


        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        while(num!=0){
         int x = num%10;
        int y = num/10;

        ans = ans+x;
        num = y;

        }
        System.out.println(ans);
    }
    
}
