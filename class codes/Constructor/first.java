class Demo{
    int x = 10;
    Demo(){
        System.out.println("In Constructor");
    }

    void fun(){
        System.out.println(x);
    }
    public static void main(String[] args) {
        Demo obj1 = new Demo();
        obj1.fun();
    }
}



/* PROTOCOLS---->
 * Code should always start with Main();
 * Do Not Create Object inside Static Block;
 * Before main --> Block;
 * After main --> Method;
*/