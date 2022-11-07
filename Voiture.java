public class Voiture {
  private String modele;
  private int prix;
  private Pilote pilote;

  /**
   * Constructeur de voiture
   * 
   * @param modele de la voiture
   * @param prix   de la voiture
   * @param pilote de la voiture
   **/
  public Voiture(String modele, int prix, Pilote pilote) {
    this.modele = modele;
    this.prix = prix;
    this.pilote = pilote;
  }

  /**
   * @return modele de la voiture
   **/
  public String getModele() {
    return modele;
  }

  /**
   * @return prix de la voiture
   **/
  public int getPrix() {
    return prix;
  }

  /**
   * @return pilote de la voiture
   **/
  public String getPilote() {
    return pilote.toString();
  }

  public void demarrer() {
    System.out.println("La voiture démarre.");
  }

  public void arreter() {
    System.out.println("La voiture s'arrête.");
  }

  public void deplacer() {
    System.out.println("La voiture se déplace.");
  }
}