package SplitwiseDesign.Group;

import SplitwiseDesign.Expense.Expense;
import SplitwiseDesign.Expense.ExpenseController;
import SplitwiseDesign.Expense.ExpenseSplitType;
import SplitwiseDesign.Expense.Split.Split;
import SplitwiseDesign.User.User;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String groupId;
    private String groupName;
    private String groupDescreption;
    private List<User> groupMembers;
    private List<Expense> expenseList;
    private ExpenseController expenseController;

    public Group() {
        groupMembers = new ArrayList<>();
        expenseList = new ArrayList<>();
        expenseController = new ExpenseController();
    }

    public void addMember(User newUser) {
        groupMembers.add(newUser);
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount,
                                 List<Split> splitDetails, ExpenseSplitType splitType, User paidByUser) {

        Expense expense = expenseController.createExpense(expenseId, description, expenseAmount, splitDetails, splitType, paidByUser);
        expenseList.add(expense);
        return expense;
    }


    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupDescreption() {
        return groupDescreption;
    }

    public void setGroupDescreption(String groupDescreption) {
        this.groupDescreption = groupDescreption;
    }

    public List<User> getGroupMembers() {
        return groupMembers;
    }

    public void setGroupMembers(List<User> groupMembers) {
        this.groupMembers = groupMembers;
    }

    public List<Expense> getExpenseList() {
        return expenseList;
    }

    public void setExpenseList(List<Expense> expenseList) {
        this.expenseList = expenseList;
    }

    public ExpenseController getExpenseController() {
        return expenseController;
    }

    public void setExpenseController(ExpenseController expenseController) {
        this.expenseController = expenseController;
    }
}
