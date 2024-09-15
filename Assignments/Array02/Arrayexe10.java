/*
WAP to print the elements whose addition of digits is even.
Ex. 26 = 2 + 6 = 8 (8 is even so print 26)
Input :
Enter array : 1 2 3 5 15 16 14 28 17 29 123
Output: 2 15 28 17 123
 */
import java.io.*;
public class Arrayexe10 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the Size of Array");
        int size = Integer.parseInt(br.readLine());

        System.out.println("Enter Array Elements");

        int sum;
        int arr[] = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            sum=0;
            while(num!=0){
                int rem = num%10;
                sum = sum+rem;
                num=num/10;
            }
            if(sum%2==0){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
