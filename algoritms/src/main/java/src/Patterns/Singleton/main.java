package src.Patterns.Singleton;

public class main {
    public static void main(String[] args) {
        LazyInitializedSingleton lazyInitializedSingleton1 =  LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton lazyInitializedSingleton2 =  LazyInitializedSingleton.getInstance();
        System.out.println(lazyInitializedSingleton2.equals(lazyInitializedSingleton1));
        System.out.println(lazyInitializedSingleton2==(lazyInitializedSingleton1));
    }
}
