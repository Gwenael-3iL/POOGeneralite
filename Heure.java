public class Heure {
  private double heureDecimale;
  private int heures;
  private int minutes;
  private int secondes;

  public Heure(int heures, int minutes, int secondes) {
    this.heures = heures;
    if (minutes >= 0 && minutes < 60) {
      this.minutes = minutes;
    }
    if (secondes >= 0 && secondes < 60) {
      this.secondes = secondes;
    }   
  }

  public Heure(double heureDecimale) {
    this.heureDecimale = heureDecimale;
  }

  public double getDecimal() {
    return this.heureDecimale;
  }

  public int getH() {
    return this.heures;
  }

  public int getM() {
    return this.minutes;
  }

  public int getS() {
    return this.secondes;
  }
}