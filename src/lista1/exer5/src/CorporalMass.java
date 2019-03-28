import javax.swing.JOptionPane;

public class CorporalMass {
  public static void main(String[] args) {
    float height = 0;
    while(height < 1) {
      height = convert("Informe sua altura");
      if(height < 1)
        JOptionPane.showMessageDialog(null, "Entrada Invalida", "Erro", JOptionPane.ERROR_MESSAGE);
    }

    float weight = 0;
    while(weight < 1) {
      weight = convert("Informe seu peso");
      if(weight < 1)
        JOptionPane.showMessageDialog(null, "Entrada Invalida", "Erro", JOptionPane.ERROR_MESSAGE);
    }

    float imc = weight / (height * height);
    String message;

    if(imc < 20)
      message = "Magro";
    else if(imc >= 20 && imc < 24)
      message = "Normal";
    else if(imc >= 24 && imc < 29)
      message = "Acima do Peso";
    else if(imc >= 29 && imc < 34)
      message = "Obeso";
    else
      message = "Muito Obeso";

    String dialog = "Altura = " + height + "\nPeso = " + weight + "\nIMC = " + String.format("%.2f",imc) + "\nConsiderado: " + message;
    JOptionPane.showMessageDialog(null, dialog);
  }

  public static float convert(String message) {
    return Float.parseFloat(JOptionPane.showInputDialog(message));
  }
}
