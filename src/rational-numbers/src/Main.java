public class Main {
  public static void main(String[] args) {
    Rational pi = new Rational(355, 113);
    Rational a = new Rational();
    Rational x = new Rational(4, 3);
    Rational y = new Rational(12, 20);
    Rational z = new Rational(9, 7);

    a.printRational();
    System.out.println();
    
    pi.printRational();
    x.printRational();
    y.printRational();
    z.printRational();
    System.out.println();

    pi.printFloat(15);
    x.printFloat(3);
    y.printFloat(2);
    z.printFloat(7);
    System.out.println();

    x.sum(y);
    x.printRational();
    x.printFloat(4);
    System.out.println();

    y.subtract(z);
    y.printRational();
    y.printFloat(6);
    System.out.println();

    x.multiply(z);
    x.printRational();
    x.printFloat(8);
    System.out.println();

    z.divide(y);
    z.printRational();
    z.printFloat(1);
  }
}
