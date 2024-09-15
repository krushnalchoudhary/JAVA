import java.util.*; 

public class while10 {

    public static void main(String[] args){
        long num;
        System.out.println("Enter a Number");

        Scanner sc = new Scanner(System.in);
        num = sc.nextLong();

       
        int count=0;

        while(num!=0){
            long A = num%10;
            long B = num/10;
            count++;
            num = B;

        }
        System.out.println(count);
    }
    
}
