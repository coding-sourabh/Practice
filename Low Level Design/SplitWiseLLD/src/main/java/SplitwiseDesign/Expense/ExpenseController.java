package SplitwiseDesign.Expense;

import SplitwiseDesign.BalanceSheetController;
import SplitwiseDesign.Expense.Split.ExpenseSplit;
import SplitwiseDesign.Expense.Split.Split;
import SplitwiseDesign.User.User;

import java.util.List;

public class ExpenseController {
    BalanceSheetController balanceSheetController;

    public ExpenseController() {
        balanceSheetController = new BalanceSheetController();
    }

    public Expense createExpense(String expenseId, String expenseDesc, double expenseAmount, List<Split> splitDetails, ExpenseSplitType expenseSplitType, User paidbyUser) {
        ExpenseSplit expenseSplit = SplitFactory.getSplitObject(expenseSplitType);

        // validata expense here
        expenseSplit.validateSplitRequest(splitDetails, expenseAmount);

        Expense expense = createExpense(expenseId, expenseDesc, expenseAmount, splitDetails, expenseSplitType, paidbyUser);
        balanceSheetController.updateUserExpenseBalanceSheet(paidbyUser, splitDetails, expenseAmount);
        return expense;
    }
}
