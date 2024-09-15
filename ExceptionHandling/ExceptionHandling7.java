import java.io.*;

class NumberFormatExceptionDemo{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();

        System.out.println(str1);
        int data;

        try{
            data = Integer.parseInt(br.readLine());
        }catch(NumberFormatException obj){
            System.out.println("Please Enter Integer Data");
            data = Integer.parseInt(br.readLine());
        }
        System.out.println(data);
    }
}