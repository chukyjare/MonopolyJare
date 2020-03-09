package monopolyVUNO;

public class Nueva {
	public static void comprobarRepoker(int[] vector, int cont) {
		int min = 1, max=10;
		for (int i = 0; i < vector.length-1; i++) {
			if (vector[i] == vector[i + 1]) {
				cont++;
				if (cont == 3) {
					do {
					vector[i] = Utiles.obtenerEntero(min, max);
					} while(vector[i]==4);
				}
			}
		}
	}
}
