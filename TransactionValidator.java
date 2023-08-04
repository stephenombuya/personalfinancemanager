package personalfinancemanager;

public class TransactionValidator {

    public static boolean validateTransactionDetails(Transaction transaction) {
        if (transaction.getAmount() <= 0) {
            System.out.println("Invalid transaction amount.");
            return false;
        }

        if (transaction.getDate() == null) {
            System.out.println("Transaction date is missing.");
            return false;
        }

        if (transaction.getDescription() == null || transaction.getDescription().isEmpty()) {
            System.out.println("Transaction description is missing.");
            return false;
        }

        // Add more validation checks as needed

        return true;
    }
}
