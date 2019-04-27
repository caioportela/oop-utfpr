public class Calculator {
  public static void main(String[] args) {
    if(args.length < 2) {
      System.out.println("Este programa precisa de uma operacao e pelo menos um numero.");
      System.exit(1);
    }

    int result;
    char operation = args[0].charAt(0);
    System.out.print(operation);

    switch(operation) {
    case '+':
      result = 0;
      for(int i = 1; i < args.length; i++) {
        result += Integer.parseInt(args[i]);
        System.out.print(" " + args[i]);
      }

      System.out.println(" = " + result);
      return;

    case 'x':
      result = 1;
      for(int i = 1; i < args.length; i++) {
        result *= Integer.parseInt(args[i]);
        System.out.print(" " + args[i]);
      }

      System.out.println(" = " + result);
      return;
    }
  }
}
