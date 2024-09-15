class Demo{
    void fun(int x){
        System.out.println("In INT Para");
    }

    void fun(Float ch){
        System.out.println("In Float Para");
    }
}

class Client3{
    public static void main(String[] args) {
        Demo obj = new Demo();
        /*obj.fun(10,10);
         * 
         * 
         * 
         *  no suitable method found for fun(int,int)
        obj.fun(10,10);
           ^
    method Demo.fun(int) is not applicable
      (actual and formal argument lists differ in length)
        */
    }
}