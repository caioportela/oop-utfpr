public class Complex {
  private float real;
  private float complex;

  public Complex() {
    real = 0;
    complex = 0;
  }

  public Complex(float a, float b) {
    real = a;
    complex = b;
  }

  public void init(float a, float b) {
    this.real = a;
    this.complex = b;
  }

  public void print() {
    System.out.println(this.real + " + " + this.complex + "i");
  }

  public boolean isEqual(Complex y) {
    return (this.real == y.real && this.complex == y.complex);
  }

  public void sum(Complex y) {
    this.real += y.real;
    this.complex += y.complex;
  }

  public void subtract(Complex y) {
    this.real -= y.real;
    this.complex -= y.complex;
  }

  public void multiply(Complex y) {
    float a = this.real, b = this.complex;
    float c = y.real, d = y.complex;

    this.real = (a*c) - (b*d);
    this.complex = (a*d) + (b*c);
  }

  public void divide(Complex y) {
    float a = this.real, b = this.complex;
    float c = y.real, d = y.complex;

    this.real = ((a*c) + (b*d))/((c*c) + (d*d));
    this.complex = ((b*c)-(a*d))/((c*c) + (d*d));
  }
}
