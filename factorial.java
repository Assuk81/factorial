//Juan Carlos Corredor Sánchez
//https://github.com/Assuk81/factorial.git



package claseDia15;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {

		int numero;
		int factorial =1;//cada factorial o numero vale 1
	

		Scanner sc = new Scanner(System.in);
		System.out.println("Cálculo factorial.\n Introduce un número: ");
		numero = sc.nextInt();

		for (int i = numero; 0 < i;i--) {// la variable i es de for, se pone que sea igual a la declarada por mi arriba(numero), es como enlazar i con numero
			factorial = i * factorial;	//y ahora i significa numero, el que tu metas con teclado, y se hace el calculo de factorial multiplicando a i
			//i--;
		}
		System.out.println("El resultado factorial es: " + factorial);	
		
		}
		
		
	}



