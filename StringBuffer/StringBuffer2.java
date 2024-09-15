public class StringBuffer2 {
    public static void main(String[] args) {

        StringBuffer str = new StringBuffer();
        System.out.println(str.capacity());                   //16

        StringBuffer str1 = new StringBuffer("Krushnal");
        System.out.println(str1.capacity());                 //24  
        System.out.println(System.identityHashCode(str1));    //622488023
        System.out.println(str1);                              //Krushnal

        str1.append("Choudhary");

        System.out.println(System.identityHashCode(str1));    //622488023
        System.out.println(str1.capacity());                    //24
        System.out.println(str1);                             //KrushnalChoudhary
    }
}
