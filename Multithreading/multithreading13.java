class MyThread13 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

class ThreadDemo13{
    public static void main(String[] args) {
        MyThread13 obj = new MyThread13();
        obj.start();
        obj.yield();

        System.out.println(Thread.currentThread().getName());
    }
}
