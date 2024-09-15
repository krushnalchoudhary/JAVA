class Parent3{
    Parent3(){
        System.out.println("In Parent Constructor");
    }

    void fun(){
        System.out.println("In Parent Fun");
    }
}


class Child3 extends Parent3{
    Child3(){
        System.out.println("In Child Constructor");
    }

    void fun(){
        System.out.println("In Child Fun");
    }
}


class Client3{
    public static void main(String[] args) {
        Parent3 obj = new Child3();
        obj.fun();
    }
}