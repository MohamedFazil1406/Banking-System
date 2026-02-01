import java.util.ArrayList;

public class AccountService{
    public ArrayList<Account> accounts=new ArrayList<>();

    public void createAccount(Account account){
        accounts.add(account);
        System.out.println("Successfully Created Account");
    }

    public Account findAccountByNumber(long accountNumber){
        for(Account a:accounts){
            if(a.getAccountNumber()==accountNumber){
                return a;
            }
        }
        return null;
    }

    public void viewAccountDetails(){
        if(accounts.isEmpty()){
            System.out.println("Not found");

        }
        for(Account a:accounts){
            System.out.println("Account Number:"+a.getAccountNumber()+"Account type: "+a.getAccountType()+"Balance: "+a.getBalance());
        }

    }
}