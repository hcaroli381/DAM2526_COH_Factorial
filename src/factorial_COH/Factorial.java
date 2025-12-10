package factorial_COH;

import java.util.Scanner;

public class Factorial {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int num;
		num = pedirNumero();

		if (num < 0) {
			System.out.println("ERROR: el número debe ser mayor o igual que 0.");
		} else {
			System.out.println("Has introducido el número: " + num);
		}
		System.out.println("RESULTADO - El factorial del número " + num + " es " + factorialBucle(num));

	}

	private static int pedirNumero() {
		int num;
		boolean valido;

		do {
			System.out.print("Introduce un número entero mayor o igual que 0: ");
			if (sc.hasNextInt()) {
				num = sc.nextInt();
				valido = true;
			} else {
				System.out.println("Entrada no válida. Introduce un entero.");
				sc.next();
				valido = false;
				num = -1;
			}
		} while (!valido);

		return num;
	}

	private static long factorialBucle(int n) {
		int multiplicador = 1;
		do {
			multiplicador = multiplicador * n;
			n = n - 1;
		} while (n > 1);
		return multiplicador;
	}

}