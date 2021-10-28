package w11_2.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<List<User>> {
    private String url;

    public MyCallable(String url) {
        this.url = url;
    }

    @Override
    public List<User> call() throws Exception {

        List<User> users = new ArrayList<>();
        if (url.equals("www.google.com")) {
            for (int i = 0; i < 10; i++) {
                User user = new User(i, "google user" + i);
                users.add(user);
            }
        } else if (url.equals("www.yahoo.com")) {
            for (int i = 0; i < 10; i++) {
                User user = new User(i, "yahoo user" + i);
                users.add(user);
            }
        }

        return users;

    }

}
