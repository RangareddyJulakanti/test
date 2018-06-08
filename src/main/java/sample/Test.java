package sample;

/**
 * Created by RANGAREJ on 5/14/2018.
 */
public class Test {
    public static void main(String a[]) throws InterruptedException {
        Increment increment=new Increment();

        Thread childThread1=new Thread(new MyRunnable(increment));
        childThread1.start();
        //childThread1.join();
        for (int k=1;k<=15;k++){
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+":"+increment.print());
        }
    }
}
class MyRunnable implements Runnable{

    private final Increment increment;

    public MyRunnable(Increment increment) {
        this.increment=increment;
    }

    public void run() {
        for (int j=1;j<=15;j++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":"+increment.print());
        }
    }
}
class Increment{
    int i=0;
    public synchronized int print(){
        return i++;
    }
}