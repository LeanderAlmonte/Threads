public class ThreadPriorityDemo implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {
        ThreadPriorityDemo a = new ThreadPriorityDemo();
        Thread t1 = new Thread(a, "First Thread");
        Thread t2 = new Thread(a, "Second Thread");
        Thread t3 = new Thread(a, "Third Thread");
        t1.setPriority(3);
        t2.setPriority(2);
        t3.setPriority(9);
        t1.start();
        t2.start();
        t3.start();
    }
}
