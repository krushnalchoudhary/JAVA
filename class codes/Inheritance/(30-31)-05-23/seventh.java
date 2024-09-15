class Parent7{
    int x = 10;
    static int y = 20;

    static{
        System.out.println("Parent Static Block");
    }

    Parent7(){
        System.out.println("In Parent Constructor");
    }


    void Methodone(){
        System.out.println(x);
        System.out.println(y);
    }

    static void Methodtwo(){
        System.out.println(y);
    }
}


class Child7 extends Parent7{
    static{
        System.out.println("In Child Static Block");
    }

    Child7(){
        System.out.println("In Child Constructor");
    }
}

class Client7{
    public static void main(String[] args) {
        Child7 obj = new Child7();
        obj.Methodone();
        obj.Methodtwo();
    }
}