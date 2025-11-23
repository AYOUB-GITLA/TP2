
public class Tp2Exercice4 {

	
	 public static void trouverPlusGrandRectangle(int[][] matrice) {
	        int lignes = matrice.length;
	        int colonnes = matrice[0].length;
	        
	        int maxAire = 0;
	        int meilleurLig = 0, meilleurCol = 0;
	        int meilleurHauteur = 0, meilleurLargeur = 0;
	        
	        // Pour chaque case de départ
	        for (int i = 0; i < lignes; i++) {
	            for (int j = 0; j < colonnes; j++) {
	                
	                // Si la case est un 1, essayer d'agrandir le rectangle
	                if (matrice[i][j] == 1) {
	                    
	                    // Essayer toutes les hauteurs possibles
	                    for (int h = 1; h <= lignes - i; h++) {
	                        
	                        // Essayer toutes les largeurs possibles
	                        for (int l = 1; l <= colonnes - j; l++) {
	                            
	                            // Vérifier si le rectangle h×l est valide
	                            boolean valide = true;
	                            
	                            for (int x = i; x < i + h; x++) {
	                                for (int y = j; y < j + l; y++) {
	                                    if (matrice[x][y] == 0) {
	                                        valide = false;
	                                        break;
	                                    }
	                                }
	                                if (!valide) break;
	                            }
	                            
	                            // Si valide, vérifier si c'est le meilleur
	                            if (valide) {
	                                int aire = h * l;
	                                if (aire > maxAire) {
	                                    maxAire = aire;
	                                    meilleurLig = i;
	                                    meilleurCol = j;
	                                    meilleurHauteur = h;
	                                    meilleurLargeur = l;
	                                }
	                            }
	                        }
	                    }
	                }
	            }
	        }
	        
	        // Afficher les résultats
	        if (maxAire > 0) {
	            System.out.println("Plus grand rectangle trouvé !");
	            System.out.println("Aire : " + maxAire);
	            System.out.println("Position : ligne " + meilleurLig + ", colonne " + meilleurCol);
	            System.out.println("Dimensions : " + meilleurHauteur + " x " + meilleurLargeur);
	            
	            System.out.println("\nRectangle dans la matrice :");
	            afficherAvecRectangle(matrice, meilleurLig, meilleurCol, 
	                                 meilleurHauteur, meilleurLargeur);
	        } else {
	            System.out.println("Aucun rectangle de 1 trouvé.");
	        }
	    }
	    
	    public static void afficherMatrice(int[][] matrice) {
	        for (int i = 0; i < matrice.length; i++) {
	            for (int j = 0; j < matrice[0].length; j++) {
	                System.out.print(matrice[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	    
	    public static void afficherAvecRectangle(int[][] matrice, int ligDebut, int colDebut,
	                                            int hauteur, int largeur) {
	        for (int i = 0; i < matrice.length; i++) {
	            for (int j = 0; j < matrice[0].length; j++) {
	                if (i >= ligDebut && i < ligDebut + hauteur && 
	                    j >= colDebut && j < colDebut + largeur) {
	                    System.out.print("[" + matrice[i][j] + "]");
	                } else {
	                    System.out.print(" " + matrice[i][j] + " ");
	                }
	            }
	            System.out.println();
	        }
	    }
	public static void main(String[] args) {
	        int[][] matrice = {
            {1, 0, 1, 1, 1},
            {1, 0, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 0, 0, 1, 0}
        };
        
        System.out.println("Matrice :");
        afficherMatrice(matrice);
        
        System.out.println("\n--- Recherche du plus grand rectangle ---");
        trouverPlusGrandRectangle(matrice);

	}

}
