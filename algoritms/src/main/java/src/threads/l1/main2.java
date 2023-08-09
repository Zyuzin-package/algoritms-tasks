package src.threads.l1;

public class main2 {
    public static void main(String[] args) throws InterruptedException {

        final ItextLoader file = new MockLoader("TextFile");
        final ItextLoader web = new MockLoader("WebFile");
        final long before = System.currentTimeMillis();
        final Thread thread = new Thread(() -> System.out.println(file.loadText()));
        thread.start();
        final Thread thread2 = new Thread(() -> System.out.println(web.loadText()));
        thread2.start();
        thread.join();
        thread.join();
        final long after = System.currentTimeMillis();
        System.out.println(after-before);
    }
}
