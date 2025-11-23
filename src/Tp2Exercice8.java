import java.util.*;
public class Tp2Exercice8 {
	 public static void afficherManquants(int[] tableau) {
	        int n = tableau.length;
	        
	        // Tableau pour marquer les éléments présents
	        boolean[] present = new boolean[n + 1];  
	        
	     	        for (int i = 0; i < n; i++) {
	            int element = tableau[i];
	            if (element >= 1 && element <= n) {
	                present[element] = true;
	            }
	        }
	        
	   	        boolean premierManquant = true;
	        for (int i = 1; i <= n; i++) {
	            if (!present[i]) {
	                if (!premierManquant) {
	                    System.out.print(" ");
	                }
	                System.out.print(i);
	                premierManquant = false;
	            }
	        }
	        
	        if (premierManquant) {
	            System.out.print("Aucun");
	        }
	        
	        System.out.println();
	    }

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Entrez la taille du tableau : ");
	        int n = scanner.nextInt();
	        
	        int[] tableau = new int[n];
	        System.out.println("Entrez les " + n + " éléments (entre 1 et " + n + ") :");
	        for (int i = 0; i < n; i++) {
	            tableau[i] = scanner.nextInt();
	        }
	        
	        System.out.print("Éléments manquants : ");
	        afficherManquants(tableau);
	        
	        scanner.close();
	}

}
