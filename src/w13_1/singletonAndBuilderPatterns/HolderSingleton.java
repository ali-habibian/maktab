package w13_1.singletonAndBuilderPatterns;

public class HolderSingleton {
    private static class Holder {
        static HolderSingleton instance = new HolderSingleton();
    }

    public static HolderSingleton getInstance() {
        return Holder.instance;
    }

    private HolderSingleton() {

    }
}
