public class Point {
  private int x, y;
  
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void afficher() {
    System.out.println("Coordonnées " + x + " " + y);
  }

  public static Point normeMax(Point a, Point b) {
    int distAO = Math.sqrt((a.x)^2 + (a.y)^2);
    int distBO = Math.sqrt((b.x)^2 + (b.y)^2);

    if (distAO > distBO) {
      result = a;
    } else {
      result = b
    }
    
    return result;
  }

  public Point normeMax(Point b) {
    Point result;
    int distAO = Math.sqrt((this.x)^2 + (this.y)^2);
    int distBO = Math.sqrt((b.x)^2 + (b.y)^2);

    if (distAO > distBO) {
      result = this;
    } else {
      result = b
    }
    
    return result;
  }

  public void homothetie(double valeur) {
    this.x *= valeur;
    this.y *= valeur;
  }

  public void rotation(int angle) {
    
  }
}