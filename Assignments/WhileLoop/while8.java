/*
Write a program to print the countdown of days to submit the
assignment
Input : day = 7
Output: 7 days remaining
6 days remaining

5 days remaining
.
.
1 days remaining
0 days Assignment is Overdue
 */

 import java.io.*;
public class while8 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the Number of Days");
        int num = Integer.parseInt(br.readLine());
        
        if(num>0){

            while(num!=0){
                if(num==7){
                    System.out.println("7 Days are Remaining");
                }else if(num==6){
                    System.out.println("6 Days are remaining");
                } if(num==5){
                    System.out.println("5 Days are Remaining");
                }else if(num==4){
                    System.out.println("4 Days are remaining");
                } if(num==3){
                    System.out.println("3 Days are Remaining");
                }else if(num==2){
                    System.out.println("2 Days are remaining");
                }else if(num==1){
                    System.out.println("1 Days are remaining");
                }else if(num==0){
                    System.out.println("Assignment is Overdue");
                }
                num--;
            }
        }else{
            System.out.println("Assignment is Overdue");
        }
    }
}
