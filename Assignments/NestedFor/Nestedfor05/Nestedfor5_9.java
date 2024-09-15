/*
Write a program to take a number as input and print the Addition of Factorials of each
digit from that number.
Input: 1234
Output: Addition of factorials of each digit from 1234 = 33
 */

 import java.io.*;
class Nestedfor5_9{

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter Number:");
		int num = Integer.parseInt(br.readLine());
		int sum=0;
        int temp=num;

		while(temp!=0){
			int fact=1;
			int rem = temp%10;
			for(int i=1;i<=rem;i++){
				fact = fact*i;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		System.out.println("Sum of factorial of number "+num+ " is= "+sum);
			
	}
}
