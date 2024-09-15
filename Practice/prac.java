import java.util.*;

class prac{

    public static void main(String[] args){

        float num1,num2,x;

        System.out.println("Enter the Number");

        Scanner sc = new Scanner(System.in);
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();
        float i=num1;
        float j=num2;
        while(num1<=num2){
            x=i;        
            for(int k=1;k<=10;k++){

                x=(x+num1/x)/2;            
            }
            
            System.out.println(x);
            num1++;
        }

    }
}