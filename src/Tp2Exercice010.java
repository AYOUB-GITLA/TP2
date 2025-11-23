import java.util.*;
public class Tp2Exercice010 {
	public static boolean estMagique(int[][] matrice) {
        // ÉTAPE 1 : Calculer la somme de référence (première ligne)
        int sommeReference = matrice[0][0] + matrice[0][1] + matrice[0][2];
        
        System.out.println("\nSomme de référence (ligne 0) : " + sommeReference);
        
        // ÉTAPE 2 : Vérifier les autres lignes
        for (int i = 1; i < 3; i++) {
            int sommeLigne = matrice[i][0] + matrice[i][1] + matrice[i][2];
            System.out.println("Somme ligne " + i + " : " + sommeLigne);
            
            if (sommeLigne != sommeReference) {
                return false;  // Pas magique
            }
        }
        
        // ÉTAPE 3 : Vérifier les colonnes
        for (int j = 0; j < 3; j++) {
            int sommeColonne = matrice[0][j] + matrice[1][j] + matrice[2][j];
            System.out.println("Somme colonne " + j + " : " + sommeColonne);
            
            if (sommeColonne != sommeReference) {
                return false;  // Pas magique
            }
        }
        
        // ÉTAPE 4 : Vérifier la diagonale principale
        int sommeDiagPrincipale = matrice[0][0] + matrice[1][1] + matrice[2][2];
        System.out.println("Somme diagonale principale : " + sommeDiagPrincipale);
        
        if (sommeDiagPrincipale != sommeReference) {
            return false;  // Pas magique
        }
        
        // ÉTAPE 5 : Vérifier la diagonale secondaire
        int sommeDiagSecondaire = matrice[0][2] + matrice[1][1] + matrice[2][0];
        System.out.println("Somme diagonale secondaire : " + sommeDiagSecondaire);
        
        if (sommeDiagSecondaire != sommeReference) {
            return false;  // Pas magique
        }
        
        // Si tout est égal, c'est magique !
        return true;
    }
    
    public static void afficherMatrice(int[][] matrice) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%4d ", matrice[i][j]);
            }
            System.out.println();
        }
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        int[][] matrice = new int[3][3];
        
        System.out.println("Entrez les éléments de la matrice 3x3 :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrice[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\nMatrice :");
        afficherMatrice(matrice);
        
        if (estMagique(matrice)) {
            System.out.println(" C'est un carré magique !");
        } else {
            System.out.println(" Ce n'est PAS un carré magique.");
        }
        
        scanner.close();
	}

}
