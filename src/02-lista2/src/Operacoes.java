import javax.swing.JOptionPane;

public class Operacoes {
  public static void main(String[] args) {
    float result = 0;
    String message = "";
    int menu = 0;
    while(menu != 5) {
      menu = Integer.parseInt(JOptionPane.showInputDialog("[1] Soma\n[2] Subtracao\n[3] Multiplicacao\n[4] Divisao\n[5] Sair"));

      if(menu == 5)
        System.exit(0);

      float num1 = convert("Digite o primeiro valor");
      float num2 = convert("Digite o segundo valor");

      if(menu == 1) {
        result = num1 + num2;
        message = "Soma: ";
      } else if(menu == 2) {
        result = num1 - num2;
        message = "Subtracao: ";
      } else if(menu == 3) {
        result = num1 * num2;
        message = "Multiplicacao: ";
      } else if(menu == 4) {
        while(num2 == 0) {
          JOptionPane.showMessageDialog(null, "Denominador deve ser diferente de zero", "Erro", JOptionPane.ERROR_MESSAGE);
          num2 = convert("Digite o denominador");
        }
        result = num1 / num2;
        message = "Divisao: ";
      }

      JOptionPane.showMessageDialog(null, message + result, "Resultado");
    }
  }

  public static float convert(String message) {
    return Float.parseFloat(JOptionPane.showInputDialog(null, message));
  }
}
