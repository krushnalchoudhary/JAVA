/*
1 
8 9 
9 64 25 
64 25 216 49 
 */

import java.util.Scanner;
public class nestedfor10{
    public static void main(String[] args) {
        System.out.println("Enter rows");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        int num1 =1;

        for(int i=1; i<=rows; i++){
            int num =num1;
            for(int j=1; j<=i; j++){
                if(i%2!=0){
                    if(j%2==0){
                        System.out.print(num*num*num+" ");
                    }else{
                        System.out.print(num*num+" ");
                    }
                }else{
                    if(j%2!=0){
                        System.out.print(num*num*num+" ");
                    }else{
                        System.out.print(num*num+" ");
                    }
                }
                num++;
            }
            num1++;
            System.out.println();
        }
    }
}