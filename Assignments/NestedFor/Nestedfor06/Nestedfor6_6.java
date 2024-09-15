/*
Write a program to take 5 numbers as input from the user and print the count of digits in those
numbers.
Input: Enter 5 numbers :
5
The digit count in 5 is 1
25
The digit count in 25 is 2
225
The digit count in 225 is 3
6548
The digit count in 6548 is 4
852347
The digit count in 852347 is 6
 */


import java.io.*;
public class Nestedfor6_6 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the number of inputs numbers you want to take");
        int inp = Integer.parseInt(br.readLine());
        int count;

        for(int i=1; i<=inp; i++ ){
            System.out.println("Enter the number");
            int num = Integer.parseInt(br.readLine());

            count=0;
            int temp = num;
            while(temp!=0){
                temp = temp/10;
                count++;
            }
            System.out.println("There are " + count + " digits in " + num);
        }

    }    
}
