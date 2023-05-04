package SplitwiseDesign.Expense;

import SplitwiseDesign.Expense.Split.Split;
import SplitwiseDesign.User.User;

import java.util.List;

public class Expense {
    private String expenseId;
    private String expenseDescription;
    private double expenseAmount;
    private User paidByUser;
    private ExpenseSplitType expenseSplitType;
    private List<Split> splitDetails;

    public Expense(String expenseId, double expenseAmount, String expenseDescription, User paidByUser, ExpenseSplitType expenseSplitType, List<Split> splitDetails) {
        this.expenseId = expenseId;
        this.expenseAmount = expenseAmount;
        this.expenseDescription = expenseDescription;
        this.paidByUser = paidByUser;
        this.expenseSplitType = expenseSplitType;
        this.splitDetails = splitDetails;
    }
}
