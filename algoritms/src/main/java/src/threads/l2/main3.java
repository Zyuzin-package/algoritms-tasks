package src.threads.l2;

import src.threads.l1.MockLoader;

public class main3 {
    public static void main(String[] args) {
        final long before = System.currentTimeMillis();
//        final Thread lo  = new TextLoaderThread(new MockLoader("KORKA"));
//     синхронно   lo.start();
        final Runnable run  = new TextLoaderRunnable(new MockLoader("KORKA"));
        final Thread thread = new Thread(run);
        thread.start();
        final long after = System.currentTimeMillis();
        System.out.println(after-before);
    }
}
