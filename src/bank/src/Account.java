public class Account {
  private String name;
  private double balance;

  public Account(String n, double b) {
    name = n;
    balance = b;
  }

  public double getBalance() {
    return this.balance;
  }

  public String getName() {
    return this.name;
  }

  public void deposit(double amount) {
    this.balance += amount;
  }

  public void withdrawal(double amount) {
    if(amount <= this.balance)
      this.balance -= amount;
  }

  public void transferFrom(Account b, double amount) {
    this.deposit(amount);
    b.withdrawal(amount);
  }

  public String toString() {
    return "Conta de " + this.name + " tem saldo " + this.balance;
  }
}
