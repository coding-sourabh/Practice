package SplitwiseDesign;

import SplitwiseDesign.Expense.ExpenseSplitType;
import SplitwiseDesign.Expense.Split.Split;
import SplitwiseDesign.Group.Group;
import SplitwiseDesign.Group.GroupController;
import SplitwiseDesign.User.User;
import SplitwiseDesign.User.UserController;

import java.util.ArrayList;
import java.util.List;

public class Splitwise {
    private UserController userController;
    private GroupController groupController;
    private BalanceSheetController balanceSheetController;

    public Splitwise() {
        userController = new UserController();
        groupController = new GroupController();
        balanceSheetController = new BalanceSheetController();
    }
    public void demo() {

        setupUserAndGroup();

        Group group = groupController.getGroupById("G1");
        group.addMember(userController.getUserById("U2"));
        group.addMember(userController.getUserById("U3"));

        List<Split> splits = new ArrayList<>();
        Split split1 = new Split();
        split1.setUser(userController.getUserById("U1"));
        split1.setAmountOwe(100);

        Split split2 = new Split();
        split1.setUser(userController.getUserById("U2"));
        split1.setAmountOwe(100);

        Split split3 = new Split();
        split1.setUser(userController.getUserById("U3"));
        split1.setAmountOwe(100);

        splits.add(split1);
        splits.add(split2);
        splits.add(split3);
        group.createExpense("EXP1", "Breakfast", 900, splits, ExpenseSplitType.EQUAL, userController.getUserById("U1"));

        List<Split> lunchSplits = new ArrayList<>();
        Split split2_1 = new Split();
        split2_1.setUser(userController.getUserById("U1"));
        split2_1.setAmountOwe(400);

        Split split2_2 = new Split();
        split2_1.setUser(userController.getUserById("U2"));
        split2_1.setAmountOwe(500);
        lunchSplits.add(split2_1);
        lunchSplits.add(split2_2);
        group.createExpense("EXP2", "Lunch", 900, lunchSplits, ExpenseSplitType.UNEQUAL, userController.getUserById("U2"));

        for(User user: userController.getUserList()) {
            balanceSheetController.showBalanceSheetUser(user);
        }
    }

    public void setupUserAndGroup() {
        // add user
        addUserToSplitwiseApp();

        // add members to group
        User user1 = userController.getUserById("U1");
        groupController.createGroup("G1", "Travel", user1);
    }

    public void addUserToSplitwiseApp() {
        User user1 = new User();
        user1.setUserId("U1");
        user1.setName("sourabh");

        User user2 = new User();
        user2.setUserId("U2");
        user2.setName("Naruto");

        User user3 = new User();
        user3.setUserId("U3");
        user3.setName("Konan");

        userController.addUser(user1);
        userController.addUser(user2);
        userController.addUser(user3);
    }
}
