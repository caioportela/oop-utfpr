public class RollDice {
  public static void main(String[] args) {
    Dice dice1 = new Dice();
    Dice dice2 = new Dice();

    dice1.rollDice();
    dice2.rollDice();

    System.out.println(dice1.getSideUp() + dice2.getSideUp());
  }
}
