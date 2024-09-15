import java.util.*;

class while12{
    public static void main(String[] args){
        long num;
        long square=1;
        System.out.println("Enter the number");

        Scanner sc = new Scanner(System.in);
        num = sc.nextLong();

        while(num!=0){
            long A = num % 10;
            long B = num/10;
            if(A%2==0){
                square = A*A;
                System.out.println(square);
            }
            num = B;



        }

    }
}