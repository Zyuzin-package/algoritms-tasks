package src.threads.ne;

public class psvm {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new MyThread();
        thread.start();
        thread.join();
        System.out.println("Main thread");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(100);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }

    }

}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("New Runnable Thread");
    }
}


