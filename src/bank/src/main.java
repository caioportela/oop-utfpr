class Main {
  public static void main(String[] args) {
    Bank atw = new Bank(4);

    atw.account[0] = new Account("Church", 1000);
    atw.account[1] = new Account("Tucker", 25000);
    atw.account[2] = new Account("Caboose", 500);
    atw.account[3] = new Account("Sarge", 500);

    System.out.println(atw.total());
  }
}
