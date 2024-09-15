/*
1 
8 9 
27 16 125 
64 25 216 49 
 */

import java.util.Scanner;
public class nestedfor9 {
    public static void main(String[] args) {
        System.out.println("Enter rows");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        for(int i=1; i<=rows; i++){
            int num = i;
            for(int j=1; j<=i; j++){
                if(j%2!=0){
                    System.out.print(num*num*num+" ");
                }else{
                    System.out.print(num*num+" ");
                }
                  num++;
                  
            }
  
            System.out.println();
        }
    }
}