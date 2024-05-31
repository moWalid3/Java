package service;

import model.Account;

public class AccountService {
    private Account account;

    public AccountService(Account account) {
        this.account=account;
    }
    public void addMoney(int money) throws Exception {
        if ( money > 20000) {
            throw new Exception("invalid money your add is greater than 20000  !!!");
        }else {
            account.setBalance(account.getBalance()+money);
            System.out.println("success added ....");
        }
    }
    public void withDraw(int money) throws Exception {
        if ( money > account.getBalance()) {
            throw new Exception("invalid money your don't have it  !!!");
        }else {
            account.setBalance(account.getBalance() - money);
            System.out.println("success withDraw ....");
        }
    }
    public int showBalance(){
        return account.getBalance();
    }
}
