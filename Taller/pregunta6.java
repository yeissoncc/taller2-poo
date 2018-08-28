package Taller;

import java.util.Scanner;

class pregunta6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado;
		int lado,Resultado;
		
		teclado = new Scanner(System.in);
		System.out.print("introducir primer dato: ");
		lado = teclado.nextInt();
		
		Resultado = lado*lado;
		
		System.out.println("el area es : "+Resultado);


	}

}
