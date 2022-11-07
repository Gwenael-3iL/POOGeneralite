/**
 * Classe Chien
 * 
 * @author Gwenael Bascour
 **/
public class Chien {
  private String race;
  private String couleur;
  private int age;

  /**
   * Constructeur de Chien
   * 
   * @param race    du chien
   * @param couleur du chien
   * @param age     du chien
   **/
  public Chien(String race, String couleur, int age) {
    this.race = race;
    this.couleur = couleur;
    this.age = age;
  }

  /**
   * @return la race du chien
   **/
  public String getRace() {
    return this.race;
  }

  /**
   * @return la couleur du chien
   **/
  public String getCouleur() {
    return this.couleur;
  }

  /**
   * @return l'âge du chien
   **/
  public int getAge() {
    return this.age;
  }

  /**
   * Méthode qui fait aboyer le chien
   **/
  public void aboyer() {
    System.out.println("Ouaf!");
  }

  /**
   * Méthode qui fait dormir le chien
   **/
  public void dormir() {
    System.out.println("...");
  }
}