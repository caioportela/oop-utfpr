public class ArrayDePontos2D {
  private Ponto2D[] ponto;

  public ArrayDePontos2D(int n) {
    ponto = new Ponto2D[n];
  }

  public int tamanho() {
    return this.ponto.length;
  }

  public void modifica(int pos, Ponto2D p) {
    if(pos >= 0 && pos < this.tamanho())
      this.ponto[pos] = p;
  }

  public Ponto2D valor(int pos) {
    if(pos >= 0 && pos < this.tamanho())
      return this.ponto[pos];
    return null;
  }

  public String toString() {
    String str = "";
    for(Ponto2D x : this.ponto)
      str += x + " ";

    return str;
  }
}
