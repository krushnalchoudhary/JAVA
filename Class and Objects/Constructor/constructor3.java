public class constructor3 {
    constructor3(){
        System.out.println("In Constructor");
    }

    void fun(){
        constructor3 obj = new constructor3();
    }
    public static void main(String[] args) {
        constructor3 obj2 = new constructor3();
        constructor3 obj3 = new constructor3();

        obj2.fun();
    }
}
