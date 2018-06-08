package sample;

/**
 * Created by RANGAREJ on 5/14/2018.
 */
public class OddEvenNumberPrinting {
    public static void main(String a[]) {
        Printer printer = new Printer();
        new Thread(new OddNumber(printer)).start();
        new Thread(new EvenNumber(printer)).start();
    }
}

class OddNumber implements Runnable {
    Printer printer;

    public OddNumber(Printer printer) {
        this.printer = printer;
    }

    public void run() {
        for (int i = 1; i <= 10; i = i + 2) {
            try {
                Thread.sleep(1000);
                printer.odd(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class EvenNumber implements Runnable {
    Printer printer;

    public EvenNumber(Printer printer) {
        this.printer = printer;
    }

    public void run() {
        for (int i = 2; i <= 10; i = i + 2) {
            try {
                Thread.sleep(2000);
                printer.even(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}

class Printer {
    boolean isEvenPrinted=true;

    //if oddNumber printed goto waiting state
    // else print the odd number make it flag like odd is printed and then notify to even thread
    public  void odd(int oddNumber) throws InterruptedException {
        synchronized (this) {
            if (!isEvenPrinted) {
               this. wait();
            }
            System.out.println(oddNumber);
            isEvenPrinted = false;
            //we are notifying to even number thread he boss my task is done
            this.notify();
        }
    }
    //
    public  void even(int evenNumber) throws InterruptedException {
        synchronized(this) {
            if (isEvenPrinted) {
               this.wait();
            }
            System.out.println(evenNumber);
            isEvenPrinted = true;
            //Hey boss my task is done
            this.notify();
        }

    }
}