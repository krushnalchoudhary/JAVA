public class String5 {
    public static void main(String[] args){
        StringBuffer str1 = new StringBuffer("AndroidOne");

        str1.delete(7, 10);
        str1.insert(str1.length(),true);

        System.out.println(str1);

    }
}
