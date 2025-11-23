
public class Tp2Exercice1 {
	
	
	 public static int plusLongueSousSuiteCroissante(int[] t) {
	        if (t.length == 0) return 0;

	        int maxcpt = 1;
	        int cpt = 1;

	        for (int i = 1; i < t.length; i++) {
	            if (t[i] > t[i - 1]) {
	                cpt++;
	            } else {
	                cpt = 1;
	            }
	            if (cpt > maxcpt) {
	                maxcpt = cpt;
	            }
	        }

	        return maxcpt;
	    }
	    
	    public static int plusLongueSousSequenceCroissante(int[] t) {
	        if (t.length == 0) return 0;
	        
	        int n = t.length;
	        int[] longueur = new int[n];
	        
	
	        for (int i = 0; i < n; i++) {
	            longueur[i] = 1;
	        }
	        
	           for (int i = 1; i < n; i++) {
	            for (int j = 0; j < i; j++) {
	                if (t[j] < t[i] && longueur[j] + 1 > longueur[i]) {
	                    longueur[i] = longueur[j] + 1;
	                }
	            }
	        }
	        
	        // Trouver le maximum
	        int maxLongueur = 0;
	        for (int i = 0; i < n; i++) {
	            if (longueur[i] > maxLongueur) {
	                maxLongueur = longueur[i];
	            }
	        }
	        
	        return maxLongueur;
	    }
	public static void main(String[] args) {
		 int[] tab = {2, 1, 4, 2, 3, 5, 1, 7};

	        int resultatSuite = plusLongueSousSuiteCroissante(tab);
	        int resultatSequence = plusLongueSousSequenceCroissante(tab);

	        System.out.println("La plus longue sous-suite croissante est de " + resultatSuite + " chiffres");
	        System.out.println("La plus longue sous-séquence croissante est de " + resultatSequence + " chiffres");

	}

}
