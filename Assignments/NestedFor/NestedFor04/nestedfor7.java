/*
F 
E 1 
D 2 E 
C 3 D 4 
B 5 C 6 D 
A 7 B 8 C 9 
 */

import java.util.Scanner;
public class nestedfor7 {
    public static void main(String[] args) {
        System.out.println("Enter rows");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        int num = 1;
        char ch = 'F';

        for(int i=1; i<=rows; i++){
            char ch1 = ch;
            for(int j=1; j<=i; j++){
                if(j%2!=0){
                    System.out.print(ch1+" ");
                    ch1++;
                }else{
                    System.out.print(num+" ");
                    num++;
                }
            }
            ch--;
            System.out.println();
        }
    }
}
