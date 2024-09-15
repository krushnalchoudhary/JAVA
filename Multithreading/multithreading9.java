class MyThread9 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

class ThreadDemo9 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        MyThread9 obj = new MyThread9();
        obj.start();

        obj.start();  // --------->
    }
}



/*
 * Exception in thread "main" Thread-0
java.lang.IllegalThreadStateException
        at java.base/java.lang.Thread.start(Thread.java:1534)
        at ThreadDemo9.main(multithreading9.java:14)
 */