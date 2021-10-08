package w8_2;

public class EnumClass {
    public enum Type{
        RED{
            @Override
            public int getCode() {
                return 0;
            }
        },
        YELLOW{
            @Override
            public int getCode() {
                return 1;
            }
        };

        public abstract int getCode();
    }
}
