/*
Write a program to check whether the number is a Palindrome
number or not. (2332)
Output: 2332 is a palindrome number
 */

 import java.io.*;
public class while10 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the number");
        int num = Integer.parseInt(br.readLine());

        int num1 = num;
        int palindromeNo = 0;
        int temp;
        while(num!=0){
            temp = num%10;
            palindromeNo = palindromeNo * 10 + temp;
            num = num/10;
        }
        if(num1 == palindromeNo){
            System.out.println(num1+" is a pallindrome number");
        }else{
            System.out.println(num1+" is Not a pallindrome");
        }
    }
}
