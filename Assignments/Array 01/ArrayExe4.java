/*
 * WAP to take 7 Character as input 
 * print only vowels from the array
 */
import java.io.*;
public class ArrayExe4{
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br  = new BufferedReader(isr);
        
        int size;

        System.out.println("Enter Size of An Array");
        size = Integer.parseInt(br.readLine());
        char arr[] = new char[size];


        System.out.println("Enter Array Elements");
        for(int i=0; i<arr.length; i++){
            arr[i] = (char) (br.read());
            br.skip(1);
                
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i] == 'u'|| arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i] == 'u'){
                System.out.println("Vowels in array are:"+arr[i]);

            }
        }


    }
}
