interface Demo10{
    static void fun(){
        System.out.println("In fun-Demo10");
    }
}

interface Demo11{
    static void fun(){
        System.out.println("In fun-Demo11");
    }
}


class Demochild implements Demo10,Demo11{
    void fun(){
        System.out.println("In fun child");
        Demo10.fun();
        Demo11.fun();
    }
}

class client{
    public static void main(String[] args) {
        Demochild obj = new Demochild();
        obj.fun();
    }
}