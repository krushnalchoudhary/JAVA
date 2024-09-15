class Parent1{
    int x = 10;
    static int y = 20;
    Parent1(){
        System.out.println("In Parent Constructor");
    }
}

class Child1 extends Parent1{
    int x = 100;
    static int y = 200;

    Child1(){
        System.out.println("In Child Constructor");
    }

    void access(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(super.x);
        System.out.println(super.y);
    }
}

class Client1{
    public static void main(String[] args) {
        Child1 obj = new Child1();
        obj.access();
    }
}