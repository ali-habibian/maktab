package w13_1.singletonAndBuilderPatterns;

public class BuilderPattern {
    private String firstName;
    private String lastName;
    private String email;
    private String userName;
    private String phoneNumber;
    private long nationalCod;
    private int age;

    private BuilderPattern(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.userName = builder.userName;
        this.phoneNumber = builder.phoneNumber;
        this.nationalCod = builder.nationalCod;
        this.age = builder.age;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String email;
        private String userName;
        private String phoneNumber;
        private long nationalCod;
        private int age;

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder email(long nationalCod) {
            this.nationalCod = nationalCod;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public BuilderPattern build() {
            return new BuilderPattern(this);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public long getNationalCod() {
        return nationalCod;
    }

    public int getAge() {
        return age;
    }
}
