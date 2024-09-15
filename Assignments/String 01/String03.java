/*
Write a program to check if a String contains any digits? 
EXAMPLE : INPUT => CORE2WEB OUTPUT => TRUE
           INPUT => BIENCAPS OUTPUT=> FALSE
 */


 import java.io.*;
public class String03 {
    public static void main(String[] args)throws IOException {
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the String");
        String str = br.readLine();
        char arr[] = str.toCharArray();

        int flag = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]=='0' || arr[i]<='9'){
                flag =1;
            }
        }
        if(flag ==1){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        
    }
}
