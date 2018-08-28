package Taller;

import java.util.Scanner;

class preguntaa10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado;
		int Numero;
		
		teclado = new Scanner(System.in);
		
		
		System.out.print("ingresar el numero : ");
		Numero = teclado.nextInt();
		
		
		System.out.println("el valo absoluto es de : "+Numero+" ="+"|"+Math.abs(Numero)+"|");

	}

}
