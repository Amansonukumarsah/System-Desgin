package Thread;

public class Consumer extends Thread {

    Compnay c;

    Consumer(Compnay c) {
        this.c = c;
    }

    public void run() {
        while (true) {
            this.c.consume_item();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}
