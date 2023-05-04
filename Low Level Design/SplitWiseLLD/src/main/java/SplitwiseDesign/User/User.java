package SplitwiseDesign.User;

import SplitwiseDesign.UserExpenseBalanceSheet;

public class User {
    private String userId;
    private String name;
    private UserExpenseBalanceSheet userExpenseBalanceSheet;

    public User() {
        userExpenseBalanceSheet = new UserExpenseBalanceSheet();
    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserExpenseBalanceSheet getUserExpenseBalanceSheet() {
        return userExpenseBalanceSheet;
    }

    public void setUserExpenseBalanceSheet(UserExpenseBalanceSheet userExpenseBalanceSheet) {
        this.userExpenseBalanceSheet = userExpenseBalanceSheet;
    }
}
