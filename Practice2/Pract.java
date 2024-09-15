import java.io.*;

 class CheckProperties {

  public static void main(String args[]) {
    Integer a = 10;
    Integer b = 200;
      
    // Printing the hashcodes of a and b
    System.out.println("HashCode of a = " + a + ": " + a.hashCode());
    System.out.println("HashCode of b = " + b + ": " + b.hashCode());
    
    // Declaring a different variable
    Integer c = 30;

    // Printing the hashcode of c
    System.out.println("HashCode of c = " + c + ": " + c.hashCode());
    
    // Second Computation of a's hashcode
    System.out.println("HashCode of a = " + a + ": " + a.hashCode());
  }
}
