/*
 * Method : public String concat (String str);
 * 
 * Description : concatenates one string to the end of another string
 *               implements new Array of Characters whose length is sum of both strings
 * 
 * Parameters : String
 * Return Type : String 
 */


public class Method1 {
    public static void main(String[] args) {
        String str1 = "Core2";
        String str2 = "Web";

        String str3 = str1.concat(str2);
        System.out.println(str3);
    }
}
