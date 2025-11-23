import java.util.*;
public class Tp2Exercice5 {

	   public static boolean estPermutationCirculaire(int[] tableau) {
	        int n = tableau.length;
	        
	        // Vérifier que tous les nombres de 1 à n sont présents
	        boolean[] present = new boolean[n + 1]; // ca c'est le tableau de presance des element il contient il aurant tous la valeur false par default
	        
	        for (int i = 0; i < n; i++) {
	            // Vérifier que le nombre est dans l'intervalle [1, n]
	            if (tableau[i] < 1 || tableau[i] > n) {
	                return false;
	            }
	            
	            // Vérifier qu'il n'y a pas de doublon
	            if (present[tableau[i]]) {
	                return false; 
	            }
	            
	            present[tableau[i]] = true;
	        }
	        
	        for (int i = 0; i < n; i++) {
	            int suivant = (i + 1) % n; 
	            int valeurActuelle = tableau[i];
	            int valeurSuivante = tableau[suivant];
	            
	            // Le suivant doit être valeurActuelle + 1, ou revenir à 1 si on était à n
	            int attendu;
	            if (valeurActuelle == n) {
	                attendu = 1; // Après n, on attend 1
	            } else {
	                attendu = valeurActuelle + 1; 
	            }
	            
	            if (valeurSuivante != attendu) {
	                return false; 
	            }
	        }
	        
	        return true;
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
        
        if (estPermutationCirculaire(tableau)) {
            System.out.println(" C'est une permutation circulaire valide !");
        } else {
            System.out.println(" Ce n'est PAS une permutation circulaire valide.");
        }
        
        scanner.close();
	}

}
