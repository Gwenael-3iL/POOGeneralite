package etudiant;

public class Etudiant {
  private String nom;

  public Etudiant(String nom) {
    this.nom = nom;
  }

  public String getNom() {
    return nom;
  }

  public void travailler() {
    if (this.nom.equals("Philippe")) {
      System.out.println("Philippe se met au travail !");
    }
  }

  public void seReposer() {
    if (this.nom.equals("Philippe")) {
      System.out.println("Philippe se repose.");
    }
  }
}