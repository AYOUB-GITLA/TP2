import java.util.*;
public class Tp2Exercice9 {
	public static void calculerDifferenceDiagonales(int[][] matrice) {
        int n = matrice.length;
        
        // ÉTAPE 1 : Calculer la somme de la diagonale principale
        int sommePrincipale = 0;
        for (int i = 0; i < n; i++) {
            sommePrincipale = sommePrincipale + matrice[i][i];
        }
        
        // ÉTAPE 2 : Calculer la somme de la diagonale secondaire
        int sommeSecondaire = 0;
        for (int i = 0; i < n; i++) {
            sommeSecondaire = sommeSecondaire + matrice[i][n - 1 - i];
        }
        
        // ÉTAPE 3 : Calculer la différence absolue
        int difference = sommePrincipale - sommeSecondaire;
        if (difference < 0) {
            difference = -difference;  // Rendre positif
        }
        
        // Affichage
        System.out.println("\nSomme diagonale principale : " + sommePrincipale);
        System.out.println("Somme diagonale secondaire : " + sommeSecondaire);
        System.out.println("Différence absolue : " + difference);
    }
    
    public static void afficherMatrice(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.printf("%4d ", matrice[i][j]);
            }
            System.out.println();
        }
    }

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez la taille de la matrice (n x n) : ");
        int n = scanner.nextInt();
        
        int[][] matrice = new int[n][n];
        
        System.out.println("Entrez les éléments de la matrice :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrice[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\nMatrice :");
        afficherMatrice(matrice);
        
        calculerDifferenceDiagonales(matrice);
        
        scanner.close();
	}

}
