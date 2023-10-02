package homework.model.repository;

import homework.model.User;

public class UserSaver {
    public static void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
}
