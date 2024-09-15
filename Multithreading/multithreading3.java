class MyThread3 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(int i=0; i<10; i++){
            System.out.println("In Run");
            try{
                Thread.sleep(5000);
            }catch(InterruptedException obj){

            }
        }
    }
}

 
class MyThreadDemo3{
    public static void main(String[] args)throws InterruptedException {
        MyThread obj = new MyThread();
        obj.start();

        for(int i=0; i<10; i++){
            System.out.println("In Main");
            Thread.sleep(5000);
        }
    }
}