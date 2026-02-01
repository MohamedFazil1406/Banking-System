public class Main {

    public static void main(String[] args) {

        AccountService accountService = new AccountService();
        TransactionService transactionService = new TransactionService();

        boolean running = true;

        while (running) {

            MenuUtil.showMenu();
            int choice = InputUtil.getInt("");

            switch (choice) {

                case 1:
                    long accNo = InputUtil.getLong("Enter Account Number: ");
                    String accType = InputUtil.getString("Enter Account Type: ");
                    double initialBalance = InputUtil.getDouble("Enter Initial Balance: ");
                    Account account= new Account(accNo, accType, initialBalance);
                    accountService.createAccount(account);
                    break;

                case 2:
                    long viewAccNo = InputUtil.getLong("Enter Account Number: ");
                    account = accountService.findAccountByNumber(viewAccNo);

                    if (account != null) {
                        System.out.println("Account Number: " + account.getAccountNumber());
                        System.out.println("Account Type  : " + account.getAccountType());
                        System.out.println("Balance       : " + account.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    long depAccNo = InputUtil.getLong("Enter Account Number: ");
                    Account depAccount = accountService.findAccountByNumber(depAccNo);

                    if (depAccount != null) {
                        double amount = InputUtil.getDouble("Enter Deposit Amount: ");
                        transactionService.deposit(depAccount, amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    long witAccNo = InputUtil.getLong("Enter Account Number: ");
                    Account witAccount = accountService.findAccountByNumber(witAccNo);

                    if (witAccount != null) {
                        double amount = InputUtil.getDouble("Enter Withdrawal Amount: ");
                        transactionService.withdraw(witAccount, amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 5:
                    long balAccNo = InputUtil.getLong("Enter Account Number: ");
                    Account balAccount = accountService.findAccountByNumber(balAccNo);

                    if (balAccount != null) {
                        System.out.println("Current Balance: " +
                                transactionService.checkBalance(balAccount));
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using the Banking System.");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
