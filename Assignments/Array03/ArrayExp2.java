/*
 * Write a program to Reverse Each Element in an Array.
 * Take Size and Elements from User.
 */
import java.io.*;
public class ArrayExp2 {

    static void Reverse()throws IOException{
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
            int sum=0;
            int num;
            while(arr[i]!=0){
                num = arr[i]%10;
                sum = sum *10 + num;
                arr[i] = arr[i]/10;
            }
            System.out.print(sum+" ");
        }
    }

    public static void main(String[] args)throws IOException{
        Reverse();
    }
}
