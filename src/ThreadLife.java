public class ThreadLife {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread());
        System.out.println("Thread is alive "+ t.isAlive());
        t.start();
        System.out.println("Thread is Alive"+ t.isAlive());
    }
}

class MyThread implements Runnable{


    @Override
    public void run() {
        try{
            System.out.println("Thread is running now");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
