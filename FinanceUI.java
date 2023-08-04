package personalfinancemanager;

import java.util.*;

public class FinanceUI {

    private TransactionManager transactionManager;
    private Scanner scanner;

    public FinanceUI() {
        transactionManager = new TransactionManager();
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("Personal Finance Manager");
        System.out.println("1. Add a transaction");
        System.out.println("2. Remove a transaction");
        System.out.println("3. Calculate total income");
        System.out.println("4. Calculate total expense");
        System.out.println("5. View transactions within date range");
        System.out.println("6. View transactions by category");
        System.out.println("7. View all transactions");
        System.out.println("0. Exit");
    }

    public void handleUserInput() {
        boolean exit = false;
        while (!exit) {
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addTransaction();
                    break;
                case 2:
                    removeTransaction();
                    break;
                case 3:
                    calculateTotalIncome();
                    break;
                case 4:
                    calculateTotalExpense();
                    break;
                case 5:
                    viewTransactionsWithinDateRange();
                    break;
                case 6:
                    viewTransactionsByCategory();
                    break;
                case 7:
                    viewAllTransactions();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }

    private void addTransaction() {
        System.out.println("Add a Transaction");

        System.out.print("Enter transaction ID: ");
        int transactionId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter transaction date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        System.out.print("Enter transaction description: ");
        String description = scanner.nextLine();

        System.out.print("Enter transaction amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter transaction category: ");
        String category = scanner.nextLine();

        Transaction transaction = new Transaction(transactionId, date, description, amount, category);

        if (TransactionValidator.validateTransactionDetails(transaction)) {
            transactionManager.addTransaction(transaction);
            System.out.println("Transaction added successfully.");
        } else {
            System.out.println("Invalid transaction details. Transaction not added.");
        }
    }

    private void removeTransaction() {
        System.out.println("Remove a Transaction");

        System.out.print("Enter the transaction ID to remove: ");
        int transactionId = scanner.nextInt();

        boolean removed = transactionManager.removeTransaction(transactionId);
        if (removed) {
            System.out.println("Transaction removed successfully.");
        } else {
            System.out.println("Transaction not found.");
        }
    }

    private void calculateTotalIncome() {
        System.out.println("Calculate Total Income");

        double totalIncome = transactionManager.calculateTotalIncome();
        System.out.println("Total Income: " + totalIncome);
    }

    private void calculateTotalExpense() {
        System.out.println("Calculate Total Expense");

        double totalExpense = transactionManager.calculateTotalExpense();
        System.out.println("Total Expense: " + totalExpense);
    }

    private void viewTransactionsWithinDateRange() {
        System.out.println("View Transactions within Date Range");

        System.out.print("Enter start date (YYYY-MM-DD): ");
        String startDate = scanner.nextLine();

        System.out.print("Enter end date (YYYY-MM-DD): ");
        String endDate = scanner.nextLine();

        List<Transaction> transactions = transactionManager.getTransactionsWithinDateRange(startDate, endDate);
        if (transactions.isEmpty()) {
            System.out.println("No transactions found within the specified date range.");
        } else {
            System.out.println("Transactions within the date range:");
            for (Transaction transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }

    private void viewTransactionsByCategory() {
        System.out.println("View Transactions by Category");

        System.out.print("Enter category: ");
        String category = scanner.nextLine();

        List<Transaction> transactions = transactionManager.getTransactionsByCategory(category);
        if (transactions.isEmpty()) {
            System.out.println("No transactions found for the specified category.");
        } else {
            System.out.println("Transactions for the category:");
            for (Transaction transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }

    private void viewAllTransactions() {
        System.out.println("View All Transactions");

        List<Transaction> transactions = transactionManager.getAllTransactions();
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            System.out.println("All transactions:");
            for (Transaction transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }

}
