public class TestMultiTasking3 {

    public static void main(String[] args) {
        Simple1 t1 = new Simple1();
        Simple1 t2 = new Simple1();

        t1.start();
        t2.start();
    }
}

class Simple1 extends Thread{
    public void run(){
        for(int i =1; i<=10; i++){
            System.out.println(i);
        }
    }
}

class Simple2 extends Thread{
    public void run(){
        for(int i =1; i<=10; i++){
            System.out.println(i);
        }
    }
}