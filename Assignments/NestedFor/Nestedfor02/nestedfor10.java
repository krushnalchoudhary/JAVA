/*F 5 D 3 B 1 
  F 5 D 3 B 1 
  F 5 D 3 B 1 
  F 5 D 3 B 1 
  F 5 D 3 B 1 
  F 5 D 3 B 1  */







import java.util.*;
public class nestedfor10 {
    public static void main(String[] args){
        int r;
        int c;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        r = sc.nextInt();
        System.out.println("Enter columns");
        c = sc.nextInt();

        for(int i=1; i<=r; i++){
           int num=5; char ch = 'F';
            for(int j=1; j<=c; j++){
                if(j%2!=0){
                System.out.print(ch+" ");
                ch--;
                ch--;

                }else{
                System.out.print(num+" ");
                num -= 2;
                }
            }
            num++;

            System.out.println();
        }


    
    }
}

