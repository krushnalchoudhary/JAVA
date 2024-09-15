/*
 * Method : public char charAt(int index)
 * 
 * Description : It return the character located at specified index within a given string
 * 
 * Parameters : integer(index)
 * return Type : Character
 */


public class Method3 {
    public static void main(String[] args) {
        String str1 = "Core2Web";

        System.out.println(str1.charAt(4));
        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(8));   //StringIndexOutOfBoundsException
    }
}
