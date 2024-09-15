class Demo{
    void run(int x){
        System.out.println(x);
    }

    void run(float y){
        System.out.println(y);
    }

    void run(Demo obj){
        System.out.println("In Demo Para");
        System.out.println(obj);
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.run(obj);
        obj.run(10);
        obj.run(10.5f);
    }
}