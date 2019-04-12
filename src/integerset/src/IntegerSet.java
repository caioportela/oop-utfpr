public class IntegerSet {
  private boolean set[];

  public IntegerSet() {
    set = new boolean[100];
    for(boolean x:set)
      x = false;
  }

  public boolean getElement(int index) {
    return this.set[index];
  }

  public void setElement(int index, boolean value) {
    set[index] = value;
  }

  public String toString() {
    for(int i = 0; i < 100; i++) {

    }
  }

  public IntegerSet union(IntegerSet b) {
    IntegerSet unionSet = new IntegerSet();

    for(int i = 0; i < 100; i++) {
      unionSet[i] = this.set[i] || b.set[i];
    }

    return unionSet;
  }

  // public IntegerSet instersection(IntegerSet b) {
  //
  // }


}
