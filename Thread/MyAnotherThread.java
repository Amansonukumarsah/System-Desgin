package Thread;

// creating thread using Thread class
public class MyAnotherThread extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Value Another Thread of i is " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("....Exception.........");
            }
        }
    }
}
