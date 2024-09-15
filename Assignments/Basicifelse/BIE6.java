import java.util.*;

public class BIE6 {

    public static void main(String[] args){
        int num1;
        int num2;
        int num3;

        System.out.println("Enter any three numbers ");

        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        if(num1==num2 && num1>num3){
            System.out.println(num1+ "and" +num2+"Are Equal and greater than "+num3);
        }else if(num1==num2 && num1<num3){
            System.out.println(num1+ " and " +num2+"Are Equal and less than "+num3);
        }else if(num1==num3 && num1>num2){
            System.out.println(num1+ " and " +num3+ "are Equal and are greater than"+num2);
        }else if(num1==num3 && num1<num2){
            System.out.println(num1+ " and " +num3+ "are Equal and are less than"+num2);
        }else if(num2==num3 && num3>num1){
            System.out.println(num2+ "and"+num3+"are equal and greater than"+num1);
        }else if(num2==num3 && num3<num1){
            System.out.println(num2+ " and "+num3+"are equal and less than"+num1);
        }else if(num1!=num2 && num2!=num3){
            if(num1>num2 && num1>num3){
                System.out.println(num1+" is greater b/w "+num1 +" and " +num2+ " and "+num3);
            }else if(num2>num1 && num2>num3){
                System.out.println(num2+" is greater b/w "+num1 +" and " +num2+ " and "+num3);
            }else if(num3>num1 && num3>num2){
                System.out.println(num3+" is greater b/w "+num1 +" and " +num2+ " and "+num3);
            }
        }else{
            System.out.println("The numbers you have entered are equal");
        }

    }
    
}
    
