class Match{
    void MatchType(){
        System.out.println("T20/OneDay/Test");
    }
}

class IPL extends Match{
    void MatchType(){
        System.out.println("T20");
    }
}

class WTC extends Match{
    void MatchType(){
        System.out.println("Test");
    }
}

class Client2{
    public static void main(String[] args) {
        Match type1 = new IPL();
        type1.MatchType();


        Match type2 = new WTC();
        type2.MatchType();
    }
}