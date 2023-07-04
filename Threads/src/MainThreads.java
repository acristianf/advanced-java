public class MainThreads {
    public static void main(String[] args) {
        Threads t1 = new Threads();
        t1.setName("Thread 1");
        t1.start();
        Threads t2 = new Threads();
        t2.setName("Thread 2");
        t2.start();
    }
}
