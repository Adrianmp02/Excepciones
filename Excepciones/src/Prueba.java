import java.util.ArrayList;
import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) throws AdrianExcepcion {

		System.out.println(conversion());
	}

	public static double division() throws AdrianExcepcion {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el primer número.");
		int num1 = sc.nextInt();
		System.out.println("Dime el segundo número.");
		int num2 = sc.nextInt();

		double division = 0;

		if(num2 == 0) {
			throw new AdrianExcepcion("No es posible dividir entre 0");
		}else {

			division = (double)num1 / (double)num2;

		}

		return division;
	}


	public static void indexRange() throws AdrianExcepcion {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la posicion que quieres acceder.");
		int posicion = sc.nextInt();

		int[] array = {1,2,3,4,5};

		if(posicion > array.length || posicion < 0) {
			throw new AdrianExcepcion("No existe la posicion a la que se intenta acceder");
		}else {
			System.out.println(array[posicion]);
		}

	}

	public static int conversion() throws AdrianExcepcion {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero");
		String cadena = sc.nextLine();

		boolean flag = true;
		for (int i = 0; i < cadena.length(); i++) {
			
			switch (cadena.charAt(i)) {
			case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':
				break;
				
			default:
				flag = false;
				break;
			}
		}
		
		if(flag) {
			return Integer.parseInt(cadena);
		}else {
			throw new AdrianExcepcion("La cadena no es valida");
		}

	}

	public static String split() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una cadena de texto");
		String cadena = sc.nextLine();
		
		System.out.println("Dime el delimitador de la cadena");
		String delimitador = sc.nextLine();
		
	}
	
	







}
