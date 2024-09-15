/*
A b C d 
E f G h 
I j K l 
M n O p  */


import java.util.*;

public class nestedfor13 {
    public static void main(String[] args){
        char x= 'A';
        char y = 'b';
        int r;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        r = sc.nextInt();
        System.out.println("Enter columns");
        c = sc.nextInt();

        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                if(j%2==0){
                    System.out.print(y+" ");
                    y++;
                    y++;
                    
                }else{
                System.out.print(x+" ");
                x++;
                x++;
                
                }
            }
            System.out.println();
        }


    }
}