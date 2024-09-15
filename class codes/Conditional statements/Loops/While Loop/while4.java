import java.util.*;
public class while4 {
    public static void main(String[] args){
    int num;
    System.out.println("Enter number");

    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    

    while (num!=0){
        int A = num%10;
    int y = num/10;
       
        System.out.println(A);
        num=y;


    }
    
}
}