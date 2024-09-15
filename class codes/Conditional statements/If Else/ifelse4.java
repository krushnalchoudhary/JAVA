import java.util.Scanner;

public class ifelse4 {

    public static void main(String[] args) {
        int a;
        int b;

        System.out.println("Enter a");
        Scanner A = new Scanner(System.in);
        a = A.nextInt();

        System.out.println("Enter b");
        Scanner B = new Scanner(System.in);
        b = B.nextInt();

        if(a>b){
            System.out.println("A is Greater");
        }else if(a<b){
            System.out.println("B is Greater");
        }else{
            System.out.println("Both Are equal");
        }

    }

    
}
