public class Bank {
  public Account account[];

  public Bank(int n) {
    account = new Account[n];
  }

  public void newAccount(String name, double amount) {

  }

  public double total() {
    double total = 0;
    for(Account x : this.account) {
      total += x.getBalance();
    }
    return total;
  }
}
