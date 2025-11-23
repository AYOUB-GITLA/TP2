
public class Tp2Exercice2 {
	
	public static void afficherPivots(int[] t) {
        int n = t.length;
        
        for (int i = 1; i < n-1; i++) {
            boolean estPivot = true;
            
            // Vérifier que tous les éléments à gauche de t[i]
            for (int j = 0; j < i; j++) {
                if (t[j] > t[i]) {
                    estPivot = false;
                    break;
                }
            }
            
            // Si déjà faux, pas besoin de vérifier à droite on passe directement a indice i suivant
            if (!estPivot) continue;
            
            // Vérifier que tous les éléments à droite de t[i]
            for (int j = i + 1; j < n; j++) {
                if (t[j] < t[i]) {
                    estPivot = false;
                    break;
                }
            }
            
            if (estPivot) {
                System.out.print(t[i] + " ");
            }
        }
    }

	public static void main(String[] args) {
		int[] t = {2, 4, 3, 5, 6};
        System.out.print("Pivots : ");
        afficherPivots(t);

	}

}
