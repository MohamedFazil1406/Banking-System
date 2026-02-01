public class Account{
    private long accountNumber;
    private String accountType;
    private double balance;

    public Account(long accountNumber,String accountType,double balance){
        this.accountNumber=accountNumber;
        this.accountType=accountType;
        this.balance=balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString(){
        return "Account details:{" + "accountNumber=" + accountNumber + ", accountType=" + accountType + ", balance=" + balance + '}';
    }
}