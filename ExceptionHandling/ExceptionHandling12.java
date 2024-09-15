
import java.io.*;
class StringLengthOverFlowException extends RuntimeException{
    StringLengthOverFlowException(String msg){
        super(msg);
    }
}

class StringLengthUnderFlowException extends RuntimeException{
    StringLengthUnderFlowException(String msg){
        super(msg);
    }
}

class UserDefinedExceptionDemo2{
    public static void main(String[] args) throws IOException {


        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);


        System.out.println("Enter String");
        System.out.println("Note: 1 < Characters in String < 10");

        String str = br.readLine();
        System.out.println(str);

        char []ch = str.toCharArray();

        if(ch.length<1){
            throw new StringLengthUnderFlowException("String should have min 2 Characters");
        }

        if(ch.length>10){
            throw new StringLengthOverFlowException("String cannot contain more than 10 Characters");
        }

       

    }
}