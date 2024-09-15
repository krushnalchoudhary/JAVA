public class String7 {
    public static void main(String[] args){
        StringBuffer str1 = new StringBuffer(400);

  
        str1.append("Java_Developement_Kit");

        str1.trimToSize();
        str1.setLength(10);


        System.out.println(str1.length());
        System.out.println(str1.capacity());

    }
}
