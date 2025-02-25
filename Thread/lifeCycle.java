package Thread;

// new --> start-->(runnable means waiting in queue)-->(running )-->
// (when we give sleep or i/ogoes into blocked start after that it goes inot runnable not in running)
// and last terminate
// it is in java.lang package

// some import thread method
//   1.getName()-->return the name of thread
//  2.setName()->set the name of thread
//   3.run()
// 4.start()
// 5.get()-->return the id of thread
// 6.getPriority()
// 7.sleep(),join(),interrup(),resume(),stop()

public class lifeCycle {
    public static void main(String[] args) {
        System.out.println("program started....");
        int x = 45 + 34;
        System.out.println("sum is " + x);
        // thread

        Thread t = Thread.currentThread();
        String tname = t.getName();
        System.out.println("......thread......." + tname);
        System.out.println("program ended....");
    }
}
