/*
 * Method : Public int compareTo(String str2)
 * 
 * Description : It compares two Strings
 *               Case Sensitive
 *               If both strings are equal it returns 0 otherwise returns the comparision
 * 
 * example : str1.compareTo(str2)
 * 
 * Parameters : String
 * return type : int
 */

public class Method4 {
    public static void main(String[] args) {
        String str1 = "Krushnal";
        String str2 = "Krushnal";
        String str3 = "krushnal";

        System.out.println(str1.compareTo(str2));    //0
        System.out.println(str2.compareTo(str3));   //-32
    }
}
