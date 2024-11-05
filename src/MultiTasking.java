public class MultiTasking {
    public static void main(String[] args) {
        class1 t1 = new class1();
        class2 t2 = new class2();
        class3 t3 = new class3();

        t1.start();
        t2.start();
        t3.start();
    }
}

class class1 extends Thread{
    public void run(){
        int sum=0;
        for(int i =1; i<=100; i++){
            sum+=i;
            System.out.println("Sum is:"+ sum);
        }
    }
}

class class2 extends Thread{
    public void run(){
        int rep =0;
        for(int i =0; rep<10; i++){
            System.out.println("Even number: "+ i);
            i++;
            rep++;
        }
    }
}

class class3 extends Thread{
    public void run(){
        int rep =0;
        for(int i =1; rep<10; i++){
            System.out.println("Odd number: "+ i);
            i++;
            rep++;
        }
    }
}
