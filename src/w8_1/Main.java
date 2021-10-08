package w8_1;

public class Main {
    public static void main(String[] args) {
//        Singleton s1 = Singleton.getInstance();
//        System.out.println(s1);
//
//        Singleton s2 = Singleton.getInstance();
//        System.out.println(s2);
//
//        // Java 11
//        var number = 11;
//        var s3 = Singleton.getInstance();

//        Print printWithLine = new PrintWithLine();
//        Print printWithoutLine = new PrintWithoutLine();
//
//        printWithLine.print("111","222","333","444");
//        System.out.println();
//        System.out.println();
//        printWithoutLine.print("111","222","333","444");

        InnerClass innerClass = new InnerClass();
        InnerClass.J j = innerClass.new J();
        j.print();
    }
}
