public class Main {
  public static void main(String[] args) {
    Rational x = new Rational(3, 8);
    Rational y = new Rational(1, 4);

    x.printRational();
    y.printRational();

    x.divide(y);
    x.printRational();
    x.printFloat(4);
  }
}
