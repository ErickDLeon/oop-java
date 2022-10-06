package dto;

public class BanckAccount {
    private String account;
    private double balance;

    public BanckAccount() {
    }

    public BanckAccount(String account, double balance) {
        this.account = account;
        this.balance = balance;
    }

    public String getAccount() {
        return this.account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BanckAccount account(String account) {
        setAccount(account);
        return this;
    }

    public BanckAccount balance(double balance) {
        setBalance(balance);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " account='" + getAccount() + "'" +
            ", balance='" + getBalance() + "'" +
            "}";
    }

}
