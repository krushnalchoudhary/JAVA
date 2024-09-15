/*
 * Method : public String substring(int index)
 * 
 * description : Creates a substring of a given string starting with a specified index 
 * and ending at end of given string (if end is not specified)
 * 
 * Parameters : Integer (index)
 * return type : string
 */


public class Method11 {
    public static void main(String[] args) {
        String str = "Core2Web Tech";

        System.out.println(str.substring(5));    //Web Tech
        System.out.println(str.substring(0,3));  //Cor
    }
}
