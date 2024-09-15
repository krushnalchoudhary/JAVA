class Demo{
    void fun(String str){
        System.out.println("String");
    }

    void fun(StringBuffer str1){
        System.out.println("String Buffer");
    }
}


class Client5{
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.fun("CORE2WEB");
        obj.fun(new StringBuffer("core2web"));
    }
}