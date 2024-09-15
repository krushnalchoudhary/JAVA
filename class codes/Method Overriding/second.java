class Parent2{
    Parent2(){
        System.out.println("In Parent Constructor");
    }

    void fun(){
        System.out.println("In Fun");
    }
}

class Child2 extends Parent2{
    Child2(){
        System.out.println("In Child Constructor");
    }

    void gun(){
        System.out.println("In Gun");
    }
}

class Client2 {
    public static void main(String[] args) {
        Child2 obj = new Child2();
        obj.fun();
        obj.gun();

        Parent2 obj2 = new Parent2();
        obj2.fun();
        //obj2.gun();   ----> ERROR : Cannot Find Symbol 
    }
    
}