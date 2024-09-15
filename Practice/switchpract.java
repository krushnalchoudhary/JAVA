import java.io.*;

public class switchpract {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter First number");
        int num1 = Integer.parseInt(br.readLine());

        System.out.println("Enter seconf number");
        int num2 = Integer.parseInt(br.readLine());


        System.out.println("Select the Operation");
        System.out.println("1.Addition\n2.Multiplication\n3.Susbtraction\n4.Division");
        int x = Integer.parseInt(br.readLine());

        switch(x){
            case 1:
            System.out.println(num1+num2);
            break;

            case 2:
            System.out.println(num1*num2);
            break;

            case 3:
            System.out.println(num1-num2);
            break;

            case 4:
            System.out.println(num1/num2);
            break;

            default :
            break;
        }
    }
}
