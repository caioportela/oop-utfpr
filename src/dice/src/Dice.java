public class Dice {
  private int sideUp;

  public int getSideUp() {
    return sideUp;
  }

  public void rollDice() {
    this.sideUp = (int)(Math.random() * 6 + 1);
  }
}
