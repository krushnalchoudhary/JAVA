/*
 * error: non-static variable this cannot be referenced from a static context
            Child1 obj = new Child1();
                         ^
1 error
 */




class Parent1{
    Parent1(){
        System.out.println("In Parent Constructor");
    }

    void property(){
        System.out.println("flat, car,Gold");
    }

    class Child1 extends Parent1{
        Child1(){
            System.out.println("In Child Constructor");
        }
    }

    class Client{
        public static void main(String[] args) {
            Child1 obj = new Child1();
            obj.property();
        }
    }
}