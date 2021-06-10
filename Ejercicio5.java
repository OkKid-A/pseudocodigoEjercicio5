import java.util.Scanner;

public class Ejercicio5{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nIngresa el número de ciclos a realizar");
		int ciclos = scanner.nextInt();
		int mm = 0;
		int hm = 0;
		for (int i = 0;i < ciclos;i++ ) {
			System.out.println("\nIngresa tu edad");
			int edad = scanner.nextInt();
			System.out.println("\nIngresa tu sexo (F/M)");
			String sexo = scanner.nextLine();
			sexo = scanner.nextLine();
			if (edad >= 18 && sexo.equals( "F")) {
				mm++;
			} else if (edad < 18 && sexo.equals("M")) {
				hm++;
			}
		}
		System.out.println("\nHay " + mm+ " mujeres mayores y "+hm+" hombres menores");
	}
}