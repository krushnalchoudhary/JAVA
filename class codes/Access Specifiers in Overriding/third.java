class Parent3{
    private void fun(){
        System.out.println("In Parent Fun");
    }
}

class Child3 extends Parent3{
    void fun(){
        System.out.println("In Child fun");
    }
}

class Client3 {
    public static void main(String[] args) {
        Parent3 obj = new Child3();
       // obj.fun();
    }
}

/*
 * 
 * error: fun() has private access in Parent3
        obj.fun();
           ^
1 error
 */