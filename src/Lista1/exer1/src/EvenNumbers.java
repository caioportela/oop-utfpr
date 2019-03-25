import java.util.Scanner;

public class EvenNumbers {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);

    System.out.print("Insira o início do intervalo: ");
    int a = read.nextInt();

    System.out.print("Insira o final do intervalo: ");
    int b = read.nextInt();

    for(int i = a; i <= b; i++) {
      if(i % 2 == 0) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
    read.close();
  }
}
