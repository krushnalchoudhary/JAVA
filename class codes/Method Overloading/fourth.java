class Demo{
    void fun(int x , float ch){
        System.out.println("Int-Float Para");
    }

    void fun(float ch, int x){
        System.out.println("Flaot-Int Para");
    }
}



class Client4{
    public static void main(String[] args) {
        Demo obj = new Demo();
       // obj.fun(10,10);
    }
}


/*
 * error: reference to fun is ambiguous
        obj.fun(10,10);
           ^
  both method fun(int,float) in Demo and method fun(float,int) in Demo match
1 error
 */