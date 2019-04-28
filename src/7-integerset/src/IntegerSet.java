public class IntegerSet {
  private boolean set[];

  public IntegerSet() {
    set = new boolean[100];
    for(boolean x:set)
      x = false;
  }

  public void insertElement(int index) {
    set[index] = true;
  }

  public void deleteElement(int index) {
    set[index] = false;
  }

  public String toString() {
    String output = "";
    for(int i = 0; i < 100; i++)
      if(this.set[i])
        output += i + " ";

    if(output != "")
      return output;
    else
      return "--";
  }

  public IntegerSet union(IntegerSet b) {
    IntegerSet unionSet = new IntegerSet();
    for(int i = 0; i < 100; i++)
      unionSet.set[i] = this.set[i] || b.set[i];
    return unionSet;
  }

  public IntegerSet instersection(IntegerSet b) {
    IntegerSet interSet = new IntegerSet();
    for(int i = 0; i < 100; i++)
      interSet.set[i] = this.set[i] && b.set[i];
    return interSet;
  }

  public boolean isEqualTo(IntegerSet b) {
    for(int i = 0; i < 100; i++)
      if(this.set[i] != b.set[i])
        return false;
    return true;
  }
}
