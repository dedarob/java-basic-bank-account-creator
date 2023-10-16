package entities;

public class UserData {
    private int accountID;
    private String accountUserName;
    private double accountBalance;

    public UserData(int accountID, String accountUserName, double firstDepo) {
        this.accountID = accountID;
        this.accountUserName = accountUserName;
        accountDepo(firstDepo);
    }
    public UserData(int accountID, String accountUserName) {
        this.accountID = accountID;
        this.accountUserName = accountUserName;
    }
    public void setAccountUserNameBase(String accountUserName){
        this.accountUserName = accountUserName;
    }
    public void accountDepo(double accountBalance) {
        this.accountBalance += accountBalance;
    }
    public void accountDraw(double accountBalance) {
        this.accountBalance -= 5 + accountBalance;
    }
    public String toString() {
        return "Account: " + accountID
                + ", Holder: " + accountUserName
                + String.format(", Balance: R$%.2f", accountBalance);
    }

}
