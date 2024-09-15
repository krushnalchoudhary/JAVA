import java.util.*;

public class break1 {
    public static void main(String[] args){
        int num;
        int count = 0;

        System.out.println("Ennter the Number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for(int i=1; i<=num; i++){
            if(num%i==0){
                count++;
            }
            if(count>2){
                break;
            }
        }
        if(count==2){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
