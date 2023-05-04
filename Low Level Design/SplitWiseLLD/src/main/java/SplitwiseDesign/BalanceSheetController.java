package SplitwiseDesign;

import SplitwiseDesign.Expense.Split.Split;
import SplitwiseDesign.User.User;

import java.util.List;
import java.util.Map;

public class BalanceSheetController {
    public void updateUserExpenseBalanceSheet(User expensePaidBy, List<Split> splits, double totalExpenseAmount) {
        // update the total amount of expense paid by user
        UserExpenseBalanceSheet paidByUserExpenseSheet = expensePaidBy.getUserExpenseBalanceSheet();
        paidByUserExpenseSheet.setTotalPayment(paidByUserExpenseSheet.getTotalPayment() + totalExpenseAmount);

        for(Split split: splits) {
            User userOwe = split.getUser();
            UserExpenseBalanceSheet userOweBalanceSheet = split.getUser().getUserExpenseBalanceSheet();
            double amountOwe = split.getAmountOwe();

            // split is for the user who paid the amount
            if(userOwe.getUserId().equals(expensePaidBy.getUserId())) {
                paidByUserExpenseSheet.setTotalYourExpense(paidByUserExpenseSheet.getTotalYourExpense() + amountOwe);
            } else {
                // add the amount which paid user will get back from current split
                paidByUserExpenseSheet.setTotalYouGetBack(paidByUserExpenseSheet.totalYouGetBack + amountOwe);

                Balance userOweBalance = new Balance();
                if(paidByUserExpenseSheet.getUserVsBalance().containsKey(userOwe.getUserId())) {
                    userOweBalance = paidByUserExpenseSheet.getUserVsBalance().get(userOwe.getUserId());
                } else {
                    userOweBalance = new Balance();
                }
                userOweBalance.setAmountGiveBack(userOweBalance.getAmountGiveBack() + amountOwe);
                paidByUserExpenseSheet.getUserVsBalance().put(userOwe.getUserId(), userOweBalance);

                // update the balance sheet of owe user
                userOweBalanceSheet.setTotalYouOwe(userOweBalanceSheet.getTotalYouOwe() + amountOwe);
                userOweBalanceSheet.setTotalYourExpense(userOweBalanceSheet.getTotalYourExpense() + amountOwe);

                // not completed ???
            }

        }

    }

    public void showBalanceSheetUser(User user) {
        System.out.println("-------------------------------------------");
        System.out.println("Balance sheet of user : " + user.getUserId());

        UserExpenseBalanceSheet userExpenseBalanceSheet = user.getUserExpenseBalanceSheet();

        System.out.println("TotalYourExpense: " + userExpenseBalanceSheet.getTotalYourExpense());
        System.out.println("TotalGetBack: " + userExpenseBalanceSheet.getTotalYouGetBack());
        System.out.println("TotalYourOwe: " + userExpenseBalanceSheet.getTotalYouOwe());
        System.out.println("TotalPaymentMade: " + userExpenseBalanceSheet.getTotalPayment());

        for (Map.Entry<String, Balance> entry : userExpenseBalanceSheet.getUserVsBalance().entrySet()) {
            String userID = entry.getKey();
            Balance balance = entry.getValue();
            System.out.println("userID:" + userID + " YouGetBack:" + balance.getAmountGiveBack() + " YouOwe:" + balance.getAmountOwe());
        }

        System.out.println("---------------------------------------");
    }
}
