import javax.swing.JOptionPane;

public class Account {
  private String account;
  private float balance;

  public Account() {
    this.account = "12345-0";
    this.balance = 0;
  }

  public Account(String account, float balance) {
    this.account = account;
    this.balance = balance;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public void setBalance(float balance) {
    this.balance = balance;
  }

  public String getAccount() {
    return account;
  }

  public float getBalance() {
    return balance;
  }

  public void deposit(float value) {
    this.balance += value;
  }

  public void displayMessage(String message) {
    
  }
}
