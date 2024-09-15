import java.util.ArrayList;
class ArrayListDemo extends ArrayList{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20.5f);
        al.add("Krushnal");
        al.add(10);
        al.add(20.5f);

        System.out.println(al);

        //Methods
        
        // 1. int size();

        System.out.println(al.size());

        // 2. boolean contains (object);

        System.out.println(al.contains("Krushnal"));
        System.out.println(al.contains(30));

        // 3. int indexof(object);

        System.out.println(al.indexOf(10));
        System.out.println(al.indexOf(20.5f));


        // 4. int lastIndexof(object);

        System.out.println(al.lastIndexOf(10));
        System.out.println(al.lastIndexOf(20.5f));


        // 5. E get(int);

        System.out.println(al.get(2));
        System.out.println(al.get(0));

        // 6. E set(int , E);

        System.out.println(al.set(3, "Incubator"));
        System.out.println(al.set(3, "Core2Web"));

        // 7. void add (int , E);

        al.add(3, "Biencaps");
        System.out.println(al);

        // 8. remove(int);

        System.out.println(al.remove(3));
        System.out.println(al);

        // 9. boolean addAll(int,collection);

        ArrayList al2 = new ArrayList();
        al2.add(40);
        al2.add(50);

        al.addAll(3,al2);
        System.out.println(al);

        // 10. boolean addAll(collection);

        al.addAll(al2);
        System.out.println(al);

        // 11. Protected void removeRange(int,int);

     //   al.removeRange(3,5);
       // System.out.println(al);

       // 12. boolean remove(object);

       al.remove(4);
       System.out.println(al);

       // 13. void clear()

       al.clear();
       System.out.println(al);
    }
}