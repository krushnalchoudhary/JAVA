import java.util.*;

public class while6 {
    public static void main(String[] args){

    int num;
    int ans=1;
    System.out.println("Enter the number");
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();

    while(num!=0){
        int A = num%10;
        int B = num/10;

        ans = ans*A;
        num = B;

    }
    System.out.println(ans);


    
}
}