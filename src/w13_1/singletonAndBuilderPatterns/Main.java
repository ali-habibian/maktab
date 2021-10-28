package w13_1.singletonAndBuilderPatterns;

public class Main {
    public static void main(String[] args) {
//        Singleton singleton = new Singleton();
        Singleton instance = Singleton.getInstance();

        BuilderPattern builderPattern = new BuilderPattern.Builder("ali", "habibian")
                .email("ali@gmail.com")
                .age(30)
                .build();
    }
}
