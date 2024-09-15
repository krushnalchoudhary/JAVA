import java.util.*;
class VectorDemo{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        Vector v = new Vector(al);

        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);

        System.out.println(v);

       System.out.println(v.capacity()); 
        v.remove(3);
        System.out.println(v);
    }
}

