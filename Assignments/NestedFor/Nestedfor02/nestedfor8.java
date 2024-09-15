/*
A b C d 
E f G h 
I j K l 
M n O p 
 */

import java.util.Scanner;
class nestedfor8{
    public static void main(String[] args) {
        System.out.println("Enter rows");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        System.out.println("Enter columns");
        int col = sc.nextInt();

        char ch1 = 'A';
        char ch2 = 'a';

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=col; j++){
                if(j%2==0){
                    System.out.print(ch2+" ");
                }else{
                    System.out.print(ch1+" ");
                }
                ch1++;
                ch2++;
            }
            System.out.println();
        }

    }
}
