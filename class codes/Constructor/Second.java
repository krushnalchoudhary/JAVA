class Demo2{
    int x = 10;
    Demo2(){
        System.out.println("In Constructor");
        System.out.println(this);
        System.out.println(this.x);
    }

    void fun(){
        System.out.println(this);
        System.out.println(x);
    }

    public static void main(String[] args) {
        Demo2 obj = new Demo2();
        System.out.println(obj);
        obj.fun();
    }
}