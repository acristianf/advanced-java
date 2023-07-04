public class MainRunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableMine());
        t1.start();

        // Without creating a class that implements runnable you can do this
        Thread t2 = new Thread(() -> {
            int i = 0;
            while (i <= 100) {
                System.out.println(i + " " + Thread.currentThread().getName());
                i++;
            }
        });
        t2.start();
    }
}
