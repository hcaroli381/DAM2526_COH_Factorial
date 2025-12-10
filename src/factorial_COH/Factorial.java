package factorial_COH;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número entero mayor o igual que 0: ");
		int num = sc.nextInt();

		if (num < 0) {
			System.out.println("ERROR: el número debe ser mayor o igual que 0.");
		} else {
			System.out.println("Has introducido el número: " + num);
		}

		sc.close();
	}

}