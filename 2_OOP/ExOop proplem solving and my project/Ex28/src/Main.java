import model.Account;
import service.AccountService;

public class Main {
    public static void main(String[] args) throws Exception {
        Account account=new Account(40000);
        AccountService accountService = new AccountService(account);
        accountService.addMoney(20000);
        accountService.withDraw(10000);
        System.out.println(accountService.showBalance());
        
    }
}