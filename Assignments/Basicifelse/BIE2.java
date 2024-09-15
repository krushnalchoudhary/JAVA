import java.util.*;

public class BIE2 {
     public static void main(String[] args){
        int var;
        System.out.println("Enter The Value");
        Scanner sc = new Scanner(System.in);
        var = sc.nextInt();

        if (var==10){
            System.out.println(var+"Is equal 10");
        }else if(var<10){
            System.out.println(var+"is less than 10");
        }else{
            System.out.println(var+"is greater than 10");
        }
     }    
}
