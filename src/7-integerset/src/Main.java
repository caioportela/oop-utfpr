class Main{
  public static void main(String[] args) {
    IntegerSet a = new IntegerSet();
    IntegerSet b = new IntegerSet();
    System.out.println(a.toString());
    System.out.println(b.toString());

    a.insertElement(5);
    a.insertElement(54);
    b.insertElement(5);
    b.insertElement(54);
    System.out.println(a.isEqualTo(b));


    a.insertElement(12);
    a.insertElement(89);
    a.insertElement(43);
    System.out.println("A: " + a.toString());
    System.out.println(a.isEqualTo(b));

    b.insertElement(90);
    b.insertElement(23);
    b.insertElement(74);
    System.out.println("B: " + b.toString());

    IntegerSet c = a.union(b);
    System.out.println("C: " + c.toString());

    IntegerSet d = a.instersection(b);
    System.out.println("D: " + d.toString());

    a.deleteElement(5);
    a.deleteElement(89);
    a.deleteElement(12);
    System.out.println("A: " + a.toString());

  }
}
