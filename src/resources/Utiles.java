package resources;

public class Utiles {
	public static int obtenerEntero(int min, int max) {
		int intervalo = max + 1 - min;
		return (int) (Math.random() * (intervalo)) + min;
	}
	public static void mostrarVector(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]);
		}
	}
	public static void rellenarVectorAleatorio(int[] vector, int min, int max) {
		for (int index = 0; index < vector.length; index++) {
			vector[index] = obtenerEntero(min, max);
		}
	}

	public static void igualarACeroRepetidos(int[] vector) {
		// por cada elemento
		for (int i = 0; i < vector.length - 1; i++) {
			// recorrido para comparar cada elemento con los restantes
			if (vector[i] != 0) {
				for (int j = i + 1; j < vector.length; j++) {
					if (vector[i] == vector[j]) {
						vector[j] = 0;
					}
				}
			}
		}
	}

	public static int[] eliminarCerosDelVector(int[] vector) {
		int tamano;
		// La parte cuenta ceros
		int contador = 0;
		tamano=vector.length;
		while (vector[contador] == 0) {
			contador++;
		}
		// cuando sepa los ceros que hay significa que conozco el tamano
		// de elementos no repetidos
		int nuevoTamanomano = tamano - contador;
		int vectorIntercambio[] = new int[nuevoTamanomano];
		for (int i = contador, j = 0; i < vector.length; i++, j++) {
			vectorIntercambio[j] = vector[i];
		}
		// Cuando hay creado el nuevo desecho el anterior
		System.out.println("empiezo con el nuevo vector");
		return vectorIntercambio;
	}

}
