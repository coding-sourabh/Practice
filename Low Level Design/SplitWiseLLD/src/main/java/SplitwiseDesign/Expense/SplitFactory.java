package SplitwiseDesign.Expense;

import SplitwiseDesign.Expense.Split.*;

public class SplitFactory {
    public static ExpenseSplit getSplitObject(ExpenseSplitType expenseSplitType) {
        switch (expenseSplitType) {
            case EQUAL:
                return new EqualExpenseSplit();
            case UNEQUAL:
                return new UnequalExpenseSplit();
            case PERENTAGE:
                return new PercentageExpenseSplit();
            default:
                return null;
        }
    }
}
