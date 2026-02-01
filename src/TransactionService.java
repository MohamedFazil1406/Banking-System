public class TransactionService {

    // Deposit money into account
    public boolean deposit(Account account, double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
            return false;
        }

        double currentBalance = account.getBalance();
        account.setBalance(currentBalance + amount);

        System.out.println("Amount deposited successfully.");
        System.out.println("Updated Balance: " + account.getBalance());
        return true;
    }

    // Withdraw money from account
    public boolean withdraw(Account account, double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
            return false;
        }

        if (account.getBalance() < amount) {
            System.out.println("Insufficient balance.");
            return false;
        }

        double currentBalance = account.getBalance();
        account.setBalance(currentBalance - amount);

        System.out.println("Amount withdrawn successfully.");
        System.out.println("Remaining Balance: " + account.getBalance());
        return true;
    }

    // Check balance
    public double checkBalance(Account account) {
        return account.getBalance();
    }
}
