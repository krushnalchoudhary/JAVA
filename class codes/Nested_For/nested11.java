import java.util.*;

public class nested11 {
    public static void main(String[] args){
        int r;
        int c;
        char ch = 'A'; 
        int num = 1;

        System.out.println("Enter rows");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();

        System.out.println("Enter rows");
        c = sc.nextInt();

        for(int i= 1; i<=r; i++){
            for(int j=1; j<=c; j++){
                if(j%2==0){
                    System.out.print(num+" ");
                    num++;
                }else{
                    System.out.print(ch+" ");
                    ch++;
                }
            }
            System.out.println();
        }

    }
}
