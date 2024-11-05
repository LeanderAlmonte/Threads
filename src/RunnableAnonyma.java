public class RunnableAnonyma {
    public static void main(String[] args) {
        System.out.println("inside : "+Thread.currentThread().getName());

        System.out.println("Creating runnable");

        Runnable runnable = () -> {
            System.out.println("inside : "+Thread.currentThread().getName());
        };

        System.out.println("Now create a Thread");
        Thread t1 = new Thread(runnable);
        System.out.println("Starting new thread");
        t1.start();
    }
}
