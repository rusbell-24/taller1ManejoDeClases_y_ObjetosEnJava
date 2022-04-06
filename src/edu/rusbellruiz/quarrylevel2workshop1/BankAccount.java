package edu.rusbellruiz.quarrylevel2workshop1;

public class BankAccount {
    private int accountNumber;
    protected boolean activated = false;
    public boolean actived;

    public BankAccount(int accountNumber, boolean actived) {
        this.accountNumber = accountNumber;
        setActived(actived);
    }


    public void setActived(boolean actived) {
        this.actived = actived;
        this.activated = actived;
    }

    public boolean getActived() {
        return actived;
    }

}
