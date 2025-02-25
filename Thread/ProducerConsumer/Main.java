package Thread;

public class Main {

    public static void main(String[] args) {
        Compnay comp = new Compnay();
        producer p = new producer(comp);
        Consumer c = new Consumer(comp);
        p.start();
        c.start();

    }
}
