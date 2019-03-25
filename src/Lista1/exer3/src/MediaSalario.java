import java.util.Scanner;

public class MediaSalario {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);


    System.out.print("Insira a quantidade de funcionários: ");
    int emp = read.nextInt();

    
    // System.out.print("Insira o comprimento da caixa: ");
    // float length = read.nextInt();
    //
    // System.out.print("Insira a largura da caixa: ");
    // float width = read.nextInt();
    //
    // float volume = height * length * width;
    //
    // System.out.println("O volume da caixa é: " + volume);
    read.close();
  }
}
