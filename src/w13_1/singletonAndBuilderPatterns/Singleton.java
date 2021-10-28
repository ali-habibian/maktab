package w13_1.singletonAndBuilderPatterns;

// Only one instance in whole app
public class Singleton {

    // Singleton Eager loading
    private static Singleton instance = new Singleton();;

/*    public synchronized static Singleton getInstance(){
        // Lazy loading
        // if we use lazy load we must use synchronized in methode
        if (instance == null)
            instance = new Singleton();*//*
        return instance;
    }*/

    public static Singleton getInstance(){
        return instance;
    }

    private Singleton() {
    }
}
