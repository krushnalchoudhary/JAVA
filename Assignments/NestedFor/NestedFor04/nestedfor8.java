/*
10 
I H 
7 6 5 
D C B A 
 */

import java.util.Scanner;
public class nestedfor8 {
    public static void main(String[] args) {
        System.out.println("Enter rows");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        int num = 10;
        char ch = 'J';

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                if(i%2==0){
                    System.out.print(ch+" ");
                }else{
                    System.out.print(num+" ");
                }
                  num--;
                  ch--;
            }
  
            System.out.println();
        }
    }
}
