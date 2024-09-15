class Parent{
    Parent(){
        System.out.println("In Parent Construcotr");
    }
}

class Child extends Parent{
    Child(){
        System.out.println("In Child Construcotr");
    }
}

class Client{
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        Child obj2 = new Child();
    }
}