/*
 * Method : public boolean equals(object an)
 * 
 * Description : True only for strings with same character sequence
 * 
 * Parameters : object (andobject)
 * return type : boolean
 */
public class Method6 {
    public static void main(String[] args) {
        String str1 = "Krushnal";
        String str2 = new String("krushnal");
        String str3 = new String("Krushnal");

         System.out.println(str1.equals(str2));  //false
         System.out.println(str1.equals(str3));  //true
    }
}
