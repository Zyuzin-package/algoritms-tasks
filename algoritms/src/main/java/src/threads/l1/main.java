package src.threads.l1;

public class main {
    public static void main(String[] args) {

        final ItextLoader file = new MockLoader("TextFile");
        final ItextLoader web = new MockLoader("WebFile");
        final long before = System.currentTimeMillis();
        System.out.println(file.loadText());
        System.out.println(web.loadText());
        final long after = System.currentTimeMillis();
        System.out.println(after-before);
    }
}
