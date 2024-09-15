/*
 * Write a program to find a perfect no from an Array and return it's Index.
 * Take size and elements from user
 */
import java.io.*;
public class ArrayExp5 {
   
    static void perfectNo()throws IOException{

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
            int sum =  0;
            for(int j=1; j<arr[i]; j++){

                if(arr[i]%j==0){
                    sum = sum+j;
                }
            }
            if(sum==arr[i]){
                System.out.println("Perfect no "+arr[i]+" found at index "+i);
            }
        }

    }

    public static void main(String[] args)throws IOException{

        perfectNo();
    }
}
