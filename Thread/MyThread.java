package Thread;

// creating a thread in java
// 1.using runnable:- interface
// 2.using thread class:- thread class

// run:- it a method which is inside the runnable interface in which i just give
// the task

// Thread thread = new Thread(t)
// thread.start()

class MyThread implements Runnable {

    public void run() {
        // task for thread
        for (int i = 1; i <= 10; i++) {
            System.out.println("value of i is " + i);
            try {
                Thread.sleep(10000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        Thread thr = new Thread(t);

        // run another thread
        MyAnotherThread Athr = new MyAnotherThread();
        Athr.start();
        thr.start();
    }
}
