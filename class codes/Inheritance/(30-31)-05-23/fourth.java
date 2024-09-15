class Parent2{
    int x = 10;
    Parent2(){
        System.out.println("In Parent Constructor");
    }

    void access(){
        System.out.println("Parent Instance");
    }
}

class Child2 extends Parent2{
    int y=20;
    Child2(){
        System.out.println("In Child Constructor");
        System.out.println(x);
        System.out.println(y);
        access();
    }
}


class Client{
    public static void main(String[] args) {
        Child2 obj = new Child2();
        obj.access();
    }
}
