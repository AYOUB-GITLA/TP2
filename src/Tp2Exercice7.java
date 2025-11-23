import java.util.*;
public class Tp2Exercice7 {
	public static int trouverMajoritaire(int[] tableau) {
        int n = tableau.length;
        int seuilMajoritaire = n / 2;  // Plus de n/2 fois
        
        // Pour chaque élément du tableau
        for (int i = 0; i < n; i++) {
            int element = tableau[i];
            int compteur = 0;
            
            // Compter combien de fois cet élément apparaît
            for (int j = 0; j < n; j++) {
                if (tableau[j] == element) {
                    compteur++;
                }
            }
            
            // Si cet élément apparaît plus de n/2 fois
            if (compteur > seuilMajoritaire) {
                return element;
            }
        }
        
        return -1;  // Aucun élément majoritaire
    }

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez la taille du tableau : ");
        int n = scanner.nextInt();
        
        int[] tableau = new int[n];
        System.out.println("Entrez les " + n + " éléments :");
        for (int i = 0; i < n; i++) {
            tableau[i] = scanner.nextInt();
        }
        
        int resultat = trouverMajoritaire(tableau);
        
        if (resultat != -1) {
            System.out.println(" L'élément majoritaire est : " + resultat);
        } else {
            System.out.println(" Aucun élément majoritaire.");
        }
        
        scanner.close();

	}

}
