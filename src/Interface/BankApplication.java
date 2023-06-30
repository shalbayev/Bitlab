package Interface;

import java.util.Arrays;

public class BankApplication implements BankApplicationInterface{
    String name;
    Account[] accounts = new Account[1000];
    int sizeOfAccount = 0;


    public BankApplication() {
    }

    public BankApplication(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public int getSizeOfAccount() {
        return sizeOfAccount;
    }

    public void setSizeOfAccount(int sizeOfAccount) {
        this.sizeOfAccount = sizeOfAccount;
    }

    @Override
    public void addAccount(Account a) {
        accounts[sizeOfAccount] = a;
        sizeOfAccount++;
    }

    @Override
    public void printAccounts() {
        for (int i = 0; i < sizeOfAccount; i++) {
            System.out.println(accounts[i]);
        }
    }

    @Override
    public Account getMaxBalance() {
        double max = 0;
        int index = 0;
        for (int i = 0; i < sizeOfAccount; i++) {
            if(accounts[i].getBalance()>max){
                max = accounts[i].getBalance();
                index = i;
            }
        }
        return accounts[index];
    }

}
