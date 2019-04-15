public class Main {
  public static void main(String[] args) {
    Rational x = new Rational(1, 3);
    Rational y = new Rational(9, 16);

    x.printRational();
    y.printRational();

    x.multiply(y);
    x.printRational();
  }
}
