import java.util.*;
class SortDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add("Krushnal");
        al.add("Pratik");
        al.add("Rohan");
        al.add("Dhiraj");
        al.add("Shivam");

        System.out.println(al);

        Collections.sort(al);

        System.out.println(al);

    }
}