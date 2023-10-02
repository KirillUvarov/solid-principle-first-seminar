package homework;

import homework.model.User;
import homework.model.repository.UserSaver;

public class Main {

    public static void main(String[] args) {
        User user = new User("Bob");
        user.report();
        UserSaver.save(user);
    }
}