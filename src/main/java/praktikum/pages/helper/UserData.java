package praktikum.pages.helper;

import praktikum.pages.model.User;

public class UserData {
    public static User defaultUserData() {
        return new User("ExampleTestUsr", "ExampleTestUsr@test.ru", "1234Qwer");
    }
    public static User defaultUserLogin() {
        return new User("ExampleTestUsr@test.ru","1234Qwer");
    }
    public static User userDataIncorrectPassword() {
        return new User("ExampleTestUsr", "ExampleTestUsr@test.ru", "123");
    }
    public static User userDataNullName() {
        return new User(null, "ExampleTestUsr@test.ru", "1234Qwer");
    }
    public static User userDataNullEmail() {
        return new User("ExampleTestUsr", null, "1234Qwer");
    }
    public static User userDataNullPassword() {
        return new User("ExampleTestUsr", "ExampleTestUsr@test.ru", null);
    }
}
