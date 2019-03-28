import javax.swing.JOptionPane;

public class TaxaAumento {
  public static void main(String[] args) {
    float value = convert("Informe o valor");
    float tax = convert("Informe a taxa de aumento");

    float newValue = value + (value * tax / 100);

    String message = "Valor do produto: R$" + String.format("%.2f",value)
                    + "\nTaxa de aumento: " + tax + "%"
                    + "\nNovo valor do produto: R$" + String.format("%.2f",newValue);

    JOptionPane.showMessageDialog(null, message);
  }

  public static float convert(String message) {
    return Float.parseFloat(JOptionPane.showInputDialog(message));
  }
}
