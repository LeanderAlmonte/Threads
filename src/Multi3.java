public class Multi3 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        Multi3 m1 = new Multi3();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}
