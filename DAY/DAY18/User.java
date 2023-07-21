import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class User {
    private String name;
    private String email;
    private String password;
    private String address;

    public User(String name, String email, String password, String address) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }
}

class UserRepo {
    private List<User> users;

    public UserRepo() {
        users = new ArrayList<>();
    }

    public void regUser(User user) {
        users.add(user);
    }

    public boolean isEmailTaken(String email) {
        for (User user : users) {
            if (user.getEmail().equalsIgnoreCase(email)) {
                return true;
            }
        }
        return false;
    }
}




