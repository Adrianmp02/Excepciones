import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) throws AdrianExcepcion {

		int numero = 123456;
		System.out.println(factorial(numero));
	}

	public static double division(int num1, int num2) throws AdrianExcepcion {

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
	
	public static String[] split (String cadena, char deli) throws AdrianExcepcion {
		 
		int contador=0;
 
		for (int i = 0; i < cadena.length(); i++) {		
 
			if (cadena.charAt(i) == deli) {
				contador++;
			}
 
		}
 
		if(contador == 0) {
			throw new AdrianExcepcion("no esta el limitador");
		}
 
 
		String [] array = new String [contador+1];
		int posicion=0;
		StringBuffer sr = new StringBuffer();
		for (int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i)==deli){
				array[posicion]=sr.toString();
				sr = new StringBuffer();
				posicion++;		
			}else if(i==cadena.length()-1) {
				sr.append(cadena.charAt(i));
				array[posicion]=sr.toString();
				
			}else {
				sr.append(cadena.charAt(i));
			}
		}
 
		return array;
 
	}

	public static int factorial(int num) throws AdrianExcepcion {
		
		if(num < 0) {
			throw new AdrianExcepcion("El número no puede ser negativo");
		}
		
		int resultado = 1;
		for(int i = 1; i <= num; i++) {
			resultado *= i;
		}
		
		if(resultado > 99999) {
			throw new AdrianExcepcion("El número no puede superar las 5 cifras");
		}
		
		return resultado;
	}
	
	
	
	







}
