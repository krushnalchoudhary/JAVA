interface Example1{
    default void fun(){
        System.out.println("In fun Example-1");
    }
}

interface Example2{
    default void fun(){
        System.out.println("In fun Example-2");
    }
}

class EgChild implements Example1,Example2{
    public static void main(String[] args) {
        EgChild obj1 = new EgChild();
        obj1.fun();

        Example1 eg1 = new EgChild();
        eg1.fun();

        Example2 eg2 = new EgChild();
        eg2.fun();
    }
}