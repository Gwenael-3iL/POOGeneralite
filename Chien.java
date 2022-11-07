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
   * Méthode qui fait aboyer le chien
   **/
  public static void aboyer() {
    System.out.println("Ouaf!");
  }

  /**
   * Méthode qui fait dormir le chien
   **/
  public static void dormir() {
    System.out.println("...");
  }

  /**
   * Programme
   * 
   * @param args inutilisé
   **/
  public static void main(String[] args) {
    Chien monChien = new Chien("Chihuahua", "Noir", 4);
    monChien.aboyer();
  }
}