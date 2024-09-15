/*
 * Write the program to find Palindrome number from an Array and return it's index.
 * Take size and elements from the user.
 */
import java.io.*;
public class ArrayExp6 {

    static void palindromeNo() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the Size/Dimensions ");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        System.out.println("Enter Array Elements");

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            int sum = 0;
            while(num!=0){
                int x =num%10;
                sum = sum*10+x;
                num = num/10;
            }
            if(arr[i]==sum){
                System.out.print("Palindrome no "+arr[i]+" found at index "+i);
            }
        }
    }

    public static void main(String[] args)throws IOException{
       
        palindromeNo();
    }
}
