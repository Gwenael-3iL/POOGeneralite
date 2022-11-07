public class Util {
  /**
   * Fonction qui calcule le nom d'Ackermann
   * @author G.B
   * @param m valeur de m >= 0
   * @param n valeur de n >= 0
   * @return le nombre d'Ackermann
   **/
  public static int ackermann(int m, int n) {
    int resultat = 0;

    // 𝐴(0, 𝑛) = 𝑛 + 1
    if (m == 0) {
      resultat = n + 1;
    // 𝐴(𝑚, 0) = 𝐴(𝑚 − 1, 1)
    } else if (n == 0) {
      resultat = ackermann(m-1, 1);
    // 𝐴(𝑚, 𝑛) = 𝐴(𝑚 − 1, 𝐴(𝑚, 𝑛 − 1))
    } else {
      resultat = ackermann(m-1, ackermann(m,n-1));
    }

    return resultat;
  }
}