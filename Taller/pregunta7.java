package Taller;

import java.util.Scanner;

class pregunta7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado;
		int ladoA,ladoB,H,Resultado;
		
		teclado = new Scanner(System.in);
		System.out.print("introducir lado A : ");
		ladoA = teclado.nextInt();
		
		System.out.print("introducir lado B : ");
		ladoB = teclado.nextInt();
		
		H = ((ladoA*2)+(ladoB*2));
		
		System.out.println("la hipotenusa es  : "+Math.sqrt(H));

		

	}

}
