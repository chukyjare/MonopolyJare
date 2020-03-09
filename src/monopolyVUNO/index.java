package monopolyVUNO;

public class index {
	public static void main(String[] args) {
		int size = 11;
		int[][] tablero = new int[size][size];
		int[][] jugadores = asignarJugadores();
		int[][] fichasColocadas = prepararMesa(tablero, jugadores);
		int turno = sortearTurno(fichasColocadas);
		iniciarTurno(tablero, fichasColocadas, turno);
		comprobarCasilla(tablero, fichasColocadas, jugadores);
		turno=cambiarTurno(turno);

	}

	private static int cambiarTurno(int turno) {
		// TODO Auto-generated method stub
		//modificado
		return 0;
	}

	public static void comprobarCasilla(int[][] tablero, int[][] fichasColocadas, int[][] jugadores) {
		// TODO Auto-generated method stub
		
	}

	public static void iniciarTurno(int[][] tablero, int[][] fichasColocadas, int turno) {
		// TODO Auto-generated method stub
		int dados=tirarDados();
		int posAntigua=comprobarPosicionAntigua(tablero, fichasColocadas, turno);
		colocarFicha(tablero, dados, fichasColocadas);
		borrarFichaAntigua(tablero, fichasColocadas, posAntigua);
		
	}

	private static void borrarFichaAntigua(int[][] tablero, int[][] fichasColocadas, int posAntigua) {
		// TODO Auto-generated method stub
		
	}

	private static void colocarFicha(int[][] tablero, int dados, int[][] fichasColocadas) {
		// TODO Auto-generated method stub
		
	}

	private static int comprobarPosicionAntigua(int[][] tablero, int[][] fichasColocadas, int turno) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int tirarDados() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static int[][] asignarJugadores() {
		int size = 0, max = 4, min = 2;
		do {
			System.out.println("Elija el número de jugadores entre 2 y 4");
			size = resources.Leer.entero();
		} while (size < min || size > max);
		int[][] matriz = new int[size][min];
		repartirSaldo(matriz);
		verMatriz(matriz);
		return matriz;
	}

	private static void verMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (j == 0) {
					System.out.print("Jugador " + (int) matriz[i][j] + "\t");
				} else {
					System.out.print("Saldo: " + matriz[i][j] + "€ \t");
				}
			}
			System.out.println();
		}

	}

	private static void repartirSaldo(int[][] matriz) {
		int saldoInicial = 1500;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (j == 0) {
					matriz[i][j] = i + 1;
				} else {
					matriz[i][j] = saldoInicial;
				}
			}
		}

	}

	public static int[][] prepararMesa(int[][] tablero, int[][] jugadores) {
		crearTablero(tablero);
		int[][] fichasColocadas = introducirJugadores(tablero, jugadores);

		return fichasColocadas;
	}

	public static int sortearTurno(int[][] fichasColocadas) {
		int max=(fichasColocadas.length), min=1;
		int turno=resources.Utiles.obtenerEntero(min, max);
		return turno;
	}

	public static int[][] introducirJugadores(int[][] tablero, int[][] jugadores) {
		int size = 2;
		int[] fichas = new int[jugadores.length];
		int[] posicion = new int[jugadores.length];
		int[][] fichasColocadas = new int[fichas.length][size];
		for (int i = 0; i < jugadores.length; i++) {
			for (int j = 0; j < jugadores[i].length; j++) {
				if (j == 0) {
					fichas[i] = jugadores[i][j];
				}
			}
		}
		for (int i = 0; i < fichasColocadas.length; i++) {
			for (int j = 0; j < fichasColocadas[i].length; j++) {
				if (j==0) {
					fichasColocadas[i][j]=fichas[i];
				}else {
					fichasColocadas[i][j]=posicion[i];
				}
			}
		}
		return fichasColocadas;
	}

	public static void crearTablero(int[][] tablero) {
		int visitaCarcel = 10, parking = 20, veALaCarcel = 30;
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				if (i == 0) {
					tablero[i][j] = visitaCarcel + j;
				}
				if (i > 0 && i < visitaCarcel) {
					if (j == 0) {
						tablero[i][j] = parking - i;
					}
					if (j == visitaCarcel) {
						tablero[i][j] = veALaCarcel + i;
					}
				}
				if (i == visitaCarcel) {
					tablero[i][j] = visitaCarcel - j;
				}
			}
		}
		verTablero(tablero);

	}

	private static void verTablero(int[][] mapa) {
		for (int i = 0; i < mapa.length; i++) {
			for (int j = 0; j < mapa.length; j++) {
				if (mapa[i][j] == 0 && i != 10 && j != 10) {
					System.out.print("  " + "\t");
				} else {

					System.out.print("[ " + mapa[i][j] + " ]" + "\t");
				}
			}
			System.out.println();
			System.out.println();
		}

	}

}
