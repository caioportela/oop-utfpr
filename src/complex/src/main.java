class Main {
  public static void main(String[] args) {
    Complex x = new Complex(2, 3);
    Complex y = new Complex(1, 5);
    Complex z = new Complex();

    z.sum(y);
    z.print();
    z.sum(x);
    z.print();

    x.multiply(z);
    x.print();
    y.divide(x);
    y.print();
  }
}
