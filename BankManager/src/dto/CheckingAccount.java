package dto;

public class CheckingAccount extends BanckAccount{
    private double limit;

    public CheckingAccount() {
    }

    public CheckingAccount(double limit) {
        this.limit = limit;
    }

    public double getLimit() {
        return this.limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public CheckingAccount limit(double limit) {
        setLimit(limit);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " limit='" + getLimit() + "'" +
            "}";
    }

}
