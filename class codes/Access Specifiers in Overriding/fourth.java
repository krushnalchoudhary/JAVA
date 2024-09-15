class Parent4{
    final void fun(){
        System.out.println("Parent Fun");
    }
}

class Child4 extends Parent4{
   // void fun(){
   //     System.out.println("CHILD FUN");
    //}
}


/*
 * 
  error: fun() in Child4 cannot override fun() in Parent4
    void fun(){
         ^
  overridden method is final
1 error
 * 
 */