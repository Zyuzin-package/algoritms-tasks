package src.threads.l2;

import src.threads.l1.ItextLoader;

public class TextLoaderRunnable implements Runnable{
    private final ItextLoader itextLoader;

    public TextLoaderRunnable(ItextLoader itextLoader) {
        this.itextLoader = itextLoader;
    }
    @Override
    public void run() {
        System.out.println(itextLoader.loadText());
    }
}
