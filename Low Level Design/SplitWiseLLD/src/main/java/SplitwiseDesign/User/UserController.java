package SplitwiseDesign.User;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    List<User> userList;

    public UserController() {
        userList = new ArrayList<>();
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public User getUserById(String id) {
        for(User user: userList) {
            if(user.getUserId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    public List<User> getUserList() {
        return userList;
    }
}
