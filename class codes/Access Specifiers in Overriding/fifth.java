class Parent5{
    static void fun(){
        System.out.println("In Parent fun");
    }
}

class Child5 extends Parent5{
   /*  void fun(){
        System.out.println("In Child Fun");
    }*/
}



/*
 * error: fun() in Child5 cannot override fun() in Parent5
    void fun(){
         ^
  overridden method is static
1 error
 */