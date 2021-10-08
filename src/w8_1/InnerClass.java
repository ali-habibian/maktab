package w8_1;

public class InnerClass {
    public void print( String name){
        System.out.println(name);
    }

    public class J {
        public void print(){
            InnerClass.this.print("Ali");
        }
    }
}
