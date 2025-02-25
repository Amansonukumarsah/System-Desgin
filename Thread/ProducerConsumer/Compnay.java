package Thread.ProducerConsumer;

public class Compnay {

    int n;
    boolean f = false;

    // f=false: chance : procuder
    // we can use throw execption
    synchronized public void produce_item(int n) {
        if (f) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println("waiting producer" + e);
            }
        }
        this.n = n;
        System.out.println("Producr : " + this.n);
        f = true;
    }

    // f=true: chance : consumer
    synchronized public int consume_item() {
        if (!f) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println("waiting consumer" + e);
            }
        }
        System.out.println("Consumed : " + this.n);
        f = false;
        return this.n;
    }

}
