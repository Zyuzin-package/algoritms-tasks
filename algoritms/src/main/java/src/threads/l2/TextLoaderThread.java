package src.threads.l2;

import src.threads.l1.ItextLoader;

public class TextLoaderThread extends Thread {
    private final ItextLoader itextLoader;

    public TextLoaderThread(ItextLoader itextLoader) {
        this.itextLoader = itextLoader;
    }

    @Override
    public void run() {
        System.out.println(itextLoader.loadText());
    }
}
