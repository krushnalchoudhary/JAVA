import java.util.*;
class Movies implements Comparable {
    String movieName = null;
    float totColl = 0.0f;

    Movies(String movieName , float totColl){
        this.movieName = movieName;
        this.totColl = totColl;
    }

    public int compareTo(Object obj){
       // return(movieName.compareTo(((Movies)obj).movieName));
         return -(movieName.compareTo(((Movies)obj).movieName));
    }
    public String toString(){
        return movieName;
    }
}

class TreeSetDemo3{
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(new Movies("Gadar2", 1500.00f));
        ts.add(new Movies("OMG2", 1200.00f));
        ts.add(new Movies("Jailer", 250.00f));
        ts.add(new Movies("OMG2", 1200.00f));

        System.out.println(ts);
    }
}
