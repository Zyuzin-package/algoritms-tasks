package src.threads.l1;

public class MockLoader implements ItextLoader{
    private final String textToLoad;

    public MockLoader(String textToLoad) {
        this.textToLoad = textToLoad;
    }

    @Override
    public String loadText() {
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return textToLoad;
    }
}
