interface Demo9{
    static void fun(){
        System.out.println("In Fun");
    }
}

class DemoChild implements Demo9{

}

class Client{
    public static void main(String[] args) {
        DemoChild obj = new DemoChild();
      //  obj.fun();
    }
}




/*
 * cannot find symbol
        obj.fun();
           ^
  symbol:   method fun()
  location: variable obj of type DemoChild
1 error
 */