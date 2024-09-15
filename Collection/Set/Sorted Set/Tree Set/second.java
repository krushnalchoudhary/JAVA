import java.util.*;
class myClass implements Comparable{
    String str = null;

    myClass (String str){
        this.str = str;
    }

    public int compareTo(Object obj){
      //  (obj.str).compareTo(this.str);
        return 1;
    }
    
}

class TreeSetDemo2{
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        
        ts.add(new myClass("Kanha"));
        ts.add(new myClass("Ashish"));
        ts.add(new myClass("Rahul"));
        ts.add(new myClass("Badhe"));

        System.out.println(ts);
    }
}