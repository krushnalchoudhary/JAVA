
/*
 * WAP to take 7 Character as input 
 * print only vowels from the array
 */
import java.io.*;
public class ArrayExe6{
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
        /*for(int i = 0; i<arr.length; i++){
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i] == 'u'|| arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i] == 'u'){
                System.out.println("Vowels in array are:"+arr[i]);

            }
        }*/

        char arr1[] = {'a','e','i','o','u','A','E','I','O','U'};
        
        System.out.println("Vowels present in Array are:");
        for(int i=0; i<arr1.length; i++ ){
            for(int j = 0; j<arr.length; j++){
                if(arr1[i]== arr[j]){
                    System.out.println(arr[j]);
                }
            }

        }


    }
}
