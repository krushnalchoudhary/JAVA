class Parent5{
    Parent5(){
        System.out.println("Parent Constructor");
    }

    void fun (int x){
        System.out.println("In Parent Fun");
    }
}

class Child5 extends Parent5{
    Child5(){
        System.out.println("In Child Constructor");
    }

    void fun(){
        System.out.println("In Child Fun");
    }
}


class Client5{
    public static void main(String[] args) {
        Parent5 obj = new Child5();
        //obj.fun();    ------> ERROR
        obj.fun(0);
    }
}