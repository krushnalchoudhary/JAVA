public class StringDemo6 {
    public static void main(String[] args) {
        String str1 = "Krushnal";
        String str2 = "Choudhary";


        String str3 = str1.concat(str2);
        String str4 = str1 + str2;            // Internally calls append method of StringBuffer class....

        System.out.println(str3);   
        System.out.println(str4);  
    }
}
