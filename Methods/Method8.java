/*
 * Method : public int  indexOf(char ch, int from index)
 * 
 * Description : Finds the first instance of the character in the given String
 * 
 * Parameters : character (ch) , integer(index to start from)
 * return type : int
 */
public class Method8 {
   public static void main(String[] args) {
    String str = "Krushnal";

    System.out.println(str.indexOf('h',0));  //4
    System.out.println(str.indexOf('h',1));  //4
    System.out.println(str.indexOf('h',5));  //-1
   } 
}
