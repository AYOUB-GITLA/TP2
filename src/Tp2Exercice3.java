import java.util.*;
public class Tp2Exercice3 {
	
	public static int[][] remplirSpiral(int n) {
        int[][] matrice = new int[n][n];
        
        int nombre = 1;
        int ls = 0, li = n - 1;  // ligne supérieure, ligne inférieure
        int cg = 0, cd = n - 1;  // colonne gauche, colonne droite
        
        while (nombre <= n * n) {
            // Remplir de gauche à droite (ligne supérieure)
            for (int col = cg; col <= cd; col++) {
                matrice[ls][col] = nombre++;
            }
            ls++; // La limite supperieur desend de 1
            
            // Remplir de haut en bas (colonne de droite)
            for (int lig = ls; lig <= li; lig++) {
                matrice[lig][cd] = nombre++;
            }
            cd--; // Reculer la limite droite
            
            // Remplir de droite à gauche (ligne inférieure)
            if (ls <= li) {
                for (int col = cd; col >= cg; col--) {
                    matrice[li][col] = nombre++;
                }
                li--; // Monter la limite inférieure
            }
            
            // Remplir de bas en haut (colonne de gauche)
            if (cg <= cd) {
                for (int lig = li; lig >= ls; lig--) {
                    matrice[lig][cg] = nombre++;
                }
                cg++; // Avancer la limite gauche
            }
        }
        
        return matrice;
    }
    
    public static void afficherMatrice(int[][] matrice) {
        int n = matrice.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d ", matrice[i][j]); // juste un formatage pour un meilleur visuel de la matrice 
            }
            System.out.println();
        }
    }

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Entrez la taille de la matrice (n) : ");
	        int n = scanner.nextInt();
	        
	        int[][] matrice = remplirSpiral(n);
	        System.out.println("\nMatrice " + n + "x" + n + " en spirale :");
	        afficherMatrice(matrice);
	        
	        scanner.close();
	}

}
