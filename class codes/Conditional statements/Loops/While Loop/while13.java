import java.util.*;

public class while13 {
    public static void main(String[] args){

        int num;
        int add=0;
        int mult=1;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        while(num!=0){
            if(num%2==0){

                add = add+num;
                
            }else if(num%2!=0){
                mult = mult*num;
            }
            num--;

            
        }
        System.out.println(add);
        System.out.println(mult);
        

    }
}
