public class String4 {
    public static void main(String[] args){
        StringBuffer str1 = new StringBuffer(400);
        str1.append(400);

        str1.setLength(str1.length());

        System.out.println(str1.capacity());

    }
}
