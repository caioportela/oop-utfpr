import javax.swing.JOptionPane;

public class Calc {
  private float height = 0;
  private float weight = 0;

  public float getHeight() {
    return height;
  }

  public float getWeight() {
    return weight;
  }

  public void setHeight() {
    while(height < 1) {
      height = convert("Informe sua altura");
      if(height < 1)
        errorDisplay();
    }
  }

  public void setWeight() {
    while(weight < 1) {
      weight = convert("Informe seu peso");
      if(weight < 1)
        errorDisplay();
    }
  }

  public float index() {
    return weight / (height * height);
  }

  public void displayAll() {
    float imc = this.index();

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

    JOptionPane.showMessageDialog(null, "Altura = " + height +
                                "\nPeso = " + weight +
                                "\nIMC = " + String.format("%.2f",imc)
                                + "\nConsiderado: " + message);
  }

  public static float convert(String message) {
    return Float.parseFloat(JOptionPane.showInputDialog(message));
  }

  public static void errorDisplay() {
    JOptionPane.showMessageDialog(null, "Entrada Invalida", "Erro", JOptionPane.ERROR_MESSAGE);
  }
}
