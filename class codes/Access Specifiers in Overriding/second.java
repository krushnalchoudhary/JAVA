class Parent2{
    public void fun(){
        System.out.println("Parent Fun");
    }
}

class Child2 extends Parent2{
    /*
     * void fun(){
        System.out.println("Child Fun");
    }
     */
}




/*
 * fun() in Child2 cannot override fun() in Parent2
    void fun(){
         ^
  attempting to assign weaker access privileges; was public
1 error
 * 
 */