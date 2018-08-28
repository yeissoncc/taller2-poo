package Taller;

import java.util.Scanner;

class pregunta1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner teclado;
		int Numero;
		
		teclado = new Scanner(System.in);
		System.out.print("introducir un numero: ");
		Numero = teclado.nextInt();
		
		System.out.println("el cuadrado de "+Numero+" es :"+Numero*Numero);
		System.out.println("el cuadrado de "+Numero+" es :"+Numero*Numero*Numero);
		
	}

}
