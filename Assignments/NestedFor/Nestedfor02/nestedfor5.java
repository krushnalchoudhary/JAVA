/*
26 Z 25 Y 
24 X 23 W 
22 V 21 U 
20 T 19 S  */



import java.util.*;
public class nestedfor5 {
    public static void main(String[] args){
        int r;
        int c;
        int num=26;
        char ch = 'Z';


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        r = sc.nextInt();
        System.out.println("Enter columns");
        c = sc.nextInt();

        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                if(j%2==0){
                System.out.print(ch+" ");
                ch--;
                }else{
                    System.out.print(num+" ");
                    num--;
                }
            }

            System.out.println();
        }


    
    }
}


