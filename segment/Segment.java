package segment;

public class Segment {
  private int extr1;
  private int extr2;

  /**
   * Constructeur de segment
   * 
   * @param extr1 première extrimité
   * @param extr2 seconde extrimité
   **/
  public Segment(int extr1, int extr2) {
    this.extr1 = extr1;
    this.extr2 = extr2;
    this.ordonne();
  }

  /**
   * @return extr1
   **/
  public int getExtr1() {
    return extr1;
  }

  /**
   * @return extr2
   **/
  public int getExtr2() {
    return extr2;
  }

  public void setExtr1(int x) {
    this.extr1 = x;
  }

  public void setExtr2(int x) {
    this.extr2 = x;
  }

  /**
   * Ordonne les deux extrémité si extr1 > extr2
   **/
  private void ordonne() {
    int temp;
    if (this.extr1 > this.extr2) {
      temp = this.extr1;
      this.extr1 = this.extr2;
      this.extr2 = temp;
    }
  }

  /**
   * @return la longueur du segment
   **/
  public int getLong() {
    int longueur = this.extr2 - this.extr1;
    return longueur;
  }

  public boolean appartient(int x) {
    return (x >= this.extr1 && x <= this.extr2);
  }

  @Override
  public String toString() {
    return ("Segment d'extrémité :\nextr1 = " + this.extr1 + "\nextr2 = " + this.extr2 + "\nLongeur = " + getLong());
  }
}