import java.util.Scanner;

public class MediaSalario {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);


    System.out.print("Insira a quantidade de funcionários: ");
    int emp = read.nextInt();
    float media = 0;

    for(int i = 0; i < emp; i++) {
      System.out.print("Insira o salário do funcionário: ");
      float a = read.nextFloat();
      media += a;
    }
    media /= emp;

    System.out.println("A média de salário é R$" + media);
    read.close();
  }
}
