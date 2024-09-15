
public class String1 {
    public static void main(String[] args){
        StringBuffer Str1 = new StringBuffer("Demo");
        StringBuffer Str2 = new StringBuffer();

        str2 = str2.append("Demo");

        System.out.println(str1.capacity() == str2.capacity());

    }
}
