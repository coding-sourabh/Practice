package SplitwiseDesign.Expense.Split;

import SplitwiseDesign.User.User;

public class Split {
    private User user;
    private Integer amountOwe;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getAmountOwe() {
        return amountOwe;
    }

    public void setAmountOwe(Integer amountOwe) {
        this.amountOwe = amountOwe;
    }
}
