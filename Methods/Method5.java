/*
 * Method : public int compareToIgnoreCase(String str)
 * 
 * Dscription : same as compareTo with a difference that compareTo is CASE SENSITIVE whereas 
 *              compareToIgnoreCase is Case Insensitive
 * 
 * Parameter : String
 * return type : int
 */
public class Method5 {
    public static void main(String[] args) {
        String str1 = "Krushnal";
        String str2 = "krushnal";

        System.out.println(str1.compareToIgnoreCase(str2));
    }
}
