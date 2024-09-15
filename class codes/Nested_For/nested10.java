import java.util.*;

public class nested10 {
    public static void main(String[] args){
        int r;
        int c;

        System.out.println("Enter rows");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();

        System.out.println("Enter rows");
        c = sc.nextInt();

        for(int i= 1; i<=r; i++){
            char ch = 'A'; int num = 1;
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
