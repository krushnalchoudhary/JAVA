
public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Krushnal");
        System.out.println(System.identityHashCode(str));

        System.out.println(str);
        
        str.append("Choudhary");

        System.out.println(str);

        System.out.println(System.identityHashCode(str));
    }
}
