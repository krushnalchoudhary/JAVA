import java.util.*;

public class for9 {
    public static void main(String[] args){
        int num;
        int sum = 0;
        int count = 0;
        int temp;
        int temp2;
        int A;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        num = sc.nextInt();
        temp = num;
        temp2 = num;

        while(num!=0){
            count++;
            num = num/10;
        }
        while(temp!=0){
            for(int i=1; i<=count; i++){
                 A = temp / 10;
               sum = sum +(A*A);
               temp = temp/10;
            }
        }
        if(temp2 == sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }

    }
}


