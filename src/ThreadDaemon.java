public class ThreadDaemon extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("daemon thread work");
        }
        else{
            System.out.println("user thread work");
        }
    }

    public static void main(String[] args) {
        ThreadDaemon t1 = new ThreadDaemon();
        ThreadDaemon t2 = new ThreadDaemon();
        ThreadDaemon t3 = new ThreadDaemon();

        t1.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();
    }
}
