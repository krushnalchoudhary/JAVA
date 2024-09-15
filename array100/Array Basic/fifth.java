import java.io.*;
class Array5{
    public static void main(String[] args)throws IOException {
        System.out.println("Enter the Number");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int num = Integer.parseInt(br.readLine());

        int temp=0;
        int num2=0;
         while(num!=0){
            temp = num%10;
            if(temp==0){
                temp=5;
            }
            num2 = num2*10+temp;
            num = num/10;
        
        }
        while(num2!=0){
            temp=num2%10;
            num = num*10+temp;
            num2=num2/10;
        }

        System.out.println(num);
    }
}