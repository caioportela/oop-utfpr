import java.text.NumberFormat;

public class Rational {
  private int nominator;
  private int denominator;

  public Rational() {
    nominator = 0;
    denominator = 1;
  }

  public Rational(int a, int b) {
    if(b == 0){
      System.out.println("O denominador não pode ser zero!");
      nominator = 0;
      denominator = 1;
    } else {
      int gcd = gcd(a, b);
      nominator = a / gcd;
      denominator = b / gcd;
    }
  }

  public void sum(Rational b) {
    int lcm = lcm(this.denominator, b.denominator),
    x = ((this.nominator) * (lcm / this.denominator)) + ((b.nominator) * (lcm / b.denominator));

    int gcd = gcd(x, lcm);
    this.nominator = x / gcd;
    this.denominator = lcm / gcd;
  }

  public void subtract(Rational b) {
    int lcm = lcm(this.denominator, b.denominator),
    x = ((this.nominator) * (lcm / this.denominator)) - ((b.nominator) * (lcm / b.denominator));

    int gcd = gcd(x, lcm);
    this.nominator = x / gcd;
    this.denominator = lcm / gcd;
  }

  public void multiply(Rational b) {
    this.nominator *= b.nominator;
    this.denominator *= b.denominator;

    int gcd = gcd(this.nominator, this.denominator);
    this.nominator /= gcd;
    this.denominator /= gcd;
  }

  public void divide(Rational b) {
    int aux = b.nominator;
    b.nominator = b.denominator;
    b.denominator = aux;

    this.multiply(b);
  }

  public void printRational() {
    if(this.nominator == 0 || this.denominator == 1) {
      System.out.println(this.nominator);
      return;
    }
    System.out.println(this.nominator + "/" + this.denominator);
  }

  public void printFloat(int decimals) {
    double a = this.nominator, b = this. denominator;
    NumberFormat nf = NumberFormat.getInstance();
    nf.setMaximumFractionDigits(decimals);
    System.out.println(nf.format(a/b));
  }

  private int gcd(int a, int b) {
    if(a == 0) return a;
    if(b == 0) return b;
    if(a == b) return a;

    if(a > b)
      return gcd(a-b, b);
    return gcd(a, b-a);
  }

  private int lcm(int a, int b) {
    return (a*b)/gcd(a, b);
  }
}
