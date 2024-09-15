import java.util.*;

public class while7 {
    public static void main(String[] args){
        int  num;
        int i=1;
        int sqr = 1;
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        while(i<=num){

             sqr = i*i;
             System.out.println(sqr);
             i++;

        }
       



    }
    
}
