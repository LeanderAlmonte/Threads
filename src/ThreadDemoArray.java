public class ThreadDemoArray {
    public static void main(String[] args) {
        System.out.println("Inside : "+ Thread.currentThread().getName());
        String[] messages = {
                "I will come to Vanier",
                "Cos I like the PP exam",
                "I think its fun",
                "Maybe I pass the exam",
                "See you tmrw"
        };

        Runnable runnable = () -> {
            System.out.println("Inside : "+ Thread.currentThread().getName());
        };

        for (String message: messages) {
            System.out.println(message);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                throw new IllegalStateException(e);
            }
        }

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
