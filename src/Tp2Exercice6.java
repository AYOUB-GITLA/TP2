import java.util.*;
public class Tp2Exercice6 {
	 public static void trouverSommeMax(int[] tableau) {
	        int n = tableau.length;
	        
	     
	        int sommeMax = tableau[0];      
	        int sommeActuelle = tableau[0]; 
	        
	        // Variables pour les indices
	        int debut = 0;           
	        int debutMax = 0;       
	        int finMax = 0;         
	        
	        // Parcourir le tableau à partir de l'indice 1
	        for (int i = 1; i < n; i++) {
	           
	            if (sommeActuelle + tableau[i] > tableau[i]) {
	               
	                sommeActuelle = sommeActuelle + tableau[i];
	            } else {
	              
	                sommeActuelle = tableau[i];
	                debut = i;
	            }
	            
	            // Mettre à jour le maximum si on a trouvé mieux
	            if (sommeActuelle > sommeMax) {
	                sommeMax = sommeActuelle;
	                debutMax = debut;
	                finMax = i;
	            }
	        }
	        
	        // Afficher les résultats
	        System.out.println("\n--- RÉSULTAT ---");
	        System.out.println("Somme maximale : " + sommeMax);
	        System.out.print("Sous-suite : ");
	        for (int i = debutMax; i <= finMax; i++) {
	            System.out.print(tableau[i]);
	            if (i < finMax) System.out.print(", ");
	        }
	        System.out.println();
	        System.out.println("Indices : [" + debutMax + " à " + finMax + "]");
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
	        
	        trouverSommeMax(tableau);
	        
	        scanner.close();
	}

}
