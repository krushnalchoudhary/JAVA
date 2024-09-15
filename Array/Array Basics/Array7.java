/*Take an integer array
size = 5
take elements as input 
perform addition on its elements
print the addition*/


import java.io.*;
public class Array7 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr =  new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr );

        int arr[] = new int[5];
        System.out.println("Enter Array Elements");

        int sum = 0;

        for(int i=0; i<arr.length; i++){

            arr[i] = Integer.parseInt(br.readLine());

            sum = sum + arr[i];
        }

        System.out.println("Sum = "+sum);
    }
}
