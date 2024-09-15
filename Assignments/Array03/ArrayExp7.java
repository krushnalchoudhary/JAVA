/*
 * Write a program to find Strong number from an array and return its inddex
 * Take Size and Elements from user
 */

 import java.io.*;
public class ArrayExp7 {

    static void strongNo() throws IOException{
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
            int x = arr[i];
            int sum = 0;
            while(x!=0){
              int fact = 1;
              int rem = x%10;
              for(int j=1; j<=rem; j++){
                fact = fact*j;
              }
              sum = sum + fact;
              x = x/10;
            }
            if(sum == arr[i]){
              System.out.print("Strong Number "+arr[i]+" found at index "+i);
            }
        }
    }

    public static void main(String[] args)throws IOException{

        strongNo();
    }
}
