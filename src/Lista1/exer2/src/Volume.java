import java.util.Scanner;

public class Volume {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);

    System.out.print("Insira a altura da caixa: ");
    float height = read.nextInt();

    System.out.print("Insira o comprimento da caixa: ");
    float length = read.nextInt();

    System.out.print("Insira a largura da caixa: ");
    float width = read.nextInt();

    float volume = height * length * width;

    System.out.println("O volume da caixa é: " + volume);
    read.close();
  }
}
