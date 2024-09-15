import java.util.*;

public class while8 {
    public static void main(String[] args){

    int num;
    int x=1;

    System.out.println("Enter the Number");
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();

    while(x<=10){
        int table = x*num;
        System.out.println(table);
        x++;
       
    }  
}
}
