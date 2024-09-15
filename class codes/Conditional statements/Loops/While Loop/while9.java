import java.util.*;

public class while9 {
  public static void main(String[] args){

    int num;
    int fact = 1;

    System.out.println("Enter the number");
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();

    while(num>0){
        fact = fact*num;
        num--;
    }
    System.out.println(fact);
  }    
}
