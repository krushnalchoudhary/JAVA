class Demo extends Thread{
    public void run(){
        System.out.println("Demo : " +Thread.currentThread().getName());
    }
}

class MyThread5 extends Thread{
    public void run(){
        System.out.println("MyThread: "+Thread.currentThread().getName());

        Demo obj = new Demo();
        obj.start();
    }
}

class ThreadDemo5 {
    public static void main(String[] args) {
        System.out.println("ThreadDemo: "+Thread.currentThread().getName());

        MyThread5 obj = new MyThread5();
        obj.start();
    }
}