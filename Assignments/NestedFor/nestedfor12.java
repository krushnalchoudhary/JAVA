/*
1 2 9 4 
25 6 49 8 
81 10 121 12 
169 14 225 16  */


import java.util.*;

public class nestedfor12 {
    public static void main(String[] args){
        int num = 1;
        int r;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        r = sc.nextInt();
        System.out.println("Enter columns");
        c = sc.nextInt();

        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                if(num%2==0){
                    System.out.print(num+" ");
                    
                }else{
                System.out.print(num*num+" ");
                
                }
                num++;
            }
            System.out.println();
        }


    }
}