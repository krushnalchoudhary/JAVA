import java.io.IOException;

/*
 * Write a program to find composite number from an Array and return its index
 * Take size and elements from the user 
 */
import java.io.*;
public class ArrayExp3 {

    static void composite()throws IOException{
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
            int count = 0;
            for(int j=1; j<=arr[i]/2; j++){
                if(arr[i]%j==0){
                    count++;
                }
            }
            if(count>2){
                System.out.println("Composite "+arr[i]+" found at index "+i);
            }
        }
    }

    public static void main(String[] args)throws IOException{

        composite();
    }
}
