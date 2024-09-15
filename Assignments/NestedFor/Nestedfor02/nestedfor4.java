/*
1A 2B 3C 
1A 2B 3C 
1A 2B 3C  */



import java.util.*;
public class nestedfor4{
    public static void main(String[] args){
        int r;
        int c;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        r = sc.nextInt();
        System.out.println("Enter columns");
        c = sc.nextInt();

        for(int i=1; i<=r; i++){
            char ch = 'A';
            for(int j=1; j<=c; j++){
                System.out.print(j);
                System.out.print(ch+" ");
                ch++;
            }

            System.out.println();
        }


    
    }
}

