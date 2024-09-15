class MyThread6 implements Runnable{
    public void run(){
        System.out.println("In Run");
        System.out.println(Thread.currentThread().getName());
    }
}

class ThreadDemo6 {
    public static void main(String[] args) {
        MyThread6 obj = new MyThread6();
        Thread t = new Thread(obj);
        t.start();
        System.out.println(Thread.currentThread().getName());
    }
}